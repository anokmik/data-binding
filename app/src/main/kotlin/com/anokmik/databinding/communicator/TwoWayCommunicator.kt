package com.anokmik.databinding.communicator

import android.content.res.Resources
import android.support.v4.content.res.ResourcesCompat
import android.util.Log

import com.anokmik.databinding.R

class TwoWayCommunicator(private val resources: Resources) {

    var editTextValue = ""
        set(newEditTextValue) {
            field = newEditTextValue
            Log.i(TAG, "setEditTextValue: " + field)
        }

    var checkBoxValue = false
        set(newCheckBoxValue) {
            field = newCheckBoxValue
            Log.i(TAG, "setCheckBoxValue: " + field)
        }

    var checkedButton = R.id.radio_button_first
        set(newCheckedButton) {
            field = newCheckedButton
            Log.i(TAG, "setCheckedButton: " + getResourceName(field))
        }

    var seekBarProgress = 0
        set(newSeekBarProgress) {
            field = newSeekBarProgress
            Log.i(TAG, "setSeekBarProgress: " + field)
        }

    var ratingBarValue = 0
        set(newRatingBarValue: Int) {
            field = newRatingBarValue
            Log.i(TAG, "setRatingBarValue: " + field)
        }

    var color = ResourcesCompat.getColor(resources, R.color.material_primary_red, null)
        set(newColor: Int) {
            field = newColor
            Log.i(TAG, "setColor: " + getColorHex(field))
        }

    private fun getResourceName(resourceId: Int): String {
        return resources.getResourceName(resourceId)
    }

    private fun getColorHex(color: Int): String {
        return "#" + Integer.toHexString(color).toUpperCase().substring(2)
    }

    companion object {
        private val TAG = TwoWayCommunicator::class.java.simpleName
    }

}