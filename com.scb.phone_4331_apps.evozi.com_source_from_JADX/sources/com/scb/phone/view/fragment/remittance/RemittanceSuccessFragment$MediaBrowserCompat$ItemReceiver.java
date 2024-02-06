package com.scb.phone.view.fragment.remittance;

import android.content.DialogInterface;
import p040o.BaseDiscoverFundFilterActivity;
import p040o.CheckSCBSEligibilityActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;

final /* synthetic */ class RemittanceSuccessFragment$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements BaseDiscoverFundFilterActivity<DialogInterface, Integer, HmlVerifyPhoneValidateOtpActivity> {
    RemittanceSuccessFragment$MediaBrowserCompat$ItemReceiver(RemittanceSuccessFragment remittanceSuccessFragment) {
        super(2, remittanceSuccessFragment);
    }

    public final String getName() {
        return "onAddNickNamePositiveButtonClicked";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(RemittanceSuccessFragment.class);
    }

    public final String getSignature() {
        return "onAddNickNamePositiveButtonClicked(Landroid/content/DialogInterface;I)V";
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        RemittanceSuccessFragment.read((RemittanceSuccessFragment) this.receiver);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
