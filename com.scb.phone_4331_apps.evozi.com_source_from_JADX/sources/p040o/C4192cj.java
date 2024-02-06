package p040o;

import java.util.List;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.ByteStreams;
import p040o.Iterables;
import p040o.KtaJsonCheck;

/* renamed from: o.cj */
public class C4192cj extends writeUInt64NoTag<KtaJsonCheck.IconCompatParcelizer> {
    public final Iterables.C352212 IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public List<MoreExecutors> f2807x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public int MediaSessionCompat$QueueItem = -1;
    /* access modifiers changed from: private */
    public final MapMaker MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token = "0";
    public getOrgId ParcelableVolumeInfo;
    public final C10869tileProvider read;
    public final getInput write;

    @HmlPinActivity
    public C4192cj(RegularImmutableBiMap regularImmutableBiMap, C10869tileProvider tileprovider, getInput getinput, skipFully skipfully, getDigest getdigest, ByteStreams.C31353 r6, MapMaker mapMaker, Iterables.C352212 r8) {
        super(regularImmutableBiMap);
        this.read = tileprovider;
        this.write = getinput;
        getinput.RatingCompat = skipfully;
        this.write.IconCompatParcelizer = getdigest;
        this.write.MediaBrowserCompat$MediaItem = r6;
        this.MediaSessionCompat$ResultReceiverWrapper = mapMaker;
        this.IconCompatParcelizer = r8;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read.read.write(), this.read.MediaBrowserCompat$CustomActionResultReceiver.setCheckable());
        this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.MediaDescriptionCompat;
        String str2 = "";
        boolean z = true;
        if (str == null) {
            if (MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver != null) {
                str = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
                String str3 = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
                String str4 = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$SearchResultReceiver = str3;
                this.MediaDescriptionCompat = str4;
                this.MediaMetadataCompat = null;
                C4143cB cBVar = new C4143cB(this);
                if (this.RatingCompat != null) {
                    cBVar.IconCompatParcelizer(this.RatingCompat);
                }
                MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                str = str2;
            }
        }
        if (this.MediaBrowserCompat$MediaItem.Keep != null && "0".equals(this.MediaSessionCompat$Token)) {
            str2 = this.MediaBrowserCompat$MediaItem.Keep.MediaBrowserCompat$SearchResultReceiver;
        }
        this.ParcelableVolumeInfo = this.MediaBrowserCompat$MediaItem.f2672x50fd9e4a;
        this.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver;
        C4076bQ bQVar = new C4076bQ(this, str, str2);
        if (this.RatingCompat != null) {
            bQVar.IconCompatParcelizer(this.RatingCompat);
        }
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.read.write();
        this.read.IconCompatParcelizer(new cj$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if ((r6.MediaBrowserCompat$ItemReceiver.length() < 2 || r6.MediaBrowserCompat$ItemReceiver.length() > 29) != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        if (r6.MediaSessionCompat$QueueItem == -1) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r6 = this;
            o.AutoValue_CrashlyticsReport_CustomAttribute$Builder r0 = r6.MediaBrowserCompat$MediaItem
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = r6.MediaSessionCompat$Token
            java.lang.String r3 = "0"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0018
            o.AutoValue_CrashlyticsReport_CustomAttribute$Builder r0 = r6.MediaBrowserCompat$MediaItem
            o.AutoValue_CrashlyticsReport_CustomAttribute r0 = r0.Keep
            if (r0 != 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            o.AutoValue_CrashlyticsReport_CustomAttribute$Builder r3 = r6.MediaBrowserCompat$MediaItem
            o.getOrgId r3 = r3.f2672x50fd9e4a
            r4 = -1
            if (r3 != 0) goto L_0x0025
            int r3 = r6.MediaSessionCompat$QueueItem
            if (r3 != r4) goto L_0x0025
            r0 = r2
        L_0x0025:
            o.AutoValue_CrashlyticsReport_CustomAttribute$Builder r3 = r6.MediaBrowserCompat$MediaItem
            o.AutoValue_CrashlyticsReport_CustomAttribute$1 r3 = r3.MediaBrowserCompat$SearchResultReceiver
            if (r3 != 0) goto L_0x0044
            java.lang.String r3 = r6.MediaBrowserCompat$SearchResultReceiver
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0044
            java.lang.String r3 = r6.MediaDescriptionCompat
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0044
            java.lang.String r3 = r6.MediaMetadataCompat
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0044
            r0 = r2
        L_0x0044:
            java.lang.String r3 = r6.MediaBrowserCompat$ItemReceiver
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0064
            java.lang.String r3 = r6.MediaBrowserCompat$ItemReceiver
            int r3 = r3.length()
            r5 = 2
            if (r3 < r5) goto L_0x0061
            java.lang.String r3 = r6.MediaBrowserCompat$ItemReceiver
            int r3 = r3.length()
            r5 = 29
            if (r3 > r5) goto L_0x0061
            r3 = r2
            goto L_0x0062
        L_0x0061:
            r3 = r1
        L_0x0062:
            if (r3 == 0) goto L_0x0065
        L_0x0064:
            r0 = r2
        L_0x0065:
            int r3 = r6.MediaSessionCompat$QueueItem
            if (r3 != r4) goto L_0x006a
        L_0x0069:
            r0 = r2
        L_0x006a:
            o.bW r3 = new o.bW
            r3.<init>(r0)
            T r0 = r6.RatingCompat
            if (r0 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = r2
        L_0x0075:
            if (r1 == 0) goto L_0x007c
            T r0 = r6.RatingCompat
            r3.IconCompatParcelizer(r0)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4192cj.MediaBrowserCompat$CustomActionResultReceiver():void");
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.MediaSessionCompat$QueueItem = i;
        boolean z = true;
        if ("TH".equals(this.f2807x50fd9e4a.get(i).MediaBrowserCompat$ItemReceiver)) {
            C4080bU bUVar = C4080bU.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                bUVar.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            C4144cC cCVar = C4144cC.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                cCVar.IconCompatParcelizer(this.RatingCompat);
            }
            IconCompatParcelizer();
        }
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void onDestroy() {
        C10869tileProvider tileprovider = this.read;
        if (!tileprovider.MediaBrowserCompat$MediaItem.isDisposed()) {
            tileprovider.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public final void IconCompatParcelizer() {
        String str;
        if (this.MediaBrowserCompat$MediaItem.Keep != null) {
            str = this.MediaBrowserCompat$MediaItem.Keep.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = "";
        }
        this.MediaSessionCompat$Token = "0";
        C4083bX bXVar = new C4083bX(str);
        if (this.RatingCompat != null) {
            bXVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4192cj cjVar) {
        if (cjVar.RatingCompat != null) {
            cjVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4192cj cjVar) {
        if (cjVar.RatingCompat != null) {
            cjVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4192cj cjVar) {
        if (cjVar.RatingCompat != null) {
            cjVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(C4192cj cjVar) {
        if (cjVar.RatingCompat != null) {
            cjVar.RatingCompat.aj_();
        }
    }
}
