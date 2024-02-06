package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.W$MediaBrowserCompat$SearchResultReceiver */
final class W$MediaBrowserCompat$SearchResultReceiver implements Runnable {
    private /* synthetic */ C3949W MediaBrowserCompat$CustomActionResultReceiver;

    W$MediaBrowserCompat$SearchResultReceiver(C3949W w) {
        this.MediaBrowserCompat$CustomActionResultReceiver = w;
    }

    public final void run() {
        C3949W w = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C98332.write;
        if (w.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(w.RatingCompat);
        }
    }
}
