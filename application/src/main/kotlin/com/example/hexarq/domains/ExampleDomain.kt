package com.example.hexarq.domains

import com.example.hexarq.entities.ExampleEntity

class ExampleDomain(
    val message: String? = null
) {
}

fun ExampleDomain.toExampleEntity(): ExampleEntity {
    return ExampleEntity(message = message.let { it.orEmpty() })
}