package p040o;

import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.StreetViewPanorama */
public final class StreetViewPanorama {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String read;

    /* renamed from: o.StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener */
    public final class OnStreetViewPanoramaCameraChangeListener {
        public String AlertController$RecycleListView;
        public double IconCompatParcelizer;
        public OffsetDateTime Keep;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2788x50fd9e4a;
        public String MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public boolean MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public String PlaybackStateCompat;
        public String PlaybackStateCompat$CustomAction;
        public String RatingCompat;
        public String read;
        public String setHasDecor;
        public String write;
    }

    /* renamed from: o.StreetViewPanorama$OnStreetViewPanoramaChangeListener */
    public final class OnStreetViewPanoramaChangeListener {
        public List<OnStreetViewPanoramaCameraChangeListener> IconCompatParcelizer;
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* renamed from: o.StreetViewPanorama$OnStreetViewPanoramaClickListener */
    public final class OnStreetViewPanoramaClickListener {
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public List<onStreetViewPanoramaChange> write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanorama)) {
            return false;
        }
        StreetViewPanorama streetViewPanorama = (StreetViewPanorama) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) streetViewPanorama.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) streetViewPanorama.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) streetViewPanorama.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) streetViewPanorama.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CashOffshore(currency=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", amount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", exRate=");
        sb.append(this.read);
        sb.append(", amountTH=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public StreetViewPanorama(String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }

    /* renamed from: o.StreetViewPanorama$OnStreetViewPanoramaLongClickListener */
    public final class OnStreetViewPanoramaLongClickListener extends zzuk {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public Double MediaBrowserCompat$ItemReceiver;
        public zzsg MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public getShortName f2789x50fd9e4a;
        public String MediaDescriptionCompat;
        public List<String> MediaMetadataCompat;
        public List<zzvq> MediaSessionCompat$ResultReceiverWrapper;
        public String ParcelableVolumeInfo;
        public Double RatingCompat;
        public String read;
        public String write;

        public static OnStreetViewPanoramaLongClickListener write() {
            return new OnStreetViewPanoramaLongClickListener();
        }
    }
}
