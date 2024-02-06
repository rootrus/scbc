package p039io.beid.beidk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import p040o.C7329x31a960dc;
import p040o.setLastBaselineToBottomHeight;

/* renamed from: io.beid.beidk.view.JHFaceMaskView */
public class JHFaceMaskView extends C9652a {
    public JHFaceMaskView(Context context) {
        super(context);
    }

    public JHFaceMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JHFaceMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void read(Canvas canvas) {
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) setLastBaselineToBottomHeight.write(getContext(), C7329x31a960dc.cameraframe);
        RectF rectF = new RectF((this.write - this.IconCompatParcelizer) - 10.0f, (this.MediaBrowserCompat$ItemReceiver - this.IconCompatParcelizer) - 10.0f, this.write + this.IconCompatParcelizer + 10.0f, this.MediaBrowserCompat$ItemReceiver + this.IconCompatParcelizer + 10.0f);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        ninePatchDrawable.setBounds(rect);
        ninePatchDrawable.draw(canvas);
    }
}
