package com.anokmik.databinding.util;

import android.databinding.BindingAdapter;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import com.anokmik.databinding.model.ObservableString;

public class BindingAdapters {

    @BindingAdapter("bind:textWatcher")
    public static void setTextWatcher(TextView view, TextWatcher watcher) {
        view.addTextChangedListener(watcher);
    }

    @BindingAdapter("bind:bindingText")
    public static void setBindingText(TextView view, final ObservableString text) {
        view.addTextChangedListener(new SimpleTextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
                text.set(s.toString());
            }

        });
    }

}