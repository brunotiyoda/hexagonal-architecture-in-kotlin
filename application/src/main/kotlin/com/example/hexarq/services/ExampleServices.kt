package com.example.hexarq.services

import com.example.hexarq.usecases.ExampleUseCase
import org.springframework.stereotype.Service

@Service
class ExampleServices : ExampleUseCase {

    override fun message(message: String): String {
        return message
    }
}