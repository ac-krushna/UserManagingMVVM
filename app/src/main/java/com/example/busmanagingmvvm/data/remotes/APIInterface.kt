package com.example.busmanagingmvvm.data.remotes

import com.example.busmanagingmvvm.data.model.UserModelDTO
import com.google.gson.JsonObject
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface APIInterface {

    @GET("user")
    suspend fun getUserPagination(
        @HeaderMap map:Map<String,String>,
        @Query("limit") limit:String
    ): UserModelDTO?

    @GET("user/{id}")
    suspend fun getUserDetails(
        @HeaderMap map:Map<String,String>,
        @Path("id") id:String
    ): UserModelDTO?

    @POST("user/create")
    suspend fun createUser(
        @HeaderMap map:Map<String,String>,
        @Body json:JsonObject
    ): UserModelDTO?

    @PUT("user/{id}")
    suspend fun updateUser(
        @HeaderMap map:Map<String,String>,
        @Path("id") id:String,
        @Body json:JsonObject
    ): UserModelDTO?

    @DELETE("user/{id}")
    suspend fun deleteUserDetails(
        @HeaderMap map:Map<String,String>,
        @Path("id") id:String
    ): UserModelDTO?
}