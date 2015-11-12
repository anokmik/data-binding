package com.anokmik.databinding.communicator;

import android.databinding.ObservableBoolean;
import android.view.View;

public class CustomizationFragmentCommunicator {

    public ObservableBoolean state = new ObservableBoolean();

    public View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            state.set(!state.get());
        }

    };

}