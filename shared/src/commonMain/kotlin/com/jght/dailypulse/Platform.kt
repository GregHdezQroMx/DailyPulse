package com.jght.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform