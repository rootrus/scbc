package com.scb.phone.view.activity.remittance;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;
import p040o.setImportance;

public final class RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver {
    private RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static Intent read(Context context, setImportance setimportance) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) setimportance, "successDisplay");
        Intent intent = new Intent(context, RemittanceSuccessActivity.class);
        intent.putExtra("EXTRA_REMITTANCE_SUCCESS_DISPLAY", setimportance);
        return intent;
    }
}
