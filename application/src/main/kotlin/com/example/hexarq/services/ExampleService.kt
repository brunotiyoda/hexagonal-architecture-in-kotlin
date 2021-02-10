package com.example.hexarq.services

import com.example.hexarq.domains.ExampleDomain
import com.example.hexarq.domains.toExampleEntity
import com.example.hexarq.entities.toExampleDomain
import com.example.hexarq.repositories.ExampleRepository
import com.example.hexarq.usecases.CallApiExternalUseCase
import com.example.hexarq.usecases.ExampleUseCase

class ExampleService(
    private val callApiExternalUseCase: CallApiExternalUseCase,
    private val exampleRepository: ExampleRepository
) : ExampleUseCase {

    override fun create(message: String): String {

        val buildExampleDomain = ExampleDomain.Builder()
            .with { builder -> builder.message = "new message"; }
            .build()
        // ter um mapper para entity ???

        val exampleDomain = ExampleDomain(message = message)
        val exampleEntity = exampleRepository.save(exampleDomain.toExampleEntity())
        return exampleEntity.toExampleDomain().message.let { it.orEmpty() }
    }

    fun callApiExternal(): String {
        return callApiExternalUseCase.call()
    }
}