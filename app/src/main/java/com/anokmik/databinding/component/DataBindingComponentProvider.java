package com.anokmik.databinding.component;

import android.databinding.DataBindingComponent;

public class DataBindingComponentProvider implements DataBindingComponent {

    @Override
    public MainDataBindingComponent getMainDataBindingComponent() {
        return new MainDataBindingComponent();
    }

    @Override
    public TwoWayDataBindingComponent getTwoWayDataBindingComponent() {
        return new TwoWayDataBindingComponent();
    }

}