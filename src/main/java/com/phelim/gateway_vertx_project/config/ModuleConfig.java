package com.phelim.gateway_vertx_project.config;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ModuleConfig {

    private Integer idleTimeOut;
    private int workerPoolSize;
    private int workerMaxExecuteTime;

    @SerializedName("vertxHttpServer")
    private HttpServerConfig vertxHttpServer;
    @SerializedName("smsServiceConfig")
    private SmsServiceConfig smsServiceConfig;

    private HttpServerConfig httpServer;

    private CicConfig cicConfig;
}
