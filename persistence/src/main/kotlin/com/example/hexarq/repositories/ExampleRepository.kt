package com.example.hexarq.repositories

import com.example.hexarq.entities.ExampleEntity

interface ExampleRepository {
    fun save(exampleEntity: ExampleEntity): ExampleEntity
}