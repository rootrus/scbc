package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.enqueueCleanup */
public class enqueueCleanup extends drainRecencyQueue {
    @SerializedName("annualInterestRate")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    private String read;

    /* synthetic */ enqueueCleanup(enqueueCleanup$MediaBrowserCompat$ItemReceiver enqueuecleanup_mediabrowsercompat_itemreceiver, byte b) {
        this(enqueuecleanup_mediabrowsercompat_itemreceiver);
    }

    private enqueueCleanup(enqueueCleanup$MediaBrowserCompat$ItemReceiver enqueuecleanup_mediabrowsercompat_itemreceiver) {
        super(enqueuecleanup_mediabrowsercompat_itemreceiver);
        this.read = enqueuecleanup_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = enqueuecleanup_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem;
    }
}
