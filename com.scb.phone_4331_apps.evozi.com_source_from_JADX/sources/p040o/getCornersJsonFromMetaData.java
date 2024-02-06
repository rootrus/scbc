package p040o;

/* renamed from: o.getCornersJsonFromMetaData */
public final /* synthetic */ class getCornersJsonFromMetaData implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ CustomAdvertisingIdClient MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String MediaBrowserCompat$MediaItem;
    private final /* synthetic */ String MediaBrowserCompat$SearchResultReceiver;
    private final /* synthetic */ String MediaDescriptionCompat;
    private final /* synthetic */ String MediaMetadataCompat;
    private final /* synthetic */ String MediaSessionCompat$QueueItem;
    private final /* synthetic */ String ParcelableVolumeInfo;
    private final /* synthetic */ String RatingCompat;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ getCornersJsonFromMetaData(CustomAdvertisingIdClient customAdvertisingIdClient, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customAdvertisingIdClient;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.RatingCompat = str5;
        this.MediaDescriptionCompat = str6;
        this.MediaMetadataCompat = str7;
        this.MediaSessionCompat$QueueItem = str8;
        this.ParcelableVolumeInfo = str9;
        this.write = str10;
        this.MediaBrowserCompat$ItemReceiver = str11;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.write(this.IconCompatParcelizer, this.read, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, this.RatingCompat, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.MediaSessionCompat$QueueItem, this.ParcelableVolumeInfo, this.write, this.MediaBrowserCompat$ItemReceiver, (setContentDescription) obj);
    }
}
