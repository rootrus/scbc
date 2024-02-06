package p040o;

import p040o.CrashlyticsBackgroundWorker;
import p040o.writeUInt64NoTag;

/* renamed from: o.IPassportDetector$MediaBrowserCompat$CustomActionResultReceiver */
public final class IPassportDetector$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<CrashlyticsBackgroundWorker.C32131, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ IPassportDetector MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IPassportDetector$MediaBrowserCompat$CustomActionResultReceiver(IPassportDetector iPassportDetector) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = iPassportDetector;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final CrashlyticsBackgroundWorker.C32131 r3 = (CrashlyticsBackgroundWorker.C32131) obj;
        onGetStartedClick.write((Object) r3, "success");
        IPassportDetector iPassportDetector = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<readFromParcel>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                readFromParcel readfromparcel = (readFromParcel) obj;
                readfromparcel.aj_();
                readfromparcel.IconCompatParcelizer(r3);
            }
        };
        if (iPassportDetector.RatingCompat != null) {
            r1.IconCompatParcelizer(iPassportDetector.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
