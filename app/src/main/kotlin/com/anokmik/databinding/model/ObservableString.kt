package com.anokmik.databinding.model

import android.databinding.BaseObservable

class ObservableString : BaseObservable() {

    var value: String? = null

    fun get(): String {
        return value ?: ""
    }

    fun set(value: String) {
        this.value = value
        notifyChange()
    }

    fun length(): Int {
        return value?.length ?: 0
    }

    override fun toString(): String {
        return get()
    }

}