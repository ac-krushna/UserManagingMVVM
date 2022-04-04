package com.example.busmanagingmvvm.domain.model

import com.google.gson.annotations.SerializedName

data class User(

    @field:SerializedName("firstName")
    val firstName: String? = null,

    @field:SerializedName("lastName")
    val lastName: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("updatedDate")
    val updatedDate: String? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("registerDate")
    val registerDate: String? = null
)