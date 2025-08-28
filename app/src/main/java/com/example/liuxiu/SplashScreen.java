package com.example.liuxiu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.liuxiu.manager.isRun;
import com.example.liuxiu.manager.isSignIn;
import com.example.liuxiu.ui.WellComeActivity;
import com.example.liuxiu.ui.auth.SignInActivity;
import com.example.liuxiu.windown.fullscreen;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends fullscreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean is_run = isRun.get(this);
        boolean is_signIn = isSignIn.get(this);

        if (!is_run) {
            startActivity(new Intent(SplashScreen.this, WellComeActivity.class));
        } else if (!is_signIn) {
            startActivity(new Intent(SplashScreen.this, SignInActivity.class));
            finish();
        } else {

        }
    }
}