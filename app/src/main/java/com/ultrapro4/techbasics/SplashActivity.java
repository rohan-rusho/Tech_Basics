package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final String APP_NAME = "Tech Basics";
    private static final String TAGLINE = "Learn Technology Made Simple";

    private TextView appNameText, taglineText;
    private ImageView logoImage;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        appNameText = findViewById(R.id.appNameText);
        taglineText = findViewById(R.id.taglineText);
        logoImage = findViewById(R.id.logoImage);

        // Logo animation (fade + scale)
        ScaleAnimation scaleUp = new ScaleAnimation(
                0.8f, 1f, 0.8f, 1f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f
        );
        scaleUp.setDuration(700);

        AlphaAnimation fadeInLogo = new AlphaAnimation(0f, 1f);
        fadeInLogo.setDuration(700);

        AnimationSet logoAnim = new AnimationSet(true);
        logoAnim.addAnimation(scaleUp);
        logoAnim.addAnimation(fadeInLogo);
        logoImage.startAnimation(logoAnim);

        // App name fade-in
        AlphaAnimation fadeInText = new AlphaAnimation(0f, 1f);
        fadeInText.setDuration(900);
        fadeInText.setFillAfter(true);

        handler.postDelayed(() -> {
            appNameText.setText(APP_NAME);
            appNameText.startAnimation(fadeInText);
        }, 700);

        // Tagline fade-in after app name
        handler.postDelayed(() -> {
            taglineText.setText(TAGLINE);
            taglineText.startAnimation(fadeInText);
        }, 1300);

        // Go to MainActivity
        handler.postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 2500);
    }
}
