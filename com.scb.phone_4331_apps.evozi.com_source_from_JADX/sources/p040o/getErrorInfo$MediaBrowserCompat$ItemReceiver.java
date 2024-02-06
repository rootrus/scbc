package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getErrorInfo$MediaBrowserCompat$ItemReceiver */
public final class getErrorInfo$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getErrorInfo IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getErrorInfo$MediaBrowserCompat$ItemReceiver(getErrorInfo geterrorinfo) {
        super(1);
        this.IconCompatParcelizer = geterrorinfo;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        getErrorInfo.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        getErrorInfo geterrorinfo = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_RttiExceptionResponseDeserializer_Factory>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((IdCaptureModule_RttiExceptionResponseDeserializer_Factory) obj).read(th);
            }
        };
        if (geterrorinfo.RatingCompat != null) {
            r1.IconCompatParcelizer(geterrorinfo.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
