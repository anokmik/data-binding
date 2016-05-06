package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.LoginFragmentCommunicator;
import com.anokmik.databinding.databinding.FragmentLoginBinding;

public class LoginFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        FragmentLoginBinding binding = FragmentLoginBinding.bind(view);
        binding.setCommunicator(new LoginFragmentCommunicator(getActivity().getApplicationContext()));
        return view;
    }

}