package com.example.hexarq.controllers

import com.example.hexarq.usecases.ExampleUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/examples")
class ExampleController(
    private val exampleUseCase: ExampleUseCase
) {

    @PostMapping
    fun message(@RequestBody message: String): String {
        return exampleUseCase.message(message)
    }
}