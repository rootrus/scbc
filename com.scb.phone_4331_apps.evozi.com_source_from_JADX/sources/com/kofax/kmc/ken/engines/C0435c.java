package com.kofax.kmc.ken.engines;

import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.OrientationGuidance;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;
import java.util.List;

/* renamed from: com.kofax.kmc.ken.engines.c */
class C0435c extends DocumentDetectionResult {

    /* renamed from: L */
    private ZoomGuidance f159L;

    /* renamed from: R */
    private final DocumentDetectionSettings f160R;

    /* renamed from: S */
    private final C0443g f161S;

    /* renamed from: T */
    private final IBoundingRectCalculator f162T;

    /* renamed from: U */
    private final OrientationGuidance f163U;
    private final int _height;
    private final int _width;

    C0435c(Rect rect, List<Point> list, Frame frame, INativeGuidance iNativeGuidance, DocumentDetectionSettings documentDetectionSettings, IBoundingRectCalculator iBoundingRectCalculator, IOrientationGuidanceCalculator iOrientationGuidanceCalculator) {
        super(rect, list, frame);
        this.f160R = documentDetectionSettings;
        this.f161S = new C0434b(iNativeGuidance, documentDetectionSettings, rect);
        this.f162T = iBoundingRectCalculator;
        this.f163U = iOrientationGuidanceCalculator.calculate(rect, this.bounds);
        this._width = frame.getWidth();
        this._height = frame.getHeight();
    }

    public ZoomGuidance getZoomGuidance() {
        if (this.f159L == null) {
            m180a(this._width, this._height);
        }
        return this.f159L;
    }

    public TurnGuidance getTurnGuidance() {
        return this.f161S.getTurnGuidance();
    }

    public HorizontalGuidance getHorizontalMovementGuidance() {
        return this.f161S.getHorizontalMovementGuidance();
    }

    public VerticalGuidance getVerticalMovementGuidance() {
        return this.f161S.getVerticalMovementGuidance();
    }

    public OrientationGuidance getOrientationGuidance() {
        return this.f163U;
    }

    /* renamed from: a */
    private void m180a(int i, int i2) {
        Rect calculate = this.f162T.calculate(getBounds());
        double width = ((double) calculate.width()) / ((double) getTargetRect().width());
        double height = ((double) calculate.height()) / ((double) getTargetRect().height());
        if (i <= i2) {
            double d = width;
            width = height;
            height = d;
        }
        if (width >= this.f160R.getLongEdgeThreshold() || height >= this.f160R.getShortEdgeThreshold()) {
            this.f159L = this.f161S.getZoomGuidance();
        } else {
            this.f159L = ZoomGuidance.ZOOM_IN;
        }
    }
}
