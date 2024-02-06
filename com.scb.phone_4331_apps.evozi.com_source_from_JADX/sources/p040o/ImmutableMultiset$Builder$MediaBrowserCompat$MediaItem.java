package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem */
public class ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem {
    @SerializedName("accountNo")
    String IconCompatParcelizer;
    @SerializedName("nickname")
    String write;

    public /* synthetic */ ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer.read;
        this.write = iconCompatParcelizer.write;
    }

    public static IconCompatParcelizer IconCompatParcelizer() {
        return new IconCompatParcelizer((byte) 0);
    }

    /* renamed from: o.ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String read;
        public String write;

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
