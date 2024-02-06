package com.scb.phone.view.activity.additionaldocument;

import p040o.CheckSCBSEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.SettingsController;
import p040o.access$2300;
import p040o.onGetStartedClick;

final /* synthetic */ class CropDocumentActivity$MediaBrowserCompat$MediaItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    CropDocumentActivity$MediaBrowserCompat$MediaItem(SettingsController settingsController) {
        super(1, settingsController);
    }

    public final String getName() {
        return "documentProcessError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(SettingsController.class);
    }

    public final String getSignature() {
        return "documentProcessError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        SettingsController settingsController = (SettingsController) this.receiver;
        onGetStartedClick.write((Object) th, "error");
        settingsController.MediaBrowserCompat$ItemReceiver(settingsController.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
