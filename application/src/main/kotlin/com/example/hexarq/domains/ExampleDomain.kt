package com.example.hexarq.domains

import com.example.hexarq.ExampleEntity

class ExampleDomain(
    val message: String? = null
) {
}

fun ExampleDomain.toExampleEntity(): ExampleEntity {
    return ExampleEntity(messagem = message.let { it.orEmpty() })
}