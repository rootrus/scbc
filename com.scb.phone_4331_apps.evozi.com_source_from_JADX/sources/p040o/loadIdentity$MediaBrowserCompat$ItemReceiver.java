package p040o;

import p040o.C10885rotate;

/* renamed from: o.loadIdentity$MediaBrowserCompat$ItemReceiver */
public final class loadIdentity$MediaBrowserCompat$ItemReceiver extends rotate$MediaBrowserCompat$ItemReceiver {
    private C10885rotate.read MediaBrowserCompat$ItemReceiver;
    private Long4 read;

    public final rotate$MediaBrowserCompat$ItemReceiver IconCompatParcelizer(C10885rotate.read read2) {
        this.MediaBrowserCompat$ItemReceiver = read2;
        return this;
    }

    public final rotate$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver(Long4 long4) {
        this.read = long4;
        return this;
    }

    public final C10885rotate MediaBrowserCompat$ItemReceiver() {
        return new loadIdentity(this.MediaBrowserCompat$ItemReceiver, this.read);
    }
}
