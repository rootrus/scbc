package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C0775i;
import com.kofax.mobile.sdk._internal.view.C0776j;
import com.kofax.mobile.sdk._internal.view.IMessageListener;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.l */
public class C0751l extends View implements C0772e {

    /* renamed from: VG */
    private static final int f1763VG = 16;

    /* renamed from: VH */
    private static final int f1764VH = 500;

    /* renamed from: VI */
    private static final long f1765VI = 400;

    /* renamed from: VJ */
    private static final long f1766VJ = 300;

    /* renamed from: VK */
    private Matrix f1767VK = new Matrix();

    /* renamed from: VL */
    private RectF f1768VL = new RectF();

    /* renamed from: VM */
    private RectF f1769VM = new RectF();

    /* renamed from: VN */
    private C0752a f1770VN;

    /* renamed from: VO */
    private C0752a f1771VO;

    /* renamed from: VP */
    private final CaptureMessage f1772VP = new CaptureMessage();
    @HmlPinActivity

    /* renamed from: VQ */
    C0775i f1773VQ;
    @HmlPinActivity

    /* renamed from: VR */
    C0517g f1774VR;
    @HmlPinActivity

    /* renamed from: VS */
    C0776j f1775VS;
    @HmlPinActivity

    /* renamed from: Vu */
    C0769a f1776Vu;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo11876c(float f, float f2) {
        float f3 = f2 / 3.0f;
        if (f < BitmapDescriptorFactory.HUE_RED || f > f2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f < f3) {
            return ((f * 0.9f) / f3) + 0.2f;
        }
        float f4 = 2.0f * f3;
        return f < f4 ? 1.1f - (((f - f3) * 0.2f) / f3) : (((f - f4) * 0.1f) / f3) + 0.9f;
    }

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C0751l(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo11873a(CaptureMessage captureMessage, IMessageListener iMessageListener) {
        mo11875a(captureMessage, iMessageListener, f1764VH, false);
    }

    /* renamed from: a */
    public void mo11874a(CaptureMessage captureMessage, IMessageListener iMessageListener, int i) {
        mo11875a(captureMessage, iMessageListener, i, false);
    }

    /* renamed from: a */
    public void mo11875a(CaptureMessage captureMessage, IMessageListener iMessageListener, int i, boolean z) {
        if (captureMessage != null) {
            this.f1774VR.mo11322M(captureMessage.getMessage());
            C0752a aVar = new C0752a(captureMessage, iMessageListener);
            this.f1771VO = aVar;
            aVar.mo11888q(i);
            this.f1771VO.f1782VY = z;
            return;
        }
        this.f1771VO = null;
    }

    public void clear() {
        recycle();
        invalidate();
    }

    public boolean isMessageDisplayed() {
        return this.f1770VN != null;
    }

    public void recycle() {
        C0752a aVar = this.f1770VN;
        if (aVar != null) {
            aVar.recycle();
            this.f1770VN = null;
        }
        C0752a aVar2 = this.f1771VO;
        if (aVar2 != null) {
            aVar2.recycle();
            this.f1771VO = null;
        }
    }

    /* renamed from: rL */
    private void m1716rL() {
        C0752a aVar = this.f1770VN;
        if (aVar == null) {
            C0752a aVar2 = this.f1771VO;
            this.f1770VN = aVar2;
            if (aVar2 != null) {
                aVar2.setActive(true);
                this.f1770VN.onStart();
            }
        } else if (aVar.isActive() && ((long) this.f1770VN.mo11889rN()) < ((long) this.f1770VN.mo11890rO()) + f1765VI) {
        } else {
            if (!this.f1770VN.isActive()) {
                C0752a aVar3 = this.f1771VO;
                if ((aVar3 != null && !aVar3.f1777VT.equals(this.f1770VN.f1777VT)) || this.f1770VN.f1782VY || ((long) this.f1770VN.mo11889rN()) > f1766VJ) {
                    this.f1770VN.recycle();
                    this.f1770VN.onStop();
                    this.f1770VN = null;
                    return;
                }
                return;
            }
            C0752a aVar4 = this.f1771VO;
            if (aVar4 == null || !aVar4.f1777VT.equals(this.f1770VN.f1777VT) || this.f1770VN.f1782VY || !this.f1770VN.f1777VT.getVisibility() || this.f1770VN.f1777VT.equals(this.f1772VP)) {
                this.f1770VN.setActive(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1773VQ.mo11929a(this, 16);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1773VQ.stop();
        recycle();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 8) {
            this.f1773VQ.stop();
        } else if (i == 0) {
            this.f1773VQ.mo11929a(this, 16);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1775VS.mo11928l(getContext());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m1716rL();
        C0752a aVar = this.f1770VN;
        if (aVar != null && aVar.f1777VT.getVisibility()) {
            Bitmap bitmap = this.f1770VN.getBitmap();
            if (!bitmap.isRecycled()) {
                Matrix a = mo11872a(this.f1770VN, bitmap.getWidth(), bitmap.getHeight());
                this.f1775VS.mo11925a(a, bitmap.getWidth(), bitmap.getHeight(), this.f1770VN.f1777VT.getOrientation());
                this.f1775VS.mo11926a(a, this.f1776Vu.mo11768rE(), this.f1770VN.f1777VT, bitmap.getWidth(), bitmap.getHeight(), this.f1770VN.f1777VT.getPosition());
                canvas.drawBitmap(bitmap, a, (Paint) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Matrix mo11872a(C0752a aVar, int i, int i2) {
        this.f1767VK.reset();
        float f = aVar.isActive() ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        if (aVar.isActive() && ((long) aVar.mo11889rN()) < f1765VI) {
            f = mo11876c((float) aVar.mo11889rN(), 400.0f);
        } else if (!aVar.isActive() && ((long) aVar.mo11889rN()) < f1766VJ) {
            f = mo11876c((float) (f1766VJ - ((long) aVar.mo11889rN())), 300.0f);
        }
        this.f1768VL.right = (float) i;
        this.f1768VL.bottom = (float) i2;
        float f2 = (1.0f - f) / 2.0f;
        this.f1769VM.left = this.f1768VL.width() * f2;
        this.f1769VM.top = f2 * this.f1768VL.height();
        RectF rectF = this.f1769VM;
        rectF.right = rectF.left + (this.f1768VL.width() * f);
        RectF rectF2 = this.f1769VM;
        rectF2.bottom = rectF2.top + (this.f1768VL.height() * f);
        this.f1767VK.setRectToRect(this.f1768VL, this.f1769VM, Matrix.ScaleToFit.CENTER);
        return this.f1767VK;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.view.l$a */
    protected class C0752a implements IMessageListener {
        /* access modifiers changed from: private */

        /* renamed from: VT */
        public final CaptureMessage f1777VT;

        /* renamed from: VU */
        public Bitmap[] f1778VU;

        /* renamed from: VV */
        private final IMessageListener f1779VV;

        /* renamed from: VW */
        private long f1780VW = -1;

        /* renamed from: VX */
        private boolean f1781VX = false;

        /* renamed from: VY */
        public boolean f1782VY = false;

        /* renamed from: VZ */
        private int f1783VZ = 0;

        C0752a(CaptureMessage captureMessage, IMessageListener iMessageListener) {
            this.f1777VT = captureMessage;
            this.f1779VV = iMessageListener;
        }

        /* renamed from: rM */
        private Bitmap[] m1723rM() {
            if (this.f1778VU == null) {
                if (this.f1777VT.getMessageIcons() == null || this.f1777VT.getMessageIcons().length <= 0) {
                    Bitmap[] bitmapArr = new Bitmap[1];
                    this.f1778VU = bitmapArr;
                    bitmapArr[0] = new C0750k(C0751l.this.getContext(), this.f1777VT, (Bitmap) null).getViewBitmap();
                } else {
                    this.f1778VU = new Bitmap[this.f1777VT.getMessageIcons().length];
                    for (int i = 0; i < this.f1777VT.getMessageIcons().length; i++) {
                        Bitmap[] bitmapArr2 = this.f1778VU;
                        Context context = C0751l.this.getContext();
                        CaptureMessage captureMessage = this.f1777VT;
                        bitmapArr2[i] = new C0750k(context, captureMessage, captureMessage.getMessageIcons()[i]).getViewBitmap();
                    }
                }
            }
            return this.f1778VU;
        }

        public Bitmap getBitmap() {
            Bitmap[] rM = m1723rM();
            if (rM.length > 0) {
                return rM[(mo11889rN() / C0751l.f1764VH) % rM.length];
            }
            throw new IllegalStateException();
        }

        /* renamed from: rN */
        public int mo11889rN() {
            return (int) (System.currentTimeMillis() - this.f1780VW);
        }

        public boolean isActive() {
            return this.f1781VX;
        }

        public void setActive(boolean z) {
            this.f1780VW = System.currentTimeMillis();
            this.f1781VX = z;
        }

        public void onStart() {
            IMessageListener iMessageListener = this.f1779VV;
            if (iMessageListener != null) {
                iMessageListener.onStart();
            }
        }

        public void onStop() {
            IMessageListener iMessageListener = this.f1779VV;
            if (iMessageListener != null) {
                iMessageListener.onStop();
            }
        }

        public void recycle() {
            Bitmap[] bitmapArr = this.f1778VU;
            if (bitmapArr != null) {
                for (Bitmap bitmap : bitmapArr) {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
            }
        }

        /* renamed from: q */
        public void mo11888q(int i) {
            this.f1783VZ = i;
        }

        /* renamed from: rO */
        public int mo11890rO() {
            return this.f1783VZ;
        }
    }
}
