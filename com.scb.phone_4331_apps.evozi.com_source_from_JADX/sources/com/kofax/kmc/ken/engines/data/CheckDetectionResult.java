package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;
import java.util.List;

public abstract class CheckDetectionResult extends DetectionResult {
    protected final CheckSide side;

    public CheckDetectionResult(Rect rect, List<Point> list, Frame frame, CheckSide checkSide) {
        super(rect, list, frame);
        if (checkSide != null) {
            this.side = checkSide;
            return;
        }
        throw new IllegalArgumentException("side is null");
    }

    public final CheckSide getCheckSide() {
        return this.side;
    }
}
