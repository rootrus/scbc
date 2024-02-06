package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;

class HeartBeatInfoStorage {
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences sharedPreferences;

    private HeartBeatInfoStorage(Context context) {
        this.sharedPreferences = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static HeartBeatInfoStorage getInstance(Context context) {
        HeartBeatInfoStorage heartBeatInfoStorage;
        synchronized (HeartBeatInfoStorage.class) {
            if (instance == null) {
                instance = new HeartBeatInfoStorage(context);
            }
            heartBeatInfoStorage = instance;
        }
        return heartBeatInfoStorage;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldSendSdkHeartBeat(String str, long j) {
        synchronized (this) {
            if (!this.sharedPreferences.contains(str)) {
                this.sharedPreferences.edit().putLong(str, j).apply();
                return true;
            } else if (j - this.sharedPreferences.getLong(str, -1) < 86400000) {
                return false;
            } else {
                this.sharedPreferences.edit().putLong(str, j).apply();
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldSendGlobalHeartBeat(long j) {
        boolean shouldSendSdkHeartBeat;
        synchronized (this) {
            shouldSendSdkHeartBeat = shouldSendSdkHeartBeat("fire-global", j);
        }
        return shouldSendSdkHeartBeat;
    }
}
