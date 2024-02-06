package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.kui.uicontrols.data.GuidingLine;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.v */
public class C8228v extends View {

    /* renamed from: Xb */
    private GuidingLine f4346Xb = GuidingLine.OFF;

    /* renamed from: Xc */
    private Paint f4347Xc;

    @HmlPinActivity
    public C8228v(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f4347Xc = paint;
        paint.setColor(-65536);
        this.f4347Xc.setStrokeWidth(3.0f);
        setWillNotDraw(false);
    }

    public void setGuidingLine(GuidingLine guidingLine) {
        this.f4346Xb = guidingLine;
        invalidate();
    }

    public GuidingLine getGuidingLine() {
        return this.f4346Xb;
    }

    public void onDraw(Canvas canvas) {
        if (this.f4346Xb != GuidingLine.OFF) {
            super.dispatchDraw(canvas);
            int max = Math.max(canvas.getWidth(), canvas.getHeight());
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            if (this.f4346Xb == GuidingLine.LANDSCAPE) {
                if (canvas.getWidth() == max) {
                    float f = (float) (min / 2);
                    canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f, (float) max, f, this.f4347Xc);
                    return;
                }
                float f2 = (float) (min / 2);
                canvas.drawLine(f2, BitmapDescriptorFactory.HUE_RED, f2, (float) max, this.f4347Xc);
            } else if (this.f4346Xb != GuidingLine.PORTRAIT) {
            } else {
                if (canvas.getHeight() == max) {
                    float f3 = (float) (max / 2);
                    canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f3, (float) min, f3, this.f4347Xc);
                    return;
                }
                float f4 = (float) (max / 2);
                canvas.drawLine(f4, BitmapDescriptorFactory.HUE_RED, f4, (float) min, this.f4347Xc);
            }
        }
    }
}
