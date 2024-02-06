package p040o;

import p040o.AppStatsState;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppstatsThresholdReachedListener */
public class AppstatsThresholdReachedListener extends writeUInt64NoTag<ICheckDeserializer$MediaBrowserCompat$CustomActionResultReceiver> {
    public final StreetViewPanoramaOrientation MediaBrowserCompat$ItemReceiver;
    public final notNull read;

    @HmlPinActivity
    public AppstatsThresholdReachedListener(RegularImmutableBiMap regularImmutableBiMap, StreetViewPanoramaOrientation streetViewPanoramaOrientation, notNull notnull) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaOrientation;
        this.read = notnull;
    }

    /* renamed from: o.AppstatsThresholdReachedListener$3 */
    public static /* synthetic */ class C30453 {
        public static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o.zzmd$zzm$zzb$zza[] r0 = p040o.zzmd.zzm.zzb.zza.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.zzmd$zzm$zzb$zza r1 = p040o.zzmd.zzm.zzb.zza.JURISTIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.zzmd$zzm$zzb$zza r1 = p040o.zzmd.zzm.zzb.zza.INDIVIDUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AppstatsThresholdReachedListener.C30453.<clinit>():void");
        }
    }

    public void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.IconCompatParcelizer();
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = this.MediaBrowserCompat$ItemReceiver;
        if (!streetViewPanoramaOrientation.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaOrientation.MediaBrowserCompat$MediaItem.dispose();
        }
        streetViewPanoramaOrientation.IconCompatParcelizer.read();
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(AppstatsThresholdReachedListener appstatsThresholdReachedListener) {
        if (appstatsThresholdReachedListener.RatingCompat != null) {
            appstatsThresholdReachedListener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(AppstatsThresholdReachedListener appstatsThresholdReachedListener, MapFragment mapFragment) {
        boolean z = true;
        if (appstatsThresholdReachedListener.RatingCompat != null) {
            boolean MediaSessionCompat$Token = appstatsThresholdReachedListener.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token();
            if (!MediaSessionCompat$Token) {
                appstatsThresholdReachedListener.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setShortcut();
            }
            AppStatsState.C30441 r3 = new writeUInt64NoTag.IconCompatParcelizer(MediaSessionCompat$Token) {
                private final /* synthetic */ boolean IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r2;
                }

                public final void IconCompatParcelizer(Object obj) {
                    ((ICheckDeserializer$MediaBrowserCompat$CustomActionResultReceiver) obj).MediaBrowserCompat$ItemReceiver(MapFragment.this, !this.IconCompatParcelizer);
                }
            };
            if (appstatsThresholdReachedListener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r3.IconCompatParcelizer(appstatsThresholdReachedListener.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(AppstatsThresholdReachedListener appstatsThresholdReachedListener) {
        if (appstatsThresholdReachedListener.RatingCompat != null) {
            appstatsThresholdReachedListener.RatingCompat.aj_();
        }
    }

    public final void read() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.IconCompatParcelizer();
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C3046x22918e66(this, (byte) 0));
    }
}
