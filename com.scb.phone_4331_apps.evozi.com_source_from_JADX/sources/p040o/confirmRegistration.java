package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/* renamed from: o.confirmRegistration */
public final class confirmRegistration implements LineBackgroundSpan {
    private float IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final float read;

    public confirmRegistration() {
        this.read = 3.0f;
        this.IconCompatParcelizer = 25.0f;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
    }

    public confirmRegistration(float f, float f2, int i) {
        this.read = f;
        this.IconCompatParcelizer = f2;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int color = paint.getColor();
        int i9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i9 != 0) {
            paint.setColor(i9);
        }
        float f = (float) i5;
        float f2 = this.IconCompatParcelizer;
        float f3 = this.read;
        canvas.drawCircle(((float) (i + i2)) / 2.0f, f + f2 + f3, f3, paint);
        paint.setColor(color);
    }
}
