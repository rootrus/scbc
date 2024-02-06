package com.kony.sdk.client;

import android.util.Log;

public class KonyLogger {
    private static int IconCompatParcelizer = IconCompatParcelizer.ERROR.intValue;

    public enum IconCompatParcelizer {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6),
        ASSERT(7),
        NONE(8);
        
        int intValue;

        private IconCompatParcelizer(int i) {
            this.intValue = i;
        }
    }

    public KonyLogger() {
        System.loadLibrary("stlport_shared");
        System.loadLibrary("sqlcipher_android");
        System.loadLibrary("database_sqlcipher");
        System.loadLibrary("synccore");
    }

    public static void write(String str, String str2) {
        if (7 >= IconCompatParcelizer) {
            Log.println(7, str, str2);
        }
    }

    public static void write(String str) {
        if (3 >= IconCompatParcelizer) {
            Log.println(3, "Kony-SDK", str);
        }
    }

    public static void IconCompatParcelizer(String str, String str2) {
        if (IconCompatParcelizer <= 6) {
            Log.e(str, str2);
        }
    }

    public static void write(String str, String str2, Exception exc) {
        if (IconCompatParcelizer <= 6) {
            Log.e(str, str2, exc);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        if (IconCompatParcelizer <= 3) {
            Log.d(str, str2);
        }
    }

    public static void IconCompatParcelizer(String str) {
        if (IconCompatParcelizer <= 3) {
            Log.d("Kony-SDK", str);
        }
    }

    public static void read(String str, String str2) {
        if (IconCompatParcelizer <= 4) {
            Log.i(str, str2);
        }
    }

    public static void IconCompatParcelizer(String str, String str2, Exception exc) {
        if (IconCompatParcelizer <= 5) {
            Log.w(str, str2, exc);
        }
    }

    public static boolean MediaBrowserCompat$ItemReceiver(String str, int i) {
        return Log.isLoggable(str, i);
    }

    public static void read(Exception exc) {
        if (IconCompatParcelizer != IconCompatParcelizer.NONE.intValue) {
            exc.printStackTrace();
        }
    }
}
