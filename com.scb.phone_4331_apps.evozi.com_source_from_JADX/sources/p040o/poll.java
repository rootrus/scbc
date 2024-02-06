package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.poll */
public class poll {
    @SerializedName("accountNo")
    private String IconCompatParcelizer;
    @SerializedName("accountType")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("annotation")
    private paddedPartition<String> MediaBrowserCompat$ItemReceiver;
    @SerializedName("txnChannel")
    private String MediaBrowserCompat$MediaItem;
    @SerializedName("txnCode")
    private String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("txnDebitCreditFlag")
    private String MediaDescriptionCompat;
    @SerializedName("txnDateTime")
    private String MediaMetadataCompat;
    @SerializedName("txnSequence")
    private int RatingCompat;
    @SerializedName("txnBatchRunDate")
    private String read;
    @SerializedName("txnAmount")
    private double write;

    public /* synthetic */ poll(poll$MediaBrowserCompat$CustomActionResultReceiver poll_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(poll_mediabrowsercompat_customactionresultreceiver);
    }

    private poll(poll$MediaBrowserCompat$CustomActionResultReceiver poll_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = new paddedPartition<>();
        this.MediaBrowserCompat$CustomActionResultReceiver = poll_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = poll_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.RatingCompat = poll_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
        this.read = poll_mediabrowsercompat_customactionresultreceiver.write;
        this.MediaMetadataCompat = poll_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$SearchResultReceiver = poll_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat;
        this.MediaBrowserCompat$MediaItem = poll_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        this.MediaDescriptionCompat = poll_mediabrowsercompat_customactionresultreceiver.RatingCompat;
        this.write = poll_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = poll_mediabrowsercompat_customactionresultreceiver.read;
    }
}
