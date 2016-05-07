package com.anokmik.databinding.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public abstract class BaseFragment extends Fragment {

    private String title;

    private boolean showBack;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        title = getArguments().getString(Key.TITLE);
        showBack = getArguments().getBoolean(Key.SHOW_BACK);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        prepareActionBar();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Activity activity = getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void initArguments(String title) {
        initArguments(title, true);
    }

    public void initArguments(String title, boolean showBack) {
        Bundle args = new Bundle();
        args.putString(Key.TITLE, title);
        args.putBoolean(Key.SHOW_BACK, showBack);
        setArguments(args);
    }

    private void prepareActionBar() {
        ActionBar supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(title);
            supportActionBar.setDisplayHomeAsUpEnabled(showBack);
        }
    }

    private interface Key {
        String TITLE = "title";
        String SHOW_BACK = "show_back";
    }

}
