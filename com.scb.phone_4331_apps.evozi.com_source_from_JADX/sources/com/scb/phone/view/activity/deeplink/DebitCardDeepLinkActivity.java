package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.debitcard.DebitCardLandingActivity;
import p040o.onGetStartedClick;

public final class DebitCardDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        read(DebitCardLandingActivity.write(this));
    }
}
