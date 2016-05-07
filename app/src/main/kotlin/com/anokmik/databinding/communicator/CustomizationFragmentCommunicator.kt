package com.anokmik.databinding.communicator;

import android.databinding.ObservableBoolean

class CustomizationFragmentCommunicator {

    @JvmField
    val state = ObservableBoolean()

    fun switchState() {
        state.set(!state.get())
    }

}