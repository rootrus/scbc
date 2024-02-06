package p040o;

import p040o.CharStreams;
import p040o.readVersion;
import p040o.writeUInt64NoTag;

/* renamed from: o.eD */
public final class C4334eD extends writeUInt64NoTag<readVersion.read> {
    public final Lists IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Closeables MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver read;
    /* access modifiers changed from: private */
    public final CharStreams.C31712 write;

    /* renamed from: o.eD$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<readVersion.read> {
        private /* synthetic */ setStartedAt MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ C4334eD write;

        public IconCompatParcelizer(C4334eD eDVar, setStartedAt setstartedat) {
            this.write = eDVar;
            this.MediaBrowserCompat$ItemReceiver = setstartedat;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((readVersion.read) obj).write(this.write.write.read(this.MediaBrowserCompat$ItemReceiver, this.write.read.setItemInvoker()));
        }
    }

    /* renamed from: o.eD$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<zoomByWithFocus, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4334eD MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ setStartedAt write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(C4334eD eDVar, setStartedAt setstartedat) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = eDVar;
            this.write = setstartedat;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            zoomByWithFocus zoombywithfocus = (zoomByWithFocus) obj;
            onGetStartedClick.write((Object) zoombywithfocus, "confirm");
            C4334eD.read(this.MediaBrowserCompat$ItemReceiver);
            final standardStartAndWait IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.write, zoombywithfocus);
            C4334eD eDVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<readVersion.read>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((readVersion.read) obj).MediaBrowserCompat$ItemReceiver(IconCompatParcelizer);
                }
            };
            if (eDVar.RatingCompat != null) {
                r1.IconCompatParcelizer(eDVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4334eD(RegularImmutableBiMap regularImmutableBiMap, Lists lists, CharStreams.C31712 r4, Closeables closeables, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) lists, "controller");
        onGetStartedClick.write((Object) r4, "nsipPartnerPaymentReviewDisplayMapper");
        onGetStartedClick.write((Object) closeables, "nsipPartnerPaymentSuccessDisplayMapper");
        onGetStartedClick.write((Object) getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, "profileRepositoryContractor");
        this.IconCompatParcelizer = lists;
        this.write = r4;
        this.MediaBrowserCompat$ItemReceiver = closeables;
        this.read = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public static final /* synthetic */ void read(C4334eD eDVar) {
        if (eDVar.RatingCompat != null) {
            eDVar.RatingCompat.aj_();
        }
    }
}
