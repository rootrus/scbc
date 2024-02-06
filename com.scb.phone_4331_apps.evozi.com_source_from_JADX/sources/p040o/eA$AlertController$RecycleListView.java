package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.eA$AlertController$RecycleListView */
final class eA$AlertController$RecycleListView implements Runnable {
    private /* synthetic */ C4323eA MediaBrowserCompat$CustomActionResultReceiver;

    eA$AlertController$RecycleListView(C4323eA eAVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = eAVar;
    }

    public final void run() {
        C4323eA eAVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C99011.MediaBrowserCompat$ItemReceiver;
        if (eAVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(eAVar.RatingCompat);
        }
    }
}
