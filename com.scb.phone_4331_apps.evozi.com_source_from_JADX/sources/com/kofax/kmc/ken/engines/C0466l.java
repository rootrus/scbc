package com.kofax.kmc.ken.engines;

import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.OrientationGuidance;

/* renamed from: com.kofax.kmc.ken.engines.l */
class C0466l implements IOrientationGuidanceCalculator {

    /* renamed from: bO */
    private static final double f518bO = 1.1d;

    /* renamed from: bP */
    private static final double f519bP = 0.9090909090909091d;

    /* renamed from: T */
    private final IBoundingRectCalculator f520T;

    /* renamed from: a */
    private static boolean m403a(double d) {
        return f519bP < d && d < f518bO;
    }

    public C0466l(IBoundingRectCalculator iBoundingRectCalculator) {
        this.f520T = iBoundingRectCalculator;
    }

    public OrientationGuidance calculate(Rect rect, BoundingTetragon boundingTetragon) {
        Rect calculate = this.f520T.calculate(boundingTetragon);
        double width = ((double) calculate.width()) / ((double) calculate.height());
        if (m403a(width)) {
            return OrientationGuidance.ORIENTATION_OK;
        }
        double width2 = ((double) rect.width()) / ((double) rect.height());
        if (m403a(width2)) {
            return OrientationGuidance.ORIENTATION_OK;
        }
        if ((width >= 1.0d || width2 <= 1.0d) && (width <= 1.0d || width2 >= 1.0d)) {
            return OrientationGuidance.ORIENTATION_OK;
        }
        return OrientationGuidance.ORIENTATION_CHANGE;
    }
}
