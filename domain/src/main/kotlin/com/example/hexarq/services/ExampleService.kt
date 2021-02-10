package com.example.hexarq.services

import com.example.hexarq.domains.ExampleDomain
import com.example.hexarq.domains.toExampleEntity
import com.example.hexarq.usecases.ExampleUseCase

class ExampleService : ExampleUseCase {

    override fun create(message: String): String {
        val exampleDomain = ExampleDomain(message = message)
        return exampleDomain.toExampleEntity().messagem
    }
}