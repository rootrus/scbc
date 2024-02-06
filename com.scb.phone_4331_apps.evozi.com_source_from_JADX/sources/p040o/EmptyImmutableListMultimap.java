package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.EmptyImmutableListMultimap */
public class EmptyImmutableListMultimap {
    @SerializedName("mobileNumber")
    private String IconCompatParcelizer;

    public /* synthetic */ EmptyImmutableListMultimap(EmptyImmutableListMultimap$MediaBrowserCompat$ItemReceiver emptyImmutableListMultimap$MediaBrowserCompat$ItemReceiver, byte b) {
        this(emptyImmutableListMultimap$MediaBrowserCompat$ItemReceiver);
    }

    private EmptyImmutableListMultimap(EmptyImmutableListMultimap$MediaBrowserCompat$ItemReceiver emptyImmutableListMultimap$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = emptyImmutableListMultimap$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        String str2 = ((EmptyImmutableListMultimap) obj).IconCompatParcelizer;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
