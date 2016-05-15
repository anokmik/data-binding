package com.anokmik.databinding.communicator;

import android.content.res.Resources
import android.support.annotation.IdRes
import com.anokmik.databinding.R
import com.anokmik.databinding.fragment.*
import com.anokmik.databinding.listener.OnFragmentEventListener

class MainFragmentCommunicator(val resources: Resources, val listener: OnFragmentEventListener) {

    @JvmField
    val titles: Array<String> = getTitles(resources)

    fun replaceFragment(@IdRes id: Int) {
        val fragmentAndTitle = getFragmentAndTitle(id);
        val baseFragment = fragmentAndTitle.first;
        val title = fragmentAndTitle.second;
        baseFragment.initArguments(title);
        listener.replaceFragment(baseFragment);
    }

    private fun getFragmentAndTitle(@IdRes id: Int): Pair<BaseFragment, String> {
        return when (id) {
            R.id.find_view_by_id -> Pair(FindViewByIdFragment(), titles[0])
            R.id.butter_knife -> Pair(ButterKnifeFragment(), titles[1])
            R.id.data_binding_model -> Pair(BindingModelFragment(), titles[2])
            R.id.data_binding_ids -> Pair(BindingIdsFragment(), titles[3])
            R.id.login -> Pair(LoginFragment(), titles[4])
            R.id.observable_greeting -> Pair(ObservableGreetingFragment(), titles[5])
            R.id.notify_greeting -> Pair(NotifyGreetingFragment(), titles[6])
            R.id.notes -> Pair(NotesFragment(), titles[7])
            R.id.customization -> Pair(CustomizationFragment(), titles[8])
            R.id.two_way -> Pair(TwoWayFragment(), titles[9])
            else -> throw IllegalArgumentException()
        }
    }

    private fun getTitles(resources: Resources): Array<String> {
        return arrayOf(
                resources.getString(R.string.button_find_view_by_id),
                resources.getString(R.string.button_butter_knife),
                resources.getString(R.string.button_data_binding_model),
                resources.getString(R.string.button_data_binding_ids),
                resources.getString(R.string.button_login),
                resources.getString(R.string.button_observable_greeting),
                resources.getString(R.string.button_notify_greeting),
                resources.getString(R.string.button_notes),
                resources.getString(R.string.button_customization),
                resources.getString(R.string.button_two_way)
        )
    }

}
