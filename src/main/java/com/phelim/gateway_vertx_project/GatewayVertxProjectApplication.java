package com.phelim.gateway_vertx_project;

import com.phelim.gateway_vertx_project.integration.verticle.MainVerticle;
import com.phelim.gateway_vertx_project.config.ModuleConfig;
import com.phelim.gateway_vertx_project.integration.util.VertxPropertiesUtil;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.micrometer.MicrometerMetricsOptions;
import io.vertx.micrometer.VertxPrometheusOptions;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;

//Entry point
@Slf4j
public class GatewayVertxProjectApplication {

	// Run in local
	public static void main(String[] args) throws IOException, InterruptedException {
		log.info("------------------------------Start service--------------------------------------");

		InputStream is = GatewayVertxProjectApplication.class.getClassLoader().getResourceAsStream("vertx-project.json");

		if (is == null) {
			throw new RuntimeException("Cannot find vertx-project.json in resources");
		}

		String content = new String(is.readAllBytes());
		JsonObject jsonConfig = new JsonObject(content);

		ModuleConfig moduleConfig = (ModuleConfig) VertxPropertiesUtil.loadProperties(jsonConfig.encode(), new ModuleConfig());
		MeterRegistry meterRegistry = new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);
		VertxOptions options = new VertxOptions()
				.setWorkerPoolSize(moduleConfig.getWorkerPoolSize())
				.setMetricsOptions(
						new MicrometerMetricsOptions()
								.setPrometheusOptions(new VertxPrometheusOptions().setEnabled(true))
								.setMicrometerRegistry(meterRegistry)
								.setEnabled(true)
								.setJvmMetricsEnabled(true)
				);
		Vertx vertx = Vertx.vertx(options);

		//DeploymentOptions ~ context.config()
		DeploymentOptions deploymentOptions = new DeploymentOptions()
				.setConfig(jsonConfig);

		vertx.deployVerticle(new MainVerticle(meterRegistry), deploymentOptions, res -> {
			if (res.succeeded()) {
				log.info("[GatewayVertxProjectApplication][main] Deploy MainVerticle SUCCESS");
			} else {
				log.error("[GatewayVertxProjectApplication][main] Deploy FAILED", res.cause());
			}
		});

		Thread.currentThread().join();
	}

}