package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.nIncTypeCreate */
public final class nIncTypeCreate extends GradientDrawable {
    public final RectF MediaBrowserCompat$CustomActionResultReceiver = new RectF();
    private int read;
    private final Paint write;

    public nIncTypeCreate() {
        Paint paint = new Paint(1);
        this.write = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.write.setColor(-1);
        this.write.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void IconCompatParcelizer(float f, float f2, float f3, float f4) {
        if (f != this.MediaBrowserCompat$CustomActionResultReceiver.left || f2 != this.MediaBrowserCompat$CustomActionResultReceiver.top || f3 != this.MediaBrowserCompat$CustomActionResultReceiver.right || f4 != this.MediaBrowserCompat$CustomActionResultReceiver.bottom) {
            this.MediaBrowserCompat$CustomActionResultReceiver.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ((View) callback).setLayerType(2, (Paint) null);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.read = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        } else {
            this.read = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.read);
        }
    }
}
