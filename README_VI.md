# CIC PR Services

**Updated by Phelim (16/07/2026)**

## Overview

CIC PR Services là một **Vert.x Integration Gateway** dùng để kết nối các hệ thống nội bộ với hệ thống đối tác **CIC (chỉ là 1 ví dụ cụ thể)** thông qua giao thức **SOAP**.

Gateway đóng vai trò trung gian giữa các business services và CIC nhằm:

- Chuẩn hóa request/response.
- Xây dựng SOAP XML.
- Parse XML sang JSON.
- Retry khi gọi CIC thất bại.
- Timeout khi CIC phản hồi chậm.
- Tách biệt logic tích hợp khỏi business service.
- Tăng khả năng mở rộng và bảo trì.

---

# Technology Stack

- Java 21
- Vert.x
- Google Guice
- Gradle 8.14.3
- SOAP
- REST API

---

# Project Architecture

## Work Flow

```
GatewayVertxProjectApplication.main()
        │
        ▼
Vertx.vertx(options)
        │
        ▼
deployVerticle(MainVerticle)
        │
        ▼
MainVerticle.start()
        │
        ▼
Guice Injector
        │
        ▼
ConsumerImpl
        │
        ▼
Router
        │
        ▼
HTTP Server
        │
        ▼
Request
        │
        ▼
CicConsumerImpl
        │
        ▼
SOAP Request
        │
        ▼
CIC
        │
        ▼
JSON Response
```

---

## Layer Architecture

```
GatewayVertxProjectApplication (Main) (Bootstrap)
        │
        ▼
Verticle (Runtime Entry)
        │
        ▼
Dependency Injection (Guice)
        │
        ▼
Consumer (HTTP Layer)
        │
        ▼
CicConsumer (Business Layer)
        │
        ▼
CallApi (Integration Layer)
```

---

## Data Flow

```
Client
   │
   ▼
REST API
   │
   ▼
Router
   │
   ▼
CicConsumer
   │
   ▼
SOAP Request
   │
   ▼
CIC
   │
   ▼
SOAP Response
   │
   ▼
JSON Response
   │
   ▼
Client
```

---

# Production Workflow

Ví dụ trong môi trường Banking:

```
Mobile App
      │
      ▼
Spring API Gateway
      │
      ▼
Payment Service
      │
      ▼
Vert.x CIC Gateway
      │
      ▼
CIC
```

### Request Flow

1. Client gọi Payment API.
2. Payment Service cần kiểm tra CIC.
3. Payment gọi CIC Gateway.
4. CIC Gateway thực hiện:
    - Validate request.
    - Build SOAP XML.
    - Retry nếu lỗi.
    - Timeout nếu CIC phản hồi chậm.
    - Parse XML thành JSON.
5. Gateway trả JSON về Payment Service.
6. Payment tiếp tục xử lý business.

---

# Why Use a CIC Gateway?

Nếu mỗi service gọi CIC trực tiếp:

```
Payment Service ───────┐
Account Service ───────┤
User Service ──────────┤
                        ▼
                       CIC
```

Mỗi service đều phải tự triển khai:

- SOAP Builder
- XML Parser
- Retry Logic
- Timeout
- Error Mapping

Điều này dẫn đến:

- Logic bị lặp lại.
- Khó bảo trì.
- Khó đồng bộ.
- Khó mở rộng.

---

## Real Production Problem

Trong các hệ thống ngân hàng thực tế từng xảy ra trường hợp:

```
Service
    │
    ▼
CIC chậm
    │
    ▼
Thread bị block
    │
    ▼
Thread Pool Full
    │
    ▼
Toàn hệ thống bị treo
```

Gateway giúp cô lập việc tích hợp với hệ thống bên ngoài và giảm ảnh hưởng tới các business service.

---

# When Should Vert.x Be Used?

Vert.x phù hợp khi:

- Gọi nhiều external services.
- IO intensive.
- Async processing.
- High throughput.
- High concurrency.

Không nên dùng Vert.x nếu hệ thống chủ yếu là:

- Business logic rất phức tạp.
- Nhiều transaction database.
- Đồng bộ dữ liệu nặng.

---

# Project Structure

```
com.phelim
│
├── config
│   ├── CicConfig
│   ├── HttpServerConfig
│   ├── ModuleConfig
│   └── SmsServiceConfig
│
├── consumer
│   ├── Consumer
│   ├── ConsumerImpl
│   ├── CicConsumer
│   └── CicConsumerImpl
│
├── dto
│   ├── request
│   │   └── CreditReportRequest
│   ├── response
│   │   └── CicPrResponse
│   └── MockData
│
├── enums
│   ├── CicProduct
│   ├── CicReportType
│   └── CicValidationError
│
├── exception
│   ├── BaseException
│   ├── CommonExceptions
│   └── EbankException
│
├── integration
│   ├── cic
│   │   └── CicSoapBuilder
│   ├── module
│   │   ├── CallApiModule
│   │   └── GatewayModule
│   └── util
│       └── VertxPropertiesUtil
│
├── verticle
│   └── MainVerticle
│
└── Main

resources
│
├── note
│   ├── flowwork.txt
│   └── structure_project.txt
│
└── test-postman.json
└── vertx-project.json
```

---

# Build Project

Sử dụng Gradle ShadowJar để tạo file chạy.

```
gradlew shadowJar
```

Sau khi build thành công sẽ sinh ra:

```
cicpr-services.jar
```

---

# Running the Project

Sau khi build cần chuẩn bị:

```
cicpr-services.jar
cicpr-services.json
run.bat
logs/
```

Ví dụ cấu trúc thư mục:

```
deploy/
│
├── cicpr-services.jar
├── cicpr-services.json
├── run.bat
└── logs/
```

---

## run.bat

```bat
@echo off

REM Set path to your Java executable
SET JAVA_PATH=C:\Users\xxx\Downloads\gradle-8.14.3-all\temurin-jdk8u482-b08\bin\java.exe

REM Set path to your JAR
SET JAR_PATH=C:\Users\xxx\Downloads\task2\cicpr-services.jar

REM Set path to configuration
SET CONFIG_PATH=C:\Users\xxx\Downloads\task2\cicpr-services.json

REM Start Vert.x application
"%JAVA_PATH%" -jar "%JAR_PATH%" -conf "%CONFIG_PATH%"

pause
```

---

# Configuration

Ứng dụng sử dụng file cấu hình:

```
cicpr-services.json
```

File này chứa:

- HTTP Server
- CIC Endpoint
- SOAP Configuration
- Module Configuration
- SMS Configuration
- Other runtime properties

---

# Logs

Sau khi ứng dụng khởi động, toàn bộ log sẽ được ghi vào thư mục:

```
logs/
```

Nên cấu hình log rotation trong môi trường production để tránh log tăng quá lớn.

---

# Request Processing Summary

```
HTTP Request
      │
      ▼
Router
      │
      ▼
Consumer
      │
      ▼
Validate
      │
      ▼
Build SOAP
      │
      ▼
Call CIC
      │
      ▼
Parse XML
      │
      ▼
Return JSON
```

---

# Notes

- Đây là project Gateway chuyên trách tích hợp CIC (chỉ là 1 ví dụ).
- Business logic nên được xử lý ở các service phía trên (Payment, Account, User,...).
- Gateway chỉ chịu trách nhiệm tích hợp với hệ thống bên ngoài.
- Thiết kế theo hướng bất đồng bộ (asynchronous) để tối ưu hiệu năng khi gọi external services.
