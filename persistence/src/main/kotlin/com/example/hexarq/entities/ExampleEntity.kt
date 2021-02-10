package com.example.hexarq.entities

import com.example.hexarq.domains.ExampleDomain

data class ExampleEntity(
    val id: Long? = 0,
    val message: String
) {
}

fun ExampleEntity.toExampleDomain(): ExampleDomain {
    return ExampleDomain(message = message)
}