package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.databinding.FragmentBindingIdsBinding
import com.anokmik.databinding.model.User

class BindingIdsFragment : BaseFragment() {

    private val binding by lazy { FragmentBindingIdsBinding.bind(view) }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_binding_ids, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = User.default
        binding.apply {
            firstName.text = user.firstName
            lastName.text = user.lastName
        }
    }

}