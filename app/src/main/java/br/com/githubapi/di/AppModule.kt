package br.com.githubapi.di

import br.com.githubapi.data.api.GithubApi
import br.com.githubapi.domian.repository.UserRepository
import br.com.githubapi.data.repository.UserRepositoryImpl
import br.com.githubapi.domian.use_case.UserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserRepository(api: GithubApi): UserRepository{
        return UserRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideUserUseCase(repository: UserRepository): UserUseCase {
        return UserUseCase(repository)
    }

    @Singleton
    @Provides
    fun provideGithubApi(): GithubApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(GithubApi.BASE_URL)
            .build()
            .create(GithubApi::class.java)
    }
}