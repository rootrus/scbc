package com.scb.phone.view.fragment.hml;

import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.executeKMSSoapCall;
import p040o.writeUInt64NoTag;

final class HmlEditOperatingAccountFragment$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlEditOperatingAccountFragment IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HmlEditOperatingAccountFragment$MediaBrowserCompat$ItemReceiver(HmlEditOperatingAccountFragment hmlEditOperatingAccountFragment) {
        super(0);
        this.IconCompatParcelizer = hmlEditOperatingAccountFragment;
    }

    public final /* synthetic */ Object invoke() {
        executeKMSSoapCall executekmssoapcall = (executeKMSSoapCall) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = executeKMSSoapCall.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (executekmssoapcall.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(executekmssoapcall.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
