package p040o;

import p040o.OnDeviceIdExtractor;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.ho$MediaSessionCompat$ResultReceiverWrapper */
public final class ho$MediaSessionCompat$ResultReceiverWrapper extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C4778ho read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ho$MediaSessionCompat$ResultReceiverWrapper(C4778ho hoVar) {
        super(1);
        this.read = hoVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        C4778ho.MediaSessionCompat$Token(this.read);
        C4778ho hoVar = this.read;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.IconCompatParcelizer>(this) {
            private /* synthetic */ ho$MediaSessionCompat$ResultReceiverWrapper MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((OnDeviceIdExtractor.C6966a.IconCompatParcelizer) obj).write(this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        };
        if (hoVar.RatingCompat != null) {
            r1.IconCompatParcelizer(hoVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
