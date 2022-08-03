package com.dev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication(scanBasePackages = ["com.dev"])
open class ShareOfficeApplication {
    @GetMapping("ping")
    fun pong() = "pong"
}

fun main(args: Array<String>) {
    runApplication<ShareOfficeApplication>(*args)
}