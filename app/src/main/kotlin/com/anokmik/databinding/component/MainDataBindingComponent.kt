package com.anokmik.databinding.component

import android.databinding.BindingAdapter
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.StateListDrawable
import android.widget.Button

class MainDataBindingComponent {

    @BindingAdapter(value = *arrayOf("defaultColor", "pressedColor"))
    fun setButtonStateListBackground(button: Button, defaultColor: Int, pressedColor: Int) {
        button.background = getButtonStateListDrawable(defaultColor, pressedColor);
    }

    private fun getButtonStateListDrawable(defaultColor: Int, pressedColor: Int): StateListDrawable {
        val drawable = StateListDrawable()
        drawable.addState(IntArray(1, { android.R.attr.state_pressed }), ColorDrawable(pressedColor));
        drawable.addState(IntArray(0), ColorDrawable(defaultColor));
        return drawable;
    }

}