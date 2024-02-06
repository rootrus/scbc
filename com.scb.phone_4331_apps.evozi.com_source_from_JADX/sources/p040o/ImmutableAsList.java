package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ImmutableAsList */
public class ImmutableAsList {
    @SerializedName("depositList")
    public List<HashMultiset> MediaBrowserCompat$ItemReceiver;

    public static ImmutableAsList read() {
        return new ImmutableAsList();
    }

    /* renamed from: o.ImmutableAsList$SerializedForm */
    public class SerializedForm {
        @SerializedName("deviceId")
        public final String IconCompatParcelizer;
        @SerializedName("baseStaticURL")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("baseAssetsURL")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("environment")
        public final int MediaBrowserCompat$MediaItem;
        @SerializedName("phoneNumber")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("isWireMock")
        public final boolean MediaDescriptionCompat;
        @SerializedName("isRoot")
        public final boolean RatingCompat;
        @SerializedName("deviceModel")
        public final String read;
        @SerializedName("baseURL")
        public final String write;

        public SerializedForm(String str, String str2, String str3, int i, boolean z, String str4, String str5, String str6, boolean z2) {
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.MediaBrowserCompat$SearchResultReceiver = str3;
            this.MediaBrowserCompat$MediaItem = i;
            this.RatingCompat = z;
            this.write = str4;
            this.MediaBrowserCompat$ItemReceiver = str5;
            this.MediaBrowserCompat$CustomActionResultReceiver = str6;
            this.MediaDescriptionCompat = z2;
        }
    }
}
