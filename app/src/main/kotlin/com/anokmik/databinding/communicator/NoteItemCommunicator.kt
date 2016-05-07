package com.anokmik.databinding.communicator;

import com.anokmik.databinding.model.Note

class NoteItemCommunicator(@JvmField var note: Note) {

    fun switchState() {
        note.state.set(!note.state.get())
    }

}