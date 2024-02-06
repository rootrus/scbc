package p040o;

import java.io.File;
import java.io.InputStream;
import p040o.CheckParameters;

/* renamed from: o.setSharedElementReturnTransition */
public final class setSharedElementReturnTransition implements isInLayout<InputStream> {
    private final CheckParameters.CheckCountry read;

    public final /* synthetic */ boolean read(Object obj, File file, onActivityResult onactivityresult) {
        return MediaBrowserCompat$ItemReceiver((InputStream) obj, file);
    }

    public setSharedElementReturnTransition(CheckParameters.CheckCountry checkCountry) {
        this.read = checkCountry;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e A[SYNTHETIC, Splitter:B:21:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b A[SYNTHETIC, Splitter:B:30:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean MediaBrowserCompat$ItemReceiver(java.io.InputStream r7, java.io.File r8) {
        /*
            r6 = this;
            java.lang.String r0 = "StreamEncoder"
            o.CheckParameters$CheckCountry r1 = r6.read
            java.lang.Class<byte[]> r2 = byte[].class
            r3 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r1 = r1.read(r3, r2)
            byte[] r1 = (byte[]) r1
            r2 = 1
            r3 = 0
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002f }
            r5.<init>(r8)     // Catch:{ IOException -> 0x002f }
        L_0x0016:
            int r8 = r7.read(r1)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            r3 = -1
            if (r8 == r3) goto L_0x0021
            r5.write(r1, r4, r8)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            goto L_0x0016
        L_0x0021:
            r5.close()     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            r5.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0042
        L_0x0028:
            r7 = move-exception
            goto L_0x0049
        L_0x002a:
            r7 = move-exception
            r3 = r5
            goto L_0x0030
        L_0x002d:
            r7 = move-exception
            goto L_0x0048
        L_0x002f:
            r7 = move-exception
        L_0x0030:
            r8 = 3
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x003c
            java.lang.String r8 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r0, r8, r7)     // Catch:{ all -> 0x002d }
        L_0x003c:
            if (r3 == 0) goto L_0x0041
            r3.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            r2 = r4
        L_0x0042:
            o.CheckParameters$CheckCountry r7 = r6.read
            r7.MediaBrowserCompat$CustomActionResultReceiver(r1)
            return r2
        L_0x0048:
            r5 = r3
        L_0x0049:
            if (r5 == 0) goto L_0x004e
            r5.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            o.CheckParameters$CheckCountry r8 = r6.read
            r8.MediaBrowserCompat$CustomActionResultReceiver(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSharedElementReturnTransition.MediaBrowserCompat$ItemReceiver(java.io.InputStream, java.io.File):boolean");
    }
}
