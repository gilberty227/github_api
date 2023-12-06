package br.com.githubapi.data.repository

import br.com.githubapi.data.api.GithubApi
import br.com.githubapi.domian.model.ListUsers
import br.com.githubapi.domian.model.User
import br.com.githubapi.domian.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class UserRepositoryImpl(private val api: GithubApi) : UserRepository {
    override fun getListUser(): Flow<MutableList<ListUsers>> {
        return api.getListUsers()
    }

    override fun getUser(userName: String): Flow<User> {
        return api.getUser(userName)
    }

    override fun getRepositoriesUser(userName: String): Flow<MutableList<ListUsers>> {
        return api.getRepositoriesUser(userName)
    }


}