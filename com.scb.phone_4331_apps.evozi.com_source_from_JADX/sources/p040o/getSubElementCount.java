package p040o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: o.getSubElementCount */
public final class getSubElementCount implements C1344x72315db3 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: o.getSubElementCount$MediaBrowserCompat$CustomActionResultReceiver} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:38|41|(2:49|50)|(2:53|54)|55|56) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:94|(2:24|25)|26|27|28|30|31|(3:33|34|(2:36|101)(1:100))(1:99)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0073 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0052 A[SYNTHETIC, Splitter:B:33:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x006b A[SYNTHETIC, Splitter:B:49:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0070 A[SYNTHETIC, Splitter:B:53:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0078 A[SYNTHETIC, Splitter:B:61:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0080 A[Catch:{ IOException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0085 A[SYNTHETIC, Splitter:B:70:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(android.content.Context r7, java.lang.String[] r8, java.lang.String r9, java.io.File r10, p040o.C10821Element.Builder r11) {
        /*
            r6 = this;
            r11 = 0
            o.getSubElementCount$MediaBrowserCompat$CustomActionResultReceiver r7 = read(r7, r8, r9)     // Catch:{ all -> 0x00a2 }
            if (r7 == 0) goto L_0x0099
            r8 = 0
            r9 = r8
        L_0x0009:
            r0 = 5
            if (r9 >= r0) goto L_0x008c
            boolean r0 = r10.exists()     // Catch:{ IOException -> 0x0088 }
            if (r0 != 0) goto L_0x0018
            boolean r0 = r10.createNewFile()     // Catch:{ IOException -> 0x0088 }
            if (r0 == 0) goto L_0x0088
        L_0x0018:
            java.util.zip.ZipFile r0 = r7.write     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0074, all -> 0x0067 }
            java.util.zip.ZipEntry r1 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0074, all -> 0x0067 }
            java.io.InputStream r0 = r0.getInputStream(r1)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0074, all -> 0x0067 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0065, IOException -> 0x0063, all -> 0x005f }
            r1.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0065, IOException -> 0x0063, all -> 0x005f }
            long r2 = IconCompatParcelizer(r0, r1)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x0076, all -> 0x005d }
            java.io.FileDescriptor r4 = r1.getFD()     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x0076, all -> 0x005d }
            r4.sync()     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x0076, all -> 0x005d }
            long r4 = r10.length()     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x0076, all -> 0x005d }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x0083
            r0.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0083
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            r1.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            r9 = 1
            r10.setReadable(r9, r8)     // Catch:{ all -> 0x009f }
            r10.setExecutable(r9, r8)     // Catch:{ all -> 0x009f }
            r10.setWritable(r9)     // Catch:{ all -> 0x009f }
            if (r7 == 0) goto L_0x005c
            java.util.zip.ZipFile r8 = r7.write     // Catch:{ IOException -> 0x005c }
            if (r8 == 0) goto L_0x005c
            java.util.zip.ZipFile r7 = r7.write     // Catch:{ IOException -> 0x005c }
            r7.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            return
        L_0x005d:
            r8 = move-exception
            goto L_0x0061
        L_0x005f:
            r8 = move-exception
            r1 = r11
        L_0x0061:
            r11 = r0
            goto L_0x0069
        L_0x0063:
            r1 = r11
            goto L_0x0076
        L_0x0065:
            r1 = r11
            goto L_0x007e
        L_0x0067:
            r8 = move-exception
            r1 = r11
        L_0x0069:
            if (r11 == 0) goto L_0x006e
            r11.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r8     // Catch:{ all -> 0x009f }
        L_0x0074:
            r0 = r11
            r1 = r0
        L_0x0076:
            if (r0 == 0) goto L_0x0083
            r0.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0083
        L_0x007c:
            r0 = r11
            r1 = r0
        L_0x007e:
            if (r0 == 0) goto L_0x0083
            r0.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            if (r1 == 0) goto L_0x0088
            r1.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            int r9 = r9 + 1
            goto L_0x0009
        L_0x008c:
            if (r7 == 0) goto L_0x0098
            java.util.zip.ZipFile r8 = r7.write     // Catch:{ IOException -> 0x0098 }
            if (r8 == 0) goto L_0x0098
            java.util.zip.ZipFile r7 = r7.write     // Catch:{ IOException -> 0x0098 }
            r7.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            return
        L_0x0099:
            com.getkeepsafe.relinker.MissingLibraryException r8 = new com.getkeepsafe.relinker.MissingLibraryException     // Catch:{ all -> 0x009f }
            r8.<init>(r9)     // Catch:{ all -> 0x009f }
            throw r8     // Catch:{ all -> 0x009f }
        L_0x009f:
            r8 = move-exception
            r11 = r7
            goto L_0x00a3
        L_0x00a2:
            r8 = move-exception
        L_0x00a3:
            if (r11 == 0) goto L_0x00ae
            java.util.zip.ZipFile r7 = r11.write     // Catch:{ IOException -> 0x00ae }
            if (r7 == 0) goto L_0x00ae
            java.util.zip.ZipFile r7 = r11.write     // Catch:{ IOException -> 0x00ae }
            r7.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getSubElementCount.read(android.content.Context, java.lang.String[], java.lang.String, java.io.File, o.Element$Builder):void");
    }

    private static long IconCompatParcelizer(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    private static getSubElementCount$MediaBrowserCompat$CustomActionResultReceiver read(Context context, String[] strArr, String str) {
        String[] strArr2;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || applicationInfo.splitSourceDirs == null || applicationInfo.splitSourceDirs.length == 0) {
            strArr2 = new String[]{applicationInfo.sourceDir};
        } else {
            strArr2 = new String[(applicationInfo.splitSourceDirs.length + 1)];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(applicationInfo.splitSourceDirs, 0, strArr2, 1, applicationInfo.splitSourceDirs.length);
        }
        ZipFile zipFile = null;
        for (String str2 : strArr2) {
            int i = 0;
            while (true) {
                if (i >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i++;
                }
            }
            if (zipFile != null) {
                for (int i2 = 0; i2 < 5; i2++) {
                    for (String append : strArr) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("lib");
                        sb.append(File.separatorChar);
                        sb.append(append);
                        sb.append(File.separatorChar);
                        sb.append(str);
                        ZipEntry entry = zipFile.getEntry(sb.toString());
                        if (entry != null) {
                            return new getSubElementCount$MediaBrowserCompat$CustomActionResultReceiver(zipFile, entry);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }
}
