package com.kofax.kmc.ken.engines;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.api.Api;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import java.lang.reflect.Array;

/* renamed from: com.kofax.kmc.ken.engines.a */
class C0433a implements IBoundingRectCalculator {
    C0433a() {
    }

    public Rect calculate(BoundingTetragon boundingTetragon) {
        BoundingTetragon boundingTetragon2;
        if (!m169a(boundingTetragon)) {
            boundingTetragon = m171b(boundingTetragon);
        }
        Point point = new Point(0, 0);
        double a = m166a(boundingTetragon.getBottomLeft(), boundingTetragon.getTopLeft());
        if (a <= 0.7853981633974483d) {
            boundingTetragon2 = m168a(boundingTetragon, point, -a);
        } else {
            boundingTetragon2 = m168a(boundingTetragon, point, 1.5707963267948966d - a);
        }
        int[] c = m172c(boundingTetragon2);
        return new Rect(c[0], c[1], c[2], c[3]);
    }

    /* renamed from: a */
    private static boolean m169a(BoundingTetragon boundingTetragon) {
        Point point = new Point();
        point.x = boundingTetragon.getBottomLeft().x + boundingTetragon.getBottomRight().x + boundingTetragon.getTopLeft().x + boundingTetragon.getTopRight().x;
        point.y = boundingTetragon.getBottomLeft().y + boundingTetragon.getBottomRight().y + boundingTetragon.getTopLeft().y + boundingTetragon.getTopRight().y;
        point.x /= 4;
        point.y /= 4;
        double b = m170b(point, boundingTetragon.getBottomLeft());
        if (Math.abs(b - m170b(point, boundingTetragon.getBottomLeft())) <= 1.0d && Math.abs(b - m170b(point, boundingTetragon.getBottomRight())) <= 1.0d && Math.abs(b - m170b(point, boundingTetragon.getTopLeft())) <= 1.0d && Math.abs(b - m170b(point, boundingTetragon.getTopRight())) <= 1.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static BoundingTetragon m171b(BoundingTetragon boundingTetragon) {
        Point[] pointArr = {boundingTetragon.getBottomLeft(), boundingTetragon.getTopLeft(), boundingTetragon.getTopRight(), boundingTetragon.getBottomRight()};
        Point[] pointArr2 = new Point[4];
        Point[] pointArr3 = new Point[4];
        pointArr3[0] = pointArr[0];
        for (int i = 1; i < 4; i++) {
            pointArr3[i] = pointArr[i];
            pointArr2[i] = pointArr3[i - 1];
        }
        pointArr2[0] = pointArr[3];
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        Point[][] pointArr4 = (Point[][]) Array.newInstance(Point.class, new int[]{4, 4});
        for (int i2 = 0; i2 < 4; i2++) {
            dArr[i2] = Math.atan2((double) (pointArr3[i2].y - pointArr2[i2].y), (double) (pointArr3[i2].x - pointArr2[i2].x));
            pointArr4[i2] = m173d(m168a(boundingTetragon, new Point(0, 0), -dArr[i2]));
            Point point = pointArr4[i2][1];
            Point point2 = pointArr4[i2][3];
            dArr2[i2] = (double) ((point2.x - point.x) * (point2.y - point.y));
        }
        double d = Double.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (dArr2[i4] < d) {
                d = dArr2[i4];
                i3 = i4;
            }
        }
        BoundingTetragon boundingTetragon2 = new BoundingTetragon();
        boundingTetragon2.setBottomLeft(pointArr4[i3][0]);
        boundingTetragon2.setTopLeft(pointArr4[i3][1]);
        boundingTetragon2.setTopRight(pointArr4[i3][2]);
        boundingTetragon2.setBottomRight(pointArr4[i3][3]);
        return m168a(boundingTetragon2, new Point(0, 0), dArr[i3]);
    }

    /* renamed from: a */
    private static double m166a(Point point, Point point2) {
        return (Math.atan2((double) (point2.y - point.y), (double) (point2.x - point.x)) + 3.141592653589793d) % 1.5707963267948966d;
    }

    /* renamed from: a */
    private static BoundingTetragon m168a(BoundingTetragon boundingTetragon, Point point, double d) {
        BoundingTetragon boundingTetragon2 = new BoundingTetragon();
        double sin = Math.sin(d);
        Point point2 = point;
        double d2 = sin;
        double cos = Math.cos(d);
        boundingTetragon2.setBottomLeft(m167a(boundingTetragon.getBottomLeft(), point2, d2, cos));
        boundingTetragon2.setBottomRight(m167a(boundingTetragon.getBottomRight(), point2, d2, cos));
        boundingTetragon2.setTopLeft(m167a(boundingTetragon.getTopLeft(), point2, d2, cos));
        boundingTetragon2.setTopRight(m167a(boundingTetragon.getTopRight(), point2, d2, cos));
        return boundingTetragon2;
    }

    /* renamed from: c */
    private static int[] m172c(BoundingTetragon boundingTetragon) {
        int[] iArr = new int[4];
        Point[] pointArr = {boundingTetragon.getBottomLeft(), boundingTetragon.getBottomRight(), boundingTetragon.getTopRight(), boundingTetragon.getTopLeft()};
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < 4; i5++) {
            if (pointArr[i5].x < i) {
                i = pointArr[i5].x;
            }
            if (pointArr[i5].y < i4) {
                i4 = pointArr[i5].y;
            }
            if (pointArr[i5].x > i2) {
                i2 = pointArr[i5].x;
            }
            if (pointArr[i5].y > i3) {
                i3 = pointArr[i5].y;
            }
        }
        iArr[0] = i;
        iArr[1] = i4;
        iArr[2] = i2;
        iArr[3] = i3;
        return iArr;
    }

    /* renamed from: a */
    private static Point m167a(Point point, Point point2, double d, double d2) {
        Point point3 = new Point();
        point.x -= point2.x;
        point.y -= point2.y;
        double d3 = (double) point.y;
        point3.x = (int) Math.ceil((((double) point.x) * d2) - (((double) point.y) * d));
        point3.y = (int) Math.ceil((((double) point.x) * d) + (d3 * d2));
        point3.x += point2.x;
        point3.y += point2.y;
        return point3;
    }

    /* renamed from: b */
    private static double m170b(Point point, Point point2) {
        double d = (double) (point2.x - point.x);
        double d2 = (double) (point2.y - point.y);
        return (d * d) + (d2 * d2);
    }

    /* renamed from: d */
    private static Point[] m173d(BoundingTetragon boundingTetragon) {
        int[] c = m172c(boundingTetragon);
        return new Point[]{new Point(c[0], c[3]), new Point(c[0], c[1]), new Point(c[2], c[1]), new Point(c[2], c[3])};
    }
}
