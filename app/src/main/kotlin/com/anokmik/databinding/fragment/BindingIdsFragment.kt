package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.databinding.FragmentBindingIdsBinding
import com.anokmik.databinding.model.User

class BindingIdsFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_binding_ids, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = User.DEFAULT
        FragmentBindingIdsBinding.bind(view).apply {
            firstName.text = user.firstName
            lastName.text = user.lastName
        }
    }

}