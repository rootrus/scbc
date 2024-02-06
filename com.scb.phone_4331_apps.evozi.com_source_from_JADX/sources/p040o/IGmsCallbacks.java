package p040o;

/* renamed from: o.IGmsCallbacks */
public final /* synthetic */ class IGmsCallbacks implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getPendingIntent MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ IGmsCallbacks(getPendingIntent getpendingintent) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getpendingintent;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) obj);
    }

    /* renamed from: o.IGmsCallbacks$zza */
    public final /* synthetic */ class zza implements findFragmentByWho {
        public static final /* synthetic */ zza read = new zza();

        private /* synthetic */ zza() {
        }

        public final Object IconCompatParcelizer(Object obj) {
            isScaleIdentity isscaleidentity = (isScaleIdentity) obj;
            int i = isscaleidentity.MediaMetadataCompat;
            String str = isscaleidentity.read;
            String str2 = isscaleidentity.RatingCompat;
            String str3 = isscaleidentity.MediaBrowserCompat$SearchResultReceiver;
            String str4 = isscaleidentity.MediaBrowserCompat$ItemReceiver;
            boolean z = true;
            if (1 != isscaleidentity.MediaBrowserCompat$CustomActionResultReceiver) {
                z = false;
            }
            return new zzxf(i, str, str2, str3, str4, Boolean.valueOf(z), isscaleidentity.IconCompatParcelizer, isscaleidentity.write);
        }
    }
}
