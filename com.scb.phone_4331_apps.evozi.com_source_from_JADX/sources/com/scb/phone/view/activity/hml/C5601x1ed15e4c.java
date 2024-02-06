package com.scb.phone.view.activity.hml;

import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsBackgroundWorker;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.zzfe;

/* renamed from: com.scb.phone.view.activity.hml.HmlBaseReviewActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5601x1ed15e4c extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlBaseReviewActivity IconCompatParcelizer;
    private /* synthetic */ CrashlyticsBackgroundWorker.C32142 MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5601x1ed15e4c(HmlBaseReviewActivity hmlBaseReviewActivity, CrashlyticsBackgroundWorker.C32142 r2) {
        super(0);
        this.IconCompatParcelizer = hmlBaseReviewActivity;
        this.MediaBrowserCompat$ItemReceiver = r2;
    }

    public final /* synthetic */ Object invoke() {
        T t = this.IconCompatParcelizer.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.read(zzfe.zza.CROSS_SELL_CONSENT, this.MediaBrowserCompat$ItemReceiver);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
