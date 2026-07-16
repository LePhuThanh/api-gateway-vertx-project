package com.phelim.gateway_vertx_project.consumer;

public interface Consumer {
    Consumer usingRestful();

    Consumer usingMq();

    Consumer start();
}
