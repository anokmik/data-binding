package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.CustomizationFragmentCommunicator;
import com.anokmik.databinding.databinding.FragmentCustomizationBinding;

public class CustomizationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_customization, container, false);
        FragmentCustomizationBinding binding = FragmentCustomizationBinding.bind(view);
        binding.setCommunicator(new CustomizationFragmentCommunicator());
        return view;
    }

}