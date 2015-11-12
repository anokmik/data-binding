package com.anokmik.databinding.communicator;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.anokmik.databinding.adapter.NotesAdapter;
import com.anokmik.databinding.model.Note;

import java.util.ArrayList;

public class NotesFragmentCommunicator {

    public RecyclerView.LayoutManager layoutManager;

    public NotesAdapter adapter;

    public NotesFragmentCommunicator(Context context, ArrayList<Note> notes) {
        this.layoutManager = new LinearLayoutManager(context);
        this.adapter = new NotesAdapter(context, notes);
    }

}