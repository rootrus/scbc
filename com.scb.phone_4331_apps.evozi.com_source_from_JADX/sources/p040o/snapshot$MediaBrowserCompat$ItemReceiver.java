package p040o;

import androidx.core.p000os.OperationCanceledException;
import java.util.concurrent.CountDownLatch;

/* renamed from: o.snapshot$MediaBrowserCompat$ItemReceiver */
final class snapshot$MediaBrowserCompat$ItemReceiver extends valueOf<Void, Void, D> implements Runnable {
    boolean IconCompatParcelizer;
    final /* synthetic */ snapshot MediaBrowserCompat$CustomActionResultReceiver;
    private final CountDownLatch MediaMetadataCompat = new CountDownLatch(1);

    snapshot$MediaBrowserCompat$ItemReceiver(snapshot snapshot) {
        this.MediaBrowserCompat$CustomActionResultReceiver = snapshot;
    }

    /* access modifiers changed from: private */
    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public D IconCompatParcelizer() {
        try {
            return this.MediaBrowserCompat$CustomActionResultReceiver.onLoadInBackground();
        } catch (OperationCanceledException e) {
            if (this.MediaBrowserCompat$ItemReceiver.get()) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(D d) {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispatchOnLoadComplete(this, d);
        } finally {
            this.MediaMetadataCompat.countDown();
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(D d) {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispatchOnCancelled(this, d);
        } finally {
            this.MediaMetadataCompat.countDown();
        }
    }

    public final void run() {
        this.IconCompatParcelizer = false;
        this.MediaBrowserCompat$CustomActionResultReceiver.executePendingTask();
    }

    public final void write() {
        try {
            this.MediaMetadataCompat.await();
        } catch (InterruptedException unused) {
        }
    }
}
