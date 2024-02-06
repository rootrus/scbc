package p040o;

import java.util.List;

/* renamed from: o.hasLocationAvailability */
public final class hasLocationAvailability {
    public List<String> IconCompatParcelizer;
    public List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public List<String> MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ hasLocationAvailability(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private hasLocationAvailability(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.write;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer;
    }

    /* renamed from: o.hasLocationAvailability$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public List<String> IconCompatParcelizer;
        public List<String> MediaBrowserCompat$ItemReceiver;
        public List<String> write;

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
