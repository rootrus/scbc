package p040o;

import p040o.LinkedListMultimap;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvCarrier */
public final class getEnvCarrier extends writeUInt64NoTag<C7143hy> {
    public final LinkedListMultimap.MultisetView.C35811 MediaBrowserCompat$ItemReceiver;
    public String write;

    /* renamed from: o.getEnvCarrier$write */
    public static final /* synthetic */ class write extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public write(getEnvCarrier getenvcarrier) {
            super(1, getenvcarrier);
        }

        public final String getName() {
            return "postAddressConfirmationError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(getEnvCarrier.class);
        }

        public final String getSignature() {
            return "postAddressConfirmationError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            getEnvCarrier.IconCompatParcelizer((getEnvCarrier) this.receiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getEnvCarrier(RegularImmutableBiMap regularImmutableBiMap, LinkedListMultimap.MultisetView.C35811 r3) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "controller");
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }

    /* renamed from: o.getEnvCarrier$read */
    static final class read implements Runnable {
        private /* synthetic */ getEnvCarrier MediaBrowserCompat$ItemReceiver;

        read(getEnvCarrier getenvcarrier) {
            this.MediaBrowserCompat$ItemReceiver = getenvcarrier;
        }

        public final void run() {
            getEnvCarrier getenvcarrier = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C45574.IconCompatParcelizer;
            if (getenvcarrier.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getenvcarrier.RatingCompat);
            }
        }
    }

    /* renamed from: o.getEnvCarrier$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Runnable {
        private /* synthetic */ getEnvCarrier write;

        IconCompatParcelizer(getEnvCarrier getenvcarrier) {
            this.write = getenvcarrier;
        }

        public final void run() {
            getEnvCarrier getenvcarrier = this.write;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C45565.IconCompatParcelizer;
            if (getenvcarrier.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getenvcarrier.RatingCompat);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r0.equals("1038") != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0.equals("1037") != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r0.equals("1035") != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r2.RatingCompat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void IconCompatParcelizer(p040o.getEnvCarrier r2, java.lang.Throwable r3) {
        /*
            boolean r0 = r3 instanceof com.scb.phone.domain.errors.RetrofitException
            if (r0 == 0) goto L_0x0060
            r0 = r3
            com.scb.phone.domain.errors.RetrofitException r0 = (com.scb.phone.domain.errors.RetrofitException) r0
            o.ILocationSourceDelegate r0 = r0.IconCompatParcelizer
            if (r0 == 0) goto L_0x0012
            o.ILocationSourceDelegate$zza r0 = r0.write
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.IconCompatParcelizer
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x004f
            int r1 = r0.hashCode()
            switch(r1) {
                case 1507425: goto L_0x003b;
                case 1507521: goto L_0x002f;
                case 1507523: goto L_0x0026;
                case 1507524: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x004f
        L_0x001d:
            java.lang.String r1 = "1038"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
            goto L_0x0037
        L_0x0026:
            java.lang.String r1 = "1037"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
            goto L_0x0037
        L_0x002f:
            java.lang.String r1 = "1035"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
        L_0x0037:
            r2.RatingCompat(r3)
            return
        L_0x003b:
            java.lang.String r1 = "1002"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
            o.RegularImmutableBiMap r0 = r2.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2300$write r1 = p040o.access$2300.write.JUST_DISMISS
            o.access$2200 r3 = r0.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (p040o.access$2300.write) r1)
            r2.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r3)
            return
        L_0x004f:
            o.getEnvCarrier$read r0 = new o.getEnvCarrier$read
            r0.<init>(r2)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            o.RegularImmutableBiMap r1 = r2.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r3 = r1.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (java.lang.Runnable) r0)
            r2.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r3)
            return
        L_0x0060:
            o.getEnvCarrier$IconCompatParcelizer r0 = new o.getEnvCarrier$IconCompatParcelizer
            r0.<init>(r2)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            o.RegularImmutableBiMap r1 = r2.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r3 = r1.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (java.lang.Runnable) r0)
            r2.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getEnvCarrier.IconCompatParcelizer(o.getEnvCarrier, java.lang.Throwable):void");
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getEnvCarrier getenvcarrier, readElement readelement) {
        boolean z = true;
        if (getenvcarrier.RatingCompat != null) {
            getenvcarrier.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer getenvcarrier_mediabrowsercompat_searchresultreceiver = new getEnvCarrier$MediaBrowserCompat$SearchResultReceiver(readelement);
        if (getenvcarrier.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getenvcarrier_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(getenvcarrier.RatingCompat);
        }
    }
}
