package p040o;

import android.graphics.Bitmap;

/* renamed from: o.performPrepareOptionsMenu */
final class performPrepareOptionsMenu implements getCheckUsabilityData {
    private final performStart<read, Bitmap> read = new performStart<>();
    private final performPrepareOptionsMenu$MediaBrowserCompat$ItemReceiver write = new performPrepareOptionsMenu$MediaBrowserCompat$ItemReceiver();

    performPrepareOptionsMenu() {
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Bitmap bitmap) {
        performPrepareOptionsMenu$MediaBrowserCompat$ItemReceiver performprepareoptionsmenu_mediabrowsercompat_itemreceiver = this.write;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        getMicrAmount getmicramount = (getMicrAmount) performprepareoptionsmenu_mediabrowsercompat_itemreceiver.read.poll();
        if (getmicramount == null) {
            getmicramount = performprepareoptionsmenu_mediabrowsercompat_itemreceiver.write();
        }
        read read2 = (read) getmicramount;
        read2.write = width;
        read2.read = height;
        read2.MediaBrowserCompat$CustomActionResultReceiver = config;
        this.read.MediaBrowserCompat$ItemReceiver(read2, bitmap);
    }

    public final Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config) {
        performPrepareOptionsMenu$MediaBrowserCompat$ItemReceiver performprepareoptionsmenu_mediabrowsercompat_itemreceiver = this.write;
        getMicrAmount getmicramount = (getMicrAmount) performprepareoptionsmenu_mediabrowsercompat_itemreceiver.read.poll();
        if (getmicramount == null) {
            getmicramount = performprepareoptionsmenu_mediabrowsercompat_itemreceiver.write();
        }
        read read2 = (read) getmicramount;
        read2.write = i;
        read2.read = i2;
        read2.MediaBrowserCompat$CustomActionResultReceiver = config;
        return this.read.read(read2);
    }

    public final Bitmap MediaBrowserCompat$ItemReceiver() {
        return this.read.MediaBrowserCompat$ItemReceiver();
    }

    public final String read(int i, int i2, Bitmap.Config config) {
        return write(i, i2, config);
    }

    public final int IconCompatParcelizer(Bitmap bitmap) {
        return LinearLayoutManager.IconCompatParcelizer(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeStrategy:\n  ");
        sb.append(this.read);
        return sb.toString();
    }

    static String write(int i, int i2, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("], ");
        sb.append(config);
        return sb.toString();
    }

    /* renamed from: o.performPrepareOptionsMenu$read */
    static class read implements getMicrAmount {
        private final performPrepareOptionsMenu$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        Bitmap.Config MediaBrowserCompat$CustomActionResultReceiver;
        int read;
        int write;

        public read(performPrepareOptionsMenu$MediaBrowserCompat$ItemReceiver performprepareoptionsmenu_mediabrowsercompat_itemreceiver) {
            this.IconCompatParcelizer = performprepareoptionsmenu_mediabrowsercompat_itemreceiver;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            if (this.write == read2.write && this.read == read2.read && this.MediaBrowserCompat$CustomActionResultReceiver == read2.MediaBrowserCompat$CustomActionResultReceiver) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i = this.write;
            int i2 = this.read;
            Bitmap.Config config = this.MediaBrowserCompat$CustomActionResultReceiver;
            return (((i * 31) + i2) * 31) + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return performPrepareOptionsMenu.write(this.write, this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            performPrepareOptionsMenu$MediaBrowserCompat$ItemReceiver performprepareoptionsmenu_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
            if (performprepareoptionsmenu_mediabrowsercompat_itemreceiver.read.size() < 20) {
                performprepareoptionsmenu_mediabrowsercompat_itemreceiver.read.offer(this);
            }
        }
    }

    public final String write(Bitmap bitmap) {
        return write(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }
}
