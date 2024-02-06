package com.kofax.kmc.kui.uicontrols;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Debug;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import com.kofax.mobile.sdk.p015ak.C8284d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ImageService {
    private static final String TAG = ImageService.class.getSimpleName();
    public static final int THUMBNAIL_SIZE = 100;

    /* renamed from: ig */
    private static final int f3499ig = 1;

    /* renamed from: ih */
    private static final int f3500ih = 1;

    /* renamed from: ii */
    private static final int f3501ii = 200;

    /* renamed from: ij */
    private static final int f3502ij = 200;

    /* renamed from: ik */
    private static final int f3503ik = 24;

    /* renamed from: il */
    private static final int f3504il = 3;

    /* renamed from: im */
    private static final int f3505im = 72;

    /* renamed from: io */
    private static final int f3506io = 72;

    /* renamed from: kK */
    private static boolean f3507kK = false;

    /* renamed from: kL */
    private static Bitmap f3508kL = null;

    /* renamed from: kM */
    private static String f3509kM = null;

    /* renamed from: kN */
    private static String f3510kN = null;

    /* renamed from: kO */
    private static UseableImageMemoryLimit f3511kO = UseableImageMemoryLimit.NORMAL;

    /* renamed from: kP */
    private static InterimImageFileFormat f3512kP = InterimImageFileFormat.PNG;

    public enum InterimImageFileFormat {
        PNG,
        JPEG
    }

    public enum UseableImageMemoryLimit {
        NORMAL,
        LARGE,
        MAXIMUM
    }

    public static void setInterimImageFileFormat(InterimImageFileFormat interimImageFileFormat) {
        f3512kP = interimImageFileFormat;
    }

    public static InterimImageFileFormat getInterimImageFileFormat() {
        return f3512kP;
    }

    public static Bitmap getGlobalBitmap() {
        return f3508kL;
    }

    public static String getEnhancedBitonalImageFileName() {
        return f3509kM;
    }

    public static String getIpResults() {
        return f3510kN;
    }

    public static String getNonNullIpResults() {
        String str = f3510kN;
        return str == null ? new String() : str;
    }

    public static void storeGlobalBitmap(Bitmap bitmap) {
        C0767k.m1801b(TAG, "Storing global bitmap");
        Bitmap bitmap2 = f3508kL;
        if (!(bitmap2 == null || bitmap2 == bitmap)) {
            clearGlobalBitmap();
        }
        f3508kL = bitmap;
    }

    public static void clearGlobalBitmap() {
        C0767k.m1801b(TAG, "Clearing global bitmap");
        Bitmap bitmap = f3508kL;
        if (bitmap != null) {
            bitmap.recycle();
            f3508kL = null;
        }
    }

    public static Bitmap getBitmapFromURL(URL url) {
        try {
            HttpURLConnection a = C8284d.m4660a(url, (CertificateValidatorListener) null);
            a.setDoInput(true);
            a.connect();
            return BitmapFactory.decodeStream(a.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap getBitmapFromURI(Context context, Uri uri) {
        InputStream inputStream;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            inputStream = null;
        }
        if (inputStream != null) {
            return BitmapFactory.decodeStream(inputStream);
        }
        return null;
    }

    /* renamed from: a */
    private static int m3778a(Context context, Uri uri, int i, int i2) throws FileNotFoundException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
        int i3 = options.outHeight;
        float f = (float) (i / options.outWidth);
        float f2 = (float) (i2 / i3);
        try {
            openInputStream.close();
        } catch (Exception e) {
            C0767k.m1821e(TAG, "Error closing input stream", (Throwable) e);
        }
        if (decodeStream != null) {
            decodeStream.recycle();
        }
        return (int) Math.pow(2.0d, (double) Math.min(f, f2));
    }

    public static void setUseableImageMemoryLimits(UseableImageMemoryLimit useableImageMemoryLimit) {
        f3511kO = useableImageMemoryLimit;
    }

    public static UseableImageMemoryLimit getUseableImageMemoryLimits() {
        return f3511kO;
    }

    /* renamed from: af */
    private static long m3779af() {
        long j = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j2 = maxMemory / 2;
        long min = Math.min(j, j2);
        int i = C78801.f3513kQ[f3511kO.ordinal()];
        if (i == 1) {
            maxMemory = j2;
        } else if (i != 2) {
            maxMemory = min;
        }
        dumpHeapStats("getLargestUseableImage()");
        return maxMemory;
    }

    /* renamed from: com.kofax.kmc.kui.uicontrols.ImageService$1 */
    static /* synthetic */ class C78801 {

        /* renamed from: kQ */
        static final /* synthetic */ int[] f3513kQ;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.kmc.kui.uicontrols.ImageService$UseableImageMemoryLimit[] r0 = com.kofax.kmc.kui.uicontrols.ImageService.UseableImageMemoryLimit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3513kQ = r0
                com.kofax.kmc.kui.uicontrols.ImageService$UseableImageMemoryLimit r1 = com.kofax.kmc.kui.uicontrols.ImageService.UseableImageMemoryLimit.LARGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3513kQ     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kui.uicontrols.ImageService$UseableImageMemoryLimit r1 = com.kofax.kmc.kui.uicontrols.ImageService.UseableImageMemoryLimit.MAXIMUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3513kQ     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.kui.uicontrols.ImageService$UseableImageMemoryLimit r1 = com.kofax.kmc.kui.uicontrols.ImageService.UseableImageMemoryLimit.NORMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kui.uicontrols.ImageService.C78801.<clinit>():void");
        }
    }

    public static void dumpHeapStats(String str) {
        C0767k.m1801b(TAG, "*** [START] Dumping heap stats ***");
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("--- msg -> ");
        sb.append(str);
        C0767k.m1801b(str2, sb.toString());
        String str3 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--- native heap size -> ");
        sb2.append(Debug.getNativeHeapSize());
        C0767k.m1801b(str3, sb2.toString());
        String str4 = TAG;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--- native heap size (free) -> ");
        sb3.append(Debug.getNativeHeapFreeSize());
        C0767k.m1801b(str4, sb3.toString());
        String str5 = TAG;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("--- native heap size (allocated) -> ");
        sb4.append(Debug.getNativeHeapAllocatedSize());
        C0767k.m1801b(str5, sb4.toString());
        String str6 = TAG;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("--- totalMemory -> ");
        sb5.append(Runtime.getRuntime().totalMemory());
        C0767k.m1801b(str6, sb5.toString());
        String str7 = TAG;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("--- maxMemory -> ");
        sb6.append(Runtime.getRuntime().maxMemory());
        C0767k.m1801b(str7, sb6.toString());
        C0767k.m1801b(TAG, "*** [END] Dumping heap stats ***");
    }

    public static Bitmap createScaledBitmap(Bitmap bitmap, boolean z) {
        long af = m3779af();
        long rowBytes = (long) (bitmap.getRowBytes() * bitmap.getHeight());
        C0767k.m1801b(TAG, "Creating scaled bitmap...");
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("... original bitmap size -> ");
        sb.append(rowBytes);
        C0767k.m1801b(str, sb.toString());
        if (rowBytes > af) {
            dumpHeapStats("createScaledBitmap - preScale");
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = ((float) af) / ((float) rowBytes);
            int i = (int) (((float) width) * f);
            int i2 = (int) (((float) height) * f);
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("... scaling bitmap with factor of ");
            sb2.append(f);
            C0767k.m1801b(str2, sb2.toString());
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                String str3 = TAG;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("... new bitmap size -> ");
                sb3.append(createScaledBitmap.getRowBytes() * createScaledBitmap.getHeight());
                C0767k.m1801b(str3, sb3.toString());
                if (z) {
                    C0767k.m1801b(TAG, "... recyling old bitmap");
                    bitmap.recycle();
                }
                dumpHeapStats("createScaledBitmap - postScale");
                return createScaledBitmap;
            } catch (OutOfMemoryError e) {
                C0767k.m1821e(TAG, "Got OOM while trying to create scaled bitmap", (Throwable) e);
                String str4 = TAG;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("... largestImageSize -> ");
                sb4.append(af);
                C0767k.m1820e(str4, sb4.toString());
                String str5 = TAG;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("... bmSize -> ");
                sb5.append(rowBytes);
                C0767k.m1820e(str5, sb5.toString());
                String str6 = TAG;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("... orgHeight -> ");
                sb6.append(height);
                sb6.append(", orgWidth -> ");
                sb6.append(width);
                C0767k.m1820e(str6, sb6.toString());
                String str7 = TAG;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("... height -> ");
                sb7.append(i2);
                sb7.append(", width -> ");
                sb7.append(i);
                C0767k.m1820e(str7, sb7.toString());
            }
        }
        return bitmap;
    }

    public static Bitmap rotateImage(byte[] bArr, boolean z, boolean z2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        dumpHeapStats("rotateImage - preDecode");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        dumpHeapStats("rotateImage - postDecode");
        return rotateBitmap(decodeByteArray, z, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap rotateBitmap(android.graphics.Bitmap r13, boolean r14, boolean r15) {
        /*
            java.lang.String r0 = "Error rotating bitmap"
            java.lang.String r1 = TAG
            java.lang.String r2 = "About to scale bitmap. Source information before scaling: "
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "... size -> "
            r2.append(r3)
            int r4 = r13.getRowBytes()
            int r5 = r13.getHeight()
            int r4 = r4 * r5
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "... height -> "
            r2.append(r4)
            int r5 = r13.getHeight()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "... width -> "
            r2.append(r5)
            int r6 = r13.getWidth()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)
            if (r15 == 0) goto L_0x0063
            r15 = 1
            android.graphics.Bitmap r13 = createScaledBitmap(r13, r15)
        L_0x0063:
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            if (r14 == 0) goto L_0x006d
            r14 = 1119092736(0x42b40000, float:90.0)
            goto L_0x006f
        L_0x006d:
            r14 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x006f:
            r11.postRotate(r14)
            java.lang.String r14 = "rotateImage - preRotate"
            dumpHeapStats(r14)
            java.lang.String r14 = TAG
            java.lang.String r15 = "About to rotate bitmap. Source information: "
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r14, (java.lang.String) r15)
            java.lang.String r14 = TAG
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r3)
            int r1 = r13.getRowBytes()
            int r2 = r13.getHeight()
            int r1 = r1 * r2
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r14, (java.lang.String) r15)
            java.lang.String r14 = TAG
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r4)
            int r1 = r13.getHeight()
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r14, (java.lang.String) r15)
            java.lang.String r14 = TAG
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r5)
            int r1 = r13.getWidth()
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r14, (java.lang.String) r15)
            r7 = 0
            r8 = 0
            r14 = 0
            int r9 = r13.getWidth()     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            int r10 = r13.getHeight()     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            r12 = 0
            r6 = r13
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createBitmap(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            java.lang.String r15 = TAG     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            java.lang.String r2 = "... rotated bitmap size -> "
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            int r2 = r14.getRowBytes()     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            int r3 = r14.getHeight()     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            int r2 = r2 * r3
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r15, (java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            r13.recycle()     // Catch:{ OutOfMemoryError -> 0x0106, Exception -> 0x00ff }
            return r14
        L_0x00ff:
            r15 = move-exception
            java.lang.String r1 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r15)
            goto L_0x010c
        L_0x0106:
            r15 = move-exception
            java.lang.String r1 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r15)
        L_0x010c:
            if (r14 == 0) goto L_0x0111
            r14.recycle()
        L_0x0111:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kui.uicontrols.ImageService.rotateBitmap(android.graphics.Bitmap, boolean, boolean):android.graphics.Bitmap");
    }

    /* renamed from: f */
    private static void m3780f(Bitmap bitmap) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RttiJsonExactionHelper.HEIGHT, bitmap.getHeight());
            jSONObject.put(RttiJsonExactionHelper.WIDTH, bitmap.getWidth());
            jSONObject.put("density", bitmap.getDensity());
            jSONObject.put("rowBytes", bitmap.getRowBytes());
            jSONObject.put("totalBytes", bitmap.getRowBytes() * bitmap.getHeight());
        } catch (Exception e) {
            C0767k.m1821e(TAG, "Error creating JSON for Bitmap", (Throwable) e);
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Bitmap -> ");
        sb.append(jSONObject.toString());
        C0767k.m1801b(str, sb.toString());
    }

    public static String dumpBitmapSize(Bitmap bitmap, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return "Unable to calculate size";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dumping bitmap data from ");
        sb2.append(str);
        sb2.append(": ");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Height -> ");
        sb3.append(bitmap.getHeight());
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(", Width -> ");
        sb4.append(bitmap.getWidth());
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(", Density -> ");
        sb5.append(bitmap.getDensity());
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(", Size -> ");
        sb6.append(bitmap.getRowBytes() * bitmap.getHeight());
        sb.append(sb6.toString());
        return sb.toString();
    }

    public static Bitmap loadBitmapFromFile(Activity activity, String str, int i) {
        return loadBitmapFromURI(activity, Uri.fromFile(new File(str)), i, -1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:23|24|25|26|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = TAG;
        r4 = new java.lang.StringBuilder();
        r4.append("OOM while loading a bitmap at scale ");
        r4.append(r8);
        com.kofax.mobile.sdk._internal.C0767k.m1820e(r1, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        return loadBitmapFromURI(r6, r7, r8 << 1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        com.kofax.mobile.sdk._internal.C0767k.m1821e(TAG, "Error closing input stream", (java.lang.Throwable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmapFromURI(android.app.Activity r6, android.net.Uri r7, int r8, long r9) {
        /*
            java.lang.String r0 = "Error closing input stream"
        L_0x0002:
            r1 = 0
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0075 }
            java.io.InputStream r2 = r2.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0075 }
            r3 = 1
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0044 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x0044 }
            r4.inPurgeable = r3     // Catch:{ OutOfMemoryError -> 0x0044 }
            if (r8 <= r3) goto L_0x0017
            r4.inSampleSize = r8     // Catch:{ OutOfMemoryError -> 0x0044 }
        L_0x0017:
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r2, r1, r4)     // Catch:{ OutOfMemoryError -> 0x0044 }
            r2.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x0025
        L_0x001f:
            r2 = move-exception
            java.lang.String r3 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r3, (java.lang.String) r0, (java.lang.Throwable) r2)
        L_0x0025:
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0041
            int r2 = r1.getRowBytes()
            int r3 = r1.getHeight()
            int r2 = r2 * r3
            long r2 = (long) r2
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0041
            if (r1 == 0) goto L_0x003e
            r1.recycle()
        L_0x003e:
            int r8 = r8 << 1
            goto L_0x0002
        L_0x0041:
            return r1
        L_0x0042:
            r6 = move-exception
            goto L_0x006a
        L_0x0044:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r4.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = "OOM while loading a bitmap at scale "
            r4.append(r5)     // Catch:{ all -> 0x0042 }
            r4.append(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0042 }
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r1, (java.lang.String) r4)     // Catch:{ all -> 0x0042 }
            int r8 = r8 << r3
            android.graphics.Bitmap r6 = loadBitmapFromURI(r6, r7, r8, r9)     // Catch:{ all -> 0x0042 }
            r2.close()     // Catch:{ Exception -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            r7 = move-exception
            java.lang.String r8 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r8, (java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x0069:
            return r6
        L_0x006a:
            r2.close()     // Catch:{ Exception -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r7 = move-exception
            java.lang.String r8 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r8, (java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x0074:
            throw r6
        L_0x0075:
            r6 = move-exception
            java.lang.String r7 = TAG
            java.lang.String r8 = "Error loading file"
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r7, (java.lang.String) r8, (java.lang.Throwable) r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kui.uicontrols.ImageService.loadBitmapFromURI(android.app.Activity, android.net.Uri, int, long):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyImageToExternalStorage(java.io.File r10) throws java.io.IOException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = r10.getName()
            r0.append(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            r0 = 0
            r1.createNewFile()     // Catch:{ IOException -> 0x0075, all -> 0x0071 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0075, all -> 0x0071 }
            r2.<init>(r10)     // Catch:{ IOException -> 0x0075, all -> 0x0071 }
            java.nio.channels.FileChannel r10 = r2.getChannel()     // Catch:{ IOException -> 0x0075, all -> 0x0071 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            r4 = 0
            long r6 = r10.size()     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            r3 = r10
            r8 = r0
            r3.transferTo(r4, r6, r8)     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            java.lang.String r2 = TAG     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            r3.<init>()     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            java.lang.String r4 = "copyImageToExternalStorage(), successfully moved image to external storage Path: "
            r3.append(r4)     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            r3.append(r1)     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            if (r10 == 0) goto L_0x0061
            r10.close()
        L_0x0061:
            if (r0 == 0) goto L_0x0085
            r0.close()
            return
        L_0x0067:
            r1 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L_0x0087
        L_0x006c:
            r1 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L_0x0078
        L_0x0071:
            r10 = move-exception
            r1 = r10
            r10 = r0
            goto L_0x0087
        L_0x0075:
            r10 = move-exception
            r1 = r10
            r10 = r0
        L_0x0078:
            r1.printStackTrace()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0080
            r0.close()
        L_0x0080:
            if (r10 == 0) goto L_0x0085
            r10.close()
        L_0x0085:
            return
        L_0x0086:
            r1 = move-exception
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            r0.close()
        L_0x008c:
            if (r10 == 0) goto L_0x0091
            r10.close()
        L_0x0091:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kui.uicontrols.ImageService.copyImageToExternalStorage(java.io.File):void");
    }
}
