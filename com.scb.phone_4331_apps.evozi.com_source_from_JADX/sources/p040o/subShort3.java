package p040o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.subShort3 */
public abstract class subShort3 {
    private static Rect IconCompatParcelizer = new Rect();
    private static Rect MediaBrowserCompat$CustomActionResultReceiver = new Rect();
    private static Rect MediaBrowserCompat$ItemReceiver = new Rect();
    private static Paint.FontMetrics MediaBrowserCompat$SearchResultReceiver = new Paint.FontMetrics();
    private static Paint.FontMetrics MediaDescriptionCompat = new Paint.FontMetrics();
    private static DisplayMetrics RatingCompat;
    public static final float read = Float.intBitsToFloat(1);
    private static addU16 write = new addObj(1);

    public static float IconCompatParcelizer(float f) {
        while (f < BitmapDescriptorFactory.HUE_RED) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    static {
        new Rect();
    }

    public static void IconCompatParcelizer(Context context) {
        if (context == null) {
            ViewConfiguration.getMinimumFlingVelocity();
            ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledMinimumFlingVelocity();
        viewConfiguration.getScaledMaximumFlingVelocity();
        RatingCompat = context.getResources().getDisplayMetrics();
    }

    public static float read(float f) {
        DisplayMetrics displayMetrics = RatingCompat;
        if (displayMetrics != null) {
            return f * displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f;
    }

    public static int read(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static int MediaBrowserCompat$ItemReceiver(Paint paint, String str) {
        Rect rect = MediaBrowserCompat$ItemReceiver;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float write(Paint paint) {
        Paint.FontMetrics fontMetrics = MediaDescriptionCompat;
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float MediaBrowserCompat$CustomActionResultReceiver(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float read(Paint paint) {
        Paint.FontMetrics fontMetrics = MediaDescriptionCompat;
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static float MediaBrowserCompat$ItemReceiver(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static Float2 IconCompatParcelizer(Paint paint, String str) {
        Float2 MediaBrowserCompat$CustomActionResultReceiver2 = Float2.MediaBrowserCompat$CustomActionResultReceiver(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Rect rect = IconCompatParcelizer;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        MediaBrowserCompat$CustomActionResultReceiver2.write = (float) rect.width();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = (float) rect.height();
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public static addU16 MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    public static float read(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == 0.0d) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float pow = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(d < 0.0d ? -d : d)))))));
        return ((float) Math.round(d * ((double) pow))) / pow;
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(float f) {
        float read2 = read((double) f);
        if (Float.isInfinite(read2)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10((double) read2))) + 2;
    }

    public static double MediaBrowserCompat$CustomActionResultReceiver(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1 : -1));
    }

    public static void IconCompatParcelizer(subShort4 subshort4, float f, float f2, subShort4 subshort42) {
        double d = (double) f;
        double d2 = (double) f2;
        subshort42.MediaBrowserCompat$ItemReceiver = (float) (((double) subshort4.MediaBrowserCompat$ItemReceiver) + (Math.cos(Math.toRadians(d2)) * d));
        subshort42.MediaBrowserCompat$CustomActionResultReceiver = (float) (((double) subshort4.MediaBrowserCompat$CustomActionResultReceiver) + (d * Math.sin(Math.toRadians(d2))));
    }

    public static void IconCompatParcelizer(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidateDelayed(10);
        }
    }

    public static void IconCompatParcelizer(Canvas canvas, String str, float f, float f2, Paint paint, subShort4 subshort4, float f3) {
        float fontMetrics = paint.getFontMetrics(MediaBrowserCompat$SearchResultReceiver);
        paint.getTextBounds(str, 0, str.length(), MediaBrowserCompat$CustomActionResultReceiver);
        float f4 = BitmapDescriptorFactory.HUE_RED - ((float) MediaBrowserCompat$CustomActionResultReceiver.left);
        float f5 = (-MediaBrowserCompat$SearchResultReceiver.ascent) + BitmapDescriptorFactory.HUE_RED;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            float width = (float) MediaBrowserCompat$CustomActionResultReceiver.width();
            if (!(subshort4.MediaBrowserCompat$ItemReceiver == 0.5f && subshort4.MediaBrowserCompat$CustomActionResultReceiver == 0.5f)) {
                Float2 MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver((float) MediaBrowserCompat$CustomActionResultReceiver.width(), fontMetrics, 0.017453292f * f3);
                f -= MediaBrowserCompat$CustomActionResultReceiver2.write * (subshort4.MediaBrowserCompat$ItemReceiver - 0.5f);
                f2 -= MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver * (subshort4.MediaBrowserCompat$CustomActionResultReceiver - 0.5f);
                Float2.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, f4 - (width * 0.5f), f5 - (fontMetrics * 0.5f), paint);
            canvas.restore();
        } else {
            if (!(subshort4.MediaBrowserCompat$ItemReceiver == BitmapDescriptorFactory.HUE_RED && subshort4.MediaBrowserCompat$CustomActionResultReceiver == BitmapDescriptorFactory.HUE_RED)) {
                f4 -= ((float) MediaBrowserCompat$CustomActionResultReceiver.width()) * subshort4.MediaBrowserCompat$ItemReceiver;
                f5 -= fontMetrics * subshort4.MediaBrowserCompat$CustomActionResultReceiver;
            }
            canvas.drawText(str, f4 + f, f5 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static Float2 read(float f, float f2, float f3) {
        return MediaBrowserCompat$CustomActionResultReceiver(f, f2, BitmapDescriptorFactory.HUE_RED);
    }

    private static Float2 MediaBrowserCompat$CustomActionResultReceiver(float f, float f2, float f3) {
        double d = (double) f3;
        return Float2.MediaBrowserCompat$CustomActionResultReceiver(Math.abs(((float) Math.cos(d)) * f) + Math.abs(((float) Math.sin(d)) * f2), Math.abs(f * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d))));
    }

    public static int read() {
        return Build.VERSION.SDK_INT;
    }
}
