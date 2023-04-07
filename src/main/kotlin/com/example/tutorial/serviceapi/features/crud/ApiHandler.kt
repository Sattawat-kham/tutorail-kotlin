package com.example.tutorial.serviceapi.features.crud

import com.example.tutorial.serviceapi.dto.TransferRequest
import com.example.tutorial.serviceapi.features.crud.models.CreateCustomerRequest
import com.example.tutorial.serviceapi.features.crud.services.ApiService
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.awaitBody
import com.example.tutorial.serviceapi.utils.coHandler
import com.example.tutorial.serviceapi.utils.transferResponseSuccess
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.withContext

@Component
class ApiHandler (

    private val apiService: ApiService
){

    suspend fun getAllData(request: ServerRequest) =
        request.coHandler {
                transferResponseSuccess(
                    request.headers(),
                    withContext(NonCancellable) {
                        apiService.getData()
                    }
                )
        }
}