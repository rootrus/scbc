package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.convertBytesToHex$MediaBrowserCompat$ItemReceiver */
final class convertBytesToHex$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ convertBytesToHex MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    convertBytesToHex$MediaBrowserCompat$ItemReceiver(convertBytesToHex convertbytestohex) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = convertbytestohex;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        convertBytesToHex convertbytestohex = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C42103.read;
        if (convertbytestohex.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(convertbytestohex.RatingCompat);
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
