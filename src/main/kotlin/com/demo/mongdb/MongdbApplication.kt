package com.demo.mongdb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongdbApplication

fun main(args: Array<String>) {
    runApplication<MongdbApplication>(*args)
}
