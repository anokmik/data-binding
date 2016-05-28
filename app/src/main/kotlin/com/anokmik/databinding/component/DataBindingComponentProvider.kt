package com.anokmik.databinding.component

import android.databinding.DataBindingComponent

class DataBindingComponentProvider : DataBindingComponent {

    override fun getMainDataBindingComponent(): MainDataBindingComponent {
        return MainDataBindingComponent()
    }

    override fun getTwoWayDataBindingComponent(): TwoWayDataBindingComponent {
        return TwoWayDataBindingComponent()
    }

}