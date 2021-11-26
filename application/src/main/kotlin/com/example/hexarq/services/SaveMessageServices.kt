package com.example.hexarq.services

import com.example.hexarq.domains.ExampleDomain
import com.example.hexarq.ports.out.ExamplePersistence
import com.example.hexarq.ports.`in`.SaveMessageUseCase
import org.springframework.stereotype.Service

@Service
class SaveMessageServices(
    private val examplePersistence: ExamplePersistence
) : SaveMessageUseCase {

    override fun message(message: String): String {
        val buildExampleDomain = ExampleDomain.Builder()
            .with { builder -> builder.message = message; }
            .build()

        return examplePersistence.save(buildExampleDomain).message.let { it.orEmpty() }
    }
}