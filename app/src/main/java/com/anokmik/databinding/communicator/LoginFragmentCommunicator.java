package com.anokmik.databinding.communicator;

import android.databinding.ObservableBoolean;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.anokmik.databinding.R;
import com.anokmik.databinding.databinding.FragmentLoginBinding;
import com.anokmik.databinding.util.SimpleTextWatcher;

public class LoginFragmentCommunicator {

    private CharSequence loginValue;

    public ObservableBoolean isLoginValid = new ObservableBoolean(false);

    public ObservableBoolean isPasswordValid = new ObservableBoolean(false);

    public SimpleTextWatcher loginTextWatcher = new SimpleTextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {
            loginValue = s;
            isLoginValid.set(!TextUtils.isEmpty(s));
        }

    };

    public SimpleTextWatcher passwordTextWatcher = new SimpleTextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {
            isPasswordValid.set(isLoginValid.get() & (s.length() >= 6));
        }

    };

    public View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), v.getContext().getResources()
                    .getString(R.string.greeting_sign_in, loginValue), Toast.LENGTH_SHORT).show();
        }

    };

}