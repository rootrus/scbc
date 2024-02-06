package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.kofax.kmc.kut.utilities.RectUtil;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0779p;
import com.kofax.mobile.sdk._internal.view.C8237m;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ak */
public class C8211ak extends View implements C8237m {

    /* renamed from: Wm */
    private static final int f4287Wm = 5;

    /* renamed from: Wn */
    private static final int f4288Wn = 8;

    /* renamed from: XM */
    private static final int f4289XM = 4;

    /* renamed from: Dw */
    private final Object f4290Dw = new Object();

    /* renamed from: FL */
    private int f4291FL;

    /* renamed from: FM */
    private int f4292FM;

    /* renamed from: I */
    private final Rect f4293I = new Rect();
    @HmlPinActivity

    /* renamed from: Vu */
    C0769a f4294Vu = null;

    /* renamed from: WA */
    private int f4295WA;

    /* renamed from: WG */
    private boolean f4296WG = false;

    /* renamed from: WH */
    private Path f4297WH = new Path();

    /* renamed from: WI */
    private RectF f4298WI;

    /* renamed from: WL */
    private Paint f4299WL = new Paint(1);

    /* renamed from: WM */
    private int f4300WM = -65536;

    /* renamed from: Wv */
    private final int f4301Wv;

    /* renamed from: Ww */
    private final int f4302Ww;

    /* renamed from: Wx */
    private int f4303Wx;

    /* renamed from: Wy */
    private int f4304Wy;

    /* renamed from: Wz */
    private int f4305Wz;

    /* renamed from: XN */
    private int f4306XN;

    /* renamed from: XO */
    private int f4307XO;

    /* renamed from: XP */
    private int f4308XP;

    /* renamed from: XQ */
    private int f4309XQ;

    /* renamed from: XR */
    private Paint f4310XR = new Paint();

    /* renamed from: XS */
    private Paint f4311XS = new Paint();

    /* renamed from: cI */
    private double f4312cI = 0.0d;

    /* renamed from: cJ */
    private double f4313cJ = 5.0d;

    /* renamed from: nS */
    private Point f4314nS = new Point();

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C8211ak(Context context) {
        super(context);
        this.f4301Wv = C0779p.m1848a(context, 8.0f);
        this.f4302Ww = C0779p.m1848a(context, 4.0f);
        m4496sh();
        m4494rT();
        m4497si();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setWillNotDraw(false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setPaddingPercent(double d) {
        this.f4313cJ = d;
        m4495rU();
    }

    public double getPaddingPercent() {
        return this.f4313cJ;
    }

    public void setOverlayAspectRatio(double d) {
        this.f4312cI = d;
        m4495rU();
    }

    public void setCenter(Point point) {
        if (point == null) {
            this.f4296WG = false;
        } else {
            this.f4296WG = true;
            this.f4314nS.set(point.x, point.y);
        }
        m4495rU();
    }

    /* renamed from: rR */
    private Point m4493rR() {
        if (this.f4296WG) {
            return this.f4314nS;
        }
        this.f4314nS.set((int) Math.round(((double) this.f4291FL) / 2.0d), (int) Math.round(((double) this.f4292FM) / 2.0d));
        return this.f4314nS;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void clear() {
        invalidate();
    }

    public void setOuterOverlayFrameColor(int i) {
        this.f4311XS.setColor(i);
        postInvalidate();
    }

    public int getOuterOverlayFrameColor() {
        return this.f4311XS.getColor();
    }

    public void setGuidanceFrameColor(int i) {
        this.f4300WM = i;
        this.f4299WL.setColor(i);
        postInvalidate();
    }

    public int getGuidanceFrameColor() {
        return this.f4300WM;
    }

    /* renamed from: sh */
    private void m4496sh() {
        this.f4310XR.setStyle(Paint.Style.FILL);
        this.f4310XR.setColor(-1);
        this.f4310XR.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: rT */
    private void m4494rT() {
        this.f4299WL.setStyle(Paint.Style.STROKE);
        this.f4299WL.setColor(this.f4300WM);
        this.f4299WL.setStrokeWidth((float) this.f4301Wv);
    }

    /* renamed from: si */
    private void m4497si() {
        this.f4311XS.setStyle(Paint.Style.FILL);
        this.f4311XS.setColor(Color.argb(255, 255, 255, 255));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f4291FL = i;
        this.f4292FM = i2;
        m4495rU();
    }

    /* renamed from: rU */
    private void m4495rU() {
        if (this.f4291FL > 0 && this.f4292FM > 0) {
            m4498sj();
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        synchronized (this.f4290Dw) {
            canvas.save();
            canvas.drawPaint(this.f4311XS);
            m4492r(canvas);
            m4491o(canvas);
            canvas.restore();
        }
    }

    /* renamed from: r */
    private void m4492r(Canvas canvas) {
        canvas.drawOval(new RectF(this.f4293I), this.f4310XR);
    }

    /* renamed from: sj */
    private void m4498sj() {
        Rect rect = new Rect(0, 0, this.f4291FL, this.f4292FM);
        Point rR = m4493rR();
        if (RectUtil.containsPoint(rR, rect, this.f4313cJ)) {
            this.f4293I.set(RectUtil.createTargetRect(this.f4313cJ, this.f4312cI, this.f4314nS, rect.width(), rect.height()));
        } else {
            this.f4293I.set(rR.x, rR.y, rR.x, rR.y);
        }
        this.f4306XN = this.f4293I.left;
        this.f4307XO = this.f4293I.top;
        this.f4308XP = this.f4293I.right;
        int i = this.f4293I.bottom;
        this.f4309XQ = i;
        int i2 = this.f4306XN;
        int i3 = this.f4302Ww;
        this.f4303Wx = i2 - i3;
        this.f4304Wy = this.f4307XO - i3;
        this.f4305Wz = this.f4308XP + i3;
        this.f4295WA = i + i3;
        this.f4298WI = new RectF((float) this.f4303Wx, (float) this.f4304Wy, (float) this.f4305Wz, (float) this.f4295WA);
        this.f4294Vu.mo11767f(this.f4293I);
    }

    /* renamed from: o */
    private void m4491o(Canvas canvas) {
        this.f4297WH.reset();
        this.f4297WH.addOval(this.f4298WI, Path.Direction.CW);
        canvas.drawPath(this.f4297WH, getGuidancePaint());
        this.f4297WH.reset();
    }

    private Paint getGuidancePaint() {
        return this.f4299WL;
    }
}
