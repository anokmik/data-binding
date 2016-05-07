package com.anokmik.databinding.communicator;

import android.databinding.adapters.TextViewBindingAdapter
import com.anokmik.databinding.model.ObservableGreeting;

class ObservableGreetingFragmentCommunicator {

    @JvmField
    val observableGreeting: ObservableGreeting = ObservableGreeting()

    @JvmField
    val onGreetingTextChanged: TextViewBindingAdapter.OnTextChanged = TextViewBindingAdapter.OnTextChanged { s, start, before, count -> observableGreeting.name.set(s.toString()) }

}