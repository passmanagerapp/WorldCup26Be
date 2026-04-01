package com.akilincarslan

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = System.getenv("PORT")?.toInt() ?: 8000) {
        module()
    }.start(wait = true)
}

fun Application.module() {
    routing {
        get("/test") {
            call.respondText("Hello, Samet!")
        }
    }
}