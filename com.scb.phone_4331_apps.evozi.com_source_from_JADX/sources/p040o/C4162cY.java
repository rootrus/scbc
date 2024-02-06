package p040o;

import android.text.TextUtils;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.Iterables;
import p040o.PhenotypeFlag;

/* renamed from: o.cY */
public class C4162cY extends writeUInt64NoTag<KtaJsonCheck$MediaBrowserCompat$CustomActionResultReceiver> {
    public final Iterables.C352212 IconCompatParcelizer;
    public getProjection MediaBrowserCompat$ItemReceiver;
    String MediaBrowserCompat$MediaItem = DiskLruCache.VERSION_1;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private final PhenotypeFlag.zza MediaSessionCompat$ResultReceiverWrapper;
    private final onProviderInstallFailed MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    public final getInput read;
    public final MarkerOptions write;

    @HmlPinActivity
    public C4162cY(RegularImmutableBiMap regularImmutableBiMap, MarkerOptions markerOptions, onProviderInstallFailed onproviderinstallfailed, PhenotypeFlag.zza zza, getInput getinput, newDataInput newdatainput, getDigest getdigest, Iterables.C352212 r8) {
        super(regularImmutableBiMap);
        this.write = markerOptions;
        this.MediaSessionCompat$Token = onproviderinstallfailed;
        this.MediaSessionCompat$ResultReceiverWrapper = zza;
        this.read = getinput;
        getinput.MediaBrowserCompat$ItemReceiver = newdatainput;
        this.read.IconCompatParcelizer = getdigest;
        this.IconCompatParcelizer = r8;
    }

    public final void read() {
        String str;
        getProjection write2 = this.write.read.write();
        this.MediaBrowserCompat$ItemReceiver = write2;
        if (!(write2.MediaBrowserCompat$MediaItem == null || this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.ParcelableVolumeInfo == null)) {
            this.MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.ParcelableVolumeInfo;
        }
        AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.write.MediaBrowserCompat$CustomActionResultReceiver.setCheckable());
        this.MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = "";
        if (MediaBrowserCompat$CustomActionResultReceiver.read != null) {
            this.MediaDescriptionCompat = this.MediaMetadataCompat.read.read;
            this.MediaBrowserCompat$SearchResultReceiver = this.MediaMetadataCompat.read.MediaBrowserCompat$ItemReceiver;
        } else {
            this.MediaDescriptionCompat = str2;
            this.MediaBrowserCompat$SearchResultReceiver = str2;
        }
        if (this.MediaMetadataCompat.MediaDescriptionCompat != null) {
            str = this.MediaMetadataCompat.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = str2;
        }
        if (this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver != null) {
            str2 = this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
        }
        getICaptureMenuView geticapturemenuview = new getICaptureMenuView(this);
        boolean z = true;
        if (this.RatingCompat != null) {
            geticapturemenuview.IconCompatParcelizer(this.RatingCompat);
        }
        getICameraView geticameraview = new getICameraView(this, str, str2);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            geticameraview.IconCompatParcelizer(this.RatingCompat);
        }
        MediaBrowserCompat$ItemReceiver();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r4.MediaSessionCompat$QueueItem == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver() {
        /*
            r4 = this;
            o.AutoValue_CrashlyticsReport_CustomAttribute$Builder r0 = r4.MediaMetadataCompat
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0036
            o.AutoValue_CrashlyticsReport_CustomAttribute r0 = r0.MediaDescriptionCompat
            if (r0 != 0) goto L_0x000c
            r0 = r2
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            o.AutoValue_CrashlyticsReport_CustomAttribute$Builder r3 = r4.MediaMetadataCompat
            o.AutoValue_CrashlyticsReport_CustomAttribute r3 = r3.MediaBrowserCompat$ItemReceiver
            if (r3 != 0) goto L_0x001a
            o.AutoValue_CrashlyticsReport_CustomAttribute$Builder r3 = r4.MediaMetadataCompat
            boolean r3 = r3.ParcelableVolumeInfo
            if (r3 != 0) goto L_0x001a
            r0 = r2
        L_0x001a:
            java.lang.String r3 = r4.MediaDescriptionCompat
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            boolean r3 = r4.ParcelableVolumeInfo
            if (r3 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            java.lang.String r3 = r4.MediaBrowserCompat$SearchResultReceiver
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            boolean r3 = r4.MediaSessionCompat$QueueItem
            if (r3 != 0) goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            o.getDiskBitmapCache r3 = new o.getDiskBitmapCache
            r3.<init>(r0)
            T r0 = r4.RatingCompat
            if (r0 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x0049
            T r0 = r4.RatingCompat
            r3.IconCompatParcelizer(r0)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4162cY.MediaBrowserCompat$ItemReceiver():void");
    }

    public final void read(String str) {
        boolean z;
        this.MediaDescriptionCompat = str;
        PhenotypeFlag.zza zza = this.MediaSessionCompat$ResultReceiverWrapper;
        boolean z2 = false;
        if (str == null) {
            z = false;
        } else {
            z = zza.IconCompatParcelizer.matcher(str).matches();
        }
        this.ParcelableVolumeInfo = z;
        MediaBrowserCompat$ItemReceiver();
        if (this.ParcelableVolumeInfo) {
            C4068bG bGVar = C4068bG.IconCompatParcelizer;
            if (this.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                bGVar.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (TextUtils.isEmpty(str)) {
            getExtractionParameters getextractionparameters = getExtractionParameters.IconCompatParcelizer;
            if (this.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                getextractionparameters.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (!this.ParcelableVolumeInfo) {
            C4157cR cRVar = C4157cR.read;
            if (this.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                cRVar.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public static Boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return Boolean.valueOf(str.equals(DiskLruCache.VERSION_1));
    }

    public final void write(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        boolean z = true;
        this.MediaSessionCompat$QueueItem = this.MediaSessionCompat$Token.read(str) && !TextUtils.isEmpty(str);
        MediaBrowserCompat$ItemReceiver();
        if (this.MediaSessionCompat$QueueItem) {
            getFaceDetector getfacedetector = getFaceDetector.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getfacedetector.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (TextUtils.isEmpty(str)) {
            C4159cU cUVar = C4159cU.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                cUVar.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (!this.MediaSessionCompat$QueueItem) {
            C4161cX cXVar = C4161cX.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                cXVar.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        MarkerOptions markerOptions = this.write;
        if (!markerOptions.MediaBrowserCompat$MediaItem.isDisposed()) {
            markerOptions.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void write(C4162cY cYVar) {
        if (cYVar.RatingCompat != null) {
            cYVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4162cY cYVar) {
        if (cYVar.RatingCompat != null) {
            cYVar.RatingCompat.aj_();
        }
    }
}
