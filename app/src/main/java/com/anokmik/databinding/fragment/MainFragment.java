package com.anokmik.databinding.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.MainFragmentCommunicator;
import com.anokmik.databinding.databinding.FragmentMainBinding;
import com.anokmik.databinding.listener.OnFragmentEventListener;
import com.anokmik.databinding.util.BaseUtils;

public class MainFragment extends BaseFragment {

    private OnFragmentEventListener listener;

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener = BaseUtils.castObjectOrThrow(activity, OnFragmentEventListener.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentMainBinding.bind(view).setCommunicator(new MainFragmentCommunicator(getResources(), listener));
    }

}