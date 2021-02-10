package com.example.hexarq.controllers

import com.example.hexarq.usecases.ExampleUseCase

class ExampleController(
    private val exampleUseCase: ExampleUseCase
) {

    fun create(start: String): String {
        return exampleUseCase.create(start)
    }

}