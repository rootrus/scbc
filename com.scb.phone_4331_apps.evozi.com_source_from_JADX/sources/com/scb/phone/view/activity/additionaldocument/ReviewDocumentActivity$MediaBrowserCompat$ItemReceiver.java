package com.scb.phone.view.activity.additionaldocument;

import p040o.CheckSCBSEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.SettingsJsonParser;
import p040o.SettingsJsonParser$MediaSessionCompat$ResultReceiverWrapper;
import p040o.onGetStartedClick;

final /* synthetic */ class ReviewDocumentActivity$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    ReviewDocumentActivity$MediaBrowserCompat$ItemReceiver(SettingsJsonParser settingsJsonParser) {
        super(1, settingsJsonParser);
    }

    public final String getName() {
        return "tiffPreviewCreationError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(SettingsJsonParser.class);
    }

    public final String getSignature() {
        return "tiffPreviewCreationError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        SettingsJsonParser settingsJsonParser = (SettingsJsonParser) this.receiver;
        onGetStartedClick.write((Object) th, "error");
        settingsJsonParser.MediaBrowserCompat$ItemReceiver(settingsJsonParser.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new SettingsJsonParser$MediaSessionCompat$ResultReceiverWrapper(settingsJsonParser)));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
