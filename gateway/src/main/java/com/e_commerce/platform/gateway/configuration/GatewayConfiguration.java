package com.e_commerce.platform.gateway.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class GatewayConfiguration {

    public RouterFunction<ServerResponse> getRoute() {
        return null;
    }
}
