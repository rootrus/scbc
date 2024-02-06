package com.thunderhead.android.infrastructure.login;

import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_MutualFundPersonalInfoFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

final class LoginPresenterImpl$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ LoginPresenterImpl read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginPresenterImpl$MediaBrowserCompat$CustomActionResultReceiver(LoginPresenterImpl loginPresenterImpl) {
        super(1);
        this.read = loginPresenterImpl;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p = LoginPresenterImpl.access$getView$p(this.read);
            if (access$getView$p != null) {
                access$getView$p.MediaBrowserCompat$CustomActionResultReceiver(booleanValue);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
