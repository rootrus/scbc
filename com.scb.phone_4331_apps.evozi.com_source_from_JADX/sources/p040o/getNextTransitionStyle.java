package p040o;

import p040o.getHost;

/* renamed from: o.getNextTransitionStyle */
public final class getNextTransitionStyle extends getHost.read {
    private int IconCompatParcelizer;
    private final int read;
    private boolean write;

    public getNextTransitionStyle(int i, int i2) {
        this.read = i2;
        this.IconCompatParcelizer = i;
        this.write = i <= i2;
    }

    public final boolean hasNext() {
        return this.write;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        int i = this.IconCompatParcelizer;
        int i2 = this.read;
        if (i >= i2) {
            this.write = false;
            return i2;
        }
        this.IconCompatParcelizer = i + 1;
        return i;
    }
}
