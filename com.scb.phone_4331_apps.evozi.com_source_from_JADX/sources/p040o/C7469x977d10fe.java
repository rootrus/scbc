package p040o;

import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setVwModelConsentSeparator$MediaBrowserCompat$CustomActionResultReceiver */
final class C7469x977d10fe implements Runnable {
    private final Runnable MediaBrowserCompat$ItemReceiver;
    private final setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver read;
    private final long write;

    C7469x977d10fe(Runnable runnable, setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver setvwmodelconsentseparator_mediabrowsercompat_itemreceiver, long j) {
        this.MediaBrowserCompat$ItemReceiver = runnable;
        this.read = setvwmodelconsentseparator_mediabrowsercompat_itemreceiver;
        this.write = j;
    }

    public final void run() {
        if (!this.read.IconCompatParcelizer) {
            long MediaBrowserCompat$ItemReceiver2 = setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(TimeUnit.MILLISECONDS);
            long j = this.write;
            if (j > MediaBrowserCompat$ItemReceiver2) {
                try {
                    Thread.sleep(j - MediaBrowserCompat$ItemReceiver2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    AlertController$RecycleListView.read.read((Throwable) e);
                    return;
                }
            }
            if (!this.read.IconCompatParcelizer) {
                this.MediaBrowserCompat$ItemReceiver.run();
            }
        }
    }
}
