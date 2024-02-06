package p040o;

import p040o.access$2300;

/* renamed from: o.dN */
public class C4261dN extends writeUInt64NoTag<getAdditionalLeftScanLinesWidth> {
    private final getUserPropertiesAs MediaBrowserCompat$ItemReceiver;
    public read read;
    public long write;

    /* renamed from: o.dN$read */
    public enum read {
        DEFAULT,
        EKYC,
        LOANORIGINATION
    }

    @HmlPinActivity
    public C4261dN(getUserPropertiesAs getuserpropertiesas, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = getuserpropertiesas;
    }

    public void onDestroy() {
        getUserPropertiesAs getuserpropertiesas = this.MediaBrowserCompat$ItemReceiver;
        if (!getuserpropertiesas.MediaBrowserCompat$MediaItem.isDisposed()) {
            getuserpropertiesas.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.dN$4 */
    static /* synthetic */ class C42624 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.dN$read[] r0 = p040o.C4261dN.read.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                o.dN$read r1 = p040o.C4261dN.read.EKYC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.dN$read r1 = p040o.C4261dN.read.LOANORIGINATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.dN$read r1 = p040o.C4261dN.read.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4261dN.C42624.<clinit>():void");
        }
    }

    /* renamed from: o.dN$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setOnCameraIdleListener> {
        private write() {
        }

        /* synthetic */ write(C4261dN dNVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            setOnCameraIdleListener setoncameraidlelistener = (setOnCameraIdleListener) obj;
            boolean z = true;
            if (C4261dN.this.RatingCompat != null) {
                C4261dN.read(C4261dN.this);
                C4261dN dNVar = C4261dN.this;
                C4250dH dHVar = new C4250dH(setoncameraidlelistener);
                if (dNVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    dHVar.IconCompatParcelizer(dNVar.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            C4261dN.MediaBrowserCompat$ItemReceiver(C4261dN.this);
            if (!C4261dN.this.MediaBrowserCompat$CustomActionResultReceiver(th, false)) {
                C4261dN dNVar = C4261dN.this;
                C4263dO dOVar = new C4263dO(this, th);
                if (dNVar.RatingCompat != null) {
                    dOVar.IconCompatParcelizer(dNVar.RatingCompat);
                    return;
                }
                return;
            }
            C4261dN.this.MediaBrowserCompat$ItemReceiver(C4261dN.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4261dN dNVar) {
        if (dNVar.RatingCompat != null) {
            dNVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4261dN dNVar) {
        if (dNVar.RatingCompat != null) {
            dNVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(C4261dN dNVar) {
        if (dNVar.RatingCompat != null) {
            dNVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(C4261dN dNVar) {
        if (dNVar.RatingCompat != null) {
            dNVar.RatingCompat.aj_();
        }
    }

    public void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        IndoorBuilding$MediaBrowserCompat$ItemReceiver indoorBuilding$MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        softKeys softkeys = new softKeys();
        softkeys.MediaBrowserCompat$SearchResultReceiver = "SCB_FastEasy_OTPPolicy";
        softkeys.MediaBrowserCompat$MediaItem = str2;
        softkeys.MediaBrowserCompat$ItemReceiver = str;
        softkeys.IconCompatParcelizer = "";
        softkeys.MediaBrowserCompat$CustomActionResultReceiver = "";
        softkeys.write = "";
        softkeys.read = "";
        softkeys.MediaDescriptionCompat = "SystemTokenStore";
        softkeys.MediaMetadataCompat = "FastEasyApp";
        int i = C42624.IconCompatParcelizer[this.read.ordinal()];
        if (i == 1) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(softkeys);
            indoorBuilding$MediaBrowserCompat$ItemReceiver = new write(this, (byte) 0);
        } else if (i != 2) {
            this.MediaBrowserCompat$ItemReceiver.write(softkeys);
            indoorBuilding$MediaBrowserCompat$ItemReceiver = new write(this, (byte) 0);
        } else {
            this.MediaBrowserCompat$ItemReceiver.write(str2);
            indoorBuilding$MediaBrowserCompat$ItemReceiver = new dN$MediaBrowserCompat$ItemReceiver(this, (byte) 0);
        }
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(indoorBuilding$MediaBrowserCompat$ItemReceiver);
    }
}
