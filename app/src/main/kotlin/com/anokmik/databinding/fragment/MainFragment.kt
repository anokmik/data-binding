package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.MainFragmentCommunicator
import com.anokmik.databinding.databinding.FragmentMainBinding
import com.anokmik.databinding.listener.OnFragmentEventListener
import com.anokmik.databinding.util.castObject

class MainFragment : BaseFragment() {

    private val listener by lazy { castObject<OnFragmentEventListener>(activity) }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentMainBinding.bind(view).communicator = MainFragmentCommunicator(resources, listener)
    }

}