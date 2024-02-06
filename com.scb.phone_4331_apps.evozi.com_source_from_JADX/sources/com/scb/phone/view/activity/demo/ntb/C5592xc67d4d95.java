package com.scb.phone.view.activity.demo.ntb;

import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.detectShadows;
import p040o.detectShadows$MediaBrowserCompat$SearchResultReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.activity.demo.ntb.RegistrationActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5592xc67d4d95 extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ RegistrationActivity IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5592xc67d4d95(RegistrationActivity registrationActivity) {
        super(0);
        this.IconCompatParcelizer = registrationActivity;
    }

    public final /* synthetic */ Object invoke() {
        detectShadows detectshadows = this.IconCompatParcelizer.presenter;
        if (detectshadows == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (RegistrationActivity.write(this.IconCompatParcelizer)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = detectShadows.MediaDescriptionCompat.write;
            if (detectshadows.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(detectshadows.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = detectShadows$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
            if (detectshadows.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(detectshadows.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
