package com.example.liuxiu.windown;

import android.view.View;
import android.view.animation.AlphaAnimation;

public class animation {

    public static void fadeIn(View view, long delay) {
        view.setTranslationY(200f);
        view.setAlpha(0f);
        view.animate()
                .translationY(0f)
                .alpha(1f)
                .setDuration(600)
                .setStartDelay(delay)
                .start();

    }
    public static void click(View view) {
        view.animate()
                .scaleY(0.95f)
                .scaleX(0.95f)
                .setDuration(100)
                .withEndAction(() -> {
                    view.animate()
                            .scaleY(1f)
                            .scaleX(1f)
                            .setDuration(100)
                            .start();
                })
                .start();
    }
}
