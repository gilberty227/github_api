package br.com.githubapi.domian.repository

import br.com.githubapi.domian.model.ListUsers
import br.com.githubapi.domian.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun getListUser(): Flow<MutableList<ListUsers>>

    fun getUser(userName: String): Flow<User>

    fun getRepositoriesUser(userName: String): Flow<MutableList<ListUsers>>


}