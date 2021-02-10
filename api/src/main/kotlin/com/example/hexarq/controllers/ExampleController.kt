package com.example.hexarq.controllers

import com.example.hexarq.dtos.ExampleDTO
import com.example.hexarq.usecases.ExampleUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("examples")
class ExampleController(
    private val exampleUseCase: ExampleUseCase
) {

    @PostMapping("message")
    fun create(@RequestBody exampleDTO: ExampleDTO): String {
        return exampleUseCase.create(exampleDTO.message)
    }

}