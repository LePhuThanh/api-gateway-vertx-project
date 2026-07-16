# CIC PR Services

**Updated by Phelim (16/07/2026)**

## Overview

CIC PR Services is a **Vert.x Integration Gateway** designed to integrate internal systems with an external partner system (**CIC is used here as a concrete example**) through the **SOAP** protocol.

The gateway acts as an integration layer between business services and external systems by providing:

- Standardized request and response handling.
- SOAP XML generation.
- XML-to-JSON transformation.
- Automatic retry for failed external requests.
- Request timeout handling.
- Separation of integration logic from business services.
- Improved scalability and maintainability.

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

## Workflow

```text
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
External Partner (CIC)
        │
        ▼
JSON Response
```

---

## Layer Architecture

```text
GatewayVertxProjectApplication (Bootstrap)
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

```text
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
External Partner (CIC)
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

# Example Production Workflow

A typical banking architecture might look like this:

```text
Mobile App
      │
      ▼
Spring API Gateway
      │
      ▼
Payment Service
      │
      ▼
Vert.x Integration Gateway
      │
      ▼
External Partner (CIC)
```

## Request Flow

1. The client sends a request to the Payment API.
2. The Payment Service needs to retrieve data from the external partner.
3. The Payment Service calls the Vert.x Integration Gateway.
4. The gateway performs:
    - Request validation
    - SOAP XML generation
    - Retry on failures
    - Timeout handling
    - XML parsing
    - JSON conversion
5. The gateway returns a standardized JSON response.
6. The Payment Service continues its business processing.

---

# Why Use an Integration Gateway?

Without a dedicated gateway, every service would communicate directly with the external system:

```text
Payment Service ───────┐
Account Service ───────┤
User Service ──────────┤
                        ▼
                 External Partner
```

Each service would have to implement:

- SOAP XML Builder
- XML Parser
- Retry Logic
- Timeout Handling
- Error Mapping

This results in:

- Duplicated integration logic
- Difficult maintenance
- Inconsistent implementations
- Poor scalability

A dedicated gateway centralizes all integration concerns into a single service.

---

# Real Production Challenges

In real banking systems, direct integration with external services can cause serious issues.

```text
Service
    │
    ▼
External System is Slow
    │
    ▼
Blocked Threads
    │
    ▼
Thread Pool Exhausted
    │
    ▼
System Performance Degradation
```

Using an integration gateway isolates external communication from business services and significantly reduces these risks.

---

# When Should Vert.x Be Used?

Vert.x is a great choice when your application requires:

- Frequent communication with external services
- IO-intensive workloads
- Asynchronous processing
- High throughput
- High concurrency

Vert.x may not be the best choice when the application mainly consists of:

- Complex business logic
- Heavy database transactions
- Synchronous transaction processing

---

# Project Structure

```text
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
├── test-postman.json
└── vertx-project.json
```

---

# Building the Project

Build the executable JAR using Gradle ShadowJar.

```bash
gradlew shadowJar
```

After a successful build, the following artifact will be generated:

```text
cicpr-services.jar
```

---

# Running the Project

Prepare the following files:

```text
cicpr-services.jar
cicpr-services.json
run.bat
logs/
```

Example deployment directory:

```text
deploy/
│
├── cicpr-services.jar
├── cicpr-services.json
├── run.bat
└── logs/
```

---

## Example `run.bat`

```bat
@echo off

REM Set path to your Java executable
SET JAVA_PATH=C:\Users\xxx\Downloads\gradle-8.14.3-all\temurin-jdk8u482-b08\bin\java.exe

REM Set path to your JAR
SET JAR_PATH=C:\Users\xxx\Downloads\task2\cicpr-services.jar

REM Set path to the configuration file
SET CONFIG_PATH=C:\Users\xxx\Downloads\task2\cicpr-services.json

REM Start the Vert.x application
"%JAVA_PATH%" -jar "%JAR_PATH%" -conf "%CONFIG_PATH%"

pause
```

---

# Configuration

The application loads its runtime configuration from:

```text
cicpr-services.json
```

Typical configuration includes:

- HTTP Server
- External Partner Endpoint
- SOAP Configuration
- Module Configuration
- SMS Configuration
- Other runtime properties

---

# Logging

Application logs are written to:

```text
logs/
```

For production environments, log rotation is recommended to prevent excessive disk usage.

---

# Request Processing Summary

```text
HTTP Request
      │
      ▼
Router
      │
      ▼
Consumer
      │
      ▼
Validate Request
      │
      ▼
Build SOAP XML
      │
      ▼
Call External Partner
      │
      ▼
Parse XML
      │
      ▼
Convert to JSON
      │
      ▼
Return Response
```

---

# Notes

- This project demonstrates an **Integration Gateway** architecture. **CIC is used only as an example external partner system.**
- Business logic should remain in upstream services such as Payment, Account, or User services.
- The gateway is responsible only for communication with external systems.
- The project follows an asynchronous architecture to maximize performance when interacting with external services.
- Although this example uses SOAP, the same architecture can be adapted for REST, gRPC, MQ, or other integration protocols.
