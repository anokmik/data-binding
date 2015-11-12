package com.anokmik.databinding.communicator;

import android.text.Editable;

import com.anokmik.databinding.model.NotifyGreeting;
import com.anokmik.databinding.util.SimpleTextWatcher;

public class NotifyGreetingFragmentCommunicator {

    public NotifyGreeting notifyGreeting = new NotifyGreeting();

    public SimpleTextWatcher nameTextWatcher = new SimpleTextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {
            notifyGreeting.setName(s.toString());
        }

    };

}