package com.demo.mongdb.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Document
data class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var name: String = "",
        var age: Int = 0
)

