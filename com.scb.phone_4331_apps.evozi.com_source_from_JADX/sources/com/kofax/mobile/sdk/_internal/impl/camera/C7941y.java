package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Point;
import com.kofax.mobile.sdk._internal.camera.C7892r;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.y */
public class C7941y implements C7892r {
    /* renamed from: a */
    public Point mo54222a(List<Point> list, int i, int i2) {
        float f = Float.MAX_VALUE;
        Point point = null;
        for (Point next : list) {
            float min = (float) Math.min(i / next.x, i2 / next.y);
            if (min - 1.0f < f - 1.0f) {
                point = next;
                f = min;
            }
        }
        return point;
    }
}
