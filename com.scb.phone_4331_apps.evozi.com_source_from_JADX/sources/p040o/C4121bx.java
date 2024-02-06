package p040o;

import p040o.Enums;
import p040o.RttiJsonBill_MembersInjector;

/* renamed from: o.bx */
public class C4121bx extends writeUInt64NoTag<getVariant> {
    /* access modifiers changed from: private */
    public final checkNotClosed IconCompatParcelizer;
    private final Enums.ValueOfFunction MediaBrowserCompat$ItemReceiver;
    private final Equivalence MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public zoomOut read;
    /* access modifiers changed from: private */
    public final readLine write;

    @HmlPinActivity
    public C4121bx(RegularImmutableBiMap regularImmutableBiMap, Equivalence equivalence, Enums.ValueOfFunction valueOfFunction, checkNotClosed checknotclosed, readLine readline) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$SearchResultReceiver = equivalence;
        this.MediaBrowserCompat$ItemReceiver = valueOfFunction;
        this.IconCompatParcelizer = checknotclosed;
        this.write = readline;
    }

    public final void write(String str) {
        drawVideoFrames drawvideoframes = drawVideoFrames.read;
        boolean z = true;
        if (this.RatingCompat != null) {
            drawvideoframes.IconCompatParcelizer(this.RatingCompat);
        }
        if (!(str == null || str.length() == 0)) {
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            this.MediaBrowserCompat$SearchResultReceiver.write(new ForwardingSetMultimap(str));
            this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zoomOut>() {
                public final /* synthetic */ void onNext(Object obj) {
                    zoomOut zoomout = (zoomOut) obj;
                    super.onNext(zoomout);
                    C4121bx bxVar = C4121bx.this;
                    Logging logging = new Logging(this, zoomout);
                    if (bxVar.RatingCompat != null) {
                        logging.IconCompatParcelizer(bxVar.RatingCompat);
                    }
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    C4121bx bxVar = C4121bx.this;
                    IllegalThreadStateException illegalThreadStateException = new IllegalThreadStateException(this, th);
                    if (bxVar.RatingCompat != null) {
                        illegalThreadStateException.IconCompatParcelizer(bxVar.RatingCompat);
                    }
                }
            });
        }
    }

    public void onDestroy() {
        Enums.ValueOfFunction valueOfFunction = this.MediaBrowserCompat$ItemReceiver;
        if (!valueOfFunction.MediaBrowserCompat$MediaItem.isDisposed()) {
            valueOfFunction.MediaBrowserCompat$MediaItem.dispose();
        }
        Equivalence equivalence = this.MediaBrowserCompat$SearchResultReceiver;
        if (!equivalence.MediaBrowserCompat$MediaItem.isDisposed()) {
            equivalence.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4121bx bxVar, getSdkVersion getsdkversion) {
        IImageToByteArray iImageToByteArray = new IImageToByteArray(bxVar, getsdkversion);
        if (bxVar.RatingCompat != null) {
            iImageToByteArray.IconCompatParcelizer(bxVar.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str, int i, final RttiJsonBill_MembersInjector.read.C10785read read2) {
        zoomOut zoomout;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            String str2 = null;
            if (!(i < 0 || (zoomout = this.read) == null || zoomout.IconCompatParcelizer == null || this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver == null || this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.size() <= i)) {
                str2 = this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.get(i);
            }
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new standardSubMap(str, read2.toString(), str2));
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zoomIn>() {
                public final /* synthetic */ void onNext(Object obj) {
                    zoomIn zoomin = (zoomIn) obj;
                    super.onNext(zoomin);
                    C4121bx bxVar = C4121bx.this;
                    IBus iBus = new IBus(this, zoomin, read2);
                    if (bxVar.RatingCompat != null) {
                        iBus.IconCompatParcelizer(bxVar.RatingCompat);
                    }
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    C4121bx bxVar = C4121bx.this;
                    KutVersion kutVersion = new KutVersion(this, th);
                    if (bxVar.RatingCompat != null) {
                        kutVersion.IconCompatParcelizer(bxVar.RatingCompat);
                    }
                }
            });
        }
    }
}
