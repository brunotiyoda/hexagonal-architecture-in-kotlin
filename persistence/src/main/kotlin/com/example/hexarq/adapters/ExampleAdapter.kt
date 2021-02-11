package com.example.hexarq.adapters

import com.example.hexarq.domains.ExampleDomain
import com.example.hexarq.entities.ExampleEntity
import com.example.hexarq.entities.toExampleDomain
import com.example.hexarq.ports.out.ExamplePersistence
import com.example.hexarq.repositories.ExampleRepository
import org.springframework.stereotype.Service

@Service
class ExampleAdapter(
    private val exampleRepository: ExampleRepository
) : ExamplePersistence {

    override fun save(exampleDomain: ExampleDomain): ExampleDomain {
        val exampleEntity = ExampleEntity(
            message = exampleDomain.message
        )

        return exampleRepository.save(exampleEntity).toExampleDomain()
    }
}