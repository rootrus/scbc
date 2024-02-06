package p040o;

/* renamed from: o.zzxk */
public final class zzxk {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    /* renamed from: o.zzxk$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$ItemReceiver;
        public String write;
    }

    public /* synthetic */ zzxk(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private zzxk(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer.write;
        this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.IconCompatParcelizer;
    }
}
