package com.anokmik.databinding.communicator;

import android.content.Context
import android.databinding.ObservableBoolean
import android.databinding.adapters.TextViewBindingAdapter
import android.text.TextUtils
import android.widget.Toast
import com.anokmik.databinding.R

class LoginFragmentCommunicator(val context: Context) {

    var loginValue: String? = null

    @JvmField
    val isLoginValid: ObservableBoolean = ObservableBoolean(false)

    @JvmField
    val isPasswordValid: ObservableBoolean = ObservableBoolean(false)

    @JvmField
    val onLoginTextChanged: TextViewBindingAdapter.OnTextChanged = TextViewBindingAdapter.OnTextChanged { s, start, before, count -> isLoginValid.set(!TextUtils.isEmpty(s)) }

    @JvmField
    val onPasswordTextChanged: TextViewBindingAdapter.OnTextChanged = TextViewBindingAdapter.OnTextChanged { s, start, before, count -> isPasswordValid.set(isLoginValid.get() && (s.length >= 6)) }

    fun showToast() {
        Toast.makeText(context, context.resources.getString(R.string.greeting_sign_in, loginValue), Toast.LENGTH_SHORT).show()
    }

}