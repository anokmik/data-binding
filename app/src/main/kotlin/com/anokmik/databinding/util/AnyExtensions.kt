package com.anokmik.databinding.util

import android.databinding.ObservableBoolean

@Suppress("UNCHECKED_CAST")
fun <T> Any.castObject(o: Any): T {
    return o as T
}