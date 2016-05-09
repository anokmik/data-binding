package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.bindView
import com.anokmik.databinding.R
import com.anokmik.databinding.model.User

class ButterKnifeFragment : BaseFragment() {

    private val firstName by bindView<TextView>(R.id.first_name)

    private val lastName by bindView<TextView>(R.id.last_name)

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