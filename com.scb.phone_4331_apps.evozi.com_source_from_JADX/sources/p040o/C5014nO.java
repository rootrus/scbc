package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nO */
public final class C5014nO extends writeUInt64NoTag<loadAllVariantsForProject> {
    public final not IconCompatParcelizer;
    public setBackground MediaBrowserCompat$ItemReceiver;
    private final LittleEndianDataOutputStream write;

    /* renamed from: o.nO$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public IconCompatParcelizer(C5014nO nOVar) {
            super(1, nOVar);
        }

        public final String getName() {
            return "onLoadUserAddressFail";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C5014nO.class);
        }

        public final String getSignature() {
            return "onLoadUserAddressFail(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            C5014nO.MediaBrowserCompat$CustomActionResultReceiver((C5014nO) this.receiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nO$read */
    public static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<onMapClick, HmlVerifyPhoneValidateOtpActivity> {
        public read(C5014nO nOVar) {
            super(1, nOVar);
        }

        public final String getName() {
            return "onLoadUserAddressSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C5014nO.class);
        }

        public final String getSignature() {
            return "onLoadUserAddressSuccess(Lcom/scb/phone/domain/entity/profile/UserAddress;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onMapClick onmapclick = (onMapClick) obj;
            onGetStartedClick.write((Object) onmapclick, "p1");
            C5014nO.read((C5014nO) this.receiver, onmapclick);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5014nO(not not, LittleEndianDataOutputStream littleEndianDataOutputStream, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) not, "getUserAddressCase");
        onGetStartedClick.write((Object) littleEndianDataOutputStream, "userAddressDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = not;
        this.write = littleEndianDataOutputStream;
    }

    /* renamed from: o.nO$write */
    static final class write implements Runnable {
        private /* synthetic */ C5014nO write;

        write(C5014nO nOVar) {
            this.write = nOVar;
        }

        /* JADX WARNING: type inference failed for: r2v4, types: [o.nN] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                o.nO r0 = r3.write
                o.nO$write$4 r1 = p040o.C5014nO.write.C50154.read
                o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
                if (r1 == 0) goto L_0x000e
                o.nN r2 = new o.nN
                r2.<init>(r1)
                r1 = r2
            L_0x000e:
                o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
                T r2 = r0.RatingCompat
                if (r2 == 0) goto L_0x0016
                r2 = 1
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                if (r2 == 0) goto L_0x001e
                T r0 = r0.RatingCompat
                r1.IconCompatParcelizer(r0)
            L_0x001e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C5014nO.write.run():void");
        }
    }

    public final void onDestroy() {
        not not = this.IconCompatParcelizer;
        if (!not.MediaBrowserCompat$MediaItem.isDisposed()) {
            not.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5014nO nOVar, Throwable th) {
        if (!nOVar.MediaBrowserCompat$CustomActionResultReceiver(th, true)) {
            nOVar.MediaBrowserCompat$ItemReceiver(nOVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new write(nOVar)));
        }
    }

    public static final /* synthetic */ void read(C5014nO nOVar, onMapClick onmapclick) {
        onGetStartedClick.write((Object) onmapclick, "domain");
        nOVar.MediaBrowserCompat$ItemReceiver = new setBackground(LittleEndianDataOutputStream.IconCompatParcelizer(onmapclick.MediaBrowserCompat$ItemReceiver));
        if (nOVar.RatingCompat != null) {
            nOVar.RatingCompat.aj_();
        }
        nOVar.read(nOVar.MediaBrowserCompat$ItemReceiver);
    }

    public final void read(setBackground setbackground) {
        String str;
        setLog setlog;
        if (setbackground == null || (setlog = setbackground.MediaBrowserCompat$ItemReceiver) == null) {
            str = null;
        } else {
            str = setlog.write;
        }
        writeUInt64NoTag.IconCompatParcelizer no_mediabrowsercompat_itemreceiver = new nO$MediaBrowserCompat$ItemReceiver(str);
        if (this.RatingCompat != null) {
            no_mediabrowsercompat_itemreceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
