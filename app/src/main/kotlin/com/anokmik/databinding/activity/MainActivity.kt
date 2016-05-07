package com.anokmik.databinding.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.anokmik.databinding.R
import com.anokmik.databinding.databinding.ActivityMainBinding
import com.anokmik.databinding.fragment.MainFragment
import com.anokmik.databinding.listener.OnFragmentEventListener

class MainActivity : AppCompatActivity(), OnFragmentEventListener {

    private val binding: ActivityMainBinding by lazy { DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(binding.toolbar)
        supportFragmentManager.beginTransaction().add(binding.container.id, getMainFragment(), null).commit()
    }

    override fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(binding.container.id, fragment).addToBackStack(null).commit()
    }

    fun getMainFragment(): MainFragment {
        val fragment = MainFragment()
        fragment.initArguments(getString(R.string.app_name), false)
        return fragment
    }

}