package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.kut.utilities.RectUtil;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.impl.detection.data.EdgeGuidance;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0774g;
import com.kofax.mobile.sdk._internal.view.C0776j;
import com.kofax.mobile.sdk._internal.view.C0778o;
import com.kofax.mobile.sdk._internal.view.C0779p;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.q */
public class C0757q extends View implements C0774g {

    /* renamed from: Wm */
    private static final int f1803Wm = 5;

    /* renamed from: Wn */
    private static final int f1804Wn = 12;

    /* renamed from: Dw */
    private final Object f1805Dw = new Object();

    /* renamed from: FL */
    private int f1806FL;

    /* renamed from: FM */
    private int f1807FM;

    /* renamed from: Hy */
    private EdgeGuidance f1808Hy = null;
    @HmlPinActivity

    /* renamed from: VR */
    C0517g f1809VR;
    @HmlPinActivity

    /* renamed from: VS */
    C0776j f1810VS;
    @HmlPinActivity

    /* renamed from: Vu */
    C0769a f1811Vu = null;

    /* renamed from: Vv */
    private final C0778o f1812Vv;

    /* renamed from: WA */
    private int f1813WA;

    /* renamed from: WB */
    private final Rect f1814WB = new Rect();

    /* renamed from: WC */
    private final Rect f1815WC = new Rect();

    /* renamed from: WD */
    private final Rect f1816WD = new Rect();

    /* renamed from: WE */
    private final Rect f1817WE = new Rect();

    /* renamed from: WF */
    private boolean f1818WF;

    /* renamed from: WG */
    private boolean f1819WG = false;

    /* renamed from: WH */
    private Path f1820WH = new Path();

    /* renamed from: WI */
    private RectF f1821WI;

    /* renamed from: WJ */
    private Bitmap f1822WJ;

    /* renamed from: WK */
    private Paint f1823WK = new Paint();

    /* renamed from: WL */
    private Paint f1824WL = new Paint(1);

    /* renamed from: WM */
    private int f1825WM = -16711936;

    /* renamed from: WN */
    private Paint f1826WN = null;

    /* renamed from: WO */
    private Paint f1827WO = new Paint();

    /* renamed from: WP */
    private int f1828WP = 50;

    /* renamed from: WQ */
    private int f1829WQ = 3;

    /* renamed from: WR */
    private int f1830WR = 255;

    /* renamed from: WS */
    private int f1831WS = 50;

    /* renamed from: WT */
    private int f1832WT = 10;

    /* renamed from: WU */
    Rect f1833WU = new Rect();

    /* renamed from: WV */
    private boolean f1834WV = false;

    /* renamed from: Wo */
    private int f1835Wo;

    /* renamed from: Wp */
    private int f1836Wp;

    /* renamed from: Wq */
    private int f1837Wq;

    /* renamed from: Wr */
    private int f1838Wr;

    /* renamed from: Ws */
    private final Rect f1839Ws = new Rect();

    /* renamed from: Wt */
    private final Rect f1840Wt = new Rect();

    /* renamed from: Wu */
    private int f1841Wu;

    /* renamed from: Wv */
    private int f1842Wv;

    /* renamed from: Ww */
    private int f1843Ww;

    /* renamed from: Wx */
    private int f1844Wx;

    /* renamed from: Wy */
    private int f1845Wy;

    /* renamed from: Wz */
    private int f1846Wz;

    /* renamed from: cI */
    private double f1847cI = 0.0d;

    /* renamed from: cJ */
    private double f1848cJ = 5.0d;

    /* renamed from: nS */
    private Point f1849nS = new Point();

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C0757q(Context context, C0778o oVar) {
        super(context);
        this.f1812Vv = oVar;
        this.f1842Wv = C0779p.m1848a(context, 12.0f);
        m1755rS();
        m1756rT();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setWillNotDraw(false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1812Vv.mo11845sm() != null) {
            this.f1812Vv.mo11843g(this.f1833WU);
            invalidate();
        }
    }

    public void setPaddingPercent(double d) {
        this.f1848cJ = d;
        m1757rU();
    }

    public double getPaddingPercent() {
        return this.f1848cJ;
    }

    public void setOverlayAspectRatio(double d) {
        this.f1847cI = d;
        m1757rU();
    }

    public void setCenter(Point point) {
        if (point == null) {
            this.f1819WG = false;
        } else {
            this.f1819WG = true;
            this.f1849nS.set(point.x, point.y);
        }
        m1757rU();
    }

    /* renamed from: rR */
    private Point m1754rR() {
        if (this.f1819WG) {
            return this.f1849nS;
        }
        this.f1849nS.set((int) Math.round(((double) this.f1806FL) / 2.0d), (int) Math.round(((double) this.f1807FM) / 2.0d));
        return this.f1849nS;
    }

    /* renamed from: w */
    public void mo11917w(boolean z) {
        this.f1834WV = z;
        invalidate();
    }

    /* renamed from: a */
    public void mo11898a(Bitmap bitmap, CaptureMessage captureMessage) {
        CaptureMessage copy = (captureMessage == null || !captureMessage.getVisibility()) ? null : captureMessage.copy();
        m1738b(copy);
        m1736b(bitmap, copy);
        this.f1812Vv.mo11840c(copy);
        setInstructionMessageDisplayRect(this.f1812Vv.mo11845sm());
        this.f1812Vv.mo11843g(this.f1833WU);
        invalidate();
    }

    /* renamed from: b */
    private void m1736b(Bitmap bitmap, CaptureMessage captureMessage) {
        if (bitmap == null) {
            Bitmap bitmap2 = this.f1822WJ;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f1822WJ = null;
            return;
        }
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = this.f1818WF ? CaptureMessage.KUIMessageOrientation.PORTRAIT : CaptureMessage.KUIMessageOrientation.LANDSCAPE;
        if (captureMessage != null) {
            kUIMessageOrientation = captureMessage.getOrientation();
        }
        Matrix matrix = new Matrix();
        this.f1810VS.mo11925a(matrix, bitmap.getWidth(), bitmap.getHeight(), kUIMessageOrientation);
        this.f1822WJ = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.view.q$1 */
    static /* synthetic */ class C07581 {

        /* renamed from: WW */
        static final /* synthetic */ int[] f1850WW;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation[] r0 = com.kofax.mobile.sdk._internal.capture.CaptureMessage.KUIMessageOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1850WW = r0
                com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation r1 = com.kofax.mobile.sdk._internal.capture.CaptureMessage.KUIMessageOrientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1850WW     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation r1 = com.kofax.mobile.sdk._internal.capture.CaptureMessage.KUIMessageOrientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1850WW     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation r1 = com.kofax.mobile.sdk._internal.capture.CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1850WW     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation r1 = com.kofax.mobile.sdk._internal.capture.CaptureMessage.KUIMessageOrientation.REVERSELANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.view.C0757q.C07581.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m1738b(CaptureMessage captureMessage) {
        if (captureMessage != null && this.f1818WF) {
            int i = C07581.f1850WW[captureMessage.getOrientation().ordinal()];
            if (i == 1) {
                captureMessage.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSELANDSCAPE);
            } else if (i == 2) {
                captureMessage.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
            } else if (i == 3) {
                captureMessage.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
            } else if (i == 4) {
                captureMessage.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
            }
        }
    }

    private void setInstructionMessageDisplayRect(CaptureMessage captureMessage) {
        if (captureMessage != null) {
            int max = Math.max(Math.min(Math.min(this.f1835Wo, this.f1836Wp), Math.min(this.f1806FL - this.f1837Wq, this.f1807FM - this.f1838Wr)), this.f1812Vv.mo11846sn()) + this.f1842Wv;
            if (captureMessage.getPosX() > 0 && captureMessage.getPosY() > 0) {
                this.f1833WU.set(0, 0, this.f1806FL, this.f1807FM);
            } else if (this.f1818WF) {
                int i = C07581.f1850WW[captureMessage.getOrientation().ordinal()];
                if (i == 1) {
                    Rect rect = this.f1833WU;
                    int i2 = this.f1835Wo;
                    int i3 = this.f1838Wr;
                    rect.set(i2, i3, this.f1837Wq, max + i3);
                } else if (i == 2) {
                    Rect rect2 = this.f1833WU;
                    int i4 = this.f1835Wo;
                    rect2.set(i4 - max, this.f1836Wp, i4, this.f1838Wr);
                } else if (i == 3) {
                    this.f1833WU.set(this.f1835Wo, 0, this.f1837Wq, max);
                } else if (i == 4) {
                    Rect rect3 = this.f1833WU;
                    int i5 = this.f1837Wq;
                    rect3.set(i5, this.f1836Wp, max + i5, this.f1838Wr);
                }
            } else {
                int i6 = C07581.f1850WW[captureMessage.getOrientation().ordinal()];
                if (i6 == 1) {
                    Rect rect4 = this.f1833WU;
                    int i7 = this.f1837Wq;
                    rect4.set(i7, this.f1836Wp, max + i7, this.f1838Wr);
                } else if (i6 == 2) {
                    Rect rect5 = this.f1833WU;
                    int i8 = this.f1835Wo;
                    int i9 = this.f1838Wr;
                    rect5.set(i8, i9, this.f1837Wq, max + i9);
                } else if (i6 == 3) {
                    Rect rect6 = this.f1833WU;
                    int i10 = this.f1835Wo;
                    rect6.set(i10 - max, this.f1836Wp, i10, this.f1838Wr);
                } else if (i6 == 4) {
                    this.f1833WU.set(this.f1835Wo, 0, this.f1837Wq, max);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1810VS.mo11928l(getContext());
        this.f1812Vv.mo11842f(i, i2, i3, i4);
    }

    public void clear() {
        this.f1834WV = false;
        this.f1822WJ = null;
        this.f1812Vv.mo11840c((CaptureMessage) null);
        invalidate();
    }

    public void setOuterOverlayFrameColor(int i) {
        this.f1823WK.setColor(i);
        postInvalidate();
    }

    public int getOuterOverlayFrameColor() {
        return this.f1823WK.getColor();
    }

    public void setGuidanceFrameColor(int i) {
        this.f1825WM = i;
        this.f1824WL.setColor(i);
        int alpha = Color.alpha(i);
        this.f1830WR = alpha;
        int i2 = alpha / 5;
        this.f1828WP = i2;
        this.f1831WS = i2;
        postInvalidate();
    }

    public void setSteadyGuidanceFrameColor(int i) {
        Paint paint = new Paint(1);
        this.f1826WN = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f1826WN.setStrokeWidth((float) this.f1842Wv);
        this.f1826WN.setColor(i);
        postInvalidate();
    }

    public int getGuidanceFrameColor() {
        return this.f1825WM;
    }

    public void showEdgesGuidance(EdgeGuidance edgeGuidance) {
        this.f1808Hy = edgeGuidance;
        postInvalidate();
    }

    public void setGuidanceFrameThickness(int i) {
        int a = C0779p.m1848a(getContext(), (float) i);
        this.f1842Wv = a;
        this.f1824WL.setStrokeWidth((float) a);
        postInvalidate();
    }

    public int getGuidanceFrameThickness() {
        return C0779p.m1850c(getContext(), (float) this.f1842Wv);
    }

    /* renamed from: rS */
    private void m1755rS() {
        this.f1823WK.setStyle(Paint.Style.FILL);
        this.f1823WK.setColor(Color.argb(153, 0, 0, 0));
    }

    /* renamed from: rT */
    private void m1756rT() {
        this.f1824WL.setStyle(Paint.Style.STROKE);
        this.f1824WL.setColor(this.f1825WM);
        this.f1824WL.setStrokeWidth((float) this.f1842Wv);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1806FL = i;
        this.f1807FM = i2;
        if (i2 > i) {
            this.f1806FL = i2;
            this.f1807FM = i;
            this.f1818WF = true;
        } else {
            this.f1818WF = false;
        }
        m1757rU();
    }

    /* renamed from: rU */
    private void m1757rU() {
        if (this.f1806FL > 0 && this.f1807FM > 0) {
            m1758rV();
            m1759rW();
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        synchronized (this.f1805Dw) {
            canvas.save();
            m1739c(canvas);
            m1740d(canvas);
            if (m1760rX()) {
                m1752p(canvas);
                m1737b(canvas);
            } else if (this.f1834WV) {
                setGuidanceAlpha(this.f1830WR);
                m1751o(canvas);
            } else {
                setGuidanceAlpha(this.f1830WR);
                m1741e(canvas);
            }
            m1750n(canvas);
            canvas.restore();
        }
    }

    /* renamed from: b */
    private void m1737b(Canvas canvas) {
        setGuidanceAlpha(this.f1831WS);
        int i = this.f1831WS + this.f1829WQ;
        this.f1831WS = i;
        if (i >= this.f1830WR) {
            this.f1831WS = this.f1828WP;
        }
        m1751o(canvas);
        m1753q(canvas);
        if (m1760rX()) {
            postInvalidateDelayed((long) this.f1832WT);
        }
    }

    private void setGuidanceAlpha(int i) {
        this.f1824WL.setAlpha(i);
    }

    /* renamed from: c */
    private void m1739c(Canvas canvas) {
        if (this.f1818WF) {
            canvas.translate((float) this.f1807FM, BitmapDescriptorFactory.HUE_RED);
            canvas.rotate(90.0f);
        }
    }

    /* renamed from: d */
    private void m1740d(Canvas canvas) {
        canvas.drawRect(this.f1815WC, this.f1823WK);
        canvas.drawRect(this.f1814WB, this.f1823WK);
        canvas.drawRect(this.f1817WE, this.f1823WK);
        canvas.drawRect(this.f1816WD, this.f1823WK);
    }

    /* renamed from: rV */
    private void m1758rV() {
        Rect rect = new Rect(0, 0, this.f1806FL, this.f1807FM);
        Point rR = m1754rR();
        if (RectUtil.containsPoint(rR, rect, this.f1848cJ)) {
            this.f1839Ws.set(RectUtil.createTargetRect(this.f1848cJ, this.f1847cI, this.f1849nS, rect.width(), rect.height()));
        } else {
            this.f1839Ws.set(rR.x, rR.y, rR.x, rR.y);
        }
        this.f1835Wo = this.f1839Ws.left;
        this.f1836Wp = this.f1839Ws.top;
        this.f1837Wq = this.f1839Ws.right;
        int i = this.f1839Ws.bottom;
        this.f1838Wr = i;
        int i2 = this.f1842Wv / 2;
        this.f1843Ww = i2;
        int i3 = this.f1835Wo - i2;
        this.f1844Wx = i3;
        int i4 = this.f1836Wp - i2;
        this.f1845Wy = i4;
        int i5 = this.f1837Wq + i2;
        this.f1846Wz = i5;
        int i6 = i + i2;
        this.f1813WA = i6;
        this.f1841Wu = i2 + Math.min((i5 - i3) / 6, (i6 - i4) / 6);
        this.f1821WI = new RectF((float) this.f1844Wx, (float) this.f1845Wy, (float) this.f1846Wz, (float) this.f1813WA);
        this.f1840Wt.set(this.f1807FM - this.f1839Ws.bottom, this.f1839Ws.left, this.f1807FM - this.f1839Ws.top, this.f1839Ws.right);
        this.f1811Vu.mo11767f(this.f1818WF ? this.f1840Wt : this.f1839Ws);
    }

    /* renamed from: e */
    private void m1741e(Canvas canvas) {
        if (this.f1842Wv != 0) {
            m1745i(canvas);
            m1744h(canvas);
            m1743g(canvas);
            m1742f(canvas);
        }
    }

    /* renamed from: f */
    private void m1742f(Canvas canvas) {
        this.f1820WH.reset();
        this.f1820WH.moveTo((float) this.f1846Wz, (float) (this.f1813WA - this.f1841Wu));
        this.f1820WH.lineTo((float) this.f1846Wz, (float) this.f1813WA);
        this.f1820WH.lineTo((float) (this.f1846Wz - this.f1841Wu), (float) this.f1813WA);
        canvas.drawPath(this.f1820WH, getGuidancePaint());
    }

    /* renamed from: g */
    private void m1743g(Canvas canvas) {
        this.f1820WH.reset();
        this.f1820WH.moveTo((float) this.f1844Wx, (float) (this.f1813WA - this.f1841Wu));
        this.f1820WH.lineTo((float) this.f1844Wx, (float) this.f1813WA);
        this.f1820WH.lineTo((float) (this.f1844Wx + this.f1841Wu), (float) this.f1813WA);
        canvas.drawPath(this.f1820WH, getGuidancePaint());
    }

    /* renamed from: h */
    private void m1744h(Canvas canvas) {
        this.f1820WH.reset();
        this.f1820WH.moveTo((float) this.f1846Wz, (float) (this.f1845Wy + this.f1841Wu));
        this.f1820WH.lineTo((float) this.f1846Wz, (float) this.f1845Wy);
        this.f1820WH.lineTo((float) (this.f1846Wz - this.f1841Wu), (float) this.f1845Wy);
        canvas.drawPath(this.f1820WH, getGuidancePaint());
    }

    /* renamed from: i */
    private void m1745i(Canvas canvas) {
        this.f1820WH.reset();
        this.f1820WH.moveTo((float) this.f1844Wx, (float) (this.f1845Wy + this.f1841Wu));
        this.f1820WH.lineTo((float) this.f1844Wx, (float) this.f1845Wy);
        this.f1820WH.lineTo((float) (this.f1844Wx + this.f1841Wu), (float) this.f1845Wy);
        canvas.drawPath(this.f1820WH, getGuidancePaint());
    }

    /* renamed from: j */
    private void m1746j(Canvas canvas) {
        this.f1820WH.reset();
        this.f1820WH.moveTo((float) this.f1844Wx, (float) (this.f1845Wy + this.f1841Wu));
        this.f1820WH.lineTo((float) this.f1844Wx, (float) (this.f1813WA - this.f1841Wu));
        canvas.drawPath(this.f1820WH, getGuidancePaint());
    }

    /* renamed from: k */
    private void m1747k(Canvas canvas) {
        this.f1820WH.reset();
        this.f1820WH.moveTo((float) this.f1846Wz, (float) (this.f1845Wy + this.f1841Wu));
        this.f1820WH.lineTo((float) this.f1846Wz, (float) (this.f1813WA - this.f1841Wu));
        canvas.drawPath(this.f1820WH, getGuidancePaint());
    }

    /* renamed from: l */
    private void m1748l(Canvas canvas) {
        this.f1820WH.reset();
        this.f1820WH.moveTo((float) (this.f1844Wx + this.f1841Wu), (float) this.f1845Wy);
        this.f1820WH.lineTo((float) (this.f1846Wz - this.f1841Wu), (float) this.f1845Wy);
        canvas.drawPath(this.f1820WH, getGuidancePaint());
    }

    /* renamed from: m */
    private void m1749m(Canvas canvas) {
        this.f1820WH.reset();
        this.f1820WH.moveTo((float) (this.f1844Wx + this.f1841Wu), (float) this.f1813WA);
        this.f1820WH.lineTo((float) (this.f1846Wz - this.f1841Wu), (float) this.f1813WA);
        canvas.drawPath(this.f1820WH, getGuidancePaint());
    }

    /* renamed from: n */
    private void m1750n(Canvas canvas) {
        EdgeGuidance edgeGuidance = this.f1808Hy;
        if (edgeGuidance != null) {
            if (edgeGuidance.isEdgeFound(EdgeGuidance.EdgeType.LEFT)) {
                m1746j(canvas);
            }
            if (this.f1808Hy.isEdgeFound(EdgeGuidance.EdgeType.TOP)) {
                m1748l(canvas);
            }
            if (this.f1808Hy.isEdgeFound(EdgeGuidance.EdgeType.RIGHT)) {
                m1747k(canvas);
            }
            if (this.f1808Hy.isEdgeFound(EdgeGuidance.EdgeType.BOTTOM)) {
                m1749m(canvas);
            }
        }
    }

    /* renamed from: o */
    private void m1751o(Canvas canvas) {
        if (this.f1842Wv != 0) {
            this.f1820WH.reset();
            this.f1820WH.addRect(this.f1821WI, Path.Direction.CW);
            canvas.drawPath(this.f1820WH, getGuidancePaint());
        }
    }

    private Paint getGuidancePaint() {
        Paint paint;
        if (!this.f1834WV || (paint = this.f1826WN) == null) {
            return this.f1824WL;
        }
        return paint;
    }

    /* renamed from: rW */
    private void m1759rW() {
        this.f1815WC.set(0, this.f1836Wp, this.f1835Wo, this.f1838Wr);
        this.f1814WB.set(0, 0, this.f1806FL, this.f1836Wp);
        this.f1817WE.set(this.f1837Wq, this.f1836Wp, this.f1806FL, this.f1838Wr);
        this.f1816WD.set(0, this.f1838Wr, this.f1806FL, this.f1807FM);
    }

    /* renamed from: rX */
    private boolean m1760rX() {
        return this.f1822WJ != null;
    }

    /* renamed from: p */
    private void m1752p(Canvas canvas) {
        Bitmap bitmap = this.f1822WJ;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f1822WJ, (Rect) null, this.f1839Ws, this.f1827WO);
            if (this.f1812Vv.mo11845sm() != null) {
                this.f1809VR.mo11322M(this.f1812Vv.mo11845sm().getMessage());
            }
        }
    }

    /* renamed from: q */
    private void m1753q(Canvas canvas) {
        if (this.f1812Vv.mo11845sm() != null) {
            setInstructionMessageDisplayRect(this.f1812Vv.mo11845sm());
            this.f1812Vv.setAlpha(((float) this.f1831WS) / ((float) this.f1830WR));
            this.f1812Vv.draw(canvas, this.f1833WU);
        }
    }
}
