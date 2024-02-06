package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.MapFragment */
public enum MapFragment {
    NO_PROMPTPAY(1),
    NO_RTP(2),
    HAVE_PROMPTPAY_WITH_RTP(3);
    
    public int type;

    /* renamed from: o.MapFragment$zzb */
    public final class zzb extends zzuk {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public String MediaDescriptionCompat;
        public double read;
        public String write;
    }

    private MapFragment(int i) {
        this.type = i;
    }

    public static MapFragment IconCompatParcelizer(int i) {
        MapFragment mapFragment = NO_PROMPTPAY;
        if (mapFragment.type == i) {
            return mapFragment;
        }
        MapFragment mapFragment2 = NO_RTP;
        if (mapFragment2.type == i) {
            return mapFragment2;
        }
        MapFragment mapFragment3 = HAVE_PROMPTPAY_WITH_RTP;
        return mapFragment3.type == i ? mapFragment3 : mapFragment;
    }

    /* renamed from: o.MapFragment$zza */
    public final class zza extends zzuk {
        public double MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2758x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public OffsetDateTime MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public String RatingCompat;
        public String read;
        public OffsetDateTime write;

        public static zza MediaBrowserCompat$ItemReceiver() {
            return new zza();
        }
    }
}
