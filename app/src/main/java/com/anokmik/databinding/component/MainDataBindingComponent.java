package com.anokmik.databinding.component;

import android.databinding.BindingAdapter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.Button;

public class MainDataBindingComponent {

    @BindingAdapter(value = {"defaultColor", "pressedColor"})
    public void setButtonStateListBackground(Button button, int defaultColor, int pressedColor) {
        button.setBackground(getButtonStateListDrawable(defaultColor, pressedColor));
    }

    private StateListDrawable getButtonStateListDrawable(int defaultColor, int pressedColor) {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(pressedColor));
        drawable.addState(new int[]{}, new ColorDrawable(defaultColor));
        return drawable;
    }

}