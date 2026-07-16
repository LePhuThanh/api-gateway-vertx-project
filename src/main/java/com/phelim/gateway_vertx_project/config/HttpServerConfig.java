package com.phelim.gateway_vertx_project.config;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HttpServerConfig {
    private String host;
    private Integer port;
}
