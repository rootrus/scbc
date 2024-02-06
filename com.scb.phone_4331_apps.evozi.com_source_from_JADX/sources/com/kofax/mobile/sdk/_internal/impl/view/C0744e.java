package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0778o;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.e */
public class C0744e extends View implements C0770c {
    @HmlPinActivity

    /* renamed from: Vu */
    C0769a f1744Vu;

    /* renamed from: Vv */
    private final C0778o f1745Vv;

    /* renamed from: Vw */
    private Rect f1746Vw;

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C0744e(Context context, C0778o oVar) {
        super(context);
        this.f1745Vv = oVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1745Vv.mo11845sm() != null) {
            this.f1745Vv.mo11843g(this.f1744Vu.mo11768rE());
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo11851a(CaptureMessage captureMessage) {
        if (captureMessage != this.f1745Vv.mo11845sm()) {
            this.f1745Vv.mo11840c(captureMessage);
            this.f1745Vv.mo11843g(this.f1744Vu.mo11768rE());
            invalidate();
        }
    }

    public void clear() {
        this.f1745Vv.mo11840c((CaptureMessage) null);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1745Vv.mo11842f(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Rect rE = this.f1744Vu.mo11768rE();
        this.f1746Vw = rE;
        if ((rE == null || rE.left != 0 || this.f1746Vw.right != 0 || this.f1746Vw.top != 0 || this.f1746Vw.bottom != 0) && this.f1745Vv.mo11845sm() != null) {
            this.f1745Vv.draw(canvas, this.f1746Vw);
        }
    }
}
