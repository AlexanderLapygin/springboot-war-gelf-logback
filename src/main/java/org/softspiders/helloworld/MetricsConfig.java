package org.softspiders.helloworld;

import io.micrometer.core.instrument.Clock;
import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricsConfig {
    @Bean
    public PrometheusMeterRegistry prometheusMeterRegistry() {
//        return new PrometheusMeterRegistry(PrometheusConfig.DEFAULT, Clock.SYSTEM);
        return new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);
    }
}
