package com.anokmik.databinding.communicator;

import android.databinding.adapters.TextViewBindingAdapter
import com.anokmik.databinding.model.NotifyGreeting

class NotifyGreetingFragmentCommunicator {

    @JvmField
    val notifyGreeting: NotifyGreeting = NotifyGreeting()

    @JvmField
    val onGreetingTextChanged: TextViewBindingAdapter.OnTextChanged = TextViewBindingAdapter.OnTextChanged { s, start, before, count -> notifyGreeting.name = s.toString() }

}