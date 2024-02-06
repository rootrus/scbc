package com.scb.phone.view.activity.additionaldocument;

import p040o.CheckSCBSEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.SettingsJsonParser;
import p040o.onGetStartedClick;

final /* synthetic */ class ReviewDocumentActivity$MediaBrowserCompat$SearchResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    ReviewDocumentActivity$MediaBrowserCompat$SearchResultReceiver(SettingsJsonParser settingsJsonParser) {
        super(1, settingsJsonParser);
    }

    public final String getName() {
        return "documentRotationSuccess";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(SettingsJsonParser.class);
    }

    public final String getSignature() {
        return "documentRotationSuccess(Ljava/lang/String;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "p1");
        ((SettingsJsonParser) this.receiver).write(str);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
