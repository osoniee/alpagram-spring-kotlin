package com.alpaka.osoniee.alpagram.rest.practice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/practice")
class HelloWorldController {
    @GetMapping("/hello-world")
    fun helloWorld(): String {
        return "Hello world ! This is REST endpoint !";
    }
}
