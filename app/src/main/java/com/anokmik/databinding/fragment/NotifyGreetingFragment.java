package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.NotifyGreetingFragmentCommunicator;
import com.anokmik.databinding.databinding.FragmentNotifyGreetingBinding;

public class NotifyGreetingFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notify_greeting, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentNotifyGreetingBinding.bind(view).setCommunicator(new NotifyGreetingFragmentCommunicator());
    }

}