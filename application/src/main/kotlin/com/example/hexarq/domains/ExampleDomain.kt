package com.example.hexarq.domains

import java.util.function.Consumer

class ExampleDomain(
    var message: String? = null
) {
    private constructor(builder: Builder) : this() {
        message = builder.message
    }

    data class Builder(
        var message: String? = null
    ) {
        fun with(consumer: Consumer<Builder>): Builder {
            consumer.accept(this)
            return this
        }

        fun build(): ExampleDomain {
            return ExampleDomain(this)
        }
    }
}