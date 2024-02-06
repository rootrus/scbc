package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.zzbt;

/* renamed from: o.notifyKeyReclaimed */
public class notifyKeyReclaimed extends zzbt.zze.zza {
    @SerializedName("monthsOfBusinessExp")
    private String MediaBrowserCompat$MediaItem;
    @SerializedName("isConfirmStage")
    private String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("yearsOfBusinessExp")
    private String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("productType")
    private String MediaSessionCompat$Token;
    @SerializedName("tilesVersion")
    private String ParcelableVolumeInfo;
    @SerializedName("applicationId")
    private String RatingCompat;

    public notifyKeyReclaimed(IconCompatParcelizer iconCompatParcelizer) {
        super(iconCompatParcelizer);
        this.MediaSessionCompat$Token = iconCompatParcelizer.f2903x50fd9e4a;
        this.RatingCompat = iconCompatParcelizer.RatingCompat;
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        this.MediaSessionCompat$ResultReceiverWrapper = iconCompatParcelizer.MediaSessionCompat$QueueItem;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaMetadataCompat;
        this.ParcelableVolumeInfo = iconCompatParcelizer.MediaSessionCompat$Token;
    }

    public static notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver read() {
        return new notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.notifyKeyReclaimed$IconCompatParcelizer */
    public static abstract class IconCompatParcelizer<T extends zzbt.zze.zza, B extends IconCompatParcelizer<T, B>> extends zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver<T, B> {
        String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        String f2903x50fd9e4a;
        String MediaMetadataCompat;
        String MediaSessionCompat$QueueItem;
        String MediaSessionCompat$Token;
        String RatingCompat;

        public final B RatingCompat(String str) {
            this.f2903x50fd9e4a = str;
            return (IconCompatParcelizer) IconCompatParcelizer();
        }

        public final B IconCompatParcelizer(String str) {
            this.RatingCompat = str;
            return (IconCompatParcelizer) IconCompatParcelizer();
        }

        public final B MediaBrowserCompat$MediaItem(String str) {
            this.MediaBrowserCompat$SearchResultReceiver = str;
            return (IconCompatParcelizer) IconCompatParcelizer();
        }

        public final B MediaDescriptionCompat(String str) {
            this.MediaSessionCompat$QueueItem = str;
            return (IconCompatParcelizer) IconCompatParcelizer();
        }

        public final B MediaBrowserCompat$SearchResultReceiver(String str) {
            this.MediaMetadataCompat = str;
            return (IconCompatParcelizer) IconCompatParcelizer();
        }

        public final B MediaMetadataCompat(String str) {
            this.MediaSessionCompat$Token = str;
            return (IconCompatParcelizer) IconCompatParcelizer();
        }
    }
}
