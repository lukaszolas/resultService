package com.example.ResultsService.votingService.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class RestConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}