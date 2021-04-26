package com.a.testdemo;

import android.content.Context;
import android.content.SharedPreferences;

/*
 * Created by komal on  06-04-2017.
 * store required values in SharedPreferences
 */

@SuppressWarnings("SameParameterValue")
public class SFStore {
    private final SharedPreferences mSharedPref;
    private static final String IS_USER_LOGIN="isUserLogin";

    public SFStore(Context context) {
        mSharedPref = context.getSharedPreferences("MarsVendor", Context.MODE_PRIVATE);
    }

    public String getString(String key, String def) {
        String val;
        val = mSharedPref.getString(key, def);
        return val;
    }

    public void setString(String key, String val) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putString(key, val);
        editor.apply();
    }
    public int getInt(String key, int def) {
        int val;
        val = mSharedPref.getInt(key,def);
        return val;
    }

    public void setInt(String key, int val) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putInt(key, val);
        editor.apply();
    }

    public void setUserLogin(boolean isUserLogin){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(IS_USER_LOGIN, isUserLogin);
        editor.commit();
    }

    public boolean isUserLogin() {
        return mSharedPref.getBoolean(IS_USER_LOGIN, false);
    }




}
