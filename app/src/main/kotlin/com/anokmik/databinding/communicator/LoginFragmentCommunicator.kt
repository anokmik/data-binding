package com.anokmik.databinding.communicator;

import android.databinding.ObservableBoolean;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.anokmik.databinding.R;
import com.anokmik.databinding.util.SimpleTextWatcher

class LoginFragmentCommunicator {

    private var loginValue: Editable? = null

    @JvmField
    val isLoginValid: ObservableBoolean = ObservableBoolean(false)

    @JvmField
    val isPasswordValid: ObservableBoolean = ObservableBoolean(false)

    @JvmField
    val loginTextWatcher: SimpleTextWatcher = object : SimpleTextWatcher() {
        override fun afterTextChanged(editable: Editable) {
            loginValue = editable
            isLoginValid.set(!TextUtils.isEmpty(editable))
        }
    }

    @JvmField
    val passwordTextWatcher: SimpleTextWatcher = object : SimpleTextWatcher() {
        override fun afterTextChanged(editable: Editable) {
            isPasswordValid.set(isLoginValid.get() && (editable.length >= 6))
        }
    }

    @JvmField
    val clickListener = View.OnClickListener {
        val context = it.context
        val signInValue = context.resources.getString(R.string.greeting_sign_in, loginValue);
        Toast.makeText(context, signInValue, Toast.LENGTH_SHORT).show()
    }

}