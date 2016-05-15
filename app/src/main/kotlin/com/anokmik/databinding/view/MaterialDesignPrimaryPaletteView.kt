package com.anokmik.databinding.view

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.support.v7.widget.GridLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import com.anokmik.databinding.R

class MaterialDesignPrimaryPaletteView : GridLayout, View.OnClickListener {

    var listener: OnColorChangeListener? = null

    var color: Int = 0

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context)
    }

    override fun onClick(v: View) {
        color = getColorFromView(v)
        listener?.onColorChange(this, color)
    }

    private fun init(context: Context) {
        columnCount = 5
        LayoutInflater.from(context).inflate(R.layout.view_material_design_primary_palette, this, true)
        for (i in 0..childCount - 1) getChildAt(i).setOnClickListener(this)
    }

    private fun getColorFromView(view: View): Int {
        return (view.background as ColorDrawable).color
    }

    interface OnColorChangeListener {

        fun onColorChange(view: MaterialDesignPrimaryPaletteView, color: Int)

    }

}