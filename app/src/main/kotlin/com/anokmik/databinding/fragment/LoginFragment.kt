package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.LoginFragmentCommunicator
import com.anokmik.databinding.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_login, container, false)
        FragmentLoginBinding.bind(view).communicator = LoginFragmentCommunicator(activity.applicationContext)
        return view
    }

}