package com.example.hexarq.services

import com.example.hexarq.domains.ExampleDomain
import com.example.hexarq.domains.toExampleEntity
import com.example.hexarq.usecases.CallApiExternalUseCase
import com.example.hexarq.usecases.ExampleUseCase

class ExampleService(private val callApiExternalUseCase: CallApiExternalUseCase) : ExampleUseCase {

    override fun create(message: String): String {
        val exampleDomain = ExampleDomain(message = message)
        return exampleDomain.toExampleEntity().messagem
    }

    fun callApiExternal(): String {
        return callApiExternalUseCase.call()
    }
}