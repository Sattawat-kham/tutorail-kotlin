package com.example.tutorial.serviceapi.features.crud

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class ApiRouter {

    @Bean
    fun router(handler: ApiHandler) = coRouter {
        accept(MediaType.APPLICATION_JSON).nest {
            GET("/getAllData", handler::getAllData)
        }
    }
}