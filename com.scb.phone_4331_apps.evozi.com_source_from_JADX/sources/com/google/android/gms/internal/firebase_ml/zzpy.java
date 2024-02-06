package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.GmsLogger;

public final class zzpy {
    private static final GmsLogger zzaoz = new GmsLogger("MLKitImageUtils", "");
    private static zzpy zzaxq = new zzpy();

    private zzpy() {
    }

    public static zzpy zznl() {
        return zzaxq;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.graphics.Matrix} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.Matrix} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: android.graphics.Matrix} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.graphics.Matrix} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.io.InputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r8 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r10 = android.graphics.Bitmap.createBitmap(r1, 0, 0, r6, r7, r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r1 == r10) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r0);
        com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8 A[SYNTHETIC, Splitter:B:38:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad A[Catch:{ all -> 0x00b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap zza(android.content.ContentResolver r10, android.net.Uri r11, int r12) throws java.io.IOException {
        /*
            r12 = 0
            java.io.InputStream r0 = r10.openInputStream(r11)     // Catch:{ FileNotFoundException -> 0x0094, all -> 0x0091 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x008f }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x008f }
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch:{ FileNotFoundException -> 0x008f }
            android.graphics.BitmapFactory.decodeStream(r0, r12, r1)     // Catch:{ FileNotFoundException -> 0x008f }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x008f }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x008f }
            int r2 = r1.outWidth     // Catch:{ FileNotFoundException -> 0x008f }
            int r2 = r2 / 1024
            int r3 = r1.outHeight     // Catch:{ FileNotFoundException -> 0x008f }
            int r3 = r3 / 1024
            int r2 = java.lang.Math.max(r2, r3)     // Catch:{ FileNotFoundException -> 0x008f }
            r1.inSampleSize = r2     // Catch:{ FileNotFoundException -> 0x008f }
            java.io.InputStream r2 = r10.openInputStream(r11)     // Catch:{ FileNotFoundException -> 0x008f }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r2, r12, r1)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            int r10 = zza(r10, r11)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            android.graphics.Matrix r3 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            int r6 = r1.getWidth()     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            int r7 = r1.getHeight()     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = 1119092736(0x42b40000, float:90.0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            switch(r10) {
                case 2: goto L_0x0069;
                case 3: goto L_0x0062;
                case 4: goto L_0x005e;
                case 5: goto L_0x0057;
                case 6: goto L_0x0053;
                case 7: goto L_0x004c;
                case 8: goto L_0x0048;
                default: goto L_0x0047;
            }     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
        L_0x0047:
            goto L_0x0071
        L_0x0048:
            r3.postRotate(r4)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            goto L_0x0067
        L_0x004c:
            r3.postRotate(r4)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            r3.postScale(r8, r9)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            goto L_0x0067
        L_0x0053:
            r3.postRotate(r5)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            goto L_0x0067
        L_0x0057:
            r3.postRotate(r5)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            r3.postScale(r8, r9)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            goto L_0x0067
        L_0x005e:
            r3.postScale(r9, r8)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            goto L_0x0067
        L_0x0062:
            r10 = 1127481344(0x43340000, float:180.0)
            r3.postRotate(r10)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
        L_0x0067:
            r8 = r3
            goto L_0x0072
        L_0x0069:
            android.graphics.Matrix r12 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            r12.<init>()     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            r12.postScale(r8, r9)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
        L_0x0071:
            r8 = r12
        L_0x0072:
            if (r8 == 0) goto L_0x0082
            r4 = 0
            r5 = 0
            r9 = 1
            r3 = r1
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            if (r1 == r10) goto L_0x0082
            r1.recycle()     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x0089 }
            r1 = r10
        L_0x0082:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r0)
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r2)
            return r1
        L_0x0089:
            r10 = move-exception
            r12 = r2
            goto L_0x00b9
        L_0x008c:
            r10 = move-exception
            r12 = r2
            goto L_0x0096
        L_0x008f:
            r10 = move-exception
            goto L_0x0096
        L_0x0091:
            r10 = move-exception
            r11 = r12
            goto L_0x00bb
        L_0x0094:
            r10 = move-exception
            r0 = r12
        L_0x0096:
            com.google.android.gms.common.internal.GmsLogger r1 = zzaoz     // Catch:{ all -> 0x00b8 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00b8 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00b8 }
            int r2 = r11.length()     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = "Could not open file: "
            if (r2 == 0) goto L_0x00ad
            java.lang.String r11 = r3.concat(r11)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x00b8 }
            r11.<init>(r3)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            java.lang.String r2 = "MLKitImageUtils"
            r1.mo4175e(r2, r11, r10)     // Catch:{ all -> 0x00b8 }
            throw r10     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r10 = move-exception
        L_0x00b9:
            r11 = r12
            r12 = r0
        L_0x00bb:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r12)
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzpy.zza(android.content.ContentResolver, android.net.Uri, int):android.graphics.Bitmap");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: o.setSubtitleTextAppearance} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(android.content.ContentResolver r6, android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r7.getScheme()
            java.lang.String r2 = "file"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x001a
            return r1
        L_0x001a:
            r0 = 0
            java.io.InputStream r6 = r6.openInputStream(r7)     // Catch:{ IOException -> 0x0030, all -> 0x002e }
            o.setSubtitleTextAppearance r2 = new o.setSubtitleTextAppearance     // Catch:{ IOException -> 0x002c }
            r2.<init>((java.io.InputStream) r6)     // Catch:{ IOException -> 0x002c }
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r6)
            r0 = r2
            goto L_0x005b
        L_0x0029:
            r7 = move-exception
            r0 = r6
            goto L_0x0066
        L_0x002c:
            r2 = move-exception
            goto L_0x0032
        L_0x002e:
            r6 = move-exception
            goto L_0x0067
        L_0x0030:
            r2 = move-exception
            r6 = r0
        L_0x0032:
            com.google.android.gms.common.internal.GmsLogger r3 = zzaoz     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0029 }
            int r4 = r4.length()     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            int r4 = r4 + 48
            r5.<init>(r4)     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "failed to open file to read rotation meta data: "
            r5.append(r4)     // Catch:{ all -> 0x0029 }
            r5.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = "MLKitImageUtils"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0029 }
            r3.mo4175e(r7, r4, r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r6)
        L_0x005b:
            if (r0 != 0) goto L_0x005e
            return r1
        L_0x005e:
            r6 = 1
            java.lang.String r7 = "Orientation"
            int r6 = r0.read((java.lang.String) r7, (int) r6)
            return r6
        L_0x0066:
            r6 = r7
        L_0x0067:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzpy.zza(android.content.ContentResolver, android.net.Uri):int");
    }
}
