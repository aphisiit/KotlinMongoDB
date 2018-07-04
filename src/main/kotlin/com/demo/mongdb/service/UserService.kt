package com.demo.mongdb.service

import com.demo.mongdb.domain.User
import com.demo.mongdb.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

interface UserService{
    fun findAll() : List<User>
}

@Service(value = "UserService")
class UserServiceImpl : UserService{

    @Autowired
    lateinit var userRepository: UserRepository;

    override fun findAll(): List<User> = userRepository.findAll().toList();

}