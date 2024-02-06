package p040o;

import p040o.Lists;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nT */
public final class C5021nT extends writeUInt64NoTag<ServerProjectProvider.C706212> {
    public final Lists.TransformingSequentialList.C35951 MediaBrowserCompat$ItemReceiver;
    String read = "REMITTANCE";
    /* access modifiers changed from: private */
    public final toLongArray write;

    /* renamed from: o.nT$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706212> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C706212) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.nT$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706212> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C706212) obj).AlertController$RecycleListView();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5021nT(Lists.TransformingSequentialList.C35951 r2, toLongArray tolongarray, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "remittanceController");
        onGetStartedClick.write((Object) tolongarray, "termsAndConditionsMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = r2;
        this.write = tolongarray;
    }

    /* renamed from: o.nT$read */
    public static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C5021nT MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(C5021nT nTVar) {
            super(0);
            this.MediaBrowserCompat$ItemReceiver = nTVar;
        }

        public final /* synthetic */ Object invoke() {
            C5021nT nTVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C50224.IconCompatParcelizer;
            if (nTVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(nTVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
