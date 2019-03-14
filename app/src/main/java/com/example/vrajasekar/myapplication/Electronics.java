package com.example.vrajasekar.myapplication;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by vrajasekar on 3/15/19.
 */

public class Electronics {
    private static final String TAG = "Electronics";

    private Television television;
    private Mobile mobile;
    @Inject
    public Electronics(Television television, Mobile mobile) {
        this.television = television;
        this.mobile = mobile;
    }

    public void turnOn(){
        Log.d(TAG, "turned ON...");
    }

}
