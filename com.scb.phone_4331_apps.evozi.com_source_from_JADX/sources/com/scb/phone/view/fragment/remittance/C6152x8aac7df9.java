package com.scb.phone.view.fragment.remittance;

import android.content.Intent;
import p040o.CheckSCBSEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment$MediaBrowserCompat$CustomActionResultReceiver */
final /* synthetic */ class C6152x8aac7df9 extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Intent, HmlVerifyPhoneValidateOtpActivity> {
    C6152x8aac7df9(RemittanceFavouriteTargetFragment remittanceFavouriteTargetFragment) {
        super(1, remittanceFavouriteTargetFragment);
    }

    public final String getName() {
        return "handleBroadcast";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(RemittanceFavouriteTargetFragment.class);
    }

    public final String getSignature() {
        return "handleBroadcast(Landroid/content/Intent;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Intent intent = (Intent) obj;
        onGetStartedClick.write((Object) intent, "p1");
        RemittanceFavouriteTargetFragment.IconCompatParcelizer((RemittanceFavouriteTargetFragment) this.receiver, intent);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
