package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.NotifyGreetingFragmentCommunicator;
import com.anokmik.databinding.communicator.ObservableGreetingFragmentCommunicator;
import com.anokmik.databinding.databinding.FragmentNotifyGreetingBinding;
import com.anokmik.databinding.databinding.FragmentObservableGreetingBinding;

public class NotifyGreetingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notify_greeting, container, false);
        FragmentNotifyGreetingBinding binding = FragmentNotifyGreetingBinding.bind(view);
        binding.setCommunicator(new NotifyGreetingFragmentCommunicator());
        return view;
    }

}