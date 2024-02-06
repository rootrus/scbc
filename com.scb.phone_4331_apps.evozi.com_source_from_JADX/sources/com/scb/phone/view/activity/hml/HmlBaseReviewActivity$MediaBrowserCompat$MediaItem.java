package com.scb.phone.view.activity.hml;

import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsBackgroundWorker;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.zzfe;

final class HmlBaseReviewActivity$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlBaseReviewActivity IconCompatParcelizer;
    private /* synthetic */ CrashlyticsBackgroundWorker.C32142 write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HmlBaseReviewActivity$MediaBrowserCompat$MediaItem(HmlBaseReviewActivity hmlBaseReviewActivity, CrashlyticsBackgroundWorker.C32142 r2) {
        super(0);
        this.IconCompatParcelizer = hmlBaseReviewActivity;
        this.write = r2;
    }

    public final /* synthetic */ Object invoke() {
        T t = this.IconCompatParcelizer.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.read(zzfe.zza.MODEL_CONSENT, this.write);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
