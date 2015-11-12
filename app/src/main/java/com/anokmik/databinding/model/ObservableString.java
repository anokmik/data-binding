package com.anokmik.databinding.model;

import android.databinding.BaseObservable;

public class ObservableString extends BaseObservable {

    String value;

    public ObservableString() {

    }

    public ObservableString(String value) {
        this.value = value;
    }

    public String get() {
        return (value != null) ? value : "";
    }

    public void set(String value) {
        this.value = value;
        notifyChange();
    }

    public int getLength() {
        return (value != null) ? value.length() : 0;
    }

    @Override
    public String toString() {
        return value;
    }
}