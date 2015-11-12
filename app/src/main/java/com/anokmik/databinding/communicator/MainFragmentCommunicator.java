package com.anokmik.databinding.communicator;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;

import com.anokmik.databinding.fragment.BindingIdsFragment;
import com.anokmik.databinding.fragment.ButterKnifeFragment;
import com.anokmik.databinding.fragment.BindingModelFragment;
import com.anokmik.databinding.fragment.CustomizationFragment;
import com.anokmik.databinding.fragment.FindViewByIdFragment;
import com.anokmik.databinding.R;
import com.anokmik.databinding.fragment.LoginFragment;
import com.anokmik.databinding.fragment.NotifyGreetingFragment;
import com.anokmik.databinding.fragment.ObservableGreetingFragment;
import com.anokmik.databinding.fragment.NotesFragment;
import com.anokmik.databinding.listener.OnFragmentEventListener;

public class MainFragmentCommunicator {

    @NonNull
    private final OnFragmentEventListener listener;

    public View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            listener.replaceFragment(getFragment(v.getId()));
        }

    };

    public MainFragmentCommunicator(@NonNull OnFragmentEventListener listener) {
        this.listener = listener;
    }

    private Fragment getFragment(@IdRes int id) {
        switch (id) {
            case R.id.find_view_by_id:
                return new FindViewByIdFragment();
            case R.id.butter_knife:
                return new ButterKnifeFragment();
            case R.id.data_binding_model:
                return new BindingModelFragment();
            case R.id.data_binding_ids:
                return new BindingIdsFragment();
            case R.id.login:
                return new LoginFragment();
            case R.id.observable_greeting:
                return new ObservableGreetingFragment();
            case R.id.notify_greeting:
                return new NotifyGreetingFragment();
            case R.id.gallery:
                return new NotesFragment();
            case R.id.customization:
                return new CustomizationFragment();
            default:
                return null;
        }
    }

}
