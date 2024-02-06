package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ImageProcessor_Factory$MediaBrowserCompat$CustomActionResultReceiver */
final class C9767xfb8bdb4f extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ ImageProcessor_Factory IconCompatParcelizer;
    final /* synthetic */ String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9767xfb8bdb4f(ImageProcessor_Factory imageProcessor_Factory, String str) {
        super(1);
        this.IconCompatParcelizer = imageProcessor_Factory;
        this.write = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ImageProcessor_Factory imageProcessor_Factory = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<CaptureData>(this) {
            private /* synthetic */ C9767xfb8bdb4f MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                CaptureData captureData = (CaptureData) obj;
                captureData.aj_();
                String str = this.MediaBrowserCompat$ItemReceiver.write;
                int hashCode = str.hashCode();
                if (hashCode != -1436717870) {
                    if (hashCode == -1039294225 && str.equals("NON_REFERRAL")) {
                        captureData.MediaBrowserCompat$ItemReceiver();
                    }
                } else if (str.equals("REFERRAL_UNSECURED")) {
                    captureData.IconCompatParcelizer();
                }
            }
        };
        if (imageProcessor_Factory.RatingCompat != null) {
            r0.IconCompatParcelizer(imageProcessor_Factory.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
