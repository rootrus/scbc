package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;

public final class TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver {
    private TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static Intent write(Context context, String str) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "stage");
        Intent putExtra = new Intent(context, TouchPointFillInfoActivity.class).putExtra("EXTRA_PROGRESS_STATE", str);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, TouchPoi…RA_PROGRESS_STATE, stage)");
        return putExtra;
    }
}
