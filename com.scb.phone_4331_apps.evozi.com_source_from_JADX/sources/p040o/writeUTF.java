package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;

/* renamed from: o.writeUTF */
public final /* synthetic */ class writeUTF implements getAllowReturnTransitionOverlap {
    public static final /* synthetic */ writeUTF MediaBrowserCompat$ItemReceiver = new writeUTF();

    private /* synthetic */ writeUTF() {
    }

    public final boolean write(Object obj) {
        return DiskLruCache.VERSION_1.equals(((AutoValue_CrashlyticsReport_FilesPayload.C30601) obj).RatingCompat);
    }
}
