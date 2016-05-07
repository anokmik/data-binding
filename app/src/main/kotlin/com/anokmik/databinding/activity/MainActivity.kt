package com.anokmik.databinding.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.anokmik.databinding.R
import com.anokmik.databinding.databinding.ActivityMainBinding
import com.anokmik.databinding.fragment.MainFragment
import com.anokmik.databinding.listener.OnFragmentEventListener
import com.anokmik.databinding.util.add
import com.anokmik.databinding.util.replace

class MainActivity : AppCompatActivity(), OnFragmentEventListener {

    private val binding: ActivityMainBinding by lazy { DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(binding.toolbar)
        supportFragmentManager.add(getMainFragment(), binding.container.id)
    }

    override fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.replace(fragment, binding.container.id)
    }

    fun getMainFragment(): MainFragment {
        val fragment = MainFragment()
        fragment.initArguments(getString(R.string.app_name), false)
        return fragment
    }

}