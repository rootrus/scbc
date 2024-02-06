package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFirstPassThresholdUniform$MediaBrowserCompat$SearchResultReceiver */
public final class C9969x4d15ec02 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getFirstPassThresholdUniform write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9969x4d15ec02(getFirstPassThresholdUniform getfirstpassthresholduniform) {
        super(1);
        this.write = getfirstpassthresholduniform;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        getFirstPassThresholdUniform getfirstpassthresholduniform = this.write;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getCvv>(this) {
            private /* synthetic */ C9969x4d15ec02 read;

            {
                this.read = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                this.read.write.MediaBrowserCompat$ItemReceiver(this.read.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        };
        if (getfirstpassthresholduniform.RatingCompat != null) {
            r1.IconCompatParcelizer(getfirstpassthresholduniform.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
