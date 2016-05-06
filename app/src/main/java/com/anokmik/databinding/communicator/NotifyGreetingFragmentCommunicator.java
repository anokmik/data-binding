package com.anokmik.databinding.communicator;

import android.databinding.adapters.TextViewBindingAdapter;

import com.anokmik.databinding.model.NotifyGreeting;

public class NotifyGreetingFragmentCommunicator {

    public NotifyGreeting notifyGreeting = new NotifyGreeting();

    public TextViewBindingAdapter.OnTextChanged onGreetingTextChanged = new TextViewBindingAdapter.OnTextChanged() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            notifyGreeting.setName(s.toString());
        }
    };

}