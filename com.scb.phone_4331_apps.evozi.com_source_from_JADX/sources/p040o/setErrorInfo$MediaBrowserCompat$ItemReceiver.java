package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setErrorInfo$MediaBrowserCompat$ItemReceiver */
public final class setErrorInfo$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setErrorInfo MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setErrorInfo$MediaBrowserCompat$ItemReceiver(setErrorInfo seterrorinfo) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = seterrorinfo;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        setErrorInfo seterrorinfo = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetProcessingParametersFactory>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((PassportCaptureModule_GetProcessingParametersFactory) obj).write(th);
            }
        };
        if (seterrorinfo.RatingCompat != null) {
            r1.IconCompatParcelizer(seterrorinfo.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
