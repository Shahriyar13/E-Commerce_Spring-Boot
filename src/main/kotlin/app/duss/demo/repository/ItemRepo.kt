package app.duss.demo.repository

import app.duss.demo.model.Item
import app.duss.demo.model.User
import org.springframework.data.repository.CrudRepository

interface ItemRepo : CrudRepository<Item, Long> {
    override fun findAll(): List<Item>

    fun findByUser(user: User): List<Item>

    fun findByNameAndUser(name: String, user: User): Item?

    fun existsByNameAndUser(name: String, user: User): Boolean
}
