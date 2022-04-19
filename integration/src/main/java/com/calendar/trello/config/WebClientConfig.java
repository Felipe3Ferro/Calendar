package com.calendar.trello.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Configuration
public class WebClientConfig{

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://api.trello.com")
                .build();
    }
}
