package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.drainRecencyQueue */
public class drainRecencyQueue extends evictEntries {
    @SerializedName("productProgram")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productType")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("loanType")
    private String read;

    public drainRecencyQueue(drainRecencyQueue$MediaBrowserCompat$CustomActionResultReceiver drainrecencyqueue_mediabrowsercompat_customactionresultreceiver) {
        super(drainrecencyqueue_mediabrowsercompat_customactionresultreceiver);
        this.MediaBrowserCompat$ItemReceiver = drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
        this.MediaBrowserCompat$CustomActionResultReceiver = drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.RatingCompat;
        this.read = drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat;
    }
}
