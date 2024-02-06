package com.scb.phone.view.activity.partner;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import p040o.onGetStartedClick;
import p040o.zzmd;

public final class PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver {
    private PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PartnerAuthorizationActivity.class);
        intent.putExtra(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, str);
        intent.putExtra("IS_NEED_HISTORY_STACK", true);
        return intent;
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, HashMap<String, Object> hashMap, boolean z, Intent intent) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) hashMap, "params");
        Intent intent2 = new Intent(context, PartnerAuthorizationActivity.class);
        intent2.putExtra("EXTRA_PARAMS", hashMap);
        intent2.putExtra("IS_NEED_HISTORY_STACK", z);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        return intent2;
    }
}
