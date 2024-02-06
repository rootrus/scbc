package p040o;

import p040o.C10887sdkVersion;
import p040o.writeUInt64NoTag;

/* renamed from: o.eC */
public final class C4332eC extends writeUInt64NoTag<C10887sdkVersion.write> {
    public final Lists MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Closeables write;

    /* renamed from: o.eC$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<zoomByWithFocus, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ setStartedAt MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ C4332eC write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(C4332eC eCVar, setStartedAt setstartedat) {
            super(1);
            this.write = eCVar;
            this.MediaBrowserCompat$CustomActionResultReceiver = setstartedat;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            zoomByWithFocus zoombywithfocus = (zoomByWithFocus) obj;
            onGetStartedClick.write((Object) zoombywithfocus, "confirm");
            C4332eC.IconCompatParcelizer(this.write);
            final standardStartAndWait IconCompatParcelizer = this.write.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, zoombywithfocus);
            C4332eC eCVar = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C10887sdkVersion.write>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((C10887sdkVersion.write) obj).write(IconCompatParcelizer);
                }
            };
            if (eCVar.RatingCompat != null) {
                r1.IconCompatParcelizer(eCVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4332eC(RegularImmutableBiMap regularImmutableBiMap, Lists lists, Closeables closeables) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) lists, "controller");
        onGetStartedClick.write((Object) closeables, "nsipPartnerPaymentSuccessDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = lists;
        this.write = closeables;
    }

    public static final /* synthetic */ void IconCompatParcelizer(C4332eC eCVar) {
        if (eCVar.RatingCompat != null) {
            eCVar.RatingCompat.aj_();
        }
    }
}
