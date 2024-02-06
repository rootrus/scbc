package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.kofax.mobile.sdk._internal.view.C0779p;
import com.kofax.mobile.sdk._internal.view.C8235h;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.t */
public class C8226t extends View implements C8235h {

    /* renamed from: WX */
    private static final int f4339WX = 5;

    /* renamed from: Dw */
    private final Object f4340Dw = new Object();

    /* renamed from: Go */
    private Rect f4341Go;

    /* renamed from: WY */
    private int f4342WY;

    /* renamed from: WZ */
    private int f4343WZ = -65536;

    /* renamed from: Xa */
    Paint f4344Xa = new Paint();

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C8226t(Context context) {
        super(context);
        this.f4342WY = C0779p.m1848a(context, 5.0f);
        m4523rZ();
    }

    public void setFaceRect(Rect rect) {
        this.f4341Go = rect;
        invalidate();
    }

    public void setFaceRectColor(int i) {
        this.f4343WZ = i;
        this.f4344Xa.setColor(i);
        postInvalidate();
    }

    public void setFaceRectThickness(int i) {
        this.f4342WY = i;
        this.f4344Xa.setStrokeWidth((float) i);
        postInvalidate();
    }

    public int getFaceRectColor() {
        return this.f4343WZ;
    }

    public int getFaceRectThickness() {
        return this.f4342WY;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        synchronized (this.f4340Dw) {
            if (this.f4341Go == null || this.f4341Go.isEmpty()) {
                canvas.drawColor(0);
            } else {
                canvas.drawRect(this.f4341Go, this.f4344Xa);
            }
        }
    }

    /* renamed from: rZ */
    private void m4523rZ() {
        this.f4344Xa.setColor(this.f4343WZ);
        this.f4344Xa.setStyle(Paint.Style.STROKE);
        this.f4344Xa.setStrokeWidth((float) this.f4342WY);
    }
}
