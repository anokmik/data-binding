package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.CustomizationFragmentCommunicator
import com.anokmik.databinding.databinding.FragmentCustomizationBinding

class CustomizationFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_customization, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentCustomizationBinding.bind(view).communicator = CustomizationFragmentCommunicator()
    }

}