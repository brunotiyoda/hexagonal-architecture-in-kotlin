package com.example.hexarq.entities

import com.example.hexarq.domains.ExampleDomain
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ExampleEntity(
    @Id
    val id: Long? = 1,
    val message: String? = null
) {
}

fun ExampleEntity.toExampleDomain(): ExampleDomain {
    return ExampleDomain(message = message)
}