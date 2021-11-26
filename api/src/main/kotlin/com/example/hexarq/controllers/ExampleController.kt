package com.example.hexarq.controllers

import com.example.hexarq.controllers.request.MessageRequest
import com.example.hexarq.controllers.response.MessageResponse
import com.example.hexarq.ports.`in`.SaveMessageUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/examples")
class ExampleController(
    private val saveMessageUseCase: SaveMessageUseCase
) {

    @PostMapping
    fun message(@RequestBody messageRequest: MessageRequest): ResponseEntity<MessageResponse> {
        return ResponseEntity.ok(MessageResponse(saveMessageUseCase.message(messageRequest.message)))
    }
}