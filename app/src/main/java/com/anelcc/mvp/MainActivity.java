package com.anelcc.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anelcc.mvp.app.App;
/*
we need to define this injection, so that dagger components interface we will be used.
Notice we are cast getApplication() to our App class. So now we get dagger component
and inject activity.
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);
    }
}
