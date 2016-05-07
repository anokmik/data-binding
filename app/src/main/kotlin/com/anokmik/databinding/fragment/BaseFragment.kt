package com.anokmik.databinding.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View

abstract class BaseFragment : Fragment() {

    private val keyTitle = "title"

    private val keyShowBack = "show_back"

    private val title by lazy { arguments.getString(keyTitle) }

    private val showBack by lazy { arguments.getBoolean(keyShowBack) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareActionBar()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> activity?.onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    fun initArguments(title: String, showBack: Boolean = true) {
        arguments = Bundle()
        arguments.putString(keyTitle, title)
        arguments.putBoolean(keyShowBack, showBack)
    }

    private fun prepareActionBar() {
        val supportActionBar = (activity as AppCompatActivity).supportActionBar
        supportActionBar?.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(showBack)
    }

}
