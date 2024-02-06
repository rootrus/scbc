package p040o;

import com.scb.phone.data.network.service.LoginService;
import com.scb.phone.data.network.service.LogoutService;
import p040o.AbstractBiMap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.nL */
public final class C5011nL extends writeUInt64NoTag<cancelLoadAllVariants> {
    public boolean MediaBrowserCompat$ItemReceiver = true;
    public final AbstractBiMap.EntrySet.C29881 write;

    /* renamed from: o.nL$MediaMetadataCompat */
    public static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<maxZoomPreference, HmlVerifyPhoneValidateOtpActivity> {
        public MediaMetadataCompat(C5011nL nLVar) {
            super(1, nLVar);
        }

        public final String getName() {
            return "onLandingSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C5011nL.class);
        }

        public final String getSignature() {
            return "onLandingSuccess(Lcom/scb/phone/domain/entity/remittance/RemittanceLandingResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            maxZoomPreference maxzoompreference = (maxZoomPreference) obj;
            onGetStartedClick.write((Object) maxzoompreference, "p1");
            C5011nL.read((C5011nL) this.receiver, maxzoompreference);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nL$RatingCompat */
    public static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public RatingCompat(C5011nL nLVar) {
            super(1, nLVar);
        }

        public final String getName() {
            return "onLandingFailed";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C5011nL.class);
        }

        public final String getSignature() {
            return "onLandingFailed(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            C5011nL.MediaBrowserCompat$CustomActionResultReceiver((C5011nL) this.receiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nL$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<cancelLoadAllVariants> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((cancelLoadAllVariants) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.nL$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<cancelLoadAllVariants> {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((cancelLoadAllVariants) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5011nL(AbstractBiMap.EntrySet.C29881 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "remittanceLandingCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = r2;
    }

    /* renamed from: o.nL$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public LoginService MediaBrowserCompat$ItemReceiver;
        public LoginService read;
        public LogoutService write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(LogoutService logoutService, LoginService loginService, LoginService loginService2) {
            this.write = logoutService;
            this.MediaBrowserCompat$ItemReceiver = loginService;
            this.read = loginService2;
        }
    }

    public final void onDestroy() {
        AbstractBiMap.EntrySet.C29881 r0 = this.write;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5011nL nLVar, Throwable th) {
        if (nLVar.RatingCompat != null) {
            nLVar.RatingCompat.aj_();
        }
        nLVar.MediaBrowserCompat$ItemReceiver(nLVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }

    public static final /* synthetic */ void read(C5011nL nLVar, maxZoomPreference maxzoompreference) {
        boolean z = false;
        if (nLVar.RatingCompat != null) {
            nLVar.RatingCompat.aj_();
        }
        nLVar.MediaBrowserCompat$ItemReceiver = maxzoompreference.read == 1;
        if (!nLVar.write.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat()) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.MediaBrowserCompat$ItemReceiver;
            if (nLVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(nLVar.RatingCompat);
            }
        } else if (nLVar.MediaBrowserCompat$ItemReceiver) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = nL$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (nLVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(nLVar.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = write.IconCompatParcelizer;
            if (nLVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(nLVar.RatingCompat);
            }
        }
    }
}
