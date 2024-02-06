package p040o;

import java.util.List;

/* renamed from: o.zzxj */
public final class zzxj {
    public List<zzxg> read;
    public String write;

    public /* synthetic */ zzxj(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private zzxj(IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.read = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* renamed from: o.zzxj$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public List<zzxg> MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
