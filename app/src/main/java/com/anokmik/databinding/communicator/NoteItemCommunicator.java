package com.anokmik.databinding.communicator;

import com.anokmik.databinding.model.Note;

public class NoteItemCommunicator {

    public final Note note;

    public NoteItemCommunicator(Note note) {
        this.note = note;
    }

    public void switchState() {
        note.state.set(!note.state.get());
    }

}
