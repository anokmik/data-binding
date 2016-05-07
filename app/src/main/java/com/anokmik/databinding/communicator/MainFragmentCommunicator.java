package com.anokmik.databinding.communicator;

import android.content.res.Resources;
import android.support.annotation.IdRes;
import android.support.v4.util.Pair;

import com.anokmik.databinding.R;
import com.anokmik.databinding.fragment.BaseFragment;
import com.anokmik.databinding.fragment.BindingIdsFragment;
import com.anokmik.databinding.fragment.BindingModelFragment;
import com.anokmik.databinding.fragment.ButterKnifeFragment;
import com.anokmik.databinding.fragment.CustomizationFragment;
import com.anokmik.databinding.fragment.FindViewByIdFragment;
import com.anokmik.databinding.fragment.LoginFragment;
import com.anokmik.databinding.fragment.NotesFragment;
import com.anokmik.databinding.fragment.NotifyGreetingFragment;
import com.anokmik.databinding.fragment.ObservableGreetingFragment;
import com.anokmik.databinding.listener.OnFragmentEventListener;

public class MainFragmentCommunicator {

    private final OnFragmentEventListener listener;

    public final String[] titles;

    public MainFragmentCommunicator(Resources resources, OnFragmentEventListener listener) {
        this.listener = listener;
        this.titles = getTitles(resources);
    }

    public void replaceFragment(@IdRes int id) {
        Pair<? extends BaseFragment, String> fragmentAndTitle = getFragmentAndTitle(id);
        BaseFragment baseFragment = fragmentAndTitle.first;
        String title = fragmentAndTitle.second;
        baseFragment.initArguments(title);
        listener.replaceFragment(fragmentAndTitle.first);
    }

    private Pair<? extends BaseFragment, String> getFragmentAndTitle(@IdRes int id) {
        switch (id) {
            case R.id.find_view_by_id:
                return new Pair<>(new FindViewByIdFragment(), titles[0]);
            case R.id.butter_knife:
                return new Pair<>(new ButterKnifeFragment(), titles[1]);
            case R.id.data_binding_model:
                return new Pair<>(new BindingModelFragment(), titles[2]);
            case R.id.data_binding_ids:
                return new Pair<>(new BindingIdsFragment(), titles[3]);
            case R.id.login:
                return new Pair<>(new LoginFragment(), titles[4]);
            case R.id.observable_greeting:
                return new Pair<>(new ObservableGreetingFragment(), titles[5]);
            case R.id.notify_greeting:
                return new Pair<>(new NotifyGreetingFragment(), titles[6]);
            case R.id.notes:
                return new Pair<>(new NotesFragment(), titles[7]);
            case R.id.customization:
                return new Pair<>(new CustomizationFragment(), titles[8]);
            default:
                throw new IllegalArgumentException();
        }
    }

    private String[] getTitles(Resources resources) {
        String[] titles = new String[9];
        titles[0] = resources.getString(R.string.button_find_view_by_id);
        titles[1] = resources.getString(R.string.button_butter_knife);
        titles[2] = resources.getString(R.string.button_data_binding_model);
        titles[3] = resources.getString(R.string.button_data_binding_ids);
        titles[4] = resources.getString(R.string.button_login);
        titles[5] = resources.getString(R.string.button_observable_greeting);
        titles[6] = resources.getString(R.string.button_notify_greeting);
        titles[7] = resources.getString(R.string.button_notes);
        titles[8] = resources.getString(R.string.button_customization);
        return titles;
    }

}
