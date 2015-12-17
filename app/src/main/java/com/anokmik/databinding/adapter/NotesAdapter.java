package com.anokmik.databinding.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.NoteItemCommunicator;
import com.anokmik.databinding.databinding.ListNoteItemBinding;
import com.anokmik.databinding.model.Note;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private final LayoutInflater inflater;

    private final ArrayList<Note> notes;

    public NotesAdapter(Context context, ArrayList<Note> notes) {
        this.inflater = LayoutInflater.from(context);
        this.notes = notes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.list_note_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.binding.setCommunicator(new NoteItemCommunicator(notes.get(position)));
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final ListNoteItemBinding binding;

        public ViewHolder(View view) {
            super(view);
            this.binding = ListNoteItemBinding.bind(view);
        }

    }

}
