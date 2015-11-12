package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.anokmik.databinding.R;
import com.anokmik.databinding.model.User;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ButterKnifeFragment extends Fragment {

    @Bind(R.id.first_name)
    TextView firstName;

    @Bind(R.id.last_name)
    TextView lastName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        User user = User.getDefault();
        firstName.setText(user.firstName);
        lastName.setText(user.lastName);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

}