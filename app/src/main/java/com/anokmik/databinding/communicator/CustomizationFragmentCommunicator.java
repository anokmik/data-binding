package com.anokmik.databinding.communicator;

import android.databinding.ObservableBoolean;

public class CustomizationFragmentCommunicator {

    public ObservableBoolean state = new ObservableBoolean();

    public void switchState() {
        state.set(!state.get());
    }

}