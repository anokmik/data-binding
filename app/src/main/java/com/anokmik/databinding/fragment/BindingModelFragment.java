package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.databinding.FragmentBindingModelBinding;
import com.anokmik.databinding.model.User;

public class BindingModelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_binding_model, container, false);
        FragmentBindingModelBinding binding = FragmentBindingModelBinding.bind(view);
        binding.setUser(User.getDefault());
        return view;
    }

}