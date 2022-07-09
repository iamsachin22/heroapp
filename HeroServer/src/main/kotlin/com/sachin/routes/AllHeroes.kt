package com.sachin.routes

import com.sachin.models.APIResponse
import com.sachin.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHeroes(){
    val heroRepository:HeroRepository by inject()
    get("indian/heroes"){
            try {
                val page = call.request.queryParameters["page"]?.toInt() ?: 1
                require(page in 1..5)

                val apiResponse = heroRepository.getAllHeroes(page= page)
                call.respond(
                    message = apiResponse,
                    status = HttpStatusCode.OK
               )
            }catch (e:java.lang.NumberFormatException){
                call.respond(
                    message = APIResponse(success = false, message = "Only Numbers Allowed."),
                    status = HttpStatusCode.BadGateway
                )
            }catch (e:IllegalArgumentException){
                call.respond(
                    message = APIResponse(success = false, message = "Heroes Not Found."),
                    status = HttpStatusCode.NotFound
                )
            }
    }
}