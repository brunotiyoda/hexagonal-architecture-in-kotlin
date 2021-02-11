package com.example.hexarq

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.hexarq"])
open class HexagonalArchitectureApplication

fun main(args: Array<String>) {
    runApplication<HexagonalArchitectureApplication>(*args)
}