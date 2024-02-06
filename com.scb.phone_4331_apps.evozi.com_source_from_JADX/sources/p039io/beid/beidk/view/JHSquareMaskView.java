package p039io.beid.beidk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import p040o.C7329x31a960dc;
import p040o.setLastBaselineToBottomHeight;

/* renamed from: io.beid.beidk.view.JHSquareMaskView */
public class JHSquareMaskView extends C9653b {
    public JHSquareMaskView(Context context) {
        super(context);
    }

    public JHSquareMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JHSquareMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void write(Canvas canvas) {
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) setLastBaselineToBottomHeight.write(getContext(), C7329x31a960dc.cameraframe);
        RectF rectF = new RectF(this.read - ((this.write / 2.0f) - ((float) getPaddingLeft())), this.IconCompatParcelizer - ((this.MediaBrowserCompat$ItemReceiver / 2.0f) - ((float) getPaddingTop())), this.read + ((this.write / 2.0f) - ((float) getPaddingRight())), this.IconCompatParcelizer + ((this.MediaBrowserCompat$ItemReceiver / 2.0f) - ((float) (getPaddingBottom() + 65))));
        Rect rect = new Rect();
        rectF.roundOut(rect);
        ninePatchDrawable.setBounds(rect);
        ninePatchDrawable.draw(canvas);
        Integer valueOf = Integer.valueOf(Math.round(((float) rect.height()) * 0.06006006f));
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setTextSize((float) valueOf.intValue());
        paint.setTextAlign(Paint.Align.CENTER);
        float paddingBottom = (this.IconCompatParcelizer + ((this.MediaBrowserCompat$ItemReceiver / 2.0f) - ((float) (getPaddingBottom() + 65)))) - ((float) valueOf.intValue());
        float width = (float) (canvas.getWidth() / 2);
        canvas.drawText("P<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<", width, paddingBottom - ((float) (valueOf.intValue() << 1)), paint);
        canvas.drawText("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<", width, paddingBottom, paint);
    }
}
