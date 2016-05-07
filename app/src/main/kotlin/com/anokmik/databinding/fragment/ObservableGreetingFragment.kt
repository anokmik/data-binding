package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.ObservableGreetingFragmentCommunicator
import com.anokmik.databinding.databinding.FragmentObservableGreetingBinding

class ObservableGreetingFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_observable_greeting, container, false)
        FragmentObservableGreetingBinding.bind(view).communicator = ObservableGreetingFragmentCommunicator()
        return view
    }

}