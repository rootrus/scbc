package com.scb.phone.view.activity.privacypolicy;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ImagesContract;
import p040o.onGetStartedClick;

public final class ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver {
    private ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static Intent read(Context context, String str, String str2) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        Intent intent = new Intent(context, ScbPrivacyPolicyActivity.class);
        intent.putExtra("EXTRA_URL", str);
        intent.putExtra("EXTRA_TITLE", str2);
        return intent;
    }
}
