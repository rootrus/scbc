package p040o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: o.DGBMV */
public final class DGBMV {
    private static final ExecutorService read = Executors.newCachedThreadPool();

    public static void read(boolean z, String str) {
    }

    DGBMV() {
    }

    public static void IconCompatParcelizer(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Bitmap IconCompatParcelizer(Drawable drawable, int i, int i2) {
        Rect rect = new Rect();
        drawable.copyBounds(rect);
        if (rect.isEmpty()) {
            rect.set(0, 0, Math.max(i, drawable.getIntrinsicWidth()), Math.max(i2, drawable.getIntrinsicHeight()));
            drawable.setBounds(rect);
        }
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static Future<Void> read(final Bitmap bitmap, final Bitmap.CompressFormat compressFormat, final int i, final File file) {
        return read.submit(new Runnable() {
            public final void run() {
                FileOutputStream fileOutputStream;
                try {
                    file.getParentFile().mkdirs();
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(compressFormat, i, fileOutputStream);
                        fileOutputStream.flush();
                        DGBMV.read(fileOutputStream);
                    } catch (Throwable unused) {
                        DGBMV.read(fileOutputStream);
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = null;
                    DGBMV.read(fileOutputStream);
                }
            }
        }, (Object) null);
    }

    static /* synthetic */ void read(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception e) {
                Log.e("scissors.Utils", "Error attempting to close stream.", e);
            }
        }
    }
}
