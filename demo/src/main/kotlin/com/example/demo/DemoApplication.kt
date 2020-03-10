package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
//@RestController
class DemoApplication {
//    @Autowired
//    private lateinit var planRepository: PlanRepository

//    @GetMapping("/api/")
//    fun home() : String {
//        return "Hello"
//    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
