package com.example.hexarq

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.hexarq"])
class HexagonalArchitecture

fun main(args: Array<String>) {
    runApplication<HexagonalArchitecture>(*args)
}