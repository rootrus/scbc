package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setImageJpegQuality$MediaBrowserCompat$MediaItem */
public final class setImageJpegQuality$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ setImageJpegQuality MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setImageJpegQuality$MediaBrowserCompat$MediaItem(setImageJpegQuality setimagejpegquality) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = setimagejpegquality;
    }

    public final /* synthetic */ Object invoke() {
        setImageJpegQuality setimagejpegquality = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<RttiIdExtractor>(this) {
            private /* synthetic */ setImageJpegQuality$MediaBrowserCompat$MediaItem read;

            {
                this.read = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((RttiIdExtractor) obj).aj_();
                setImageJpegQuality.IconCompatParcelizer(this.read.MediaBrowserCompat$CustomActionResultReceiver);
            }
        };
        if (setimagejpegquality.RatingCompat != null) {
            r1.IconCompatParcelizer(setimagejpegquality.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
