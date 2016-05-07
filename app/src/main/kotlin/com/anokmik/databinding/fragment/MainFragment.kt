package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.MainFragmentCommunicator
import com.anokmik.databinding.databinding.FragmentMainBinding
import com.anokmik.databinding.listener.OnFragmentEventListener
import com.anokmik.databinding.util.castObjectOrThrow

class MainFragment : BaseFragment() {

    private val listener by lazy { castObjectOrThrow<OnFragmentEventListener>(activity) }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_main, container, false)
        FragmentMainBinding.bind(view).communicator = MainFragmentCommunicator(resources, listener)
        return view
    }

}