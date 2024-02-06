package p040o;

import java.util.ArrayList;
import p040o.CheckCaptureModule;
import p040o.CheckCaptureModule.RttiExceptionResponseDeserializer;
import p040o.access$2300;

/* renamed from: o.aH */
public class C3970aH<V extends CheckCaptureModule.RttiExceptionResponseDeserializer> extends writeUInt64NoTag<V> {
    public discardOldLogFiles Keep;
    public final StreetViewPanoramaOrientation PlaybackStateCompat$CustomAction;

    public C3970aH(RegularImmutableBiMap regularImmutableBiMap, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        super(regularImmutableBiMap);
        this.PlaybackStateCompat$CustomAction = streetViewPanoramaOrientation;
    }

    /* renamed from: o.aH$3 */
    static /* synthetic */ class C39713 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.getGeoDataClient[] r0 = p040o.getGeoDataClient.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                o.getGeoDataClient r1 = p040o.getGeoDataClient.CONTACTUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.DONATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.MANAGE_SCB_PROMPTPAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.ACCOUNT_SUMMARY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x003e }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.CARDLESS_ATM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.CHANGE_TRANSFER_LIMIT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.TOP_UP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.TRANSFER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x006c }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.REQUEST_MONEY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.FIND_US     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.BILL_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.BILLERSCAN     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C3970aH.C39713.<clinit>():void");
        }
    }

    /* renamed from: o.aH$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        long read;

        write(long j) {
            this.read = j;
        }

        public final void onError(Throwable th) {
            C3970aH aHVar = C3970aH.this;
            aHVar.MediaBrowserCompat$ItemReceiver(aHVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C3970aH aHVar = C3970aH.this;
            sort sort = sort.IconCompatParcelizer;
            boolean z = true;
            if (aHVar.RatingCompat != null) {
                sort.IconCompatParcelizer(aHVar.RatingCompat);
            }
            C3970aH aHVar2 = C3970aH.this;
            if (aHVar2.RatingCompat != null) {
                aHVar2.RatingCompat.aj_();
            }
            C3970aH aHVar3 = C3970aH.this;
            SelfieCaptureExperience_MembersInjector selfieCaptureExperience_MembersInjector = new SelfieCaptureExperience_MembersInjector(this);
            if (aHVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                selfieCaptureExperience_MembersInjector.IconCompatParcelizer(aHVar3.RatingCompat);
            }
        }
    }

    /* renamed from: o.aH$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        protected read() {
        }

        public final void onError(Throwable th) {
            C3970aH aHVar = C3970aH.this;
            aHVar.MediaBrowserCompat$ItemReceiver(aHVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            C3970aH aHVar2 = C3970aH.this;
            Symbology symbology = Symbology.MediaBrowserCompat$CustomActionResultReceiver;
            if (aHVar2.RatingCompat != null) {
                symbology.IconCompatParcelizer(aHVar2.RatingCompat);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            C3970aH aHVar = C3970aH.this;
            sort sort = sort.IconCompatParcelizer;
            boolean z = true;
            if (aHVar.RatingCompat != null) {
                sort.IconCompatParcelizer(aHVar.RatingCompat);
            }
            C3970aH aHVar2 = C3970aH.this;
            if (aHVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                aHVar2.RatingCompat.aj_();
            }
        }
    }

    public final void read(long j) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = this.PlaybackStateCompat$CustomAction;
        standardRemove read2 = standardRemove.read();
        read2.MediaBrowserCompat$CustomActionResultReceiver = j;
        streetViewPanoramaOrientation.read(read2);
        this.PlaybackStateCompat$CustomAction.IconCompatParcelizer(new write(j));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(long j) {
        boolean z = true;
        if (this.RatingCompat != null) {
            discardOldLogFiles$MediaBrowserCompat$ItemReceiver write2 = this.Keep.write(j);
            if (write2.PlaybackStateCompat != null) {
                getGeoDataClient getgeodataclient = write2.PlaybackStateCompat;
                switch (C39713.IconCompatParcelizer[getgeodataclient.ordinal()]) {
                    case 1:
                        getAuxiliaryOnUs getauxiliaryonus = getAuxiliaryOnUs.MediaBrowserCompat$ItemReceiver;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            getauxiliaryonus.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 2:
                        getOnUs1 getonus1 = getOnUs1.MediaBrowserCompat$ItemReceiver;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            getonus1.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 3:
                        getTransitNumber gettransitnumber = getTransitNumber.read;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            gettransitnumber.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 4:
                        ILicenseOverlayView iLicenseOverlayView = ILicenseOverlayView.IconCompatParcelizer;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            iLicenseOverlayView.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 5:
                        getOnUs getonus = getOnUs.MediaBrowserCompat$ItemReceiver;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            getonus.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 6:
                        GpsUsageLimits gpsUsageLimits = GpsUsageLimits.write;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            gpsUsageLimits.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 7:
                        SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder = new SelfieCaptureExperienceCriteriaHolder(getgeodataclient);
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            selfieCaptureExperienceCriteriaHolder.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 8:
                        SelfieCaptureExperience selfieCaptureExperience = new SelfieCaptureExperience(getgeodataclient);
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            selfieCaptureExperience.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 9:
                        setOnUs2 setonus2 = setOnUs2.MediaBrowserCompat$ItemReceiver;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            setonus2.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 10:
                        buildBoundingTetragon buildboundingtetragon = buildBoundingTetragon.read;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            buildboundingtetragon.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 11:
                        C3968aF aFVar = new C3968aF(getgeodataclient);
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            aFVar.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    case 12:
                        LicenseOverlayView_MembersInjector licenseOverlayView_MembersInjector = LicenseOverlayView_MembersInjector.read;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            licenseOverlayView_MembersInjector.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                SelfieBaseCaptureExperience_MembersInjector selfieBaseCaptureExperience_MembersInjector = new SelfieBaseCaptureExperience_MembersInjector(write2);
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    selfieBaseCaptureExperience_MembersInjector.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }

    public final void IconCompatParcelizer(long j, long j2) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver write2 = this.Keep.write(j);
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver write3 = this.Keep.write(j2);
        ArrayList arrayList = new ArrayList();
        standardIsEmpty write4 = standardIsEmpty.write();
        write4.IconCompatParcelizer = write2.setBackgroundResource;
        write4.read = write3.setIcon;
        arrayList.add(write4);
        standardIsEmpty write5 = standardIsEmpty.write();
        write5.IconCompatParcelizer = write3.setBackgroundResource;
        write5.read = write2.setIcon;
        arrayList.add(write5);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = this.PlaybackStateCompat$CustomAction;
        toStringImpl write6 = toStringImpl.write();
        write6.MediaBrowserCompat$ItemReceiver = write2.setCheckable;
        write6.IconCompatParcelizer = arrayList;
        streetViewPanoramaOrientation.write(write6);
        this.PlaybackStateCompat$CustomAction.IconCompatParcelizer(new read());
    }
}
