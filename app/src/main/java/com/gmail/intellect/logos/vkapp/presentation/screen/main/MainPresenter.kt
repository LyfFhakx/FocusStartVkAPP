package com.gmail.intellect.logos.vkapp.presentation.screen.main

import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import com.gmail.intellect.logos.vkapp.presentation.navigation.Screen
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor(private val router: Router) : BasePresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.newRootScreen(Screen.SplashScreen())
    }
}