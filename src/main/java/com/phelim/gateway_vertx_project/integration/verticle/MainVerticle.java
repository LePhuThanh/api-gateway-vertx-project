package com.phelim.gateway_vertx_project.integration.verticle;

import com.phelim.gateway_vertx_project.config.ModuleConfig;
import com.phelim.gateway_vertx_project.exception.CommonExceptions;
import com.phelim.gateway_vertx_project.consumer.Consumer;
import com.phelim.gateway_vertx_project.consumer.ConsumerImpl;
import com.phelim.gateway_vertx_project.integration.module.GatewayModule;
import com.phelim.gateway_vertx_project.integration.util.VertxPropertiesUtil;
import io.micrometer.core.instrument.MeterRegistry;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;
import com.google.inject.Guice;
import com.google.inject.Injector;

//Vertx runtime
@Slf4j
public class MainVerticle extends AbstractVerticle {
    private final MeterRegistry meterRegistry;

    public MainVerticle(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @Override
    public void start() {
        log.info("[MainVerticle][start] Start service");

        if (!context.config().isEmpty()) {
            ModuleConfig config = (ModuleConfig) VertxPropertiesUtil.loadProperties(context.config().encode(), new ModuleConfig());
            Vertx vertx = this.vertx;

            try {
                /**
                 * ConsumerImpl
                 *    ↓ inject
                 * CicConsumerImpl
                 *    ↓ inject
                 * CallApiModule
                 *    ↓ inject
                 * Gson
                 */
                //Injector ~ DI container
                Injector injector = Guice.createInjector(
                        new GatewayModule(vertx, meterRegistry, config)
                );

                Consumer consumer = injector.getInstance(ConsumerImpl.class);
                consumer.usingRestful();
                consumer.start();

            } catch (Exception e) {
                log.error("[MainVerticle][start] GUICE ERROR: ", e);
            }
        } else {
            log.error("[MainVerticle][start] Not found config file");
            throw new CommonExceptions.InvalidConfig("Not found config file");
        }
    }
}

