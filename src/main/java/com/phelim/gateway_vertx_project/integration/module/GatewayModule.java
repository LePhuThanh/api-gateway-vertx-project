package com.phelim.gateway_vertx_project.integration.module;

import com.google.gson.Gson;
import com.google.inject.*;
import com.phelim.gateway_vertx_project.config.ModuleConfig;
import com.phelim.gateway_vertx_project.consumer.CicConsumer;
import com.phelim.gateway_vertx_project.consumer.CicConsumerImpl;
import com.phelim.gateway_vertx_project.consumer.Consumer;
import com.phelim.gateway_vertx_project.consumer.ConsumerImpl;
import com.phelim.gateway_vertx_project.integration.cic.CicSoapBuilder;
import io.micrometer.core.instrument.MeterRegistry;
import io.vertx.core.Vertx;

public class GatewayModule extends AbstractModule {
    private final Vertx vertx;
    private final MeterRegistry meterRegistry;
    private final ModuleConfig config;

    public GatewayModule(
            Vertx vertx,
            MeterRegistry meterRegistry,
            ModuleConfig config
    ) {
        this.vertx = vertx;
        this.meterRegistry = meterRegistry;
        this.config = config;
    }

    @Override
    protected void configure() {
        // Mapping interface => implementation
        bind(Consumer.class).to(ConsumerImpl.class).in(Scopes.SINGLETON);
        bind(CicConsumer.class).to(CicConsumerImpl.class).in(Scopes.SINGLETON);

        bind(CicSoapBuilder.class).in(Scopes.SINGLETON);
        bind(CallApiModule.class).in(Scopes.SINGLETON);
    }

    @Provides
    @Singleton
    Vertx provideVertx() {
        return vertx;
    }

    @Provides
    @Singleton
    ModuleConfig provideConfig() {
        return config;
    }

    @Provides
    @Singleton
    public Gson getGson() {
        return new Gson();
    }

}

