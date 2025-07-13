package com.devoid.myspringapp.service

import org.springframework.stereotype.Service

@Service
class BasicService {
    
    fun handleHi(): String {
        return "Hello"
    }
} 