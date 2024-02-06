package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.W$MediaBrowserCompat$ItemReceiver */
final class W$MediaBrowserCompat$ItemReceiver implements Runnable {
    private /* synthetic */ C3949W MediaBrowserCompat$CustomActionResultReceiver;

    W$MediaBrowserCompat$ItemReceiver(C3949W w) {
        this.MediaBrowserCompat$CustomActionResultReceiver = w;
    }

    public final void run() {
        C3949W w = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C98324.read;
        if (w.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(w.RatingCompat);
        }
    }
}
