package com.google.firebase.crashlytics.internal;

import android.util.Log;

public class Logger {
    static final Logger DEFAULT_LOGGER = new Logger("FirebaseCrashlytics");
    private int logLevel = 4;
    private final String tag;

    public Logger(String str) {
        this.tag = str;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    /* renamed from: d */
    public void mo8867d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* renamed from: i */
    public void mo8871i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    /* renamed from: w */
    public void mo8873w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }

    /* renamed from: e */
    public void mo8869e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* renamed from: d */
    public void mo8866d(String str) {
        mo8867d(str, (Throwable) null);
    }

    /* renamed from: i */
    public void mo8870i(String str) {
        mo8871i(str, (Throwable) null);
    }

    /* renamed from: w */
    public void mo8872w(String str) {
        mo8873w(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo8868e(String str) {
        mo8869e(str, (Throwable) null);
    }
}
