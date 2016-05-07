package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.anokmik.databinding.R
import com.anokmik.databinding.databinding.FragmentBindingModelBinding
import com.anokmik.databinding.model.User

class BindingModelFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_binding_model, container, false)
        FragmentBindingModelBinding.bind(view).user = User.default
        return view
    }

}