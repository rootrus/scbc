package com.kofax.kmc.kut.utilities;

import android.app.Application;
import android.content.Context;

public class AppContextProvider extends Application {

    /* renamed from: nA */
    private static Context f707nA;

    public void onCreate() {
        super.onCreate();
        f707nA = getApplicationContext();
    }

    public static Context getContext() {
        return f707nA;
    }

    public static void setContext(Context context) {
        f707nA = context;
    }
}
