package com.anokmik.databinding.model

class User(val firstName: String, val lastName: String) {
    companion object {
        val default: User = User("Sundar", "Pichai")
    }
}