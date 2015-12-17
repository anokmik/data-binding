package com.anokmik.databinding.communicator;

import android.text.Editable
import com.anokmik.databinding.model.NotifyGreeting
import com.anokmik.databinding.util.SimpleTextWatcher

class NotifyGreetingFragmentCommunicator {

    @JvmField
    val notifyGreeting: NotifyGreeting = NotifyGreeting()

    @JvmField
    val nameTextWatcher: SimpleTextWatcher = object : SimpleTextWatcher() {
        override fun afterTextChanged(editable: Editable) {
            notifyGreeting.name = editable.toString()
        }
    }

}