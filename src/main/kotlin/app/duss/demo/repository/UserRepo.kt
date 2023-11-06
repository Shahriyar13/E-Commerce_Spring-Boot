package app.duss.demo.repository

import app.duss.demo.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepo : CrudRepository<User, Long> {
    fun findByUsername(name: String): User?
    fun existsByUsername(name: String): Boolean
}
