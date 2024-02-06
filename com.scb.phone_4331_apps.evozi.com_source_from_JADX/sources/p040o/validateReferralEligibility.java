package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: o.validateReferralEligibility */
public final class validateReferralEligibility extends ImageSpan {
    private int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private WeakReference<Drawable> read;

    public validateReferralEligibility(Drawable drawable) {
        this(drawable, 0);
    }

    public validateReferralEligibility(Drawable drawable, int i) {
        super(drawable);
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.read = new WeakReference<>(drawable);
        this.IconCompatParcelizer = i;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable write = write();
        if (write == null) {
            return 0;
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        Rect bounds = write.getBounds();
        if (fontMetricsInt != null) {
            if (bounds.bottom - (fontMetricsInt2.descent - fontMetricsInt2.ascent) >= 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bounds.bottom - (fontMetricsInt2.descent - fontMetricsInt2.ascent);
            }
            fontMetricsInt.descent = (this.MediaBrowserCompat$CustomActionResultReceiver / 2) + fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.descent;
            fontMetricsInt.ascent = fontMetricsInt2.descent - bounds.bottom;
            fontMetricsInt.top = fontMetricsInt2.ascent;
        }
        return bounds.right + this.IconCompatParcelizer;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable write = write();
        canvas.save();
        int intrinsicHeight = write.getIntrinsicHeight();
        int height = canvas.getHeight();
        int i6 = paint.getFontMetricsInt().ascent;
        int i7 = paint.getFontMetricsInt().descent;
        if (intrinsicHeight > height) {
            write.setBounds(0, 0, (int) (((float) write.getIntrinsicWidth()) * (((float) height) / ((float) intrinsicHeight))), height);
            intrinsicHeight = height;
        }
        canvas.translate(f, (float) ((i5 - write.getBounds().bottom) + (((intrinsicHeight - i7) + i6) / 2)));
        write.draw(canvas);
        canvas.restore();
    }

    private Drawable write() {
        WeakReference<Drawable> weakReference = this.read;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.read = new WeakReference<>(drawable2);
        return drawable2;
    }
}
