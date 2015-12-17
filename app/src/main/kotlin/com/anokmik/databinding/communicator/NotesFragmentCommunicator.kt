package com.anokmik.databinding.communicator;

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.anokmik.databinding.adapter.NotesAdapter
import com.anokmik.databinding.model.Note
import java.util.*

class NotesFragmentCommunicator(val context: Context, val notes: ArrayList<Note>) {

    @JvmField
    val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)

    @JvmField
    val adapter: NotesAdapter = NotesAdapter(context, notes)

}