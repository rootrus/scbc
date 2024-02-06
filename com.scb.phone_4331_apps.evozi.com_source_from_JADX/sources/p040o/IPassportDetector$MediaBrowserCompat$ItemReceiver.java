package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IPassportDetector$MediaBrowserCompat$ItemReceiver */
public final class IPassportDetector$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ IPassportDetector IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IPassportDetector$MediaBrowserCompat$ItemReceiver(IPassportDetector iPassportDetector) {
        super(1);
        this.IconCompatParcelizer = iPassportDetector;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        IPassportDetector iPassportDetector = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<readFromParcel>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((readFromParcel) obj).MediaBrowserCompat$CustomActionResultReceiver(th);
            }
        };
        if (iPassportDetector.RatingCompat != null) {
            r1.IconCompatParcelizer(iPassportDetector.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
