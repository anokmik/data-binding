package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.NotesFragmentCommunicator;
import com.anokmik.databinding.databinding.FragmentNotesBinding;
import com.anokmik.databinding.model.Note;

import java.util.ArrayList;

public class NotesFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, container, false);
        FragmentNotesBinding binding = FragmentNotesBinding.bind(view);
        binding.setCommunicator(new NotesFragmentCommunicator(getActivity().getApplicationContext(), getNotes()));
        return view;
    }

    private ArrayList<Note> getNotes() {
        String categoryInteresting = getString(R.string.notes_category_interesting);
        String categoryCommon = getString(R.string.notes_category_common);
        String categoryEasyToUser = getString(R.string.notes_category_easy_to_use);
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note(getString(R.string.note_number_one), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_two), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_three), categoryEasyToUser, true));
        notes.add(new Note(getString(R.string.note_number_four), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_five), categoryCommon, false));
        notes.add(new Note(getString(R.string.note_number_six), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_seven), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_eight), categoryEasyToUser, true));
        notes.add(new Note(getString(R.string.note_number_nine), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_ten), categoryCommon, false));
        notes.add(new Note(getString(R.string.note_number_eleven), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_twelve), categoryCommon, false));
        notes.add(new Note(getString(R.string.note_number_thirteen), categoryEasyToUser, true));
        notes.add(new Note(getString(R.string.note_number_fourteen), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_fifteen), categoryCommon, false));
        notes.add(new Note(getString(R.string.note_number_sixteen), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_seventeen), categoryEasyToUser, true));
        notes.add(new Note(getString(R.string.note_number_eighteen), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_nineteen), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_twenty), categoryCommon, false));
        notes.add(new Note(getString(R.string.note_number_twenty_one), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_twenty_two), categoryEasyToUser, true));
        notes.add(new Note(getString(R.string.note_number_twenty_three), categoryCommon, false));
        notes.add(new Note(getString(R.string.note_number_twenty_four), categoryInteresting, true));
        notes.add(new Note(getString(R.string.note_number_twenty_five), categoryCommon, false));
        return notes;
    }

}