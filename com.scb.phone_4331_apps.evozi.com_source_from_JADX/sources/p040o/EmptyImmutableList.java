package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.EmptyImmutableList */
public class EmptyImmutableList {
    @SerializedName("cardRefFrom")
    public String IconCompatParcelizer;
    @SerializedName("clientNo")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("fundClass")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tilesVersion")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("payType")
    public String MediaDescriptionCompat;
    @SerializedName("fundCode")
    public String MediaMetadataCompat;
    @SerializedName("schedule")
    public LocationAvailability RatingCompat;
    @SerializedName("amount")
    public String read;
    @SerializedName("accountFrom")
    public String write;

    /* renamed from: o.EmptyImmutableList$1 */
    public class C97281 {
        @SerializedName("clientNo")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("schedule")
        private LocationAvailability MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ C97281(EmptyImmutableList$1$MediaBrowserCompat$ItemReceiver emptyImmutableList$1$MediaBrowserCompat$ItemReceiver, byte b) {
            this(emptyImmutableList$1$MediaBrowserCompat$ItemReceiver);
        }

        private C97281(EmptyImmutableList$1$MediaBrowserCompat$ItemReceiver emptyImmutableList$1$MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = emptyImmutableList$1$MediaBrowserCompat$ItemReceiver.read;
            this.MediaBrowserCompat$ItemReceiver = emptyImmutableList$1$MediaBrowserCompat$ItemReceiver.write;
        }

        public static EmptyImmutableList$1$MediaBrowserCompat$ItemReceiver read() {
            return new EmptyImmutableList$1$MediaBrowserCompat$ItemReceiver((byte) 0);
        }
    }
}
