package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.NotifyGreetingFragmentCommunicator
import com.anokmik.databinding.databinding.FragmentNotifyGreetingBinding

class NotifyGreetingFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_notify_greeting, container, false)
        FragmentNotifyGreetingBinding.bind(view).communicator = NotifyGreetingFragmentCommunicator()
        return view
    }

}