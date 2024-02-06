package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.BuildConfig;
import com.kofax.C7861R;
import com.kofax.kmc.ken.engines.data.BoundingRect;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.data.ImageCacheType;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0495c;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ImgReviewEditCntrl extends View implements View.OnTouchListener {
    private static final String TAG = ImgReviewEditCntrl.class.getSimpleName();

    /* renamed from: kT */
    private static final float f594kT = 25.0f;

    /* renamed from: kU */
    private static final int f595kU = 35;
    private Image image;
    /* access modifiers changed from: private */

    /* renamed from: kV */
    public int f596kV = 0;

    /* renamed from: kW */
    private int f597kW;

    /* renamed from: kX */
    private Point f598kX = new Point();

    /* renamed from: kY */
    private Point f599kY = new Point();

    /* renamed from: kZ */
    private Point f600kZ;

    /* renamed from: lA */
    private Point f601lA = new Point(0, 0);
    /* access modifiers changed from: private */

    /* renamed from: lB */
    public Point f602lB;

    /* renamed from: lC */
    private int f603lC = -16776961;

    /* renamed from: lD */
    private int f604lD = -16776961;

    /* renamed from: lE */
    private int f605lE = -256;

    /* renamed from: lF */
    private Line_Style_Solid f606lF;

    /* renamed from: lG */
    private BoundingTetragon f607lG;

    /* renamed from: lH */
    private String f608lH;

    /* renamed from: lI */
    private boolean f609lI = true;

    /* renamed from: lJ */
    private C0495c f610lJ;

    /* renamed from: lK */
    private ImageCacheType f611lK = ImageCacheType.MEMORY;

    /* renamed from: lL */
    private final List<BoundingRect> f612lL = new ArrayList();

    /* renamed from: lM */
    private final Rect f613lM = new Rect();

    /* renamed from: lN */
    private boolean f614lN = false;

    /* renamed from: lO */
    private float f615lO;

    /* renamed from: la */
    private Point f616la;

    /* renamed from: lb */
    private int f617lb;

    /* renamed from: lc */
    private Paint f618lc;

    /* renamed from: ld */
    private Paint f619ld;
    /* access modifiers changed from: private */

    /* renamed from: le */
    public boolean f620le = false;
    /* access modifiers changed from: private */

    /* renamed from: lf */
    public boolean f621lf = true;
    /* access modifiers changed from: private */

    /* renamed from: lg */
    public int f622lg = -1;

    /* renamed from: lh */
    private boolean f623lh = false;

    /* renamed from: li */
    boolean f624li = false;

    /* renamed from: lj */
    private float f625lj;

    /* renamed from: lk */
    private float f626lk;

    /* renamed from: ll */
    private float f627ll;

    /* renamed from: lm */
    private float f628lm;

    /* renamed from: ln */
    private float f629ln;

    /* renamed from: lo */
    private float f630lo = 1.0f;

    /* renamed from: lp */
    private Point f631lp;

    /* renamed from: lq */
    private Point f632lq;

    /* renamed from: lr */
    private Point f633lr;

    /* renamed from: ls */
    private Point f634ls;

    /* renamed from: lt */
    private boolean f635lt;
    /* access modifiers changed from: private */

    /* renamed from: lu */
    public float f636lu = BitmapDescriptorFactory.HUE_RED;
    /* access modifiers changed from: private */

    /* renamed from: lv */
    public float f637lv = 1.0f;

    /* renamed from: lw */
    private Bitmap f638lw;

    /* renamed from: lx */
    private Point f639lx = new Point();
    /* access modifiers changed from: private */

    /* renamed from: ly */
    public Point f640ly = new Point();

    /* renamed from: lz */
    private Rect f641lz;
    private int rotation;
    public ScaleGestureDetector scaleGestureDetector;
    /* access modifiers changed from: private */
    public int state = 0;

    public enum Line_Style_Solid {
        LINE_STYLE_SOLID,
        LINE_STYLE_DOTTED
    }

    public void setImage(Image image2) throws KmcException {
        Bitmap bitmap;
        m479az();
        this.image = image2;
        if (image2 != null) {
            this.f615lO = image2.getImageBitmapScaling().floatValue();
            this.image.getImageRepresentation();
            if (this.image.getImageRepresentation().equals(Image.ImageRep.IMAGE_REP_BITMAP) || this.image.getImageRepresentation().equals(Image.ImageRep.IMAGE_REP_BOTH)) {
                if (this.image.getImageBitmapScaling().floatValue() == 1.0f) {
                    String str = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[Bitmap]bm.getHeight() = ");
                    sb.append(this.image.getImageBitmapHeight());
                    C0767k.m1820e(str, sb.toString());
                    String str2 = TAG;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[Bitmap]bm.getWidth() = ");
                    sb2.append(this.image.getImageBitmapWidth());
                    C0767k.m1820e(str2, sb2.toString());
                    this.f615lO = 0.5f;
                    if (Build.VERSION.SDK_INT < 11 && (bitmap = this.f638lw) != null) {
                        bitmap.recycle();
                        this.f638lw = null;
                    }
                    this.f638lw = this.image.createScaledBitmap(this.f615lO);
                }
                if (this.f638lw != null) {
                    m475av();
                    invalidate();
                }
            } else if (this.image.getImageRepresentation().equals(Image.ImageRep.IMAGE_REP_FILE)) {
                try {
                    if (this.image.getImageBitmapScaling().floatValue() == 1.0f) {
                        this.f615lO = 0.5f;
                    }
                    if (this.image.getImageFileRep() == Image.ImageFileRep.FILE_STORED) {
                        Integer imageDPI = this.image.getImageDPI();
                        String imageMetaData = this.image.getImageMetaData();
                        Image.FriendI friendI = new Image.FriendI(BuildConfig.APPLICATION_ID);
                        this.image.imageReadFromFile(this.f615lO);
                        friendI.setImageMetaData(imageMetaData);
                        if (imageDPI != null) {
                            this.image.setImageDPI(imageDPI.intValue());
                        }
                    } else {
                        this.image.imageReadFromFileBuffer(this.f615lO);
                    }
                    if (this.f638lw != null) {
                        this.f638lw.recycle();
                        this.f638lw = null;
                    }
                    Bitmap v = m498v(this.image);
                    this.f638lw = v;
                    if (v != null) {
                        this.image.imageClearBitmap();
                        C0767k.m1807c(TAG, "--------------image.imageClearBitmap()");
                    }
                    if (this.f638lw != null) {
                        m475av();
                        invalidate();
                    }
                } catch (KmcException unused) {
                    throw new KmcException(ErrorInfo.KMC_UI_SCALING_FACTOR);
                }
            }
        } else {
            throw new KmcException(ErrorInfo.KMC_UI_IMAGE_NULL);
        }
    }

    /* renamed from: v */
    private Bitmap m498v(Image image2) {
        Bitmap imageBitmap = image2.getImageBitmap();
        int width = imageBitmap.getWidth();
        int height = imageBitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[(width * height)];
        imageBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    /* renamed from: av */
    private void m475av() {
        this.f626lk = (float) this.f638lw.getHeight();
        this.f625lj = (float) this.f638lw.getWidth();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("image Wd&ht = ");
        sb.append(this.f625lj);
        sb.append(" ");
        sb.append(this.f626lk);
        C0767k.m1807c(str, sb.toString());
        float height = (float) getHeight();
        float width = (float) getWidth();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("displayHt ");
        sb2.append(height);
        sb2.append("  displayWd = ");
        sb2.append(width);
        C0767k.m1807c("InitImage", sb2.toString());
        Point d = mo10622d(new Point((int) width, (int) height), new Point((int) this.f625lj, (int) this.f626lk));
        this.f627ll = (width - ((float) d.x)) / 2.0f;
        this.f628lm = (height - ((float) d.y)) / 2.0f;
        this.f629ln = this.f625lj / ((float) d.x);
        this.f641lz = m463a(this.f625lj, this.f626lk, (float) d.x, (float) d.y);
        this.state = 0;
        this.f640ly.x = 0;
        this.f640ly.y = 0;
        this.f636lu = 1.0f;
        this.f637lv = 1.0f;
        this.f620le = false;
        this.f630lo = getDisplayToBitmapScalingFactor();
    }

    public Image getImage() {
        return this.image;
    }

    public void showCropRectangle(boolean z) {
        this.f635lt = z;
        invalidate();
    }

    public int getCropLineColor() {
        return this.f603lC;
    }

    public void setCropLineColor(int i) {
        this.f603lC = i;
        invalidate();
    }

    public int getCropCornerColor() {
        int i = this.f604lD;
        if (i == -1) {
            return -16776961;
        }
        return i;
    }

    public void setCropCornerColor(int i) {
        this.f604lD = i;
        invalidate();
    }

    public void setCropLineStyle(Line_Style_Solid line_Style_Solid) {
        this.f606lF = line_Style_Solid;
        invalidate();
    }

    public void setCropTetragon(BoundingTetragon boundingTetragon) {
        this.f607lG = boundingTetragon;
        if (boundingTetragon != null) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("setCropTetragon[scale value = ]");
            sb.append(this.f615lO);
            C0767k.m1807c(str, sb.toString());
            this.f634ls.x = (int) (((float) this.f607lG.getTopLeft().x) * this.f615lO);
            this.f634ls.y = (int) (((float) this.f607lG.getTopLeft().y) * this.f615lO);
            this.f633lr.x = (int) (((float) this.f607lG.getTopRight().x) * this.f615lO);
            this.f633lr.y = (int) (((float) this.f607lG.getTopRight().y) * this.f615lO);
            this.f632lq.x = (int) (((float) this.f607lG.getBottomLeft().x) * this.f615lO);
            this.f632lq.y = (int) (((float) this.f607lG.getBottomLeft().y) * this.f615lO);
            this.f631lp.x = (int) (((float) this.f607lG.getBottomRight().x) * this.f615lO);
            this.f631lp.y = (int) (((float) this.f607lG.getBottomRight().y) * this.f615lO);
            this.f614lN = true;
        }
        invalidate();
    }

    public void showHighlights(BoundingRect[] boundingRectArr) {
        clearHighlights();
        if (boundingRectArr != null) {
            Collections.addAll(this.f612lL, boundingRectArr);
        }
    }

    public void clearHighlights() {
        this.f612lL.clear();
    }

    public void setHighlightColor(int i) {
        this.f605lE = i;
        invalidate();
    }

    public BoundingTetragon getCropTetragon() {
        if (this.f607lG == null) {
            this.f607lG = new BoundingTetragon();
        }
        try {
            this.f607lG.setTopLeft(new Point((int) (((float) this.f634ls.x) / this.f615lO), (int) (((float) this.f634ls.y) / this.f615lO)));
            this.f607lG.setTopRight(new Point((int) (((float) this.f633lr.x) / this.f615lO), (int) (((float) this.f633lr.y) / this.f615lO)));
            this.f607lG.setBottomLeft(new Point((int) (((float) this.f632lq.x) / this.f615lO), (int) (((float) this.f632lq.y) / this.f615lO)));
            this.f607lG.setBottomRight(new Point((int) (((float) this.f631lp.x) / this.f615lO), (int) (((float) this.f631lp.y) / this.f615lO)));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return this.f607lG;
    }

    public void setRetainImage(boolean z) {
        this.f609lI = z;
    }

    public boolean getRetainImage() {
        return this.f609lI;
    }

    /* renamed from: com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl$1 */
    static /* synthetic */ class C04711 {

        /* renamed from: lP */
        static final /* synthetic */ int[] f642lP;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.kofax.kmc.kui.uicontrols.data.ImageCacheType[] r0 = com.kofax.kmc.kui.uicontrols.data.ImageCacheType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f642lP = r0
                com.kofax.kmc.kui.uicontrols.data.ImageCacheType r1 = com.kofax.kmc.kui.uicontrols.data.ImageCacheType.MEMORY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f642lP     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kui.uicontrols.data.ImageCacheType r1 = com.kofax.kmc.kui.uicontrols.data.ImageCacheType.DISK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl.C04711.<clinit>():void");
        }
    }

    public void setImageCacheType(ImageCacheType imageCacheType) {
        int i = C04711.f642lP[imageCacheType.ordinal()];
        if (i == 1) {
            this.f610lJ = Injector.getInjector(getContext()).getMemoryBitmapCache();
        } else if (i == 2) {
            this.f610lJ = Injector.getInjector(getContext()).getDiskBitmapCache();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid ImageCacheType ");
            sb.append(imageCacheType);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f611lK = imageCacheType;
    }

    public ImgReviewEditCntrl(Context context) {
        super(context);
        m486b(context);
        setImageCacheType(this.f611lK);
    }

    public ImgReviewEditCntrl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m486b(context);
        m465a(context, attributeSet);
        setImageCacheType(this.f611lK);
    }

    public ImgReviewEditCntrl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m486b(context);
        m465a(context, attributeSet);
        setImageCacheType(this.f611lK);
    }

    /* renamed from: a */
    private void m465a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7861R.styleable.img_review_edit_cntrl);
        Boolean valueOf = Boolean.valueOf(obtainStyledAttributes.getBoolean(C7861R.styleable.img_review_edit_cntrl_retain_image, true));
        if (valueOf != null) {
            setRetainImage(valueOf.booleanValue());
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m486b(Context context) {
        setOnTouchListener(this);
        this.scaleGestureDetector = new ScaleGestureDetector(context, new C0472a(this, (C04711) null));
        this.f618lc = new Paint();
        this.f634ls = new Point();
        this.f633lr = new Point();
        this.f632lq = new Point();
        this.f631lp = new Point();
        this.f640ly.x = 0;
        this.f640ly.y = 0;
        setLayerType(1, (Paint) null);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f638lw == null) {
            return false;
        }
        this.f623lh = true;
        this.scaleGestureDetector.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        this.f596kV = motionEvent.getPointerCount();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("PINCH COUNT(start) = ");
        sb.append(motionEvent.getPointerCount());
        C0767k.m1807c(str, sb.toString());
        if (this.f596kV > 1) {
            this.f620le = true;
            this.f624li = false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.f616la = new Point(x, y);
            Point point = new Point(x, y);
            this.f600kZ = point;
            Point b = m483b(point);
            this.state = 0;
            if (m494e(b, this.f634ls)) {
                this.state = 1;
                this.f617lb = 1;
            } else if (m494e(b, this.f633lr)) {
                this.state = 1;
                this.f617lb = 2;
            } else if (m494e(b, this.f632lq)) {
                this.state = 1;
                this.f617lb = 3;
            } else if (m494e(b, this.f631lp)) {
                this.state = 1;
                this.f617lb = 4;
            } else {
                int c = m489c(x, y);
                this.f597kW = c;
                if (c != 0) {
                    this.state = 2;
                }
                if (this.state == 0 && this.f620le && this.f636lu > 1.0f) {
                    this.state = 3;
                    if (this.f601lA.x == 0) {
                        this.f601lA.x = 0;
                        this.f601lA.y = 0;
                    }
                    this.f639lx.x = this.f600kZ.x - this.f601lA.x;
                    this.f639lx.y = this.f600kZ.y - this.f601lA.y;
                }
            }
        } else if (action != 1) {
            if (action == 2) {
                if (this.f620le && !this.f621lf) {
                    return true;
                }
                this.f600kZ = new Point(x, y);
                Point b2 = m483b(new Point(this.f600kZ.x, this.f600kZ.y));
                if (this.state != 3 && !this.f635lt) {
                    return true;
                }
                int i = this.state;
                if (i == 1) {
                    int i2 = this.f617lb;
                    if (i2 == 1) {
                        Point point2 = this.f634ls;
                        this.f634ls = b2;
                        if (!m469a(this.f632lq, b2, this.f633lr, i2)) {
                            this.f634ls = point2;
                        }
                        if (((float) this.f634ls.x) > this.f625lj || ((float) this.f634ls.y) > this.f626lk || this.f634ls.x < 0 || this.f634ls.y < 0) {
                            this.f634ls = point2;
                        }
                        if (this.f634ls.y > this.f632lq.y) {
                            this.f634ls = point2;
                        }
                        if (this.f634ls.x > this.f633lr.x) {
                            this.f634ls = point2;
                        }
                    } else if (i2 == 2) {
                        Point point3 = this.f633lr;
                        this.f633lr = b2;
                        if (!m469a(this.f631lp, b2, this.f634ls, i2)) {
                            this.f633lr = point3;
                        }
                        if (((float) this.f633lr.x) > this.f625lj || ((float) this.f633lr.y) > this.f626lk || this.f633lr.x < 0 || this.f633lr.y < 0) {
                            this.f633lr = point3;
                        }
                        if (this.f633lr.y > this.f631lp.y) {
                            this.f633lr = point3;
                        }
                        if (this.f634ls.x > this.f633lr.x) {
                            this.f633lr = point3;
                        }
                    } else if (i2 == 3) {
                        Point point4 = this.f632lq;
                        this.f632lq = b2;
                        if (!m469a(this.f634ls, b2, this.f631lp, i2)) {
                            this.f632lq = point4;
                        }
                        if (((float) this.f632lq.x) > this.f625lj || ((float) this.f632lq.y) > this.f626lk || this.f632lq.x < 0 || this.f632lq.y < 0) {
                            this.f632lq = point4;
                        }
                        if (this.f632lq.y < this.f634ls.y) {
                            this.f632lq = point4;
                        }
                        if (this.f631lp.x < this.f632lq.x) {
                            this.f632lq = point4;
                        }
                    } else if (i2 == 4) {
                        Point point5 = this.f631lp;
                        this.f631lp = b2;
                        if (!m469a(this.f633lr, b2, this.f632lq, i2)) {
                            this.f631lp = point5;
                        }
                        if (((float) this.f631lp.x) > this.f625lj || ((float) this.f631lp.y) > this.f626lk || this.f631lp.x < 0 || this.f631lp.y < 0) {
                            this.f631lp = point5;
                        }
                        if (this.f631lp.y < this.f633lr.y) {
                            this.f631lp = point5;
                        }
                        if (this.f631lp.x < this.f632lq.x) {
                            this.f631lp = point5;
                        }
                    }
                } else if (i == 2) {
                    Point point6 = new Point(x, y);
                    this.f600kZ = point6;
                    m464a(this.f597kW, point6);
                } else if (i == 3) {
                    this.f640ly.x = this.f600kZ.x - this.f639lx.x;
                    this.f640ly.y = this.f600kZ.y - this.f639lx.y;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PanOffset ");
                    sb2.append(this.f640ly.x);
                    sb2.append(" ");
                    sb2.append(this.f640ly.y);
                    sb2.append(" ");
                    sb2.append(this.f600kZ.x);
                    sb2.append(" ");
                    sb2.append(this.f600kZ.y);
                    sb2.append(" PanOrn ");
                    sb2.append(this.f639lx.x);
                    sb2.append(" ");
                    sb2.append(this.f639lx.y);
                    C0767k.m1807c("PanOrigin", sb2.toString());
                }
            }
        } else if (this.f620le) {
            this.f621lf = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("firstPinchThisGesture ");
            sb3.append(this.f621lf);
            C0767k.m1807c("State", sb3.toString());
            m476aw();
        }
        invalidate();
        return true;
    }

    /* renamed from: aw */
    private void m476aw() {
        this.state = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("panoffset = ");
        sb.append(this.f640ly.x);
        sb.append(" ");
        sb.append(this.f640ly.y);
        C0767k.m1807c("PanOffset", sb.toString());
        Point a = m461a(new Point(0, 0));
        if (a.x > getWidth() / 2) {
            Point point = this.f640ly;
            point.x = (int) (((float) point.x) - ((float) ((a.x - (getWidth() / 2)) + 1)));
        }
        if (a.y > getHeight() / 2) {
            Point point2 = this.f640ly;
            point2.y = (int) (((float) point2.y) - ((float) ((a.y - (getHeight() / 2)) + 1)));
        }
        Point a2 = m461a(new Point((int) this.f625lj, (int) this.f626lk));
        if (a2.x < getWidth() / 2) {
            Point point3 = this.f640ly;
            point3.x = (int) (((float) point3.x) - ((float) ((a2.x - (getWidth() / 2)) - 1)));
        }
        if (a2.y < getHeight() / 2) {
            Point point4 = this.f640ly;
            point4.y = (int) (((float) point4.y) - ((float) ((a2.y - (getHeight() / 2)) - 1)));
        }
        this.f601lA.x = this.f640ly.x;
        this.f601lA.y = this.f640ly.y;
        if (((double) this.f636lu) == 1.0d) {
            this.f640ly.x = 0;
            this.f640ly.y = 0;
            this.f601lA.x = 0;
            this.f601lA.y = 0;
        }
        invalidate();
    }

    /* renamed from: com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl$a */
    class C0472a extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: lR */
        private final int f644lR;

        /* renamed from: lS */
        private final int f645lS;

        private C0472a() {
            this.f644lR = 1;
            this.f645lS = 15;
        }

        /* synthetic */ C0472a(ImgReviewEditCntrl imgReviewEditCntrl, C04711 r2) {
            this();
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = ImgReviewEditCntrl.this.scaleGestureDetector.getScaleFactor();
            ImgReviewEditCntrl imgReviewEditCntrl = ImgReviewEditCntrl.this;
            float unused = imgReviewEditCntrl.f637lv = imgReviewEditCntrl.f637lv * scaleFactor;
            StringBuilder sb = new StringBuilder();
            sb.append("focus.x= ");
            sb.append(scaleGestureDetector.getFocusX());
            sb.append(" focus.y = ");
            sb.append(scaleGestureDetector.getFocusY());
            C0767k.m1807c("Zoom", sb.toString());
            Point point = new Point((int) scaleGestureDetector.getFocusX(), (int) scaleGestureDetector.getFocusY());
            if (ImgReviewEditCntrl.this.f622lg != ImgReviewEditCntrl.this.f596kV) {
                boolean unused2 = ImgReviewEditCntrl.this.f621lf = true;
            }
            if (ImgReviewEditCntrl.this.f621lf) {
                boolean unused3 = ImgReviewEditCntrl.this.f621lf = false;
                ImgReviewEditCntrl imgReviewEditCntrl2 = ImgReviewEditCntrl.this;
                Point unused4 = imgReviewEditCntrl2.f602lB = imgReviewEditCntrl2.m483b(point);
            }
            if (ImgReviewEditCntrl.this.f637lv < 1.0f) {
                float unused5 = ImgReviewEditCntrl.this.f637lv = 1.0f;
            }
            if (ImgReviewEditCntrl.this.f637lv > 15.0f) {
                float unused6 = ImgReviewEditCntrl.this.f637lv = 15.0f;
            }
            if (ImgReviewEditCntrl.this.f637lv == 1.0f) {
                ImgReviewEditCntrl.this.f640ly.x = 0;
                ImgReviewEditCntrl.this.f640ly.y = 0;
                int unused7 = ImgReviewEditCntrl.this.state = 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("state = ");
                sb2.append(ImgReviewEditCntrl.this.state);
                C0767k.m1807c("State", sb2.toString());
                boolean unused8 = ImgReviewEditCntrl.this.f620le = false;
            }
            ImgReviewEditCntrl imgReviewEditCntrl3 = ImgReviewEditCntrl.this;
            float unused9 = imgReviewEditCntrl3.f636lu = imgReviewEditCntrl3.f637lv;
            ImgReviewEditCntrl imgReviewEditCntrl4 = ImgReviewEditCntrl.this;
            Point c = imgReviewEditCntrl4.m461a(imgReviewEditCntrl4.f602lB);
            Point point2 = new Point(point.x - c.x, point.y - c.y);
            ImgReviewEditCntrl.this.f640ly.x += point2.x;
            ImgReviewEditCntrl.this.f640ly.y += point2.y;
            ImgReviewEditCntrl imgReviewEditCntrl5 = ImgReviewEditCntrl.this;
            int unused10 = imgReviewEditCntrl5.f622lg = imgReviewEditCntrl5.f596kV;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("prevNumTouches = ");
            sb3.append(ImgReviewEditCntrl.this.f622lg);
            sb3.append(" numtouches = ");
            sb3.append(ImgReviewEditCntrl.this.f596kV);
            C0767k.m1807c("State", sb3.toString());
            ImgReviewEditCntrl.this.invalidate();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            canvas.getClipBounds(new Rect());
            int i = (int) (((double) this.f625lj) * 0.075d);
            if (!this.f623lh && this.f635lt && !this.f614lN) {
                this.f634ls.set(i, i);
                this.f633lr.set(((int) this.f625lj) - i, i);
                this.f632lq.set(i, ((int) this.f626lk) - i);
                this.f631lp.set(((int) this.f625lj) - i, ((int) this.f626lk) - i);
            }
            Bitmap bitmap = this.f638lw;
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.save();
                canvas.scale(1.0f, 1.0f);
                Paint paint = new Paint(2);
                Point a = m461a(new Point(0, 0));
                Rect rect = new Rect(0, 0, (int) this.f625lj, (int) this.f626lk);
                if (this.f636lu == BitmapDescriptorFactory.HUE_RED) {
                    this.f636lu = 1.0f;
                }
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("origin = ");
                sb.append(a.x);
                sb.append(" ");
                sb.append(a.y);
                C0767k.m1807c(str, sb.toString());
                canvas.drawBitmap(this.f638lw, rect, new Rect(a.x, a.y, ((int) (((float) this.f641lz.width()) * this.f636lu)) + a.x, ((int) (((float) this.f641lz.height()) * this.f636lu)) + a.y), paint);
                canvas.restore();
                if (this.f635lt) {
                    m466a(canvas);
                }
                m467a(a, canvas);
            }
        }
    }

    /* renamed from: a */
    private void m467a(Point point, Canvas canvas) {
        m477ax();
        for (BoundingRect a : this.f612lL) {
            m468a(point, canvas, a);
        }
    }

    /* renamed from: ax */
    private void m477ax() {
        if (this.f619ld == null) {
            Paint paint = new Paint();
            this.f619ld = paint;
            paint.setStyle(Paint.Style.FILL);
        }
        m478ay();
    }

    /* renamed from: ay */
    private void m478ay() {
        int parseLong = (int) Long.parseLong(Integer.toString(this.f605lE, 16), 16);
        this.f619ld.setColor(Color.argb(100, (parseLong >> 16) & 255, (parseLong >> 8) & 255, parseLong & 255));
    }

    /* renamed from: a */
    private void m468a(Point point, Canvas canvas, BoundingRect boundingRect) {
        if (m487b(boundingRect)) {
            setHighlightRectangle(boundingRect);
            m485b(this.f636lu, this.f630lo);
            this.f613lM.offset(point.x, point.y);
            canvas.drawRect(this.f613lM, this.f619ld);
        }
    }

    /* renamed from: b */
    private boolean m487b(BoundingRect boundingRect) {
        return boundingRect != null && boundingRect.getRectTop() > 0;
    }

    private void setHighlightRectangle(BoundingRect boundingRect) {
        this.f613lM.set(boundingRect.getRectLeft(), boundingRect.getRectTop(), boundingRect.getRectRight(), boundingRect.getRectBottom());
    }

    /* renamed from: b */
    private void m485b(float f, float f2) {
        Rect rect = this.f613lM;
        rect.set(Math.round(((float) rect.left) * f * f2), Math.round(((float) this.f613lM.top) * f * f2), Math.round(((float) this.f613lM.right) * f * f2), Math.round(((float) this.f613lM.bottom) * f * f2));
    }

    private float getDisplayToBitmapScalingFactor() {
        if (this.image == null) {
            return 1.0f;
        }
        try {
            int width = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getWidth() - this.f641lz.width();
            if (this.image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_BITMAP && this.image.getImageBitmap() != null && !this.image.getImageBitmap().isRecycled()) {
                return Utility.getDisplayToBitmapScalingFactor(getContext(), this.image.getImageBitmap().getWidth(), width);
            }
            if (this.image.getImageFileWidth() != null) {
                return Utility.getDisplayToBitmapScalingFactor(getContext(), this.image.getImageFileWidth().intValue(), width);
            }
            return 1.0f;
        } catch (IOException e) {
            e.printStackTrace();
            return 1.0f;
        }
    }

    /* renamed from: a */
    private Rect m463a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        Rect rect = new Rect();
        if (f2 > this.f625lj) {
            f6 = (float) ((int) ((f4 / f2) * f));
            if (f6 > f3) {
                f5 = (float) ((int) ((f2 / f) * f3));
                f6 = f3;
                rect.left = (int) ((f3 - f6) / 2.0f);
                rect.right = (int) (f6 + ((float) rect.left));
                rect.top = ((int) (f4 - f5)) / 2;
                rect.bottom = (int) (f5 + ((float) rect.top));
                return rect;
            }
        } else {
            float f7 = (float) ((int) ((f2 / f) * f3));
            if (f7 > f4) {
                f6 = (float) ((int) ((f4 / f2) * f));
            } else {
                f5 = f7;
                f6 = f3;
                rect.left = (int) ((f3 - f6) / 2.0f);
                rect.right = (int) (f6 + ((float) rect.left));
                rect.top = ((int) (f4 - f5)) / 2;
                rect.bottom = (int) (f5 + ((float) rect.top));
                return rect;
            }
        }
        f5 = f4;
        rect.left = (int) ((f3 - f6) / 2.0f);
        rect.right = (int) (f6 + ((float) rect.left));
        rect.top = ((int) (f4 - f5)) / 2;
        rect.bottom = (int) (f5 + ((float) rect.top));
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Point mo10622d(Point point, Point point2) {
        Point point3 = new Point();
        if (point2.y > point2.x) {
            point3.y = point.y;
            point3.x = (int) ((((float) point.y) / ((float) point2.y)) * ((float) point2.x));
            if (point3.x > point.x) {
                point3.x = point.x;
                point3.y = (int) ((((float) point2.y) / ((float) point2.x)) * ((float) point.x));
            }
        } else {
            point3.x = point.x;
            point3.y = (int) ((((float) point2.y) / ((float) point2.x)) * ((float) point.x));
            if (point3.y > point.y) {
                point3.y = point.y;
                point3.x = (int) ((((float) point.y) / ((float) point2.y)) * ((float) point2.x));
            }
        }
        return point3;
    }

    /* renamed from: a */
    private void m466a(Canvas canvas) {
        Line_Style_Solid line_Style_Solid = this.f606lF;
        if (line_Style_Solid != null) {
            if (line_Style_Solid.equals(Line_Style_Solid.LINE_STYLE_DOTTED)) {
                this.f618lc.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 10.0f));
            } else {
                this.f618lc.setPathEffect(new DashPathEffect(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}, BitmapDescriptorFactory.HUE_RED));
            }
        }
        this.f618lc.setStrokeWidth(5.0f);
        this.f618lc.setColor(this.f603lC);
        this.f618lc.setStyle(Paint.Style.STROKE);
        this.f618lc.setAntiAlias(true);
        Point a = m461a(this.f634ls);
        Point a2 = m461a(this.f633lr);
        Point a3 = m461a(this.f632lq);
        Point a4 = m461a(this.f631lp);
        Path path = new Path();
        path.moveTo((float) a.x, (float) a.y);
        path.lineTo((float) a2.x, (float) a2.y);
        path.moveTo((float) a2.x, (float) a2.y);
        path.lineTo((float) a4.x, (float) a4.y);
        path.moveTo((float) a4.x, (float) a4.y);
        path.lineTo((float) a3.x, (float) a3.y);
        path.moveTo((float) a3.x, (float) a3.y);
        path.lineTo((float) a.x, (float) a.y);
        path.close();
        canvas.drawPath(path, this.f618lc);
        this.f618lc.setStyle(Paint.Style.FILL);
        this.f618lc.setColor(this.f604lD);
        canvas.drawCircle((float) a.x, (float) a.y, f594kT, this.f618lc);
        canvas.drawCircle((float) a2.x, (float) a2.y, f594kT, this.f618lc);
        canvas.drawCircle((float) a3.x, (float) a3.y, f594kT, this.f618lc);
        canvas.drawCircle((float) a4.x, (float) a4.y, f594kT, this.f618lc);
    }

    /* renamed from: e */
    private boolean m494e(Point point, Point point2) {
        float f = this.f629ln * 35.0f;
        if (((float) point.x) < ((float) point2.x) - f || ((float) point.x) > ((float) point2.x) + f || ((float) point.y) < ((float) point2.y) - f || ((float) point.y) > ((float) point2.y) + f) {
            if (this.f636lu > 1.0f) {
                this.f624li = true;
            }
            return false;
        }
        this.f624li = false;
        return true;
    }

    /* renamed from: a */
    private boolean m469a(Point point, Point point2, Point point3, int i) {
        double abs = Math.abs((Math.atan2((double) (point2.y - point3.y), (double) (point2.x - point3.x)) * 180.0d) / 3.141592653589793d) + Math.abs((Math.atan2((double) (point2.y - point.y), (double) (point2.x - point.x)) * 180.0d) / 3.141592653589793d);
        boolean z = abs > 175.0d || abs < 2.0d;
        if (i == 2 || i == 4) {
            return abs < 175.0d;
        }
        return z;
    }

    /* renamed from: a */
    private void m464a(int i, Point point) {
        Point b = m483b(point);
        Point b2 = m483b(this.f616la);
        float f = (float) (b.x - b2.x);
        float f2 = (float) (b.y - b2.y);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        int i2 = (int) f2;
                        if (this.f598kX.y + i2 > this.f634ls.y && this.f599kY.y + i2 > this.f633lr.y && ((float) (this.f598kX.y + i2)) <= this.f626lk && ((float) (this.f599kY.y + i2)) < this.f626lk) {
                            this.f632lq.y = (int) (((float) this.f598kX.y) + f2);
                            this.f631lp.y = (int) (((float) this.f599kY.y) + f2);
                        }
                    }
                } else if (((float) this.f598kX.x) + f > ((float) this.f634ls.x) && ((float) this.f599kY.x) + f > ((float) this.f632lq.x) && ((float) this.f598kX.x) + f <= this.f625lj && ((float) this.f599kY.x) + f <= this.f625lj) {
                    this.f633lr.x = (int) (((float) this.f598kX.x) + f);
                    this.f631lp.x = (int) (((float) this.f599kY.x) + f);
                }
            } else if (((float) this.f598kX.x) + f < ((float) this.f631lp.x) && ((float) this.f599kY.x) + f < ((float) this.f633lr.x) && ((float) this.f598kX.x) + f >= BitmapDescriptorFactory.HUE_RED && ((float) this.f599kY.x) + f >= BitmapDescriptorFactory.HUE_RED) {
                this.f634ls.x = (int) (((float) this.f598kX.x) + f);
                StringBuilder sb = new StringBuilder();
                sb.append("[pointmove]pointImage.x = ");
                sb.append(this.f634ls.x);
                C0767k.m1807c("Zoom", sb.toString());
                this.f632lq.x = (int) (((float) this.f599kY.x) + f);
            }
        } else if (((float) this.f598kX.y) + f2 < ((float) this.f632lq.y) && ((float) this.f598kX.y) + f2 < ((float) this.f631lp.y) && ((float) this.f598kX.y) + f2 >= BitmapDescriptorFactory.HUE_RED && ((float) this.f599kY.y) + f2 >= BitmapDescriptorFactory.HUE_RED) {
            this.f634ls.y = (int) (((float) this.f598kX.y) + f2);
            this.f633lr.y = (int) (((float) this.f599kY.y) + f2);
        }
    }

    /* renamed from: c */
    private int m489c(int i, int i2) {
        Point b = m483b(new Point(i, i2));
        Point point = this.f634ls;
        Point point2 = this.f633lr;
        if (m470a(b, false, point, point2)) {
            this.f598kX.x = point.x;
            this.f598kX.y = point.y;
            this.f599kY.x = point2.x;
            this.f599kY.y = point2.y;
            this.f624li = false;
            return 1;
        }
        Point point3 = this.f633lr;
        Point point4 = this.f631lp;
        if (m470a(b, true, point3, point4)) {
            this.f598kX.x = point3.x;
            this.f598kX.y = point3.y;
            this.f599kY.x = point4.x;
            this.f599kY.y = point4.y;
            this.f624li = false;
            return 3;
        }
        Point point5 = this.f634ls;
        Point point6 = this.f632lq;
        if (m470a(b, true, point5, point6)) {
            this.f598kX.x = point5.x;
            this.f598kX.y = point5.y;
            this.f599kY.x = point6.x;
            this.f599kY.y = point6.y;
            this.f624li = false;
            return 2;
        }
        Point point7 = this.f632lq;
        Point point8 = this.f631lp;
        if (m470a(b, false, point7, point8)) {
            this.f598kX.x = point7.x;
            this.f598kX.y = point7.y;
            this.f599kY.x = point8.x;
            this.f599kY.y = point8.y;
            this.f624li = false;
            return 4;
        }
        this.f624li = true;
        return 0;
    }

    /* renamed from: a */
    private boolean m470a(Point point, boolean z, Point point2, Point point3) {
        float f = this.f629ln;
        float f2 = f594kT * f;
        float f3 = f * 35.0f;
        float f4 = (float) (point3.x - point2.x);
        if (f4 == BitmapDescriptorFactory.HUE_RED) {
            return ((float) point.x) >= ((float) point3.x) - f2 && ((float) point.x) <= ((float) point3.x) + f2;
        }
        float f5 = ((float) (point3.y - point2.y)) / f4;
        float f6 = ((float) point2.y) - (((float) point2.x) * f5);
        if (z) {
            float f7 = (((float) point.y) - f6) / f5;
            return ((float) point.x) >= f7 - f3 && ((float) point.x) <= f7 + f3 && ((float) point.y) >= ((float) point2.y) + f3 && ((float) point.y) <= ((float) point3.y) - f3;
        }
        float f8 = (((float) point.x) * f5) + f6;
        if (((float) point.y) < f8 - f3 || ((float) point.y) > f8 + f3) {
            return false;
        }
        C0767k.m1807c(TAG, "isonline true: horizontal");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Point m461a(Point point) {
        Point point2 = new Point();
        if (this.f636lu != BitmapDescriptorFactory.HUE_RED) {
            point2.x = (int) ((((float) point.x) * this.f636lu * (((float) this.f641lz.width()) / this.f625lj)) + this.f627ll + ((float) this.f641lz.left) + ((float) this.f640ly.x));
            point2.y = (int) ((((float) point.y) * this.f636lu * (((float) this.f641lz.height()) / this.f626lk)) + this.f628lm + ((float) this.f641lz.top) + ((float) this.f640ly.y));
        } else {
            point2.x = (int) ((((float) point.x) * (((float) this.f641lz.width()) / this.f625lj)) + this.f627ll + ((float) this.f641lz.left) + ((float) this.f640ly.x));
            point2.y = (int) ((((float) point.y) * (((float) this.f641lz.height()) / this.f626lk)) + this.f628lm + ((float) this.f641lz.top) + ((float) this.f640ly.y));
        }
        return point2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Point m483b(Point point) {
        Point point2 = new Point();
        if (this.f636lu != BitmapDescriptorFactory.HUE_RED) {
            point2.x = (int) ((((((float) point.x) - this.f627ll) - ((float) this.f641lz.left)) - ((float) this.f640ly.x)) / (this.f636lu * (((float) this.f641lz.width()) / this.f625lj)));
            point2.y = (int) ((((((float) point.y) - this.f628lm) - ((float) this.f641lz.top)) - ((float) this.f640ly.y)) / (this.f636lu * (((float) this.f641lz.height()) / this.f626lk)));
        } else {
            point2.x = (int) ((((((float) point.x) - this.f627ll) - ((float) this.f641lz.left)) - ((float) this.f640ly.x)) / (((float) this.f641lz.width()) / this.f625lj));
            point2.y = (int) ((((((float) point.y) - this.f628lm) - ((float) this.f641lz.top)) - ((float) this.f640ly.y)) / (((float) this.f641lz.height()) / this.f626lk));
        }
        return point2;
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putBoolean("retainImage", this.f609lI);
        if (this.f609lI) {
            m472aA();
            String str = this.f608lH;
            if (str != null) {
                bundle.putString("bitmapKey", str);
            }
        }
        bundle.putSerializable("cacheType", this.f611lK);
        bundle.putParcelable("displayrect", this.f641lz);
        bundle.putFloat("currentScale", this.f636lu);
        bundle.putFloat("imgHt", this.f626lk);
        bundle.putFloat("imgWd", this.f625lj);
        bundle.putIntArray("p1", new int[]{this.f634ls.x, this.f634ls.y});
        bundle.putIntArray("p2", new int[]{this.f633lr.x, this.f633lr.y});
        bundle.putIntArray("p3", new int[]{this.f632lq.x, this.f632lq.y});
        bundle.putIntArray("p4", new int[]{this.f631lp.x, this.f631lp.y});
        bundle.putInt("linecolor", this.f603lC);
        bundle.putInt("cornercolor", this.f604lD);
        bundle.putSerializable("boundingTetragon", this.f607lG);
        BoundingTetragon boundingTetragon = this.f607lG;
        if (boundingTetragon != null) {
            bundle.putSerializable("boundingTetragon", boundingTetragon);
        }
        bundle.putBoolean("isVisibleRectangle", this.f635lt);
        bundle.putBoolean("isMoving", this.f623lh);
        bundle.putBoolean("isCropTetragonSetbyUser", this.f614lN);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = this.f638lw;
            if (bitmap != null) {
                bitmap.recycle();
                this.f638lw = null;
            }
            ImageCacheType imageCacheType = (ImageCacheType) bundle.getSerializable("cacheType");
            this.f611lK = imageCacheType;
            setImageCacheType(imageCacheType);
            this.f609lI = bundle.getBoolean("retainImage");
            this.f608lH = bundle.getString("bitmapKey");
            if (this.f609lI) {
                m473aB();
            } else {
                m474aC();
            }
            this.f636lu = bundle.getFloat("currentScale", this.f636lu);
            this.f603lC = bundle.getInt("linecolor");
            this.f604lD = bundle.getInt("cornercolor");
            this.f635lt = bundle.getBoolean("isVisibleRectangle");
            this.f623lh = bundle.getBoolean("isMoving");
            this.f614lN = bundle.getBoolean("isCropTetragonSetbyUser");
            this.f634ls = new Point(bundle.getIntArray("p1")[0], bundle.getIntArray("p1")[1]);
            this.f633lr = new Point(bundle.getIntArray("p2")[0], bundle.getIntArray("p2")[1]);
            this.f632lq = new Point(bundle.getIntArray("p3")[0], bundle.getIntArray("p3")[1]);
            this.f631lp = new Point(bundle.getIntArray("p4")[0], bundle.getIntArray("p4")[1]);
            this.f620le = false;
            this.f624li = false;
            this.state = 0;
            this.f607lG = (BoundingTetragon) bundle.getSerializable("boundingTetragon");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f638lw != null) {
            this.rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            m475av();
        }
    }

    /* renamed from: az */
    private void m479az() {
        if (!Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_CAPTURE)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_CAPTURE);
        }
    }

    public void clearImage() {
        Bitmap bitmap = this.f638lw;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.image = null;
        clearHighlights();
        invalidate();
        m474aC();
    }

    /* renamed from: aA */
    private void m472aA() {
        Bitmap bitmap = this.f638lw;
        if (bitmap != null && !bitmap.isRecycled() && !m497m(this.f608lH)) {
            m474aC();
            String obj = UUID.randomUUID().toString();
            if (this.f610lJ.mo11136a(obj, this.f638lw)) {
                this.f608lH = obj;
            }
        }
    }

    /* renamed from: m */
    private boolean m497m(String str) {
        C0495c cVar = this.f610lJ;
        return (cVar == null || str == null || cVar.getBitmap(str) == null) ? false : true;
    }

    /* renamed from: aB */
    private void m473aB() {
        String str = this.f608lH;
        if (str != null) {
            this.f638lw = this.f610lJ.mo11138w(str);
            this.f608lH = null;
        }
    }

    /* renamed from: aC */
    private void m474aC() {
        String str = this.f608lH;
        if (str != null) {
            Bitmap w = this.f610lJ.mo11138w(str);
            if (w != null && !w.isRecycled()) {
                w.recycle();
            }
            this.f608lH = null;
        }
    }
}
