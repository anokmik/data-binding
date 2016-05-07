package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.anokmik.databinding.R;
import com.anokmik.databinding.databinding.FragmentBindingIdsBinding;
import com.anokmik.databinding.model.User;

public class BindingIdsFragment extends BaseFragment {

    private TextView firstName;

    private TextView lastName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_binding_ids, container, false);
        FragmentBindingIdsBinding binding = FragmentBindingIdsBinding.bind(view);
        firstName = binding.firstName;
        lastName = binding.lastName;
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        User user = User.getDefault();
        firstName.setText(user.firstName);
        lastName.setText(user.lastName);
    }

}