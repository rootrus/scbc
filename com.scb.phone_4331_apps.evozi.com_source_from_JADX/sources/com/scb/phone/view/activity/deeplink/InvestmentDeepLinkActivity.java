package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.investment.select.SelectInvestmentActivity;
import p040o.onGetStartedClick;

public final class InvestmentDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        read(SelectInvestmentActivity.write(this));
    }
}
