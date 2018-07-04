package com.demo.mongdb.controlller

import com.demo.mongdb.domain.User
import com.demo.mongdb.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/findAll")
    fun findAll() : List<User> = userService.findAll()
}