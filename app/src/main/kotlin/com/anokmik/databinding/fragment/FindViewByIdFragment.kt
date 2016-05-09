package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.anokmik.databinding.R
import com.anokmik.databinding.model.User

class FindViewByIdFragment : BaseFragment() {

    private val firstName by lazy { view?.findViewById(R.id.first_name) as TextView }

    private val lastName by lazy { view?.findViewById(R.id.last_name) as TextView }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_simple, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = User.DEFAULT
        firstName.text = user.firstName
        lastName.text = user.lastName
    }

}