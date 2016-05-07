package com.anokmik.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anokmik.databinding.R
import com.anokmik.databinding.communicator.NotesFragmentCommunicator
import com.anokmik.databinding.databinding.FragmentNotesBinding
import com.anokmik.databinding.model.Note
import java.util.*

class NotesFragment : BaseFragment() {

    private val notes: ArrayList<Note> by lazy {
        val categoryInteresting = getString(R.string.notes_category_interesting)
        val categoryCommon = getString(R.string.notes_category_common)
        val categoryEasyToUser = getString(R.string.notes_category_easy_to_use)
        val notes = ArrayList<Note>()
        notes.apply {
            add(Note(getString(R.string.note_number_one), categoryInteresting, true))
            add(Note(getString(R.string.note_number_two), categoryInteresting, true))
            add(Note(getString(R.string.note_number_three), categoryEasyToUser, true))
            add(Note(getString(R.string.note_number_four), categoryInteresting, true))
            add(Note(getString(R.string.note_number_five), categoryCommon, false))
            add(Note(getString(R.string.note_number_six), categoryInteresting, true))
            add(Note(getString(R.string.note_number_seven), categoryInteresting, true))
            add(Note(getString(R.string.note_number_eight), categoryEasyToUser, true))
            add(Note(getString(R.string.note_number_nine), categoryInteresting, true))
            add(Note(getString(R.string.note_number_ten), categoryCommon, false))
            add(Note(getString(R.string.note_number_eleven), categoryInteresting, true))
            add(Note(getString(R.string.note_number_twelve), categoryCommon, false))
            add(Note(getString(R.string.note_number_thirteen), categoryEasyToUser, true))
            add(Note(getString(R.string.note_number_fourteen), categoryInteresting, true))
            add(Note(getString(R.string.note_number_fifteen), categoryCommon, false))
            add(Note(getString(R.string.note_number_sixteen), categoryInteresting, true))
            add(Note(getString(R.string.note_number_seventeen), categoryEasyToUser, true))
            add(Note(getString(R.string.note_number_eighteen), categoryInteresting, true))
            add(Note(getString(R.string.note_number_nineteen), categoryInteresting, true))
            add(Note(getString(R.string.note_number_twenty), categoryCommon, false))
            add(Note(getString(R.string.note_number_twenty_one), categoryInteresting, true))
            add(Note(getString(R.string.note_number_twenty_two), categoryEasyToUser, true))
            add(Note(getString(R.string.note_number_twenty_three), categoryCommon, false))
            add(Note(getString(R.string.note_number_twenty_four), categoryInteresting, true))
            add(Note(getString(R.string.note_number_twenty_five), categoryCommon, false))
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_notes, container, false)
        FragmentNotesBinding.bind(view).communicator = NotesFragmentCommunicator(activity.applicationContext, notes)
        return view
    }

}