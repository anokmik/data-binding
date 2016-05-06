package com.anokmik.databinding.communicator;

import android.content.Context;
import android.databinding.ObservableBoolean;
import android.databinding.adapters.TextViewBindingAdapter;
import android.text.TextUtils;
import android.widget.Toast;

import com.anokmik.databinding.R;

public class LoginFragmentCommunicator {

    private final Context context;

    private String loginValue;

    public ObservableBoolean isLoginValid = new ObservableBoolean(false);

    public ObservableBoolean isPasswordValid = new ObservableBoolean(false);

    public LoginFragmentCommunicator(Context context) {
        this.context = context;
    }

    public String getLoginValue() {
        return loginValue;
    }

    public void setLoginValue(String loginValue) {
        this.loginValue = loginValue;
    }

    public TextViewBindingAdapter.OnTextChanged onLoginTextChanged = new TextViewBindingAdapter.OnTextChanged() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            isLoginValid.set(!TextUtils.isEmpty(s));
        }
    };

    public TextViewBindingAdapter.OnTextChanged onPasswordTextChanged = new TextViewBindingAdapter.OnTextChanged() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            isPasswordValid.set(isLoginValid.get() & (s.length() >= 6));
        }
    };

    public void showToast() {
        Toast.makeText(context, context.getResources()
                .getString(R.string.greeting_sign_in, loginValue), Toast.LENGTH_SHORT).show();
    }

}