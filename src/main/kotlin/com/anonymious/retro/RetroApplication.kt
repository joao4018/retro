package com.anonymious.retro

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.orm.hibernate5.LocalSessionFactoryBean


@EnableAutoConfiguration
class RetroApplication

@Bean(name = ["entityManagerFactory"])
fun sessionFactory(): LocalSessionFactoryBean {
	val sessionFactory = LocalSessionFactoryBean()

	return sessionFactory
}

fun main(args: Array<String>) {
	runApplication<RetroApplication>(*args)
}
