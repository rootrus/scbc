package p040o;

/* renamed from: o.setBaseAddress */
public final class setBaseAddress {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;
    public String write;

    public /* synthetic */ setBaseAddress(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private setBaseAddress(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer.write;
        this.write = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.IconCompatParcelizer;
        this.read = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.setBaseAddress$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String write;

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
