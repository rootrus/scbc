package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import com.scb.phone.view.fragment.hml.HmlIssuerLandingFragment;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

/* renamed from: com.scb.phone.view.activity.hml.HmlIssuerLandingActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5611x493deb3 extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlIssuerLandingFragment> {
    public static final C5611x493deb3 MediaBrowserCompat$CustomActionResultReceiver = new C5611x493deb3();

    C5611x493deb3() {
        super(0);
    }

    public final /* synthetic */ Object invoke() {
        HmlIssuerLandingFragment.write write = HmlIssuerLandingFragment.IconCompatParcelizer;
        HmlIssuerLandingFragment hmlIssuerLandingFragment = new HmlIssuerLandingFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_HML_ISSUER_FLAG", true);
        hmlIssuerLandingFragment.setArguments(bundle);
        return hmlIssuerLandingFragment;
    }
}
