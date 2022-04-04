package com.example.busmanagingmvvm.data.model

import com.example.busmanagingmvvm.domain.model.User
import com.google.gson.annotations.SerializedName

data class UserModelDTO(

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
fun UserModelDTO.convertToUserModel():User{
	return User(
		firstName,
		lastName,
		id,
		updatedDate,
		email,
		registerDate
	)
}
