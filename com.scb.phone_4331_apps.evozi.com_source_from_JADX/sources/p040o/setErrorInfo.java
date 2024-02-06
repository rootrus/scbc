package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setErrorInfo */
public final class setErrorInfo extends writeUInt64NoTag<PassportCaptureModule_GetProcessingParametersFactory> {
    public final ChequeInquiryDeepLinkActivity IconCompatParcelizer;
    public final TabLayout MediaBrowserCompat$ItemReceiver;
    public final Snackbar$SnackbarLayout write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setErrorInfo(RegularImmutableBiMap regularImmutableBiMap, TabLayout tabLayout, Snackbar$SnackbarLayout snackbar$SnackbarLayout, ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tabLayout, "hmlSetCustomerTypeCase");
        onGetStartedClick.write((Object) snackbar$SnackbarLayout, "hmlGetSummaryRequestedProductCase");
        onGetStartedClick.write((Object) chequeInquiryDeepLinkActivity, "disposable");
        this.MediaBrowserCompat$ItemReceiver = tabLayout;
        this.write = snackbar$SnackbarLayout;
        this.IconCompatParcelizer = chequeInquiryDeepLinkActivity;
    }

    public final void onDestroy() {
        this.IconCompatParcelizer.dispose();
        super.onDestroy();
    }

    /* renamed from: o.setErrorInfo$read */
    public static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ setErrorInfo read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(setErrorInfo seterrorinfo) {
            super(0);
            this.read = seterrorinfo;
        }

        public final /* synthetic */ Object invoke() {
            setErrorInfo.MediaBrowserCompat$ItemReceiver(this.read);
            setErrorInfo seterrorinfo = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C52975.read;
            if (seterrorinfo.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(seterrorinfo.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(setErrorInfo seterrorinfo) {
        if (seterrorinfo.RatingCompat != null) {
            seterrorinfo.RatingCompat.aj_();
        }
    }
}
