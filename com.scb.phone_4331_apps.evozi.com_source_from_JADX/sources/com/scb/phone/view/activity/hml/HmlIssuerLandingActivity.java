package com.scb.phone.view.activity.hml;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlIssuerLandingFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.onGetStartedClick;

public final class HmlIssuerLandingActivity extends BaseActivityWithFragment {
    public static final HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private final HmlVerifyEmailActivity MediaMetadataCompat;

    public HmlIssuerLandingActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C5611x493deb3.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final String au_() {
        String string = getString(R.string.auto_issuer_landing_page_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.auto_issuer_landing_page_title)");
        return string;
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((HmlIssuerLandingFragment) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).write();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        return (HmlIssuerLandingFragment) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
