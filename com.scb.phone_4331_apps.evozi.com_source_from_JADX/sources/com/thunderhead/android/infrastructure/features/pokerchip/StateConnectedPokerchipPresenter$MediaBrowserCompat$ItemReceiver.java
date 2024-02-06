package com.thunderhead.android.infrastructure.features.pokerchip;

import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindTempLimitReviewFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

final class StateConnectedPokerchipPresenter$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ StateConnectedPokerchipPresenter MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StateConnectedPokerchipPresenter$MediaBrowserCompat$ItemReceiver(StateConnectedPokerchipPresenter stateConnectedPokerchipPresenter) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = stateConnectedPokerchipPresenter;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            FragmentBuilder_BindTempLimitReviewFragment access$getView$p = StateConnectedPokerchipPresenter.access$getView$p(this.MediaBrowserCompat$ItemReceiver);
            if (access$getView$p != null) {
                access$getView$p.MediaBrowserCompat$CustomActionResultReceiver(booleanValue);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
