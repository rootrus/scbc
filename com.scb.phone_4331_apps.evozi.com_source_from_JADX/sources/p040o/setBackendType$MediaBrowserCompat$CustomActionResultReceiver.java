package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setBackendType$MediaBrowserCompat$CustomActionResultReceiver */
public final class setBackendType$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setBackendType read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setBackendType$MediaBrowserCompat$CustomActionResultReceiver(setBackendType setbackendtype) {
        super(0);
        this.read = setbackendtype;
    }

    public final /* synthetic */ Object invoke() {
        setBackendType setbackendtype = this.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C52635.MediaBrowserCompat$CustomActionResultReceiver;
        if (setbackendtype.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setbackendtype.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
