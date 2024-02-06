package p040o;

import p040o.safeID;

/* renamed from: o.safeID$MediaBrowserCompat$ItemReceiver */
public final class safeID$MediaBrowserCompat$ItemReceiver {
    public final int MediaBrowserCompat$ItemReceiver;
    public final safeID.IconCompatParcelizer[] read;

    /* synthetic */ safeID$MediaBrowserCompat$ItemReceiver(int i, safeID.IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(i, iconCompatParcelizer);
    }

    /* synthetic */ safeID$MediaBrowserCompat$ItemReceiver(safeID.IconCompatParcelizer iconCompatParcelizer, safeID.IconCompatParcelizer iconCompatParcelizer2) {
        this(62, iconCompatParcelizer, iconCompatParcelizer2);
    }

    private safeID$MediaBrowserCompat$ItemReceiver(int i, safeID.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = new safeID.IconCompatParcelizer[]{iconCompatParcelizer};
    }

    private safeID$MediaBrowserCompat$ItemReceiver(int i, safeID.IconCompatParcelizer iconCompatParcelizer, safeID.IconCompatParcelizer iconCompatParcelizer2) {
        this.MediaBrowserCompat$ItemReceiver = 62;
        this.read = new safeID.IconCompatParcelizer[]{iconCompatParcelizer, iconCompatParcelizer2};
    }
}
