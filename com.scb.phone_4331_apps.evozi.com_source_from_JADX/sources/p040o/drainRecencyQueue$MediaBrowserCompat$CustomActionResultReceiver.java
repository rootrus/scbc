package p040o;

/* renamed from: o.drainRecencyQueue$MediaBrowserCompat$CustomActionResultReceiver */
public class drainRecencyQueue$MediaBrowserCompat$CustomActionResultReceiver extends evictEntries$MediaBrowserCompat$CustomActionResultReceiver {
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;

    /* renamed from: read */
    public drainRecencyQueue MediaBrowserCompat$ItemReceiver() {
        return new drainRecencyQueue(this);
    }
}
