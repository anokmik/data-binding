package com.anokmik.databinding.model;

import android.databinding.ObservableBoolean;

public class Note {

    public final String text;

    public final String category;

    public ObservableBoolean state;

    public Note(String text, String category, boolean state) {
        this.text = text;
        this.category = category;
        this.state = new ObservableBoolean(state);
    }

}