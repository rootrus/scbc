package p040o;

import java.util.List;
import p040o.CustomConcurrentHashMap;
import p040o.Equivalences;
import p040o.access$2300;

/* renamed from: o.by */
public class C4124by extends writeUInt64NoTag<getExtractFaceImage> {
    public Boolean IconCompatParcelizer = Boolean.FALSE;
    private final pairwise MediaBrowserCompat$ItemReceiver;
    private final Equivalences.C33311 read;
    public C7040xee086eb3 write = C7040xee086eb3.SCANNING_ID_STATE;

    @HmlPinActivity
    public C4124by(pairwise pairwise, Equivalences.C33311 r2, newDataOutput newdataoutput) {
        super(newdataoutput);
        this.MediaBrowserCompat$ItemReceiver = pairwise;
        this.read = r2;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.StrongExpirableEvictableEntry strongExpirableEvictableEntry) {
        if (this.IconCompatParcelizer.booleanValue()) {
            this.IconCompatParcelizer = Boolean.FALSE;
            if (this.write != null) {
                int i = C41254.MediaBrowserCompat$CustomActionResultReceiver[this.write.ordinal()];
                boolean z = false;
                if (i == 1) {
                    C9871bs bsVar = C9871bs.write;
                    if (this.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        bsVar.IconCompatParcelizer(this.RatingCompat);
                    }
                } else if (i == 2 || i == 3) {
                    if (this.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        this.RatingCompat.AlertController$RecycleListView();
                    }
                    this.read.read();
                    this.read.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<newCameraPosition>>() {
                        public final /* synthetic */ void onNext(Object obj) {
                            super.onNext((List) obj);
                            Boolean unused = C4124by.this.IconCompatParcelizer = Boolean.TRUE;
                            C4124by.MediaBrowserCompat$CustomActionResultReceiver(C4124by.this);
                            C4124by byVar = C4124by.this;
                            doCleanUp docleanup = doCleanUp.IconCompatParcelizer;
                            if (byVar.RatingCompat != null) {
                                docleanup.IconCompatParcelizer(byVar.RatingCompat);
                            }
                        }

                        public final void onError(Throwable th) {
                            super.onError(th);
                            Boolean unused = C4124by.this.IconCompatParcelizer = Boolean.TRUE;
                            C4124by.read(C4124by.this);
                            C4124by byVar = C4124by.this;
                            byVar.MediaBrowserCompat$ItemReceiver(byVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                        }
                    });
                } else if (i == 4) {
                    getOuterOverlayFrameColor getouteroverlayframecolor = getOuterOverlayFrameColor.write;
                    if (this.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        getouteroverlayframecolor.IconCompatParcelizer(this.RatingCompat);
                    }
                } else if (i == 5) {
                    if (this.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        this.RatingCompat.AlertController$RecycleListView();
                    }
                    this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(strongExpirableEvictableEntry);
                    this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean>() {
                        public final /* synthetic */ void onNext(Object obj) {
                            Boolean bool = (Boolean) obj;
                            super.onNext(bool);
                            Boolean unused = C4124by.this.IconCompatParcelizer = Boolean.TRUE;
                            C4124by.write(C4124by.this);
                            C4124by byVar = C4124by.this;
                            onFocusAreasRequest onfocusareasrequest = new onFocusAreasRequest(this, bool);
                            if (byVar.RatingCompat != null) {
                                onfocusareasrequest.IconCompatParcelizer(byVar.RatingCompat);
                            }
                        }

                        public final void onError(Throwable th) {
                            super.onError(th);
                            Boolean unused = C4124by.this.IconCompatParcelizer = Boolean.TRUE;
                            C4124by.IconCompatParcelizer(C4124by.this);
                            C4124by byVar = C4124by.this;
                            ICameraDelegate iCameraDelegate = new ICameraDelegate(this, th);
                            if (byVar.RatingCompat != null) {
                                iCameraDelegate.IconCompatParcelizer(byVar.RatingCompat);
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: o.by$4 */
    static /* synthetic */ class C41254 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.RttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver[] r0 = p040o.C7040xee086eb3.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.RttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.C7040xee086eb3.SCANNING_ID_STATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.RttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.C7040xee086eb3.PENDING_VERIFYING_PARTNER_STATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.RttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.C7040xee086eb3.VERIFYING_PARTNER_STATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.RttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.C7040xee086eb3.LIVENESS_CHECK_STATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.RttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.C7040xee086eb3.FINISHED_FLOW_STATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4124by.C41254.<clinit>():void");
        }
    }

    public void onDestroy() {
        Equivalences.C33311 r0 = this.read;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
        pairwise pairwise = this.MediaBrowserCompat$ItemReceiver;
        if (!pairwise.MediaBrowserCompat$MediaItem.isDisposed()) {
            pairwise.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void read(C4124by byVar) {
        if (byVar.RatingCompat != null) {
            byVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4124by byVar) {
        if (byVar.RatingCompat != null) {
            byVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4124by byVar) {
        if (byVar.RatingCompat != null) {
            byVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C4124by byVar) {
        if (byVar.RatingCompat != null) {
            byVar.RatingCompat.aj_();
        }
    }
}
