package com.phelim.gateway_vertx_project.config;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SmsServiceConfig {
    private String sendOtp;
    private String getInfoUserSentOtp;
    private String getDetailInfoUser;
}

