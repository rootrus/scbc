package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver */
public class ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver {
    @SerializedName("nickname")
    String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("clientNo")
    String write;

    public /* synthetic */ ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
    }

    public static IconCompatParcelizer IconCompatParcelizer() {
        return new IconCompatParcelizer((byte) 0);
    }

    /* renamed from: o.ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String MediaBrowserCompat$ItemReceiver;
        public String read;

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
