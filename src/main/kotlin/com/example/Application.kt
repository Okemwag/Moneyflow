package com.example

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSockets()
    configureAdministration()
    configureFrameworks()
    configureSerialization()
    configureDatabases()
    configureMonitoring()
    configureHTTP()
    configureSecurity()
    configureRouting()
}
