package p040o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: o.onPause$MediaBrowserCompat$CustomActionResultReceiver */
final class onPause$MediaBrowserCompat$CustomActionResultReceiver extends WeakReference<performDetach<?>> {
    performOptionsMenuClosed<?> IconCompatParcelizer;
    final boolean read;
    final isStateSaved write;

    onPause$MediaBrowserCompat$CustomActionResultReceiver(isStateSaved isstatesaved, performDetach<?> performdetach, ReferenceQueue<? super performDetach<?>> referenceQueue, boolean z) {
        super(performdetach, referenceQueue);
        performOptionsMenuClosed<?> performoptionsmenuclosed;
        if (isstatesaved != null) {
            this.write = isstatesaved;
            if (!performdetach.MediaBrowserCompat$CustomActionResultReceiver || !z) {
                performoptionsmenuclosed = null;
            } else {
                performOptionsMenuClosed<Z> performoptionsmenuclosed2 = performdetach.read;
                if (performoptionsmenuclosed2 != null) {
                    performoptionsmenuclosed = performoptionsmenuclosed2;
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            this.IconCompatParcelizer = performoptionsmenuclosed;
            this.read = performdetach.MediaBrowserCompat$CustomActionResultReceiver;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }
}
