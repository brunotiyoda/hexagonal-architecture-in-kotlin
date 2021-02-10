package com.example.hexarq.entities

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/examples")
class ExampleController {

    @PostMapping
    fun test(@RequestBody message: String): String {
        return message
    }
}