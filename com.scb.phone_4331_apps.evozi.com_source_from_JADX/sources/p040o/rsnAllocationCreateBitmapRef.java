package p040o;

/* renamed from: o.rsnAllocationCreateBitmapRef */
public final class rsnAllocationCreateBitmapRef {
    static {
        MediaBrowserCompat$ItemReceiver();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String MediaBrowserCompat$ItemReceiver() {
        /*
            java.lang.Class<o.rsnAllocationCreateBitmapRef> r0 = p040o.rsnAllocationCreateBitmapRef.class
            java.lang.Package r1 = r0.getPackage()
            java.lang.String r1 = r1.getImplementationVersion()
            if (r1 != 0) goto L_0x0036
            java.lang.String r2 = "/google-http-client.properties"
            java.io.InputStream r0 = r0.getResourceAsStream(r2)     // Catch:{ IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0031
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x0023 }
            r2.<init>()     // Catch:{ all -> 0x0023 }
            r2.load(r0)     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "google-http-client.version"
            java.lang.String r1 = r2.getProperty(r3)     // Catch:{ all -> 0x0023 }
            goto L_0x0031
        L_0x0023:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r3 = move-exception
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x0036 }
        L_0x0030:
            throw r3     // Catch:{ IOException -> 0x0036 }
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            r0.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.rsnAllocationCreateBitmapRef.MediaBrowserCompat$ItemReceiver():java.lang.String");
    }
}
