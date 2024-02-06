package p040o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.kui.uicontrols.Utility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.requestPermissionsFromFragment */
public final class requestPermissionsFromFragment {
    private static final Lock IconCompatParcelizer = (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", Utility.MOTO_G_MODEL, "XT1008", "XT1033", "XT1035", Utility.MOTO_G_1034, "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL) ? new ReentrantLock() : new read());
    private static final Paint MediaBrowserCompat$CustomActionResultReceiver = new Paint(6);

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static int MediaBrowserCompat$ItemReceiver(int i) {
        switch (i) {
            case 3:
            case 4:
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static {
        new Paint(7);
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Lock write() {
        return IconCompatParcelizer;
    }

    public static Bitmap MediaBrowserCompat$CustomActionResultReceiver(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth() * i2;
        int height = bitmap.getHeight() * i;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (width > height) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap IconCompatParcelizer2 = checkParameters_MembersInjector.IconCompatParcelizer(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        IconCompatParcelizer2.setHasAlpha(bitmap.hasAlpha());
        write(bitmap, IconCompatParcelizer2, matrix);
        return IconCompatParcelizer2;
    }

    public static Bitmap read(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap IconCompatParcelizer2 = checkParameters_MembersInjector.IconCompatParcelizer((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        IconCompatParcelizer2.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            Log.v("TransformationUtils", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            Log.v("TransformationUtils", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(IconCompatParcelizer2.getWidth());
            sb3.append("x");
            sb3.append(IconCompatParcelizer2.getHeight());
            Log.v("TransformationUtils", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            Log.v("TransformationUtils", sb4.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        write(bitmap, IconCompatParcelizer2, matrix);
        return IconCompatParcelizer2;
    }

    public static Bitmap MediaBrowserCompat$ItemReceiver(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return read(checkParameters_MembersInjector, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap MediaBrowserCompat$ItemReceiver(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap, int i) {
        if (!MediaBrowserCompat$CustomActionResultReceiver(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap IconCompatParcelizer2 = checkParameters_MembersInjector.IconCompatParcelizer(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        matrix.postTranslate(-rectF.left, -rectF.top);
        IconCompatParcelizer2.setHasAlpha(bitmap.hasAlpha());
        write(bitmap, IconCompatParcelizer2, matrix);
        return IconCompatParcelizer2;
    }

    private static void write(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        IconCompatParcelizer.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, MediaBrowserCompat$CustomActionResultReceiver);
            canvas.setBitmap((Bitmap) null);
        } finally {
            IconCompatParcelizer.unlock();
        }
    }

    /* renamed from: o.requestPermissionsFromFragment$read */
    static final class read implements Lock {
        public final void lock() {
        }

        public final void lockInterruptibly() throws InterruptedException {
        }

        public final boolean tryLock() {
            return true;
        }

        public final boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public final void unlock() {
        }

        read() {
        }

        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
    }
}
