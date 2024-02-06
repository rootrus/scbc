package com.kofax.mobile.sdk.p022j;

import android.content.Context;
import android.graphics.Bitmap;
import com.kofax.mobile.sdk._internal.C0495c;
import com.kofax.mobile.sdk.p015ak.C0857a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.FileUtils;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.j.d */
public class C0932d implements C0495c {

    /* renamed from: zF */
    private static final long f2240zF = 20971520;

    /* renamed from: zG */
    private static final String f2241zG = "BitmapDiskCache";

    /* renamed from: zH */
    private final File f2242zH;

    /* renamed from: zI */
    private final Object f2243zI = new Object();

    @HmlPinActivity
    public C0932d(Context context) {
        if (context != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getCacheDir().getAbsolutePath());
            sb.append(File.separator);
            sb.append(f2241zG);
            File file = new File(sb.toString());
            this.f2242zH = file;
            if (!file.exists()) {
                this.f2242zH.mkdirs();
            }
            trimToSize();
            return;
        }
        throw new IllegalStateException("Context has not been set.");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|(0)|34|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|16|20|21|(0)|(0)|27|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r3 = r6;
        r6 = r5;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        r1.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0036, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002b A[Catch:{ all -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0030 A[SYNTHETIC, Splitter:B:25:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0039 A[SYNTHETIC, Splitter:B:32:0x0039] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11136a(java.lang.String r5, android.graphics.Bitmap r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2243zI
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x003d }
            java.io.File r2 = r4.f2242zH     // Catch:{ all -> 0x003d }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x003d }
            r5 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0025 }
            r4.m2411a((android.graphics.Bitmap) r6, (java.io.OutputStream) r2)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            r2.close()     // Catch:{ IOException -> 0x0016 }
        L_0x0016:
            monitor-exit(r0)
            r4.trimToSize()
            r5 = 1
            return r5
        L_0x001c:
            r5 = move-exception
            goto L_0x0037
        L_0x001e:
            r5 = r2
            goto L_0x0025
        L_0x0020:
            r6 = move-exception
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0036
        L_0x0025:
            boolean r6 = r1.exists()     // Catch:{ all -> 0x0020 }
            if (r6 == 0) goto L_0x002e
            r1.delete()     // Catch:{ all -> 0x0020 }
        L_0x002e:
            if (r5 == 0) goto L_0x0033
            r5.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            monitor-exit(r0)
            r5 = 0
            return r5
        L_0x0036:
            r2 = r6
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            throw r5     // Catch:{ all -> 0x003d }
        L_0x003d:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p022j.C0932d.mo11136a(java.lang.String, android.graphics.Bitmap):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|21|27|(2:29|30)|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0040 A[SYNTHETIC, Splitter:B:29:0x0040] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap getBitmap(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2243zI
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0044 }
            java.io.File r2 = r4.f2242zH     // Catch:{ all -> 0x0044 }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0044 }
            boolean r5 = r1.exists()     // Catch:{ all -> 0x0044 }
            r2 = 0
            if (r5 != 0) goto L_0x0013
            monitor-exit(r0)
            return r2
        L_0x0013:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0033, ClassNotFoundException -> 0x0030 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0033, ClassNotFoundException -> 0x0030 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002a, ClassNotFoundException -> 0x0028, all -> 0x0026 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x002a, ClassNotFoundException -> 0x0028, all -> 0x0026 }
            android.graphics.Bitmap r1 = r4.m2410a(r2)     // Catch:{ IOException -> 0x002a, ClassNotFoundException -> 0x0028, all -> 0x0026 }
            r5.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            monitor-exit(r0)
            return r1
        L_0x0026:
            r1 = move-exception
            goto L_0x003e
        L_0x0028:
            r1 = move-exception
            goto L_0x002b
        L_0x002a:
            r1 = move-exception
        L_0x002b:
            r2 = r5
            goto L_0x0035
        L_0x002d:
            r5 = move-exception
            r1 = r5
            goto L_0x003d
        L_0x0030:
            r5 = move-exception
        L_0x0031:
            r1 = r5
            goto L_0x0035
        L_0x0033:
            r5 = move-exception
            goto L_0x0031
        L_0x0035:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Could not read bitmap file."
            r5.<init>(r3, r1)     // Catch:{ all -> 0x002d }
            throw r5     // Catch:{ all -> 0x002d }
        L_0x003d:
            r5 = r2
        L_0x003e:
            if (r5 == 0) goto L_0x0043
            r5.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p022j.C0932d.getBitmap(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: w */
    public Bitmap mo11138w(String str) {
        Bitmap bitmap = getBitmap(str);
        synchronized (this.f2243zI) {
            m2412c(new File(this.f2242zH, str));
        }
        return bitmap;
    }

    /* renamed from: c */
    private void m2412c(File file) {
        synchronized (this.f2243zI) {
            if (file != null) {
                if (file.exists()) {
                    if (!file.delete()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Could not delete bitmap file ");
                        sb.append(file);
                        throw new RuntimeException(sb.toString());
                    }
                }
            }
        }
    }

    private void trimToSize() {
        List<File> iZ = m2413iZ();
        while (getSize() > f2240zF) {
            synchronized (this.f2243zI) {
                File remove = iZ.remove(0);
                if (remove != null) {
                    m2412c(remove);
                } else {
                    return;
                }
            }
        }
    }

    private long getSize() {
        return FileUtils.sizeOfDirectory(this.f2242zH);
    }

    /* renamed from: iZ */
    private List<File> m2413iZ() {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f2242zH.listFiles()));
        m2414k(arrayList);
        return arrayList;
    }

    /* renamed from: k */
    private void m2414k(List<File> list) {
        Collections.sort(list, new Comparator<File>() {
            public int compare(File file, File file2) {
                if (file.lastModified() > file2.lastModified()) {
                    return 1;
                }
                return file.lastModified() < file2.lastModified() ? -1 : 0;
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.j.d$a */
    static class C0934a implements Serializable {
        private static final long serialVersionUID = 6879914159857742532L;
        int height;
        int width;

        /* renamed from: zK */
        byte[] f2245zK;

        /* renamed from: zL */
        Bitmap.Config f2246zL;

        private C0934a() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2411a(android.graphics.Bitmap r3, java.io.OutputStream r4) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x002d }
            r1.<init>(r4)     // Catch:{ all -> 0x002d }
            com.kofax.mobile.sdk.j.d$a r4 = new com.kofax.mobile.sdk.j.d$a     // Catch:{ all -> 0x002a }
            r4.<init>()     // Catch:{ all -> 0x002a }
            byte[] r0 = com.kofax.mobile.sdk.p015ak.C0857a.m2194n(r3)     // Catch:{ all -> 0x002a }
            r4.f2245zK = r0     // Catch:{ all -> 0x002a }
            android.graphics.Bitmap$Config r0 = r3.getConfig()     // Catch:{ all -> 0x002a }
            r4.f2246zL = r0     // Catch:{ all -> 0x002a }
            int r0 = r3.getWidth()     // Catch:{ all -> 0x002a }
            r4.width = r0     // Catch:{ all -> 0x002a }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x002a }
            r4.height = r3     // Catch:{ all -> 0x002a }
            r1.writeObject(r4)     // Catch:{ all -> 0x002a }
            r1.close()
            return
        L_0x002a:
            r3 = move-exception
            r0 = r1
            goto L_0x002e
        L_0x002d:
            r3 = move-exception
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()
        L_0x0033:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p022j.C0932d.m2411a(android.graphics.Bitmap, java.io.OutputStream):void");
    }

    /* renamed from: a */
    private Bitmap m2410a(InputStream inputStream) throws IOException, ClassNotFoundException {
        if (inputStream == null) {
            return null;
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        C0934a aVar = (C0934a) objectInputStream.readObject();
        Bitmap a = C0857a.m2189a(aVar.f2245zK, aVar.width, aVar.height, aVar.f2246zL);
        objectInputStream.close();
        return a;
    }
}
