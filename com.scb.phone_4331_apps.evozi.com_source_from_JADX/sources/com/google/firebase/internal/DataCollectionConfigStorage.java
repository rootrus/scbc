package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.events.Publisher;
import java.util.concurrent.atomic.AtomicBoolean;
import p040o.setLastBaselineToBottomHeight;

public class DataCollectionConfigStorage {
    private final Context applicationContext;
    private final AtomicBoolean dataCollectionDefaultEnabled = new AtomicBoolean(readAutoDataCollectionEnabled());
    private final Publisher publisher;
    private final SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher2) {
        this.applicationContext = directBootSafe(context);
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        this.sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        this.publisher = publisher2;
    }

    private static Context directBootSafe(Context context) {
        return (Build.VERSION.SDK_INT < 24 || setLastBaselineToBottomHeight.write(context)) ? context : setLastBaselineToBottomHeight.MediaBrowserCompat$CustomActionResultReceiver(context);
    }

    public boolean isEnabled() {
        return this.dataCollectionDefaultEnabled.get();
    }

    private boolean readAutoDataCollectionEnabled() {
        ApplicationInfo applicationInfo;
        if (this.sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            return this.sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.applicationContext.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }
}
