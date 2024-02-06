package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.investment.roboadvisor.C5652x8cbd2afd;
import com.scb.phone.view.activity.investment.roboadvisor.RoboAdvisorLandingActivity;
import p040o.onGetStartedClick;

public final class RoboAdvisorDeepLinkActivity extends BaseDeepLinkActivity {
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
        C5652x8cbd2afd roboAdvisorLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = RoboAdvisorLandingActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        read(new Intent(context, RoboAdvisorLandingActivity.class));
    }
}
