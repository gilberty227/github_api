package br.com.githubapi.domian.use_case

import br.com.githubapi.domian.model.ListUsers
import br.com.githubapi.domian.model.User
import br.com.githubapi.domian.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class UserUseCase(private val repository: UserRepository) {

    fun getListUsers(): Flow<MutableList<ListUsers>> {
        return repository.getListUser()
    }

    fun getUser(userName: String): Flow<User> {
        return repository.getUser(userName = userName)
    }

    fun getListUsers(userName: String): Flow<MutableList<ListUsers>> {
        return repository.getRepositoriesUser(userName = userName)
    }
}