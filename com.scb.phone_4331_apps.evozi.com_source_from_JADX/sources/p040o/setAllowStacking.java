package p040o;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: o.setAllowStacking */
class setAllowStacking extends setDecorPadding {
    setAllowStacking() {
    }

    private File MediaBrowserCompat$CustomActionResultReceiver(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004b, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004f, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0052, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0053, code lost:
        if (r4 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x005d, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface write(android.content.Context r3, android.os.CancellationSignal r4, p040o.setTabSelected.IconCompatParcelizer[] r5, int r6) {
        /*
            r2 = this;
            int r0 = r5.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            o.setTabSelected$IconCompatParcelizer r5 = r2.MediaBrowserCompat$CustomActionResultReceiver(r5, r6)
            android.content.ContentResolver r6 = r3.getContentResolver()
            android.net.Uri r5 = r5.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x005e }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r4 = r6.openFileDescriptor(r5, r0, r4)     // Catch:{ IOException -> 0x005e }
            java.io.File r5 = r2.MediaBrowserCompat$CustomActionResultReceiver(r4)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x002e
            boolean r6 = r5.canRead()     // Catch:{ all -> 0x0050 }
            if (r6 != 0) goto L_0x0024
            goto L_0x002e
        L_0x0024:
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x002d
            r4.close()     // Catch:{ IOException -> 0x005e }
        L_0x002d:
            return r3
        L_0x002e:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
            java.io.FileDescriptor r6 = r4.getFileDescriptor()     // Catch:{ all -> 0x0050 }
            r5.<init>(r6)     // Catch:{ all -> 0x0050 }
            android.graphics.Typeface r3 = super.MediaBrowserCompat$ItemReceiver(r3, r5)     // Catch:{ all -> 0x0044 }
            r5.close()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0043
            r4.close()     // Catch:{ IOException -> 0x005e }
        L_0x0043:
            return r3
        L_0x0044:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r6 = move-exception
            r5.close()     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch:{ all -> 0x0050 }
        L_0x004f:
            throw r6     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r5 = move-exception
            if (r4 == 0) goto L_0x005d
            r4.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch:{ IOException -> 0x005e }
        L_0x005d:
            throw r5     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setAllowStacking.write(android.content.Context, android.os.CancellationSignal, o.setTabSelected$IconCompatParcelizer[], int):android.graphics.Typeface");
    }
}
