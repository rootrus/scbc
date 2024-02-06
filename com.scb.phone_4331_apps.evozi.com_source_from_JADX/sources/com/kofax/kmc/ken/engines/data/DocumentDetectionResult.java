package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;
import java.util.List;

public abstract class DocumentDetectionResult extends DetectionResult {
    public DocumentDetectionResult(Rect rect, List<Point> list, Frame frame) {
        super(rect, list, frame);
    }
}
