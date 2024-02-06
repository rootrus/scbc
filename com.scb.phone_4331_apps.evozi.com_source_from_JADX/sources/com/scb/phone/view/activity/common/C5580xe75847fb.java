package com.scb.phone.view.activity.common;

import android.content.Context;
import android.content.Intent;
import p040o.CycleDetector;
import p040o.onGetStartedClick;
import p040o.requestLocationUpdates;

/* renamed from: com.scb.phone.view.activity.common.ThirdPartySlipActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5580xe75847fb {
    private C5580xe75847fb() {
    }

    public /* synthetic */ C5580xe75847fb(byte b) {
        this();
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, requestLocationUpdates requestlocationupdates) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, Name.MARK);
        onGetStartedClick.write((Object) requestlocationupdates, "function");
        Intent intent = new Intent(context, ThirdPartySlipActivity.class);
        intent.putExtra("KEY_THIRD_PARTY_SLIP_DISPLAY_ID", new CycleDetector.Dep(str, requestlocationupdates));
        return intent;
    }
}
