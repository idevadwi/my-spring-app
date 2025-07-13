package com.devoid.myspringapp.controller

import com.devoid.myspringapp.service.BasicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicController(private val basicService: BasicService) {
    
    @GetMapping("/hi")
    fun hi(): String {
        return basicService.handleHi()
    }
} 