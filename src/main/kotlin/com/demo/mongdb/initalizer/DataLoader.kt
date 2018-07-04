package com.demo.mongdb.initalizer

import com.demo.mongdb.domain.User
import com.demo.mongdb.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader : CommandLineRunner {

    @Autowired
    lateinit var userRepository: UserRepository;

    override fun run(vararg args: String?) {
        userRepository.save(User(1,"Aphisit Namracha",24))
        userRepository.save(User(2,"Justin Trudor",45))
        userRepository.save(User(3,"Donald Trump",68))
        userRepository.save(User(4,"Hillary Clinton",56))

    }

}

