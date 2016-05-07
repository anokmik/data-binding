package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.databinding.FragmentBindingIdsBinding
import com.anokmik.databinding.model.User

class BindingIdsFragment : BaseFragment() {

    private lateinit var binding: FragmentBindingIdsBinding

    private val firstName by lazy { binding.firstName }

    private val lastName by lazy { binding.lastName }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View? = inflater?.inflate(R.layout.fragment_binding_ids, container, false)
        binding = FragmentBindingIdsBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = User.default
        firstName?.text = user.firstName
        lastName?.text = user.lastName
    }

}