package com.anokmik.databinding.model;

public class Note {

    private final String text;

    private final String category;

    private final boolean state;

    public Note(String text, String category, boolean state) {
        this.text = text;
        this.category = category;
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }

    public boolean isState() {
        return state;
    }

}