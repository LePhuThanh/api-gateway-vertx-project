package com.phelim.gateway_vertx_project.consumer;

import com.google.inject.Inject;
import com.phelim.gateway_vertx_project.config.ModuleConfig;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.micrometer.PrometheusScrapingHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsumerImpl implements Consumer {

    private Vertx vertx;
    private ModuleConfig moduleConfig;
    private HttpServer server;
//    private IPayooQRConsumer payooQRConsumer;

    private CicConsumer cicConsumer;

    @Inject
    public ConsumerImpl(
            Vertx vertx,
            ModuleConfig moduleConfig,
//            IPayooQRConsumer payooQRConsumer,
            CicConsumer cicConsumer
    )
    {
        this.vertx = vertx;
        this.moduleConfig = moduleConfig;
//        this.payooQRConsumer = payooQRConsumer;
        this.cicConsumer=cicConsumer;

    }

    @Override
    public Consumer usingRestful() {
        log.info("[ConsumerImpl][usingRestful] ENTER usingRestful");

        if (moduleConfig.getHttpServer() == null) {
            log.error("[ConsumerImpl][usingRestful] httpServer config is NULL");
        }

        // Create a HTTP server
        server = vertx.createHttpServer(new HttpServerOptions().setHost(moduleConfig.getHttpServer().getHost())
                .setPort(moduleConfig.getHttpServer().getPort())
                .setIdleTimeout(moduleConfig.getIdleTimeOut()));

        // Create a router
        Router router = Router.router(vertx);

        // Handle every request using a router
        server.requestHandler(router);

//        payooQRConsumer.handlerRouter(router);
        cicConsumer.handlerRouter(router);

        router.get("/metrics").handler(PrometheusScrapingHandler.create());
        return this;
    }

    @Override
    public Consumer usingMq() {
        return this;
    }

    @Override
    public Consumer start() {
        log.info("[ConsumerImpl][start] Server={}", server);
        if (server == null) {
            log.error("[ConsumerImpl][start] Server is null => not started");
            return this;
        }

        server.listen(event -> {
            if (event.succeeded()) {
                log.info("[ConsumerImpl][start] Listen on port {}", moduleConfig.getHttpServer().getPort());
            } else {
                log.error("[ConsumerImpl][start] Listen failed on port {} cause by {}", moduleConfig.getHttpServer().getPort(), event.cause().getMessage());
            }
        });

        log.info("[ConsumerImpl][start] start vertx-project complete");
        return this;
    }
}

