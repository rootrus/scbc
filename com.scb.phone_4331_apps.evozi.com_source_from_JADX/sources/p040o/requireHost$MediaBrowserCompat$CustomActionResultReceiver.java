package p040o;

import java.util.ArrayDeque;
import java.util.Queue;
import p040o.requireHost;

/* renamed from: o.requireHost$MediaBrowserCompat$CustomActionResultReceiver */
public class requireHost$MediaBrowserCompat$CustomActionResultReceiver {
    private final Queue<requireHost.IconCompatParcelizer> read = new ArrayDeque();

    requireHost$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final requireHost.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver() {
        requireHost.IconCompatParcelizer poll;
        synchronized (this.read) {
            poll = this.read.poll();
        }
        return poll == null ? new requireHost.IconCompatParcelizer() : poll;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(requireHost.IconCompatParcelizer iconCompatParcelizer) {
        synchronized (this.read) {
            if (this.read.size() < 10) {
                this.read.offer(iconCompatParcelizer);
            }
        }
    }
}
