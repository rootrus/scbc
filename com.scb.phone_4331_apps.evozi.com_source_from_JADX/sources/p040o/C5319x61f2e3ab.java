package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzby;

/* renamed from: o.setImageJpegQuality$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5319x61f2e3ab extends CheckEligibilityActivity implements FundFactSheetActivity<zzby.zzc, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ setImageJpegQuality MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5319x61f2e3ab(setImageJpegQuality setimagejpegquality) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = setimagejpegquality;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final zzby.zzc zzc = (zzby.zzc) obj;
        onGetStartedClick.write((Object) zzc, "data");
        setImageJpegQuality setimagejpegquality = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<RttiIdExtractor>(this) {
            private /* synthetic */ C5319x61f2e3ab MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((RttiIdExtractor) obj).aj_();
                setImageJpegQuality.write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, zzc);
            }
        };
        if (setimagejpegquality.RatingCompat != null) {
            r1.IconCompatParcelizer(setimagejpegquality.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
