package p040o;

import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.removeLocationUpdates */
public final class removeLocationUpdates extends zzuk {
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public OffsetDateTime MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final List<getPanoramaId> MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public double MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public final String RatingCompat;
    public String read;
    public setOnCameraMoveStartedListener write;

    public removeLocationUpdates(String str, OffsetDateTime offsetDateTime, double d, String str2, String str3, setOnCameraMoveStartedListener setoncameramovestartedlistener, List<getPanoramaId> list, String str4, String str5, String str6, boolean z) {
        onGetStartedClick.write((Object) str, "paymentId");
        onGetStartedClick.write((Object) str2, "transactionToken");
        onGetStartedClick.write((Object) str3, "qrCode");
        onGetStartedClick.write((Object) str4, "ref1");
        onGetStartedClick.write((Object) str5, "ref2");
        onGetStartedClick.write((Object) str6, "ref3");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
        this.MediaSessionCompat$QueueItem = d;
        this.MediaSessionCompat$ResultReceiverWrapper = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.write = setoncameramovestartedlistener;
        this.MediaDescriptionCompat = list;
        this.MediaMetadataCompat = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.RatingCompat = str6;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }
}
