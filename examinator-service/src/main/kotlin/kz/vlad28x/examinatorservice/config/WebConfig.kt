package kz.vlad28x.examinatorservice.config

import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class WebConfig {

    @Bean
    @LoadBalanced
    fun restTemplate() = RestTemplate()

}