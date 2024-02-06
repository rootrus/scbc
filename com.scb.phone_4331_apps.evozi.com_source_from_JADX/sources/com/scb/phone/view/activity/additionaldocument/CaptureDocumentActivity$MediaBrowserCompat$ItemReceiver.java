package com.scb.phone.view.activity.additionaldocument;

import p040o.CheckSCBSEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.access$2300;
import p040o.buildFromJson;
import p040o.buildFromJson$MediaBrowserCompat$SearchResultReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final /* synthetic */ class CaptureDocumentActivity$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    CaptureDocumentActivity$MediaBrowserCompat$ItemReceiver(buildFromJson buildfromjson) {
        super(1, buildfromjson);
    }

    public final String getName() {
        return "saveBitmapToFileError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(buildFromJson.class);
    }

    public final String getSignature() {
        return "saveBitmapToFileError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        buildFromJson buildfromjson = (buildFromJson) this.receiver;
        onGetStartedClick.write((Object) th, "throwable");
        buildfromjson.MediaBrowserCompat$ItemReceiver(buildfromjson.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = buildFromJson$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
        if (buildfromjson.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(buildfromjson.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
