package com.example.utilstask.utils.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class StorageSharedPreference {
    private static Context context ;
    private static SharedPreferences sharedPreferences ;
    private static SharedPreferences.Editor editor ;

    StorageSharedPreference(Context context)
    {
        this.context = context;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sharedPreferences.edit();
    }
    /////////////////////password storage/////////////////////////////
    public static String getPasswordPreferences( String passwordKey) {

        return sharedPreferences.getString(passwordKey, "");
    }

    public static void savePasswordPreferences( String passwordKey, String passwordValue) {
        editor.putString(passwordKey, passwordValue).apply();
    }
    ////////////////////////EMAIL storage////////////////////////////
    public static String getEmailPreferences( String emailKey) {
        return sharedPreferences.getString(emailKey, "");
    }

    public static void saveEmailPreferences( String emailKey, String emailValue) {
        editor.putString(emailKey, emailValue).apply();
    }
    //////////////////////////UserName Storge/////////////////////////////////

    public static String getUserNamePreferences( String userNameKey) {
        return sharedPreferences.getString(userNameKey, "");
    }

    public static void saveUserNamePreferences( String userNameKey, String userNameValue) {
        editor.putString(userNameKey, userNameValue).apply();
    }
    //////////////////////////clear storage//////////////////////////////////
    public static void removeAllSharedPreferences() {
        editor.clear().apply();
    }


}
