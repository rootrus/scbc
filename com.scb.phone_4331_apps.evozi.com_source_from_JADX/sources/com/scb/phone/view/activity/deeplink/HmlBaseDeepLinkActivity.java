package com.scb.phone.view.activity.deeplink;

import android.os.Bundle;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;
import p040o.setRequired;

public abstract class HmlBaseDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public setRequired basePresenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequired setrequired = this.basePresenter;
        if (setrequired == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("basePresenter");
        }
        setrequired.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
    }
}
