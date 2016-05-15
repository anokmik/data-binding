package com.anokmik.databinding.communicator;

import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;
import android.util.Log;

import com.anokmik.databinding.R;

public class TwoWayCommunicator {

    private static final String TAG = TwoWayCommunicator.class.getSimpleName();

    private final Resources resources;

    private String editTextValue;

    private boolean checkBoxValue;

    private int checkedButton;

    private int seekBarProgress;

    private int ratingBarValue;

    private int color;

    public TwoWayCommunicator(Resources resources) {
        this.resources = resources;
        this.checkedButton = R.id.radio_button_first;
        this.color = ResourcesCompat.getColor(resources, R.color.material_primary_red, null);
    }

    public String getEditTextValue() {
        Log.i(TAG, "getEditTextValue: " + editTextValue);
        return editTextValue;
    }

    public void setEditTextValue(String newEditTextValue) {
        editTextValue = newEditTextValue;
        Log.i(TAG, "setEditTextValue: " + editTextValue);
    }

    public boolean isCheckBoxValue() {
        Log.i(TAG, "isCheckBoxValue: " + checkBoxValue);
        return checkBoxValue;
    }

    public void setCheckBoxValue(boolean newCheckBoxValue) {
        checkBoxValue = newCheckBoxValue;
        Log.i(TAG, "setCheckBoxValue: " + checkBoxValue);
    }

    public int getCheckedButton() {
        Log.i(TAG, "getCheckedButton: " + getResourceName(checkedButton));
        return checkedButton;
    }

    public void setCheckedButton(int newCheckedButton) {
        checkedButton = newCheckedButton;
        Log.i(TAG, "setCheckedButton: " + getResourceName(checkedButton));
    }

    public int getSeekBarProgress() {
        Log.i(TAG, "getSeekBarProgress: " + seekBarProgress);
        return seekBarProgress;
    }

    public void setSeekBarProgress(int newSeekBarProgress) {
        seekBarProgress = newSeekBarProgress;
        Log.i(TAG, "setSeekBarProgress: " + seekBarProgress);
    }

    public int getRatingBarValue() {
        Log.i(TAG, "getRatingBarValue: " + ratingBarValue);
        return ratingBarValue;
    }

    public void setRatingBarValue(int newRatingBarValue) {
        ratingBarValue = newRatingBarValue;
        Log.i(TAG, "setRatingBarValue: " + ratingBarValue);
    }

    public int getColor() {
        Log.i(TAG, "getColor: " + getColorHex());
        return color;
    }

    public void setColor(int newColor) {
        color = newColor;
        Log.i(TAG, "setColor: " + getColorHex());
    }

    private String getResourceName(int resourceId) {
        return resources.getResourceName(resourceId);
    }

    private String getColorHex() {
        return "#" + Integer.toHexString(color).toUpperCase().substring(2);
    }

}