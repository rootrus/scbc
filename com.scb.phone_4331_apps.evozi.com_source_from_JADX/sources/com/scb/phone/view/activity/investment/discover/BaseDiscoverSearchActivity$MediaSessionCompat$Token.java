package com.scb.phone.view.activity.investment.discover;

import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

final class BaseDiscoverSearchActivity$MediaSessionCompat$Token extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ BaseDiscoverSearchActivity MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseDiscoverSearchActivity$MediaSessionCompat$Token(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverSearchActivity;
    }

    public final /* synthetic */ Object invoke() {
        this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction();
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = false;
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
