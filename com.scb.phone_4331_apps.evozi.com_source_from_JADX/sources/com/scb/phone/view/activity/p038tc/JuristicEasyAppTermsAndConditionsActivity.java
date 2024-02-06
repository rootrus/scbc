package com.scb.phone.view.activity.p038tc;

import android.content.Context;
import android.content.Intent;
import p040o.LogFileManager;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.tc.JuristicEasyAppTermsAndConditionsActivity */
public final class JuristicEasyAppTermsAndConditionsActivity extends EasyAppTermsAndConditionsActivity {

    /* renamed from: com.scb.phone.view.activity.tc.JuristicEasyAppTermsAndConditionsActivity$read */
    public static final class read {
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;

        private read() {
        }

        public read(String str, String str2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }

    public static final Intent read(Context context, LogFileManager.DirectoryProvider directoryProvider, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) directoryProvider, "preloadCheckDisplay");
        Intent intent = new Intent(context, JuristicEasyAppTermsAndConditionsActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_PRELOAD_CHECK", directoryProvider);
        intent.putExtra("com.scb.phone.EXTRA_DEEP_LINK", z);
        if (z) {
            intent.addFlags(32768);
        } else {
            intent.addFlags(268468224);
        }
        return intent;
    }
}
