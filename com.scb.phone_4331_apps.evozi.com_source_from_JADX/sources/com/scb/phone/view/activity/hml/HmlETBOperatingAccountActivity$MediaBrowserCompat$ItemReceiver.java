package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;
import p040o.zziu;

public final class HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver {
    private HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, C5609x5fc43574 hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver, zziu.zzc zzc) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver, "operatingType");
        Intent intent = new Intent(context, HmlETBOperatingAccountActivity.class);
        intent.putExtra("OPERATING_TYPE_KEY", hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver);
        if (zzc != null) {
            intent.putExtra("OPERATING_ACCOUNT_KEY", zzc);
        }
        return intent;
    }
}
