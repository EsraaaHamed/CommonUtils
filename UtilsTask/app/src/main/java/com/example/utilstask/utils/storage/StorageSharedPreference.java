package com.example.utilstask.utils.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class StorageSharedPreference {
    private static Context context ;
    private static SharedPreferences sharedPreferences ;
    StorageSharedPreference(Context context)
    {
        this.context = context;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }
    public static String getPasswordPreferences( String passwordKey) {

        return sharedPreferences.getString(passwordKey, "");
    }

    public static void savePasswordPreferences( String passwordKey, String passwordValue) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(passwordKey, passwordValue).apply();
    }

    public static String getEmailPreferences( String emailKey) {
        return sharedPreferences.getString(emailKey, "");
    }

    public static void saveEmailPreferences( String emailKey, String emailValue) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(emailKey, emailValue).apply();
    }

    public static String getUserNamePreferences( String userNameKey) {
        return sharedPreferences.getString(userNameKey, "");
    }

    public static void saveUserNamePreferences( String userNameKey, String userNameValue) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(userNameKey, userNameValue).apply();
    }

    public static void removeAllSharedPreferences() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().apply();
    }


}
