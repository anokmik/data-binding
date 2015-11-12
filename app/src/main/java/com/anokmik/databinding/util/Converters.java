package com.anokmik.databinding.util;

import android.databinding.BindingConversion;

import com.anokmik.databinding.model.ObservableString;

public class Converters {

    @BindingConversion
    public static String convertObservableToString(ObservableString observableString) {
        return observableString.get();
    }

}