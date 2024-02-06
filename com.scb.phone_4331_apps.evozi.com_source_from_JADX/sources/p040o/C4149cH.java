package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;

/* renamed from: o.cH */
public final /* synthetic */ class C4149cH implements getAllowReturnTransitionOverlap {
    public static final /* synthetic */ C4149cH write = new C4149cH();

    private /* synthetic */ C4149cH() {
    }

    public final boolean write(Object obj) {
        return DiskLruCache.VERSION_1.equals(((AutoValue_CrashlyticsReport_FilesPayload.C30601) obj).RatingCompat);
    }
}
