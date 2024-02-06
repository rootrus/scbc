package com.scb.phone.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.ScriptIntrinsicLUT;
import p040o.Short3;
import p040o.onCheckBoxClick;

public class SCBClearAppFromRecentService extends Service {
    @HmlPinActivity
    public ScriptIntrinsicLUT preloadCheckCache;
    @HmlPinActivity
    public Short3 tileCache;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        AlertController$RecycleListView.IconCompatParcelizer((Service) this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        onCheckBoxClick.read("Service Started", new Object[0]);
        return 2;
    }

    public void onDestroy() {
        super.onDestroy();
        onCheckBoxClick.read("Service Destroyed", new Object[0]);
    }

    public void onTaskRemoved(Intent intent) {
        onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Clear the data", new Object[0]);
        this.preloadCheckCache.write.edit().putString("com.scb.phone.PREK_KEY_APP_CONFIG", (String) null).commit();
        this.tileCache.MediaBrowserCompat$ItemReceiver.edit().putString("com.scb.phone.PREF_KEY_TILES", (String) null).commit();
        stopSelf();
    }
}
