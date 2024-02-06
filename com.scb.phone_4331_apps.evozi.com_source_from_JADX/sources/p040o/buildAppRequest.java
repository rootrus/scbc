package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.buildAppRequest */
public enum buildAppRequest {
    SHOW_IMAGE_ON_BANNER(DiskLruCache.VERSION_1),
    HIDE_IMAGE_ON_BANNER("0");
    
    String status;

    private buildAppRequest(String str) {
        this.status = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.buildAppRequest MediaBrowserCompat$CustomActionResultReceiver(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 1
            r2 = 48
            if (r0 == r2) goto L_0x0017
            r2 = 49
            if (r0 != r2) goto L_0x0021
            java.lang.String r0 = "1"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0021
            r3 = r1
            goto L_0x0022
        L_0x0017:
            java.lang.String r0 = "0"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0021
            r3 = 0
            goto L_0x0022
        L_0x0021:
            r3 = -1
        L_0x0022:
            if (r3 == 0) goto L_0x002c
            if (r3 == r1) goto L_0x0029
            o.buildAppRequest r3 = HIDE_IMAGE_ON_BANNER
            return r3
        L_0x0029:
            o.buildAppRequest r3 = SHOW_IMAGE_ON_BANNER
            return r3
        L_0x002c:
            o.buildAppRequest r3 = HIDE_IMAGE_ON_BANNER
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.buildAppRequest.MediaBrowserCompat$CustomActionResultReceiver(java.lang.String):o.buildAppRequest");
    }
}
