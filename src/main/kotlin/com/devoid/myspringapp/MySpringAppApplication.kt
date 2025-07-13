package com.devoid.myspringapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MySpringAppApplication

fun main(args: Array<String>) {
    runApplication<MySpringAppApplication>(*args)
}
