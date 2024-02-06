package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import p040o.getProperty;
import p040o.onGetStartedClick;

public final class HmlLatestPersonalInformationDeepLinkActivity extends HmlPersonalInformationDeepLinkBaseActivity {
    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getProperty getproperty = this.presenter;
        if (getproperty == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getproperty.read((String) null);
    }
}
