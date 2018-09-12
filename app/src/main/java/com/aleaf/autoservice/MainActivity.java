package com.aleaf.autoservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.aleaf.test_lib.IProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<IProvider> providers = LoaderUtils.getServices(IProvider.class);
        for (IProvider provider : providers) {
            Log.d("MainActivitySS", "provide="+provider.provide());
        }

    }
}
