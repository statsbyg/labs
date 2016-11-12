package com.domain;


import android.app.Application;
import android.util.Log;

public class AnalyticsManager {

    private static final String TAG = AnalyticsManager.class.getSimpleName();

    private Application applicaiton;

    public AnalyticsManager(Application applicaiotn) {
        this.applicaiton = applicaiotn;
    }

    public void execute() {
        Log.i(TAG, " I am the AnalyticsManager");
    }
}
