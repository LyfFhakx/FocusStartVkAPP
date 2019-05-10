package com.gmail.intellect.logos.vkapp.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.gmail.intellect.logos.vkapp.App
import com.gmail.intellect.logos.vkapp.view.fragment.profile.message.CatMessage
import com.gmail.intellect.logos.vkapp.view.fragment.profile.message.PostMessage
import com.gmail.intellect.logos.vkapp.navigation.screens.Screen
import com.gmail.intellect.logos.vkapp.view.ProfileView

@InjectViewState
class ProfileViewPresenter : MvpPresenter<ProfileView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showProfile("Lya Ka Koe","08.01.1910","City","Delicious","http://mila.kcbux.ru/babo/image/ico-babo/bab-001.png")

        viewState.showFeed((1..100).map {
            if (it % 5 == 0) {
                CatMessage(
                    it,
                    "https://ichef.bbci.co.uk/images/ic/720x405/p0517py6.jpg"
                )
            } else {
                PostMessage(
                    it,
                    "Message".repeat(30),
                    "https://picsum.photos/id/$it/200/300"
                )
            }
        })
    }

    fun logout() {
        App.INCTANCE.router.replaceScreen(Screen.LogInScreen())
       // TODO("Navigate to login")
    }

}