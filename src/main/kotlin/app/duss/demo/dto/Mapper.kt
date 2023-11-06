package app.duss.demo.dto

import app.duss.demo.model.Item
import app.duss.demo.model.User

/**
 * This file contains all mapping extension methods for DTOs.
 * In this simple example, there is only [Item] and [ItemDto].
 */
fun Item.toDto(): ItemDto {
    return ItemDto(
        id = id,
        name = name,
        count = count,
        note = note,
    )
}

fun User.toDto(): UserDto {
    return UserDto(
        id = id,
        username = username,
        firstName = firstName,
        lastName = lastName,
        role = role,
    )
}
