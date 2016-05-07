package com.anokmik.databinding.model

import android.databinding.ObservableBoolean

class Note(val text: String, val category: String, state: Boolean) {

    val state: ObservableBoolean = ObservableBoolean(state)

}