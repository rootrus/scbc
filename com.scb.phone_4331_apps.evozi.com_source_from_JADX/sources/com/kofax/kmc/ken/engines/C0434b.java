package com.kofax.kmc.ken.engines;

import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.DetectionSettings;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;
import com.kofax.mobile.sdk._internal.C0767k;

/* renamed from: com.kofax.kmc.ken.engines.b */
class C0434b implements C0443g {

    /* renamed from: F */
    private static final float f149F = 0.01f;
    private static final String TAG = C0434b.class.getSimpleName();

    /* renamed from: G */
    private final INativeGuidance f150G;

    /* renamed from: H */
    private final DetectionSettings f151H;

    /* renamed from: I */
    private final Rect f152I;

    /* renamed from: J */
    private final BoundingTetragon f153J;

    /* renamed from: K */
    private final boolean f154K;

    /* renamed from: L */
    private ZoomGuidance f155L;

    /* renamed from: M */
    private TurnGuidance f156M;

    /* renamed from: N */
    private HorizontalGuidance f157N;

    /* renamed from: O */
    private VerticalGuidance f158O;
    private final int _height;
    private final int _width;

    public C0434b(INativeGuidance iNativeGuidance, DetectionSettings detectionSettings, Rect rect) {
        this(iNativeGuidance, detectionSettings, rect, 0, 0, (BoundingTetragon) null, false);
    }

    public C0434b(INativeGuidance iNativeGuidance, DetectionSettings detectionSettings, Rect rect, int i, int i2, BoundingTetragon boundingTetragon, boolean z) {
        this.f150G = iNativeGuidance;
        this.f151H = detectionSettings;
        this.f152I = rect;
        this.f155L = m175g();
        this.f156M = m176h();
        this.f157N = m177i();
        this.f158O = m178j();
        this._width = i;
        this._height = i2;
        this.f153J = boundingTetragon;
        this.f154K = z;
    }

    public ZoomGuidance getZoomGuidance() {
        return this.f155L;
    }

    /* renamed from: e */
    public ZoomGuidance mo10105e() {
        ZoomGuidance zoomGuidance = this.f155L;
        if (zoomGuidance != ZoomGuidance.ZOOM_OK || this.f157N != HorizontalGuidance.HORIZONTAL_MOVE_OK || this.f158O != VerticalGuidance.VERTICAL_MOVE_OK) {
            return zoomGuidance;
        }
        if (this.f154K && !m174f()) {
            return zoomGuidance;
        }
        C0767k.m1796a(TAG, "ZOOM_OUT guidance: not all edges of document are within image");
        return ZoomGuidance.ZOOM_OUT;
    }

    /* renamed from: f */
    private boolean m174f() {
        float min = Math.min(((float) this._width) * f149F, ((float) this._height) * f149F);
        float f = ((float) this._width) - min;
        float f2 = ((float) this._height) - min;
        Point bottomLeft = this.f153J.getBottomLeft();
        Point topLeft = this.f153J.getTopLeft();
        Point topRight = this.f153J.getTopRight();
        Point bottomRight = this.f153J.getBottomRight();
        return ((float) bottomLeft.x) < min || ((float) bottomLeft.x) > f || ((float) bottomLeft.y) < min || ((float) bottomLeft.y) > f2 || ((float) topLeft.x) < min || ((float) topLeft.x) > f || ((float) topLeft.y) < min || ((float) topLeft.y) > f2 || ((float) topRight.x) < min || ((float) topRight.x) > f || ((float) topRight.y) < min || ((float) topRight.y) > f2 || ((float) bottomRight.x) < min || ((float) bottomRight.x) > f || ((float) bottomRight.y) < min || ((float) bottomRight.y) > f2;
    }

    /* renamed from: g */
    private ZoomGuidance m175g() {
        INativeGuidance iNativeGuidance = this.f150G;
        if (iNativeGuidance != null) {
            double zoomGuidance = iNativeGuidance.getZoomGuidance(this.f152I, this.f151H.getMinFillFraction(), this.f151H.getMaxFillFraction());
            if (zoomGuidance < 0.0d) {
                this.f155L = ZoomGuidance.ZOOM_IN;
            } else if (zoomGuidance > 0.0d) {
                this.f155L = ZoomGuidance.ZOOM_OUT;
            } else {
                this.f155L = ZoomGuidance.ZOOM_OK;
            }
        }
        return this.f155L;
    }

    public TurnGuidance getTurnGuidance() {
        return this.f156M;
    }

    /* renamed from: h */
    private TurnGuidance m176h() {
        INativeGuidance iNativeGuidance = this.f150G;
        if (iNativeGuidance != null) {
            double turnGuidance = iNativeGuidance.getTurnGuidance(this.f151H.getMaxSkewAngle());
            if (turnGuidance < 0.0d) {
                this.f156M = TurnGuidance.TURN_CLOCKWISE;
            } else if (turnGuidance > 0.0d) {
                this.f156M = TurnGuidance.TURN_COUNTER_CLOCKWISE;
            } else {
                this.f156M = TurnGuidance.TURN_OK;
            }
        }
        return this.f156M;
    }

    public HorizontalGuidance getHorizontalMovementGuidance() {
        return this.f157N;
    }

    /* renamed from: i */
    private HorizontalGuidance m177i() {
        INativeGuidance iNativeGuidance = this.f150G;
        if (iNativeGuidance != null) {
            double horizontalMovementGuidance = iNativeGuidance.getHorizontalMovementGuidance(this.f152I, this.f151H.getToleranceFraction());
            if (horizontalMovementGuidance < 0.0d) {
                this.f157N = HorizontalGuidance.HORIZONTAL_MOVE_LEFT;
            } else if (horizontalMovementGuidance > 0.0d) {
                this.f157N = HorizontalGuidance.HORIZONTAL_MOVE_RIGHT;
            } else {
                this.f157N = HorizontalGuidance.HORIZONTAL_MOVE_OK;
            }
        }
        return this.f157N;
    }

    public VerticalGuidance getVerticalMovementGuidance() {
        return this.f158O;
    }

    /* renamed from: j */
    private VerticalGuidance m178j() {
        INativeGuidance iNativeGuidance = this.f150G;
        if (iNativeGuidance != null) {
            double verticalMovementGuidance = iNativeGuidance.getVerticalMovementGuidance(this.f152I, this.f151H.getToleranceFraction());
            if (verticalMovementGuidance < 0.0d) {
                this.f158O = VerticalGuidance.VERTICAL_MOVE_UP;
            } else if (verticalMovementGuidance > 0.0d) {
                this.f158O = VerticalGuidance.VERTICAL_MOVE_DOWN;
            } else {
                this.f158O = VerticalGuidance.VERTICAL_MOVE_OK;
            }
        }
        return this.f158O;
    }
}
