package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.TwoWayCommunicator
import com.anokmik.databinding.databinding.FragmentTwoWayBinding

class TwoWayFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_two_way, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentTwoWayBinding.bind(view).communicator = TwoWayCommunicator(resources)
    }

}