package p040o;

import android.graphics.Bitmap;
import p040o.CheckParameters;

/* renamed from: o.markState */
public final class markState implements onContextItemSelected<Bitmap> {
    private static noteStateNotSaved<Integer> IconCompatParcelizer = noteStateNotSaved.MediaBrowserCompat$CustomActionResultReceiver("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    private static noteStateNotSaved<Bitmap.CompressFormat> MediaBrowserCompat$CustomActionResultReceiver = noteStateNotSaved.read("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final CheckParameters.CheckCountry MediaBrowserCompat$ItemReceiver;

    public markState(CheckParameters.CheckCountry checkCountry) {
        this.MediaBrowserCompat$ItemReceiver = checkCountry;
    }

    @Deprecated
    public markState() {
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|53|(2:55|56)|57|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r6 == null) goto L_0x0086;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4 A[SYNTHETIC, Splitter:B:55:0x00e4] */
    /* renamed from: IconCompatParcelizer */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean read(p040o.performOptionsMenuClosed<android.graphics.Bitmap> r9, java.io.File r10, p040o.onActivityResult r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.write()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            o.noteStateNotSaved<android.graphics.Bitmap$CompressFormat> r1 = MediaBrowserCompat$CustomActionResultReceiver
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0019
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r2.get(r1)
            goto L_0x001b
        L_0x0019:
            T r1 = r1.read
        L_0x001b:
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L_0x0020
            goto L_0x002b
        L_0x0020:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L_0x0029
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x002b
        L_0x0029:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x002b:
            r9.getWidth()
            r9.getHeight()
            long r2 = p040o.AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00e8 }
            o.noteStateNotSaved<java.lang.Integer> r4 = IconCompatParcelizer     // Catch:{ all -> 0x00e8 }
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r5 = r11.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00e8 }
            boolean r5 = r5.containsKey(r4)     // Catch:{ all -> 0x00e8 }
            if (r5 == 0) goto L_0x0046
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r5 = r11.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00e8 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x00e8 }
            goto L_0x0048
        L_0x0046:
            T r4 = r4.read     // Catch:{ all -> 0x00e8 }
        L_0x0048:
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00e8 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00e8 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0074 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0074 }
            o.CheckParameters$CheckCountry r10 = r8.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            if (r10 == 0) goto L_0x0062
            o.onAttachFragment r10 = new o.onAttachFragment     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            o.CheckParameters$CheckCountry r6 = r8.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            r6 = r10
            goto L_0x0063
        L_0x0062:
            r6 = r7
        L_0x0063:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x0074 }
            r6.close()     // Catch:{ IOException -> 0x0074 }
            r10 = 1
            r5 = r10
            goto L_0x0083
        L_0x006c:
            r9 = move-exception
            goto L_0x00e2
        L_0x006f:
            r10 = move-exception
            r6 = r7
            goto L_0x0075
        L_0x0072:
            r9 = move-exception
            goto L_0x00e1
        L_0x0074:
            r10 = move-exception
        L_0x0075:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0081
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch:{ all -> 0x0072 }
        L_0x0081:
            if (r6 == 0) goto L_0x0086
        L_0x0083:
            r6.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00e8 }
            if (r10 == 0) goto L_0x00e0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
            r10.<init>()     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch:{ all -> 0x00e8 }
            r10.append(r1)     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch:{ all -> 0x00e8 }
            int r1 = p040o.LinearLayoutManager.IconCompatParcelizer((android.graphics.Bitmap) r9)     // Catch:{ all -> 0x00e8 }
            r10.append(r1)     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch:{ all -> 0x00e8 }
            double r1 = p040o.AudioAttributesCompatParcelizer.write(r2)     // Catch:{ all -> 0x00e8 }
            r10.append(r1)     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch:{ all -> 0x00e8 }
            o.noteStateNotSaved<android.graphics.Bitmap$CompressFormat> r1 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00e8 }
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r11.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00e8 }
            boolean r2 = r2.containsKey(r1)     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00c8
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r11 = r11.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00e8 }
            java.lang.Object r11 = r11.get(r1)     // Catch:{ all -> 0x00e8 }
            goto L_0x00ca
        L_0x00c8:
            T r11 = r1.read     // Catch:{ all -> 0x00e8 }
        L_0x00ca:
            r10.append(r11)     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00e8 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00e8 }
            r10.append(r9)     // Catch:{ all -> 0x00e8 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00e8 }
            android.util.Log.v(r0, r9)     // Catch:{ all -> 0x00e8 }
        L_0x00e0:
            return r5
        L_0x00e1:
            r7 = r6
        L_0x00e2:
            if (r7 == 0) goto L_0x00e7
            r7.close()     // Catch:{ IOException -> 0x00e7 }
        L_0x00e7:
            throw r9     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.markState.read(o.performOptionsMenuClosed, java.io.File, o.onActivityResult):boolean");
    }

    public final isRemoving IconCompatParcelizer(onActivityResult onactivityresult) {
        return isRemoving.TRANSFORMED;
    }
}
