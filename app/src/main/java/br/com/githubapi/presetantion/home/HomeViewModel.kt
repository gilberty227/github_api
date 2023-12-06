package br.com.githubapi.presetantion.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.githubapi.domian.model.User
import br.com.githubapi.domian.use_case.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val userCase: UserUseCase) : ViewModel(){

    private val _state = mutableStateOf(UserState())
    val state: State<UserState> = _state
    var finishDownload = MutableLiveData<Boolean?>()

    init {
        getUser("torvalds")
    }

    fun getUser(userName: String){
        viewModelScope.launch {
            try {

                userCase.getUser(userName).collect {

                }
                _state.value = state.value.copy(isLoading = true)
                /*_state.value = state.value.copy(
                    user = userCase.getUser(userName),
                    isLoading = false)*/
            } catch (e: Exception){
                _state.value = state.value.copy(isLoading = false)
            }
        }
    }

    data class  UserState(
        var user: User? = null,
        var isLoading: Boolean = false
    )


}