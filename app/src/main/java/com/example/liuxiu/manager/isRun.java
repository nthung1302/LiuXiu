package com.example.liuxiu.manager;

import android.content.Context;
import android.content.SharedPreferences;

public class isRun {
    private static final String PREF = "isRun";
    private static final String KEY = "Key";

    public static void edit (Context context, boolean isRun) {
        SharedPreferences pref = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(KEY, isRun);
        editor.apply();
    }

    public static boolean get (Context context) {
        SharedPreferences pref = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        return pref.getBoolean(KEY, false);
    }

    public static void delete (Context context, boolean isRun) {
        SharedPreferences pref = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.remove(KEY);
        editor.apply();
    }
}
