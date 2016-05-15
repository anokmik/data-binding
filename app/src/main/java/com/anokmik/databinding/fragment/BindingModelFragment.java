package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.databinding.FragmentBindingModelBinding;
import com.anokmik.databinding.model.User;

public class BindingModelFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_binding_model, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentBindingModelBinding.bind(view).setUser(User.getDefault());
    }

}