package com.anokmik.databinding.view;

import android.content.Context;
import android.databinding.InverseBindingMethod;
import android.databinding.InverseBindingMethods;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.GridLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import com.anokmik.databinding.R;

@InverseBindingMethods({
        @InverseBindingMethod(type = MaterialDesignPrimaryPaletteView.class, attribute = "color"),
})
public class MaterialDesignPrimaryPaletteView extends GridLayout implements View.OnClickListener {

    private OnColorChangeListener listener;

    private int color;

    public MaterialDesignPrimaryPaletteView(Context context) {
        super(context);
        init(context);
    }

    public MaterialDesignPrimaryPaletteView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MaterialDesignPrimaryPaletteView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @Override
    public void onClick(View v) {
        int colorFromView = getColorFromView(v);
        setColor(colorFromView);
        if (listener != null) {
            listener.onColorChange(this, colorFromView);
        }
    }

    private void init(Context context) {
        setColumnCount(5);
        LayoutInflater.from(context).inflate(R.layout.view_material_deisgn_primary_palette, this, true);
        for (int i = 0, size = getChildCount(); i < size; i++) {
            getChildAt(i).setOnClickListener(this);
        }
    }

    private int getColorFromView(View view) {
        return ((ColorDrawable) view.getBackground()).getColor();
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setOnColorChangeListener(OnColorChangeListener listener) {
        this.listener = listener;
    }

    public interface OnColorChangeListener {

        void onColorChange(MaterialDesignPrimaryPaletteView view, int color);

    }

}