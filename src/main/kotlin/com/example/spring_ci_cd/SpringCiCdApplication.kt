package com.example.spring_ci_cd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringCiCdApplication

fun main(args: Array<String>) {
	runApplication<SpringCiCdApplication>(*args)
}

@RestController
class DemoController {

	@GetMapping("/")
	fun demo() = "Hello, Render!!!"
}