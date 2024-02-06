package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.investment.InvestmentDetailsActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingLandingActivity;
import p040o.HmlPinActivity;
import p040o.StreetViewPanoramaOrientation;

public class MutualFundsDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public StreetViewPanoramaOrientation landingCase;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        Intent intent2;
        if (!this.landingCase.write.RatingCompat().write.isEmpty()) {
            intent2 = new Intent(this, InvestmentDetailsActivity.class);
        } else {
            intent2 = new Intent(this, FundOnboardingLandingActivity.class);
        }
        read(intent2);
    }
}
