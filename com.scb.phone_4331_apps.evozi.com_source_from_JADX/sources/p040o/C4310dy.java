package p040o;

import com.scb.phone.data.network.service.CloseAccountService;
import java.util.HashMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.dy */
public final class C4310dy extends writeUInt64NoTag<ListOfException> {
    public final toStringBuilder IconCompatParcelizer;
    public PlacePhotoMetadataResult MediaBrowserCompat$ItemReceiver;
    private final TileProvider MediaBrowserCompat$MediaItem;
    private final endCap MediaBrowserCompat$SearchResultReceiver;
    private final whenAll MediaMetadataCompat;
    public final getStartFinalizer read;
    public final StreetViewPanoramaOrientation write;

    /* renamed from: o.dy$MediaMetadataCompat */
    static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ListOfException, HmlVerifyPhoneValidateOtpActivity> {
        public static final MediaMetadataCompat write = new MediaMetadataCompat();

        MediaMetadataCompat() {
            super(1);
        }

        public final String getName() {
            return "navigateToMfAddAccountInfo";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(ListOfException.class);
        }

        public final String getSignature() {
            return "navigateToMfAddAccountInfo()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ListOfException listOfException = (ListOfException) obj;
            onGetStartedClick.write((Object) listOfException, "p1");
            listOfException.IconCompatParcelizer();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dy$ParcelableVolumeInfo */
    public static final /* synthetic */ class ParcelableVolumeInfo extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ListOfException, HmlVerifyPhoneValidateOtpActivity> {
        public static final ParcelableVolumeInfo MediaBrowserCompat$ItemReceiver = new ParcelableVolumeInfo();

        ParcelableVolumeInfo() {
            super(1);
        }

        public final String getName() {
            return "requestVerifyLoginSession";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(ListOfException.class);
        }

        public final String getSignature() {
            return "requestVerifyLoginSession()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ListOfException listOfException = (ListOfException) obj;
            onGetStartedClick.write((Object) listOfException, "p1");
            listOfException.MediaDescriptionCompat();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dy$RatingCompat */
    static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ListOfException, HmlVerifyPhoneValidateOtpActivity> {
        public static final RatingCompat read = new RatingCompat();

        RatingCompat() {
            super(1);
        }

        public final String getName() {
            return "navigateToScbsLanding";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(ListOfException.class);
        }

        public final String getSignature() {
            return "navigateToScbsLanding()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ListOfException listOfException = (ListOfException) obj;
            onGetStartedClick.write((Object) listOfException, "p1");
            listOfException.MediaMetadataCompat();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dy$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ListOfException> {
        private /* synthetic */ HashMap MediaBrowserCompat$ItemReceiver;

        public read(HashMap hashMap) {
            this.MediaBrowserCompat$ItemReceiver = hashMap;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ListOfException) obj).IconCompatParcelizer("investment_landing", this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.dy$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ListOfException> {
        private /* synthetic */ PlacePhotoMetadataResult MediaBrowserCompat$ItemReceiver;

        write(PlacePhotoMetadataResult placePhotoMetadataResult) {
            this.MediaBrowserCompat$ItemReceiver = placePhotoMetadataResult;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ListOfException listOfException = (ListOfException) obj;
            String str = this.MediaBrowserCompat$ItemReceiver.read;
            if (str == null || str.matches("^(http|https)://play.google.com/store/apps/details.*")) {
                listOfException.write(this.MediaBrowserCompat$ItemReceiver.AppCompatViewInflater, this.MediaBrowserCompat$ItemReceiver.setPopupCallback);
            } else {
                listOfException.MediaBrowserCompat$ItemReceiver(str, this.MediaBrowserCompat$ItemReceiver.AppCompatViewInflater, this.MediaBrowserCompat$ItemReceiver.setPopupCallback);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4310dy(RegularImmutableBiMap regularImmutableBiMap, StreetViewPanoramaOrientation streetViewPanoramaOrientation, whenAll whenall, toStringBuilder tostringbuilder, endCap endcap, TileProvider tileProvider, getStartFinalizer getstartfinalizer) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) streetViewPanoramaOrientation, "landingCase");
        onGetStartedClick.write((Object) whenall, "ntbLandingCase");
        onGetStartedClick.write((Object) tostringbuilder, "partnerTileMapper");
        onGetStartedClick.write((Object) endcap, "accountManagementCase");
        onGetStartedClick.write((Object) tileProvider, "mutualFundTermCase");
        onGetStartedClick.write((Object) getstartfinalizer, "getNtbUserInfoUseCase");
        this.write = streetViewPanoramaOrientation;
        this.MediaMetadataCompat = whenall;
        this.IconCompatParcelizer = tostringbuilder;
        this.MediaBrowserCompat$SearchResultReceiver = endcap;
        this.MediaBrowserCompat$MediaItem = tileProvider;
        this.read = getstartfinalizer;
    }

    public static boolean IconCompatParcelizer(String str) {
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "24") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "51") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "39");
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [o.dw] */
    /* JADX WARNING: type inference failed for: r1v17, types: [o.dw] */
    /* JADX WARNING: type inference failed for: r1v20, types: [o.dw] */
    /* JADX WARNING: type inference failed for: r1v24, types: [o.dw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write() {
        /*
            r5 = this;
            o.PlacePhotoMetadataResult r0 = r5.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x014e
            java.lang.String r1 = r0.setShortcut
            o.getGeoDataClient r2 = p040o.getGeoDataClient.FUNCTION
            java.lang.String r2 = r2.name()
            boolean r2 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00ef
            java.lang.String r0 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r0 == 0) goto L_0x00ee
            int r1 = r0.hashCode()
            r2 = 1602(0x642, float:2.245E-42)
            if (r1 == r2) goto L_0x009b
            r2 = 1638(0x666, float:2.295E-42)
            if (r1 == r2) goto L_0x004b
            r2 = 1692(0x69c, float:2.371E-42)
            if (r1 != r2) goto L_0x00ee
            java.lang.String r1 = "51"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ee
            o.dy$MediaSessionCompat$ResultReceiverWrapper r0 = p040o.dy$MediaSessionCompat$ResultReceiverWrapper.write
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x003c
            o.dw r1 = new o.dw
            r1.<init>(r0)
            r0 = r1
        L_0x003c:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r5.RatingCompat
            if (r1 == 0) goto L_0x0043
            r3 = r4
        L_0x0043:
            if (r3 == 0) goto L_0x004a
            T r1 = r5.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x004a:
            return
        L_0x004b:
            java.lang.String r1 = "39"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ee
            o.endCap r0 = r5.MediaBrowserCompat$SearchResultReceiver
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r0 = r0.IconCompatParcelizer
            o.zzvf r0 = r0.RatingCompat()
            if (r0 == 0) goto L_0x0080
            o.GoogleMap$OnMapClickListener r0 = r0.MediaMetadataCompat
            if (r0 == 0) goto L_0x0080
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 != r4) goto L_0x0080
            o.dy$RatingCompat r0 = p040o.C4310dy.RatingCompat.read
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0071
            o.dw r1 = new o.dw
            r1.<init>(r0)
            r0 = r1
        L_0x0071:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r5.RatingCompat
            if (r1 == 0) goto L_0x0078
            r3 = r4
        L_0x0078:
            if (r3 == 0) goto L_0x007f
            T r1 = r5.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x007f:
            return
        L_0x0080:
            o.dy$MediaMetadataCompat r0 = p040o.C4310dy.MediaMetadataCompat.write
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x008c
            o.dw r1 = new o.dw
            r1.<init>(r0)
            r0 = r1
        L_0x008c:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r5.RatingCompat
            if (r1 == 0) goto L_0x0093
            r3 = r4
        L_0x0093:
            if (r3 == 0) goto L_0x009a
            T r1 = r5.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x009a:
            return
        L_0x009b:
            java.lang.String r1 = "24"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ee
            o.endCap r0 = r5.MediaBrowserCompat$SearchResultReceiver
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r0 = r0.IconCompatParcelizer
            o.zzvf r0 = r0.RatingCompat()
            if (r0 == 0) goto L_0x00b0
            java.util.List<o.zzrr> r0 = r0.write
            goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            if (r0 == 0) goto L_0x00d4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r4
            if (r0 != r4) goto L_0x00d4
            o.TileProvider r0 = r5.MediaBrowserCompat$MediaItem
            o.DebitCardResetOtpActivity r1 = r0.read()
            o.dy$MediaBrowserCompat$MediaItem r2 = new o.dy$MediaBrowserCompat$MediaItem
            r2.<init>(r5)
            o.DebitCardMarketConductDeepLinkActivity r2 = (p040o.DebitCardMarketConductDeepLinkActivity) r2
            o.dy$MediaDescriptionCompat r3 = new o.dy$MediaDescriptionCompat
            r3.<init>(r5)
            o.DebitCardMarketConductDeepLinkActivity r3 = (p040o.DebitCardMarketConductDeepLinkActivity) r3
            r0.read(r1, r2, r3)
            return
        L_0x00d4:
            o.dy$MediaBrowserCompat$SearchResultReceiver r0 = p040o.dy$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x00e0
            o.dw r1 = new o.dw
            r1.<init>(r0)
            r0 = r1
        L_0x00e0:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r5.RatingCompat
            if (r1 == 0) goto L_0x00e7
            r3 = r4
        L_0x00e7:
            if (r3 == 0) goto L_0x00ee
            T r1 = r5.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x00ee:
            return
        L_0x00ef:
            o.getGeoDataClient r2 = p040o.getGeoDataClient.DEEPLINK
            java.lang.String r2 = r2.name()
            boolean r2 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x010f
            o.dy$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.dy$MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r0 = r5.RatingCompat
            if (r0 == 0) goto L_0x0107
            r3 = r4
        L_0x0107:
            if (r3 == 0) goto L_0x010e
            T r0 = r5.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x010e:
            return
        L_0x010f:
            o.getGeoDataClient r2 = p040o.getGeoDataClient.WEBVIEW_PARTNER
            java.lang.String r2 = r2.name()
            boolean r2 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x012f
            o.dy$MediaSessionCompat$Token r1 = new o.dy$MediaSessionCompat$Token
            r1.<init>(r5, r0)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r0 = r5.RatingCompat
            if (r0 == 0) goto L_0x0127
            r3 = r4
        L_0x0127:
            if (r3 == 0) goto L_0x012e
            T r0 = r5.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x012e:
            return
        L_0x012f:
            o.getGeoDataClient r2 = p040o.getGeoDataClient.APPLICATION
            java.lang.String r2 = r2.name()
            boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x014e
            o.dy$write r1 = new o.dy$write
            r1.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r0 = r5.RatingCompat
            if (r0 == 0) goto L_0x0147
            r3 = r4
        L_0x0147:
            if (r3 == 0) goto L_0x014e
            T r0 = r5.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4310dy.write():void");
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: o.dy$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public CloseAccountService MediaBrowserCompat$ItemReceiver;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(CloseAccountService closeAccountService) {
            this.MediaBrowserCompat$ItemReceiver = closeAccountService;
        }
    }

    /* renamed from: o.dy$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ C4310dy read;

        MediaDescriptionCompat(C4310dy dyVar) {
            this.read = dyVar;
        }

        /* JADX WARNING: type inference failed for: r1v4, types: [o.dw] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r3) {
            /*
                r2 = this;
                o.dy r3 = r2.read
                p040o.C4310dy.MediaBrowserCompat$CustomActionResultReceiver(r3)
                o.dy r3 = r2.read
                o.dy$MediaDescriptionCompat$1 r0 = p040o.C4310dy.MediaDescriptionCompat.C43111.MediaBrowserCompat$ItemReceiver
                o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
                if (r0 == 0) goto L_0x0013
                o.dw r1 = new o.dw
                r1.<init>(r0)
                r0 = r1
            L_0x0013:
                o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
                T r1 = r3.RatingCompat
                if (r1 == 0) goto L_0x001b
                r1 = 1
                goto L_0x001c
            L_0x001b:
                r1 = 0
            L_0x001c:
                if (r1 == 0) goto L_0x0023
                T r3 = r3.RatingCompat
                r0.IconCompatParcelizer(r3)
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4310dy.MediaDescriptionCompat.IconCompatParcelizer(java.lang.Object):void");
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4310dy dyVar) {
        if (dyVar.RatingCompat != null) {
            dyVar.RatingCompat.aj_();
        }
    }

    public final PlacePhotoMetadataResult read(long j) {
        if (this.read.write.read() != null) {
            return this.MediaMetadataCompat.write(j);
        }
        return this.write.read(j, true);
    }
}
