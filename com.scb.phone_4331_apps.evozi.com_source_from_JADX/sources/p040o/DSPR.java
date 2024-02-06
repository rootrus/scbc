package p040o;

import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import p040o.nAllocationGetStride;

/* renamed from: o.DSPR */
public final class DSPR implements nAllocationGetStride.write {
    public static final DSPR MediaBrowserCompat$CustomActionResultReceiver = new DSPR();

    private DSPR() {
    }

    public final Object read(Object obj) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
    }
}
