package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.deposit.DepositOpenAccountActivity;

public class OpenAccountDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        read(DepositOpenAccountActivity.MediaBrowserCompat$ItemReceiver(this, (intent == null || intent.getStringExtra("accountType") == null) ? null : intent.getStringExtra("accountType")));
    }
}
