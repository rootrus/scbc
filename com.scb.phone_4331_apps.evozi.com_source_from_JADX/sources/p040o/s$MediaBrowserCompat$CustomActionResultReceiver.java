package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.s$MediaBrowserCompat$CustomActionResultReceiver */
final class s$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C5250s read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s$MediaBrowserCompat$CustomActionResultReceiver(C5250s sVar, String str) {
        super(1);
        this.read = sVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        C5250s sVar = this.read;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<RttiIdExtractor_Factory>(this) {
            private /* synthetic */ s$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                RttiIdExtractor_Factory rttiIdExtractor_Factory = (RttiIdExtractor_Factory) obj;
                rttiIdExtractor_Factory.aj_();
                String str = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode = str.hashCode();
                if (hashCode != -1436717870) {
                    if (hashCode == -1039294225 && str.equals("NON_REFERRAL")) {
                        rttiIdExtractor_Factory.read();
                    }
                } else if (str.equals("REFERRAL_UNSECURED")) {
                    rttiIdExtractor_Factory.IconCompatParcelizer();
                }
            }
        };
        if (sVar.RatingCompat != null) {
            r0.IconCompatParcelizer(sVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
