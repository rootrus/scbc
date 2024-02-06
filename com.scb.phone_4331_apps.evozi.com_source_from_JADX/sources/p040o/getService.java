package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.getService */
public final /* synthetic */ class getService implements getAllowReturnTransitionOverlap {
    public static final /* synthetic */ getService write = new getService();

    private /* synthetic */ getService() {
    }

    public final boolean write(Object obj) {
        return DiskLruCache.VERSION_1.equals(((getParentId) obj).MediaBrowserCompat$SearchResultReceiver);
    }
}
