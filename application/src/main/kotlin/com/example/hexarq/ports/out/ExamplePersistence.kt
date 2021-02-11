package com.example.hexarq.ports.out

import com.example.hexarq.domains.ExampleDomain

interface ExamplePersistence {

    fun save(exampleDomain: ExampleDomain): ExampleDomain
}