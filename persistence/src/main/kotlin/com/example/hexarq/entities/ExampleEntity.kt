package com.example.hexarq.entities

import com.example.hexarq.domains.ExampleDomain

data class ExampleEntity(
    val id: Long? = 1,
    val message: String? = null
) {
}

fun ExampleEntity.toExampleDomain(): ExampleDomain {
    return ExampleDomain(message = message)
}