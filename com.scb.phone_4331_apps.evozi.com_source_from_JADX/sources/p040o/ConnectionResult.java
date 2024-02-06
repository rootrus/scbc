package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.ConnectionResult */
public final /* synthetic */ class ConnectionResult implements getAllowReturnTransitionOverlap {
    public static final /* synthetic */ ConnectionResult MediaBrowserCompat$ItemReceiver = new ConnectionResult();

    private /* synthetic */ ConnectionResult() {
    }

    public final boolean write(Object obj) {
        return DiskLruCache.VERSION_1.equals(((getParentId) obj).MediaMetadataCompat);
    }
}
