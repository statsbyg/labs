package com.jonecx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.domain.AnalyticsManager;

import javax.inject.Inject;

public class HomeActivity extends AppCompatActivity {

    @Inject
    AnalyticsManager analyticsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        analyticsManager.execute();
    }
}
