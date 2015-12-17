package com.anokmik.databinding.communicator;

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.view.View
import com.anokmik.databinding.R
import com.anokmik.databinding.fragment.*
import com.anokmik.databinding.listener.OnFragmentEventListener

class MainFragmentCommunicator(val listener: OnFragmentEventListener) {

    @JvmField
    val clickListener: View.OnClickListener = View.OnClickListener() { listener.replaceFragment(getFragment(it.id)) }

    private fun getFragment(@IdRes id: Int): Fragment? {
        return when (id) {
            R.id.find_view_by_id -> FindViewByIdFragment()
            R.id.butter_knife -> ButterKnifeFragment()
            R.id.data_binding_model -> BindingModelFragment()
            R.id.data_binding_ids -> BindingIdsFragment()
            R.id.login -> LoginFragment()
            R.id.observable_greeting -> ObservableGreetingFragment()
            R.id.notify_greeting -> NotifyGreetingFragment()
            R.id.notes -> NotesFragment()
            R.id.customization -> CustomizationFragment()
            else -> null
        }
    }

}
