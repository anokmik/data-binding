package com.anokmik.databinding.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anokmik.databinding.R;
import com.anokmik.databinding.communicator.TwoWayCommunicator;
import com.anokmik.databinding.component.TwoWayDataBindingComponent;
import com.anokmik.databinding.databinding.FragmentTwoWayBinding;

public class TwoWayFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two_way, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentTwoWayBinding.bind(view, new TwoWayDataBindingComponent()).setCommunicator(new TwoWayCommunicator(getResources()));
    }

}