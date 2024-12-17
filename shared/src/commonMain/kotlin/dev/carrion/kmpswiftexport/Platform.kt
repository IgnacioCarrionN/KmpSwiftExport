package dev.carrion.kmpswiftexport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform