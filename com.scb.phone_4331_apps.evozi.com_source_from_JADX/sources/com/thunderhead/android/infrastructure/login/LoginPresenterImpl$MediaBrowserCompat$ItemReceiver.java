package com.thunderhead.android.infrastructure.login;

import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_MutualFundPersonalInfoFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

final class LoginPresenterImpl$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends Throwable>, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ LoginPresenterImpl write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginPresenterImpl$MediaBrowserCompat$ItemReceiver(LoginPresenterImpl loginPresenterImpl) {
        super(1);
        this.write = loginPresenterImpl;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p;
        HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) obj;
        if (hmlVerifyEmailSuccessfulActivity != null) {
            Integer num = (Integer) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver;
            Throwable th = (Throwable) hmlVerifyEmailSuccessfulActivity.write;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 401) {
                    FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p2 = LoginPresenterImpl.access$getView$p(this.write);
                    if (access$getView$p2 != null) {
                        access$getView$p2.MediaSessionCompat$QueueItem();
                    }
                } else if (intValue == 408) {
                    FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p3 = LoginPresenterImpl.access$getView$p(this.write);
                    if (access$getView$p3 != null) {
                        access$getView$p3.ParcelableVolumeInfo();
                    }
                } else if (intValue == 200 || intValue == 300) {
                    FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p4 = LoginPresenterImpl.access$getView$p(this.write);
                    if (access$getView$p4 != null) {
                        access$getView$p4.MediaBrowserCompat$SearchResultReceiver();
                    }
                } else {
                    FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p5 = LoginPresenterImpl.access$getView$p(this.write);
                    if (access$getView$p5 != null) {
                        access$getView$p5.MediaBrowserCompat$SearchResultReceiver();
                    }
                }
            } else if (!(th == null || (access$getView$p = LoginPresenterImpl.access$getView$p(this.write)) == null)) {
                access$getView$p.MediaBrowserCompat$SearchResultReceiver();
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
