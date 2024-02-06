package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.zzmd;

/* renamed from: o.LocationSettingsRequest */
public final class LocationSettingsRequest {
    public String IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String RatingCompat;
    public double read;
    public String write;

    /* renamed from: o.LocationSettingsRequest$Builder */
    public final class Builder {
        public OffsetDateTime IconCompatParcelizer;
        public double MediaBrowserCompat$CustomActionResultReceiver;
        public double MediaBrowserCompat$ItemReceiver;
        public double MediaBrowserCompat$MediaItem;
        public OffsetDateTime MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2752x50fd9e4a;
        public double MediaDescriptionCompat;
        public double MediaMetadataCompat;
        public double MediaSessionCompat$QueueItem;
        public double MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public int ParcelableVolumeInfo;
        public zzmd.zzk RatingCompat;
        public OffsetDateTime read;
        public double setHasDecor;
        public double write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver != locationSettingsRequest.MediaBrowserCompat$CustomActionResultReceiver || Double.compare(locationSettingsRequest.read, this.read) != 0) {
            return false;
        }
        String str = this.write;
        if (str == null ? locationSettingsRequest.write != null : !str.equals(locationSettingsRequest.write)) {
            return false;
        }
        String str2 = this.RatingCompat;
        if (str2 == null ? locationSettingsRequest.RatingCompat != null : !str2.equals(locationSettingsRequest.RatingCompat)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null ? locationSettingsRequest.MediaBrowserCompat$SearchResultReceiver != null : !str3.equals(locationSettingsRequest.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        String str5 = locationSettingsRequest.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        int i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i3) * 31) + i2;
    }
}
