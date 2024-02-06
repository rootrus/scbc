package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setPreviousEvictable */
public class setPreviousEvictable {
    @SerializedName("firstName")
    private String IconCompatParcelizer;
    @SerializedName("lastName")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("deviceId")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productType")
    private String MediaBrowserCompat$MediaItem;
    @SerializedName("officeAddress")
    private String MediaMetadataCompat;
    @SerializedName("tilesVersion")
    public String read;
    @SerializedName("homeAddress")
    private String write;

    /* renamed from: o.setPreviousEvictable$read */
    public static final class read {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String read;
        public String write;
    }

    public /* synthetic */ setPreviousEvictable(read read2, byte b) {
        this(read2);
    }

    private setPreviousEvictable(read read2) {
        this.MediaBrowserCompat$MediaItem = read2.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$ItemReceiver = read2.read;
        this.IconCompatParcelizer = read2.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.write;
        this.write = read2.MediaBrowserCompat$ItemReceiver;
        this.MediaMetadataCompat = read2.IconCompatParcelizer;
    }
}
