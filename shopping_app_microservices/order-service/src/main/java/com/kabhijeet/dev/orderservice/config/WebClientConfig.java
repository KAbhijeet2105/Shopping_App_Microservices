package com.kabhijeet.dev.orderservice.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder()
    {
        return  WebClient.builder();
    }

}

/*
* here we added client side load-balancing
* so if service finds multiple instances of inventory service
* it will start calling one by one.
* */