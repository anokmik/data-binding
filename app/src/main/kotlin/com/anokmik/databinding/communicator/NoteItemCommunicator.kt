package com.anokmik.databinding.communicator;

import android.view.View
import com.anokmik.databinding.model.Note

class NoteItemCommunicator(@JvmField val note: Note) {

    @JvmField
    val clickListener = View.OnClickListener {
        note.state.set(!note.state.get());
    }

}