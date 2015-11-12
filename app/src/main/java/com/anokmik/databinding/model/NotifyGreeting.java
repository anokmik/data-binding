package com.anokmik.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.anokmik.databinding.BR;

public class NotifyGreeting extends BaseObservable {

    private String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

}
