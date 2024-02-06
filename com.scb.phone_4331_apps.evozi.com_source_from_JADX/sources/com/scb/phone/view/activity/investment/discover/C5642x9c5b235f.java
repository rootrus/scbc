package com.scb.phone.view.activity.investment.discover;

import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.captureReportData;
import p040o.onGetStartedClick;
import p040o.setRequestUserName;

/* renamed from: com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity$MediaBrowserCompat$SearchResultReceiver */
final class C5642x9c5b235f extends CheckEligibilityActivity implements FundActionsSuccessActivity<C5641x16f00c3e> {
    final /* synthetic */ BaseDiscoverSearchActivity MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5642x9c5b235f(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverSearchActivity;
    }

    public final /* synthetic */ Object invoke() {
        return new C5641x16f00c3e(new FundFactSheetActivity<captureReportData, HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ C5642x9c5b235f write;

            {
                this.write = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                String str;
                captureReportData capturereportdata = (captureReportData) obj;
                setRequestUserName setrequestusername = this.write.MediaBrowserCompat$CustomActionResultReceiver.presenter;
                if (setrequestusername == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                if (capturereportdata != null) {
                    str = capturereportdata.IconCompatParcelizer;
                } else {
                    str = null;
                }
                String str2 = str;
                if (str2 != null && (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) setrequestusername.read))) {
                    setrequestusername.read = str2;
                    setRequestUserName.MediaBrowserCompat$CustomActionResultReceiver(setrequestusername, setrequestusername.MediaBrowserCompat$MediaItem, 0, setrequestusername.MediaBrowserCompat$ItemReceiver, str2, 2);
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        });
    }
}
