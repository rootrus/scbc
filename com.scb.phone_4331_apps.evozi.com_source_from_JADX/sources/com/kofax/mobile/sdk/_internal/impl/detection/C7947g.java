package com.kofax.mobile.sdk._internal.impl.detection;

import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.mobile.sdk._internal.impl.detection.data.EdgeGuidance;
import com.kofax.mobile.sdk._internal.impl.detection.data.FixedAspectRatioDetectionResult;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.detection.g */
class C7947g extends FixedAspectRatioDetectionResult {

    /* renamed from: Hy */
    private final EdgeGuidance f3696Hy;

    C7947g(Rect rect, List<Point> list, Frame frame, boolean[] zArr) {
        super(rect, list, frame);
        this.f3696Hy = new EdgeGuidance(zArr);
    }

    public EdgeGuidance getEdgesGuidance() {
        return this.f3696Hy;
    }
}
