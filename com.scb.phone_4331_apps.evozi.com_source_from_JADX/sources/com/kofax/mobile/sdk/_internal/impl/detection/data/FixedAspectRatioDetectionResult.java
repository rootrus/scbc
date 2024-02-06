package com.kofax.mobile.sdk._internal.impl.detection.data;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.kut.utilities.RectUtil;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;
import java.util.List;

public abstract class FixedAspectRatioDetectionResult {
    private final BoundingTetragon bounds;

    /* renamed from: cG */
    private Frame f3685cG;
    private final Rect targetRect;

    public abstract EdgeGuidance getEdgesGuidance();

    public FixedAspectRatioDetectionResult(Rect rect, List<Point> list, Frame frame) {
        m3910b(rect, "targetRect");
        m3910b(frame, "frame");
        this.targetRect = rect;
        this.bounds = RectUtil.buildBoundingTetragon(list);
        this.f3685cG = frame;
    }

    public final Rect getTargetRect() {
        return this.targetRect;
    }

    public BoundingTetragon getBounds() {
        return this.bounds;
    }

    public Bitmap getOriginalImage() {
        return this.f3685cG.toBitmap();
    }

    /* renamed from: b */
    private static void m3910b(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is null");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
