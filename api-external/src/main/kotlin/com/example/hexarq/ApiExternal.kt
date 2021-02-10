package com.example.hexarq

import com.example.hexarq.usecases.CallApiExternalUseCase

class ApiExternal : CallApiExternalUseCase {
    override fun call(): String {
        return "API External"
    }
}