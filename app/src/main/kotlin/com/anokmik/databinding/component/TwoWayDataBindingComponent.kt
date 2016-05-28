package com.anokmik.databinding.component

import android.databinding.BindingAdapter
import android.databinding.InverseBindingListener
import android.databinding.InverseBindingMethod
import android.databinding.InverseBindingMethods
import com.anokmik.databinding.view.MaterialDesignPrimaryPaletteView

@InverseBindingMethods(
        InverseBindingMethod(type = MaterialDesignPrimaryPaletteView::class, attribute = "color")
)
class TwoWayDataBindingComponent {

    @BindingAdapter(value = *arrayOf("onColorChange", "colorAttrChanged"), requireAll = false)
    fun setColorListener(view: MaterialDesignPrimaryPaletteView, listener: MaterialDesignPrimaryPaletteView.OnColorChangeListener?, colorChange: InverseBindingListener?) {
        if (colorChange == null) {
            view.listener = listener
        } else {
            view.listener = object : MaterialDesignPrimaryPaletteView.OnColorChangeListener {
                override fun onColorChange(view: MaterialDesignPrimaryPaletteView, color: Int) {
                    listener?.onColorChange(view, color)
                    colorChange.onChange()
                }
            }
        }
    }

    @BindingAdapter("color")
    fun setColor(view: MaterialDesignPrimaryPaletteView, color: Int) {
        if (color != view.color) {
            view.color = color
        }
    }

}