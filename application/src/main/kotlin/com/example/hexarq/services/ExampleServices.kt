package com.example.hexarq.services

import com.example.hexarq.domains.ExampleDomain
import com.example.hexarq.ports.out.ExamplePersistence
import com.example.hexarq.usecases.ExampleUseCase
import org.springframework.stereotype.Service

@Service
class ExampleServices(
    private val examplePersistence: ExamplePersistence
) : ExampleUseCase {

    override fun message(message: String): String {
        val buildExampleDomain = ExampleDomain.Builder()
            .with { builder -> builder.message = "new message"; }
            .build()

        return examplePersistence.save(buildExampleDomain).message.let { it.orEmpty() }
    }
}