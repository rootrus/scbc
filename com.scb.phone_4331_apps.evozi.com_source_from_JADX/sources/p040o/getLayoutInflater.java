package p040o;

import p040o.getHost;

/* renamed from: o.getLayoutInflater */
public final class getLayoutInflater extends getHost.read {
    private int IconCompatParcelizer = 0;
    private final int[] read;

    public getLayoutInflater(int[] iArr) {
        this.read = iArr;
    }

    public final boolean hasNext() {
        return this.IconCompatParcelizer < this.read.length;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        int[] iArr = this.read;
        int i = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i + 1;
        return iArr[i];
    }
}
