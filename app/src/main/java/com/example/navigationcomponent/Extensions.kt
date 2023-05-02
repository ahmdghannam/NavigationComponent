package com.example.navigationcomponent

import android.view.View
import androidx.navigation.Navigation

fun View.navigateTo(id: Int) {
    val controller = Navigation.findNavController(this)
    controller.navigate(id)
}