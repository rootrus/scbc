package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.mobile.sdk._internal.C0767k;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.h */
public class C0747h extends View {

    /* renamed from: P */
    private float f1751P;

    /* renamed from: Q */
    private Paint f1752Q;

    /* renamed from: VA */
    private int f1753VA;
    /* access modifiers changed from: private */

    /* renamed from: VB */
    public final Path f1754VB = new Path();
    /* access modifiers changed from: private */

    /* renamed from: Vy */
    public int f1755Vy;
    /* access modifiers changed from: private */

    /* renamed from: Vz */
    public int f1756Vz;

    public C0747h(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f1752Q = paint;
        paint.setStyle(Paint.Style.STROKE);
        setBorderColor(-256);
        setBorderThickness(6.0f);
    }

    public float getBorderThickness() {
        return this.f1751P;
    }

    public void setBorderThickness(float f) {
        if (f > 10.0f) {
            f = 10.0f;
        } else if (f > BitmapDescriptorFactory.HUE_RED && f < 3.0f) {
            f = 3.0f;
        }
        this.f1751P = f;
        this.f1752Q.setStrokeWidth(f);
    }

    public int getBorderColor() {
        return this.f1753VA;
    }

    public void setBorderColor(int i) {
        this.f1753VA = i;
        this.f1752Q.setColor(i);
    }

    public void setBoundsData(final BoundingTetragon boundingTetragon, final int i, final int i2) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                BoundingTetragon boundingTetragon = boundingTetragon;
                if (boundingTetragon != null) {
                    C0747h.this.m1715m(boundingTetragon);
                    int unused = C0747h.this.f1755Vy = i;
                    int unused2 = C0747h.this.f1756Vz = i2;
                } else {
                    C0747h.this.f1754VB.reset();
                }
                C0747h.this.invalidate();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m1715m(BoundingTetragon boundingTetragon) {
        float f = (float) boundingTetragon.getBottomLeft().x;
        float f2 = (float) boundingTetragon.getBottomLeft().y;
        float f3 = (float) boundingTetragon.getTopLeft().x;
        float f4 = (float) boundingTetragon.getTopLeft().y;
        float f5 = (float) boundingTetragon.getTopRight().x;
        float f6 = (float) boundingTetragon.getTopRight().y;
        float f7 = (float) boundingTetragon.getBottomRight().x;
        float f8 = (float) boundingTetragon.getBottomRight().y;
        StringBuilder sb = new StringBuilder();
        sb.append("BottomLeft:");
        sb.append(f);
        sb.append(",");
        sb.append(f2);
        sb.append(", getTopLeft: ");
        sb.append(f3);
        sb.append(",");
        sb.append(f4);
        sb.append("TopRight:");
        sb.append(f5);
        sb.append(",");
        sb.append(f6);
        sb.append(" , getBottomRight");
        sb.append(f7);
        sb.append(",");
        sb.append(f8);
        C0767k.m1807c("CapturePageBoundaryView", sb.toString());
        float f9 = (this.f1751P / 2.0f) - 2.0f;
        this.f1754VB.reset();
        this.f1754VB.moveTo(f - f9, f2 + f9);
        this.f1754VB.lineTo(f3 - f9, f4 - f9);
        this.f1754VB.lineTo(f5 + f9, f6 - f9);
        this.f1754VB.lineTo(f7 + f9, f8 + f9);
        this.f1754VB.close();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f1754VB.isEmpty()) {
            canvas.save();
            StringBuilder sb = new StringBuilder();
            sb.append("w = ");
            sb.append(getWidth());
            sb.append(", ");
            sb.append(this.f1755Vy);
            C0767k.m1807c("CapturePageBoundaryView", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("h = ");
            sb2.append(getHeight());
            sb2.append(", ");
            sb2.append(this.f1756Vz);
            C0767k.m1807c("CapturePageBoundaryView", sb2.toString());
            canvas.scale(((float) getWidth()) / ((float) this.f1755Vy), ((float) getHeight()) / ((float) this.f1756Vz));
            this.f1752Q.setColor(this.f1753VA);
            canvas.drawPath(this.f1754VB, this.f1752Q);
            canvas.restore();
        }
    }
}
