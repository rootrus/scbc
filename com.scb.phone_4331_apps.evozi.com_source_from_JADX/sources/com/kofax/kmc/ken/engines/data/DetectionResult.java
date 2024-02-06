package com.kofax.kmc.ken.engines.data;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.kmc.kut.utilities.RectUtil;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;
import java.util.List;

public abstract class DetectionResult {
    public final BoundingTetragon bounds;

    /* renamed from: cG */
    private Frame f202cG;
    protected final Rect targetRect;

    public abstract HorizontalGuidance getHorizontalMovementGuidance();

    public abstract OrientationGuidance getOrientationGuidance();

    public abstract TurnGuidance getTurnGuidance();

    public abstract VerticalGuidance getVerticalMovementGuidance();

    public abstract ZoomGuidance getZoomGuidance();

    protected DetectionResult(Rect rect, List<Point> list, Frame frame) {
        m200b(rect, "targetRect");
        m200b(frame, "frame");
        this.targetRect = rect;
        this.bounds = RectUtil.buildBoundingTetragon(list);
        this.f202cG = frame;
    }

    public final Rect getTargetRect() {
        return this.targetRect;
    }

    public BoundingTetragon getBounds() {
        return this.bounds;
    }

    public Bitmap getOriginalImage() {
        return this.f202cG.toBitmap();
    }

    public String toString() {
        return String.format("GUIDANCE: %s %s %s %s", new Object[]{getZoomGuidance(), getHorizontalMovementGuidance(), getVerticalMovementGuidance(), getTurnGuidance()});
    }

    /* renamed from: b */
    private static void m200b(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is null");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
