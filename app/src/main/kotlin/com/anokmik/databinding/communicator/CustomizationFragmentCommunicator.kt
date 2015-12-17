package com.anokmik.databinding.communicator;

import android.databinding.ObservableBoolean;
import android.view.View;

class CustomizationFragmentCommunicator {

    @JvmField
    val state = ObservableBoolean()

    @JvmField
    val clickListener = View.OnClickListener { state.set(!state.get()) }

}