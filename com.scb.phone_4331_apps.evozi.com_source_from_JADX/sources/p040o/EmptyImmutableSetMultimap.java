package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.EmptyImmutableSetMultimap */
public class EmptyImmutableSetMultimap {
    @SerializedName("schedule")
    private LocationAvailability read;
    @SerializedName("clientNo")
    private String write;

    public /* synthetic */ EmptyImmutableSetMultimap(EmptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver, byte b) {
        this(emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver);
    }

    private EmptyImmutableSetMultimap(EmptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver) {
        this.write = emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver.read;
        this.read = emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
