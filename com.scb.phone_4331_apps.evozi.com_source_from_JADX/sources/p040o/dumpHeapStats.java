package p040o;

import p040o.setContentDescription;

/* renamed from: o.dumpHeapStats */
public final /* synthetic */ class dumpHeapStats implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomAdvertisingIdClient IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String MediaBrowserCompat$MediaItem;
    private final /* synthetic */ String MediaBrowserCompat$SearchResultReceiver;
    private final /* synthetic */ String MediaDescriptionCompat;
    private final /* synthetic */ String MediaMetadataCompat;
    private final /* synthetic */ String MediaSessionCompat$Token;
    private final /* synthetic */ String RatingCompat;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ dumpHeapStats(CustomAdvertisingIdClient customAdvertisingIdClient, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.IconCompatParcelizer = customAdvertisingIdClient;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaDescriptionCompat = str4;
        this.MediaBrowserCompat$MediaItem = str5;
        this.RatingCompat = str6;
        this.MediaBrowserCompat$SearchResultReceiver = str7;
        this.MediaMetadataCompat = str8;
        this.MediaSessionCompat$Token = str9;
        this.write = str10;
    }

    public final Object write(Object obj) {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$ItemReceiver;
        String str2 = this.read;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str4 = this.MediaDescriptionCompat;
        String str5 = this.MediaBrowserCompat$MediaItem;
        String str6 = this.RatingCompat;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        String str8 = this.MediaMetadataCompat;
        String str9 = this.MediaSessionCompat$Token;
        String str10 = this.write;
        setContentDescription.write write2 = setContentDescription.write.MAILING;
        return customAdvertisingIdClient.IconCompatParcelizer.IconCompatParcelizer(write2).flatMap(new UTCStringFromDate(write2)).flatMap(new getCornersJsonFromMetaData(customAdvertisingIdClient, (String) obj, str, str2, str3, str4, str5, str6, str7, str8, str9, str10));
    }
}
