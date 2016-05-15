package com.anokmik.databinding.component;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingComponent;
import android.databinding.InverseBindingListener;

import com.anokmik.databinding.view.MaterialDesignPrimaryPaletteView;

import static com.anokmik.databinding.view.MaterialDesignPrimaryPaletteView.OnColorChangeListener;

public class TwoWayDataBindingComponent implements DataBindingComponent {

    @Override
    public TwoWayDataBindingComponent getTwoWayDataBindingComponent() {
        return this;
    }

    @BindingAdapter(value = {"onColorChange", "colorAttrChanged"}, requireAll = false)
    public void setColorListener(MaterialDesignPrimaryPaletteView view, final OnColorChangeListener listener, final InverseBindingListener colorChange) {
        if (colorChange == null) {
            view.setOnColorChangeListener(listener);
        } else {
            view.setOnColorChangeListener(new OnColorChangeListener() {
                @Override
                public void onColorChange(MaterialDesignPrimaryPaletteView view, int color) {
                    if (listener != null) {
                        listener.onColorChange(view, color);
                    }
                    colorChange.onChange();
                }
            });
        }
    }

    @BindingAdapter("color")
    public void setColor(MaterialDesignPrimaryPaletteView view, int color) {
        if (color != view.getColor()) {
            view.setColor(color);
        }
    }

}