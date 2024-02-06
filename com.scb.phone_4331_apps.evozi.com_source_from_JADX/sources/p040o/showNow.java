package p040o;

import java.io.Closeable;
import p040o.getChildFragmentManager;
import p040o.getHost;

/* renamed from: o.showNow */
public final class showNow implements Closeable {
    private static final showNow write = new showNow(new getHost.read() {
        public final int MediaBrowserCompat$ItemReceiver() {
            return 0;
        }

        public final boolean hasNext() {
            return false;
        }
    });
    public final getHost.read IconCompatParcelizer;
    public final AppCompatSeekBar read;

    private showNow(getHost.read read2) {
        this((AppCompatSeekBar) null, read2);
    }

    public showNow(AppCompatSeekBar appCompatSeekBar, getHost.read read2) {
        this.read = appCompatSeekBar;
        this.IconCompatParcelizer = read2;
    }

    public final int[] write() {
        getHost.read read2 = this.IconCompatParcelizer;
        getChildFragmentManager.write write2 = new getChildFragmentManager.write();
        while (read2.hasNext()) {
            int MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$ItemReceiver();
            write2.MediaBrowserCompat$CustomActionResultReceiver();
            int i = write2.write;
            write2.write = i + 1;
            ((int[]) write2.MediaBrowserCompat$ItemReceiver)[i] = MediaBrowserCompat$ItemReceiver;
        }
        return (int[]) write2.IconCompatParcelizer();
    }

    public final void close() {
        AppCompatSeekBar appCompatSeekBar = this.read;
        if (appCompatSeekBar != null && appCompatSeekBar.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver.run();
            this.read.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }

    public static showNow MediaBrowserCompat$ItemReceiver(int i, int i2) {
        if (i2 <= 0) {
            return write;
        }
        int i3 = i2 - 1;
        if (i3 < 0) {
            return write;
        }
        if (i3 != 0) {
            return new showNow(new getNextTransitionStyle(0, i3));
        }
        return new showNow(new getLayoutInflater(new int[]{0}));
    }
}
