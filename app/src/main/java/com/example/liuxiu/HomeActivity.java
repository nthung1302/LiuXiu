package com.example.liuxiu;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.liuxiu.windown.animation;
import com.example.liuxiu.windown.fullscreen;

public class HomeActivity extends fullscreen {

    ImageView logo;
    private LinearLayout form, btn_link_sign_in_google, btn_link_sign_in_facebook, btn_link_sign_in_email, btn_link_create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logo = findViewById(R.id.logo);
        form = findViewById(R.id.form);
        btn_link_sign_in_google = findViewById(R.id.btn_link_sign_in_google);
        btn_link_sign_in_facebook = findViewById(R.id.btn_link_sign_in_facebook);
        btn_link_sign_in_email = findViewById(R.id.btn_link_sign_in_email);
        btn_link_create_account = findViewById(R.id.btn_link_create_account);

        animation.fadeIn(logo, 0);
        animation.fadeIn(form, 150);
        btn_link_sign_in_google.setOnClickListener(view -> {
            animation.click(btn_link_sign_in_google);
            Toast.makeText(this, "Sign in with Google", Toast.LENGTH_SHORT).show();
        });
        btn_link_sign_in_facebook.setOnClickListener(view -> {
            animation.click(btn_link_sign_in_facebook);
            Toast.makeText(this, "Sign in with Facebook", Toast.LENGTH_SHORT).show();
        });
        btn_link_sign_in_email.setOnClickListener(view -> {
            animation.click(btn_link_sign_in_email);
            Toast.makeText(this, "Sign in with email", Toast.LENGTH_SHORT).show();
        });
        btn_link_create_account.setOnClickListener(view -> {
            animation.click(btn_link_create_account);
            Toast.makeText(this, "Create an Account", Toast.LENGTH_SHORT).show();
        });
    }
}