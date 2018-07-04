package com.demo.mongdb.repository


import com.demo.mongdb.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User,Long>