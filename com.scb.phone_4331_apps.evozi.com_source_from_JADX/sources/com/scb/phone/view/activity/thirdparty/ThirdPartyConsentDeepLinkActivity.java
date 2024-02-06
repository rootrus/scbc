package com.scb.phone.view.activity.thirdparty;

import android.content.Intent;
import com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity;

public class ThirdPartyConsentDeepLinkActivity extends BaseDeepLinkActivity {
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public final void IconCompatParcelizer(Intent intent, String str) {
        read(ThirdPartyConsentActivity.MediaBrowserCompat$ItemReceiver(this, intent.getStringExtra("applicationId"), intent.getStringExtra("partnertransactionId"), intent.getExtras() != null ? intent.getExtras().getString("callback_url") : null));
    }
}
