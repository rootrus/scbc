package p040o;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: o.onDoneClicked */
public final class onDoneClicked extends MetricAffectingSpan {
    private final Typeface IconCompatParcelizer;

    public onDoneClicked(Typeface typeface) {
        this.IconCompatParcelizer = typeface;
    }

    public final void updateMeasureState(TextPaint textPaint) {
        read(textPaint);
    }

    public final void updateDrawState(TextPaint textPaint) {
        read(textPaint);
    }

    private void read(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int style = (typeface != null ? typeface.getStyle() : 0) & (~this.IconCompatParcelizer.getStyle());
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.IconCompatParcelizer);
    }
}
