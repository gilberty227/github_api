package br.com.githubapi.data.api

import br.com.githubapi.domian.model.ListUsers
import br.com.githubapi.domian.model.User
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {

    companion object {
        const val BASE_URL = "https://api.github.com/"
    }

    @GET("./users")
    fun getListUsers(): Flow<MutableList<ListUsers>>

    @GET("./users/{userName}")
    fun getUser(
        @Path("userName") userName: String
    ): Flow<User>

    @GET("./users/{userName}/repos")
    fun getRepositoriesUser(
        @Path("userName")  userName: String
    ): Flow<MutableList<ListUsers>>
}