package p040o;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: o.LinearLayoutManager */
public final class LinearLayoutManager {
    private static final char[] MediaBrowserCompat$CustomActionResultReceiver = "0123456789abcdef".toCharArray();
    private static final char[] write = new char[64];

    public static int MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(boolean z, int i) {
        return (i * 31) + (z ? 1 : 0);
    }

    public static boolean write(int i, int i2) {
        if (!(i > 0 || i == Integer.MIN_VALUE)) {
            return false;
        }
        return i2 > 0 || i2 == Integer.MIN_VALUE;
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr) {
        String str;
        synchronized (write) {
            char[] cArr = write;
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i] & 255;
                int i2 = i << 1;
                char[] cArr2 = MediaBrowserCompat$CustomActionResultReceiver;
                cArr[i2] = cArr2[b >>> 4];
                cArr[i2 + 1] = cArr2[b & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static int IconCompatParcelizer(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        sb.append("[");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append("] ");
        sb.append(bitmap.getConfig());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: o.LinearLayoutManager$5 */
    static /* synthetic */ class C12275 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.LinearLayoutManager.C12275.<clinit>():void");
        }
    }

    public static boolean MediaBrowserCompat$ItemReceiver() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static <T> Queue<T> IconCompatParcelizer(int i) {
        return new ArrayDeque(i);
    }

    public static <T> List<T> write(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean IconCompatParcelizer(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof setIndex) {
            return ((setIndex) obj).read();
        }
        return obj.equals(obj2);
    }

    public static int IconCompatParcelizer(Object obj, int i) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void IconCompatParcelizer() {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static int IconCompatParcelizer(int i, int i2, Bitmap.Config config) {
        int i3 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = C12275.write[config.ordinal()];
        int i5 = 2;
        if (i4 == 1) {
            i5 = 1;
        } else if (!(i4 == 2 || i4 == 3)) {
            i5 = i4 == 4 ? 8 : 4;
        }
        return i3 * i5;
    }

    public static int write(float f) {
        return Float.floatToIntBits(f) + 527;
    }

    public static boolean write() {
        return !(Looper.myLooper() == Looper.getMainLooper());
    }
}
