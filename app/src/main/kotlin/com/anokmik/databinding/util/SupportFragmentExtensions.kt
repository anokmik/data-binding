package com.anokmik.databinding.util

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

fun FragmentManager.add(fragment: Fragment, @IdRes containerId: Int) {
    beginTransaction().add(containerId, fragment).commit()
}

fun FragmentManager.replace(fragment: Fragment, @IdRes containerId: Int) {
    beginTransaction().replace(containerId, fragment).addToBackStack(null).commit()
}