package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableSortedSet */
public final class ImmutableSortedSet {
    @SerializedName("mobileNumber")
    private final String read;
    @SerializedName("citizenId")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedSet)) {
            return false;
        }
        ImmutableSortedSet immutableSortedSet = (ImmutableSortedSet) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) immutableSortedSet.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) immutableSortedSet.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointFindUserRequest(citizenId=");
        sb.append(this.write);
        sb.append(", mobileNumber=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public ImmutableSortedSet(String str, String str2) {
        onGetStartedClick.write((Object) str, "citizenId");
        onGetStartedClick.write((Object) str2, "mobileNumber");
        this.write = str;
        this.read = str2;
    }

    /* renamed from: o.ImmutableSortedSet$SerializedForm */
    public class SerializedForm {
        @SerializedName("tilesVersion")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("transactionToken")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("accountNumber")
        public String write;

        public static SerializedForm write() {
            return new SerializedForm();
        }
    }

    /* renamed from: o.ImmutableSortedSet$Builder */
    public class Builder {
        @SerializedName("ebillSource")
        public String IconCompatParcelizer;
        @SerializedName("fee")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("amount")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("ref2")
        public String MediaBrowserCompat$MediaItem;
        @SerializedName("ref1")
        public String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("ref5")

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2726x50fd9e4a;
        @SerializedName("ref3")
        public String MediaDescriptionCompat;
        @SerializedName("payBy")
        public String MediaMetadataCompat;
        @SerializedName("transactionToken")
        public String MediaSessionCompat$QueueItem;
        @SerializedName("ref4")
        public String RatingCompat;
        @SerializedName("accountFrom")
        public String read;
        @SerializedName("accountTo")
        public String write;

        public static Builder MediaBrowserCompat$ItemReceiver() {
            return new Builder();
        }
    }
}
