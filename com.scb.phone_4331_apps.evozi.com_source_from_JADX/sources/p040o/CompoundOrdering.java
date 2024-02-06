package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.CompoundOrdering */
public class CompoundOrdering {
    @SerializedName("bondAccountNo")
    private String write;

    public /* synthetic */ CompoundOrdering(CompoundOrdering$MediaBrowserCompat$ItemReceiver compoundOrdering$MediaBrowserCompat$ItemReceiver, byte b) {
        this(compoundOrdering$MediaBrowserCompat$ItemReceiver);
    }

    private CompoundOrdering(CompoundOrdering$MediaBrowserCompat$ItemReceiver compoundOrdering$MediaBrowserCompat$ItemReceiver) {
        this.write = compoundOrdering$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
    }

    public static CompoundOrdering$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver() {
        return new CompoundOrdering$MediaBrowserCompat$ItemReceiver((byte) 0);
    }
}
