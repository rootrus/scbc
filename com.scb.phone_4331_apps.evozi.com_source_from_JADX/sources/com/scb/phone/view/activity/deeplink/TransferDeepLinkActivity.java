package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;
import p040o.onGetStartedClick;

public final class TransferDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        Intent intent2 = getIntent();
        boolean z = false;
        if (intent2 != null) {
            z = intent2.getBooleanExtra("BANKING_SERVICE_TILE_TAG", false);
        }
        read(TransferActivity.IconCompatParcelizer((Context) this, z ? "tile" : ""));
    }
}
