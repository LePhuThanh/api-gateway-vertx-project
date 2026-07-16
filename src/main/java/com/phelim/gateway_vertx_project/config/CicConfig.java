package com.phelim.gateway_vertx_project.config;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CicConfig {
    private String realtimeSrUrl; // S10T, S11T, R10T, R11T
    private String realtimeB11tUrl; // B11T
}
