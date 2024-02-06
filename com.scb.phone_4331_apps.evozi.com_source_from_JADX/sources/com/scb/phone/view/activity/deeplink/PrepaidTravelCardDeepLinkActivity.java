package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.prepaid.request.C5700x288f8104;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestMarketConductActivity;
import p040o.onGetStartedClick;

public final class PrepaidTravelCardDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        C5700x288f8104 prepaidRequestMarketConductActivity$MediaBrowserCompat$CustomActionResultReceiver = PrepaidRequestMarketConductActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent2 = new Intent(context, PrepaidRequestMarketConductActivity.class);
        intent2.putExtra("EXTRA_PREPAID_IS_FROM_DEEP_LINK", true);
        read(intent2);
    }
}
