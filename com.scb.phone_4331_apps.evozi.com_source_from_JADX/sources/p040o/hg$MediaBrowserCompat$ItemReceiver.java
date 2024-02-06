package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.hg$MediaBrowserCompat$ItemReceiver */
final class hg$MediaBrowserCompat$ItemReceiver implements Runnable {
    private /* synthetic */ C4750hg write;

    hg$MediaBrowserCompat$ItemReceiver(C4750hg hgVar) {
        this.write = hgVar;
    }

    public final void run() {
        C4750hg hgVar = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C100074.write;
        if (hgVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(hgVar.RatingCompat);
        }
    }
}
