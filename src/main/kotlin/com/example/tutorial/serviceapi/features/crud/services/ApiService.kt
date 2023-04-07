package com.example.tutorial.serviceapi.features.crud.services

import com.example.tutorial.serviceapi.features.crud.models.CreateCustomerRequest
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ApiService {

    companion object {
        private val logger = LoggerFactory.getLogger(ApiService::class.java)
    }

    suspend fun getData(): Any {

        return "return"
    }
}