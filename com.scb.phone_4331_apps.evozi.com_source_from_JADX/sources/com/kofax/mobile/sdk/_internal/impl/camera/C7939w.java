package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Point;
import com.kofax.mobile.sdk._internal.camera.C7892r;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.w */
public class C7939w implements C7892r {
    /* renamed from: a */
    public Point mo54222a(List<Point> list, int i, int i2) {
        for (Point next : list) {
            if (m3899h(next)) {
                return next;
            }
        }
        return m3900o(list);
    }

    /* renamed from: h */
    private boolean m3899h(Point point) {
        return (point.x == 1920 && point.y == 1080) || (point.x == 1080 && point.y == 1920);
    }

    /* renamed from: o */
    private Point m3900o(List<Point> list) {
        int i = 0;
        Point point = new Point(0, 0);
        for (Point next : list) {
            int i2 = next.x * next.y;
            if (i2 > i) {
                point = next;
                i = i2;
            }
        }
        return point;
    }
}
