package com.lmeadors;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class HelloAndroidActivity extends Activity {

    private static final String TAG = HelloAndroidActivity.class.getName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
    }

}

