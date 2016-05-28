package com.anokmik.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.anokmik.databinding.R;
import com.anokmik.databinding.component.DataBindingComponentProvider;
import com.anokmik.databinding.databinding.ActivityMainBinding;
import com.anokmik.databinding.fragment.MainFragment;
import com.anokmik.databinding.listener.OnFragmentEventListener;

public class MainActivity extends AppCompatActivity implements OnFragmentEventListener {

    @IdRes
    private int containerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataBindingUtil.setDefaultComponent(new DataBindingComponentProvider());

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);

        containerId = binding.container.getId();

        getSupportFragmentManager().beginTransaction()
                .add(containerId, getMainFragment(), null)
                .commit();
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(containerId, fragment)
                    .addToBackStack(null)
                    .commit();
        }
    }

    @NonNull
    private MainFragment getMainFragment() {
        MainFragment fragment = new MainFragment();
        fragment.initArguments(getString(R.string.app_name), false);
        return fragment;
    }

}