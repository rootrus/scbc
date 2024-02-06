package com.scb.phone.view.activity.ccrredemption.search;

import p040o.C7224ld;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.setFormat;

/* renamed from: com.scb.phone.view.activity.ccrredemption.search.RewardSearchActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5575x32f03c13 extends CheckEligibilityActivity implements FundActionsSuccessActivity<C7224ld> {
    final /* synthetic */ RewardSearchActivity read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5575x32f03c13(RewardSearchActivity rewardSearchActivity) {
        super(0);
        this.read = rewardSearchActivity;
    }

    public final /* synthetic */ Object invoke() {
        return new C7224ld(new FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ C5575x32f03c13 MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                String str = (String) obj;
                onGetStartedClick.write((Object) str, "it");
                setFormat setformat = this.MediaBrowserCompat$CustomActionResultReceiver.read.presenter;
                if (setformat == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                onGetStartedClick.write((Object) str, "keyword");
                setformat.MediaBrowserCompat$CustomActionResultReceiver(str, true);
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        });
    }
}
