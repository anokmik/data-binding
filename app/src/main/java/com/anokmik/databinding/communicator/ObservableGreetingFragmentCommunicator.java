package com.anokmik.databinding.communicator;

import android.databinding.adapters.TextViewBindingAdapter;

import com.anokmik.databinding.model.ObservableGreeting;

public class ObservableGreetingFragmentCommunicator {

    public ObservableGreeting observableGreeting = new ObservableGreeting();

    public TextViewBindingAdapter.OnTextChanged onGreetingTextChanged = new TextViewBindingAdapter.OnTextChanged() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            observableGreeting.name.set(s.toString());
        }
    };

}