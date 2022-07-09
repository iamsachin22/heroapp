package com.sachin.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root(){
    get("/"){
        call.respond(
            message = "welcome to hero API",
            status = HttpStatusCode.OK
        )
    }
}