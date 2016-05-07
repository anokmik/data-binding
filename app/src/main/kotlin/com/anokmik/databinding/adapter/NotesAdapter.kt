package com.anokmik.databinding.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.NoteItemCommunicator
import com.anokmik.databinding.databinding.ListNoteItemBinding
import com.anokmik.databinding.model.Note
import java.util.*

class NotesAdapter(val context: Context, val notes: ArrayList<Note>) : RecyclerView.Adapter<NotesAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.list_note_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            communicator = NoteItemCommunicator(notes[position])
            executePendingBindings()
        }
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val binding: ListNoteItemBinding = ListNoteItemBinding.bind(view)

    }

}
