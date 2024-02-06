package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.forEachDstIn;
import p040o.onGetStartedClick;

public final class JuristicStartingPinDeepLinkActivity extends BaseDeepLinkActivity {
    private final HmlVerifyEmailActivity MediaDescriptionCompat;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    public JuristicStartingPinDeepLinkActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = getIntent().getBooleanExtra("PUSH_TAG", false) ? "push_noti" : "inbox_noti";
        ((forEachDstIn) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).read("feature", "juristic");
        ((forEachDstIn) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, str);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        Intent intent2 = new Intent(this, HomeActivity.class);
        intent2.addFlags(603979776);
        intent2.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.notification_tab);
        intent2.putExtra("FROM_LINK_TAG", true);
        intent2.setAction("ACTION_DEEP_LINK_JURISTIC_STARTING_PIN");
        read(intent2);
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }
}
