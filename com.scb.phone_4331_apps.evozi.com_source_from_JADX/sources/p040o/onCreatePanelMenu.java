package p040o;

import android.os.Build;

/* renamed from: o.onCreatePanelMenu */
public abstract class onCreatePanelMenu {
    public static final onCreatePanelMenu IconCompatParcelizer = new read();
    public static final onCreatePanelMenu MediaBrowserCompat$CustomActionResultReceiver = new onCreatePanelMenu$MediaBrowserCompat$CustomActionResultReceiver();
    public static final onCreatePanelMenu MediaBrowserCompat$ItemReceiver;
    public static final noteStateNotSaved<onCreatePanelMenu> MediaBrowserCompat$SearchResultReceiver;
    public static final onCreatePanelMenu MediaDescriptionCompat = new onCreatePanelMenu$MediaBrowserCompat$ItemReceiver();
    static final boolean read = (Build.VERSION.SDK_INT >= 19);
    public static final onCreatePanelMenu write = new write();

    /* renamed from: o.onCreatePanelMenu$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        MEMORY,
        QUALITY
    }

    public abstract IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4);

    public abstract float MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, int i4);

    static {
        onCreatePanelMenu oncreatepanelmenu = write;
        MediaBrowserCompat$ItemReceiver = oncreatepanelmenu;
        MediaBrowserCompat$SearchResultReceiver = noteStateNotSaved.MediaBrowserCompat$CustomActionResultReceiver("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", oncreatepanelmenu);
    }

    /* renamed from: o.onCreatePanelMenu$read */
    static class read extends onCreatePanelMenu {
        read() {
        }

        public final float MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, int i4) {
            if (read) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max != 0) {
                return 1.0f / ((float) Integer.highestOneBit(max));
            }
            return 1.0f;
        }

        public final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
            if (read) {
                return IconCompatParcelizer.QUALITY;
            }
            return IconCompatParcelizer.MEMORY;
        }
    }

    /* renamed from: o.onCreatePanelMenu$write */
    static class write extends onCreatePanelMenu {
        write() {
        }

        public final float MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        public final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
            return IconCompatParcelizer.QUALITY;
        }
    }
}
