package com.scb.phone.view.activity.additionaldocument;

import p040o.CheckSCBSEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.SettingsJsonParser;
import p040o.onGetStartedClick;

final /* synthetic */ class ReviewDocumentActivity$MediaBrowserCompat$MediaItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    ReviewDocumentActivity$MediaBrowserCompat$MediaItem(SettingsJsonParser settingsJsonParser) {
        super(1, settingsJsonParser);
    }

    public final String getName() {
        return "documentRotationError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(SettingsJsonParser.class);
    }

    public final String getSignature() {
        return "documentRotationError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        ((SettingsJsonParser) this.receiver).MediaDescriptionCompat(th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
