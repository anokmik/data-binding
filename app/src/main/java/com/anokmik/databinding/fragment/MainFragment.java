package com.anokmik.databinding.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.MainFragmentCommunicator;
import com.anokmik.databinding.databinding.FragmentMainBinding;
import com.anokmik.databinding.listener.OnFragmentEventListener;

public class MainFragment extends Fragment {

    private OnFragmentEventListener listener;

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            listener = (OnFragmentEventListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement " + OnFragmentEventListener.class.getSimpleName());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        FragmentMainBinding binding = FragmentMainBinding.bind(view);
        binding.setCommunicator(new MainFragmentCommunicator(listener));
        binding.setTitles(getTitles(getResources()));
        return view;
    }

    private String[] getTitles(Resources resources) {
        String[] titles = new String[9];
        titles[0] = resources.getString(R.string.button_find_view_by_id);
        titles[1] = resources.getString(R.string.button_butter_knife);
        titles[2] = resources.getString(R.string.button_data_binding_model);
        titles[3] = resources.getString(R.string.button_data_binding_ids);
        titles[4] = resources.getString(R.string.button_login);
        titles[5] = resources.getString(R.string.button_observable_greeting);
        titles[6] = resources.getString(R.string.button_notify_greeting);
        titles[7] = resources.getString(R.string.button_notes);
        titles[8] = resources.getString(R.string.button_customization);
        return titles;
    }

}