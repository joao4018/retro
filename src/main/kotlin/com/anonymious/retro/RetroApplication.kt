package com.anonymious.retro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RetroApplication

fun main(args: Array<String>) {
	runApplication<RetroApplication>(*args)
}
