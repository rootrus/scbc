package com.kofax.kmc.kut.utilities;

import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class RectUtil {
    public static final void fit(Rect rect, Rect rect2, Point point, double d, double d2) throws IllegalArgumentException {
        double d3;
        double d4;
        double d5;
        if (rect == null || rect.width() <= 0 || rect.height() <= 0) {
            throw new IllegalArgumentException("outer rect cannot be null or empty");
        } else if (rect2 != null) {
            double c = m513c(d) * 0.02d;
            double width = ((double) rect.width()) - (((double) rect.width()) * c);
            double height = ((double) rect.height()) - (((double) rect.height()) * c);
            int round = (int) Math.round((((double) rect.width()) - width) / 2.0d);
            int round2 = (int) Math.round(((double) round) + width);
            int round3 = (int) Math.round((((double) rect.height()) - height) / 2.0d);
            int round4 = (int) Math.round(((double) round3) + height);
            if (point.x <= round || point.x >= round2) {
                throw new IllegalArgumentException("center.x is not inside outer, less padding");
            } else if (point.y <= round3 || point.y >= round4) {
                throw new IllegalArgumentException("center.y is not inside outer, less padding");
            } else {
                double min = (double) (Math.min(point.x - round, round2 - point.x) << 1);
                double min2 = (double) (Math.min(point.y - round3, round4 - point.y) << 1);
                if (0.0d >= d2 || d2 >= 1.0d) {
                    int i = (d2 > 1.0d ? 1 : (d2 == 1.0d ? 0 : -1));
                    if (i > 0) {
                        d4 = min / d2;
                        d3 = min;
                    } else if (i == 0) {
                        d3 = min > min2 ? min2 : min;
                        d4 = d3;
                    } else {
                        d5 = min;
                    }
                    if (d3 > min || d4 > min2) {
                        double min3 = Math.min(min / d3, min2 / d4);
                        d3 *= min3;
                        d4 *= min3;
                    }
                    int round5 = (int) Math.round(((double) point.x) - (d3 / 2.0d));
                    int round6 = (int) Math.round(((double) point.y) - (d4 / 2.0d));
                    rect2.set(round5, round6, (int) Math.round(((double) round5) + d3), (int) Math.round(((double) round6) + d4));
                }
                d5 = d2 * min2;
                d4 = min2;
                double min32 = Math.min(min / d3, min2 / d4);
                d3 *= min32;
                d4 *= min32;
                int round52 = (int) Math.round(((double) point.x) - (d3 / 2.0d));
                int round62 = (int) Math.round(((double) point.y) - (d4 / 2.0d));
                rect2.set(round52, round62, (int) Math.round(((double) round52) + d3), (int) Math.round(((double) round62) + d4));
            }
        } else {
            throw new IllegalArgumentException("inner rect cannot be null");
        }
    }

    public static boolean containsPoint(Point point, Rect rect, double d) {
        if (point == null) {
            throw new IllegalArgumentException("point is null");
        } else if (rect != null) {
            double c = m513c(d) * 0.02d;
            double width = ((double) rect.width()) - (((double) rect.width()) * c);
            double height = ((double) rect.height()) - (((double) rect.height()) * c);
            int round = (int) Math.round((((double) rect.width()) - width) / 2.0d);
            int round2 = (int) Math.round(((double) round) + width);
            int round3 = (int) Math.round((((double) rect.height()) - height) / 2.0d);
            return round < point.x && point.x < round2 && round3 < point.y && point.y < ((int) Math.round(((double) round3) + height));
        } else {
            throw new IllegalArgumentException("rect is null");
        }
    }

    /* renamed from: c */
    private static double m513c(double d) {
        return Math.min(Math.max(d, 0.0d), 50.0d);
    }

    public static List<Point> sort(Point point, Point point2, Point point3, Point point4, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        arrayList.add(point2);
        arrayList.add(point3);
        arrayList.add(point4);
        List<Point> sort = sort(arrayList, rect);
        Collections.swap(sort, 0, 3);
        Collections.swap(sort, 1, 2);
        return sort;
    }

    public static List<Point> sort(List<Point> list, Rect rect) {
        bound(list, rect);
        Collections.sort(list, new C0475a(new Point(rect.centerX(), rect.centerY())));
        return list;
    }

    /* renamed from: com.kofax.kmc.kut.utilities.RectUtil$a */
    static class C0475a implements Comparator<Point> {

        /* renamed from: nS */
        private final Point f710nS;

        public C0475a(Point point) {
            if (point != null) {
                this.f710nS = point;
                return;
            }
            throw new IllegalArgumentException("center cannot be null");
        }

        /* renamed from: f */
        public int compare(Point point, Point point2) {
            if (point == null || point2 == null) {
                throw new IllegalArgumentException("neither a nor b can be null");
            } else if (point.x - this.f710nS.x >= 0 && point2.x - this.f710nS.x < 0) {
                return -1;
            } else {
                if (point.x - this.f710nS.x < 0 && point2.x - this.f710nS.x >= 0) {
                    return 1;
                }
                if (point.x - this.f710nS.x != 0 || point2.x - this.f710nS.x != 0) {
                    int i = ((point.x - this.f710nS.x) * (point2.y - this.f710nS.y)) - ((point2.x - this.f710nS.x) * (point.y - this.f710nS.y));
                    if (i < 0) {
                        return -1;
                    }
                    if (i > 0) {
                        return 1;
                    }
                    if (((point.x - this.f710nS.x) * (point.x - this.f710nS.x)) + ((point.y - this.f710nS.y) * (point.y - this.f710nS.y)) > ((point2.x - this.f710nS.x) * (point2.x - this.f710nS.x)) + ((point2.y - this.f710nS.y) * (point2.y - this.f710nS.y))) {
                        return 1;
                    }
                    return -1;
                } else if (point.y - this.f710nS.y >= 0 || point2.y - this.f710nS.y >= 0) {
                    if (point.y <= point2.y) {
                        return 1;
                    }
                    return -1;
                } else if (point2.y > point.y) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }

    public static void bound(List<Point> list, Rect rect) {
        if (list == null || list.size() != 4) {
            throw new IllegalArgumentException("points list must be of size equal to 4");
        } else if (list.indexOf((Object) null) != -1) {
            throw new IllegalArgumentException("No point in points may be null");
        } else if (rect != null) {
            Point point = list.get(0);
            Point point2 = list.get(1);
            Point point3 = list.get(2);
            Point point4 = list.get(3);
            rect.set(Math.min(point.x, Math.min(Math.min(point2.x, point3.x), point4.x)), Math.min(point.y, Math.min(Math.min(point2.y, point3.y), point4.y)), Math.max(point.x, Math.max(Math.max(point2.x, point3.x), point4.x)), Math.max(point.y, Math.max(Math.max(point2.y, point3.y), point4.y)));
        } else {
            throw new IllegalArgumentException("bound may not be null");
        }
    }

    public static Rect scale(Rect rect, double d, double d2) {
        rect.left = (int) (((double) rect.left) * d);
        rect.right = (int) (((double) rect.right) * d);
        rect.top = (int) (((double) rect.top) * d2);
        rect.bottom = (int) (((double) rect.bottom) * d2);
        return rect;
    }

    public static Rect createTargetRect(double d, double d2, Point point, int i, int i2) {
        Point point2;
        if (i < i2 && d2 != 0.0d) {
            d2 = 1.0d / d2;
        }
        double d3 = d2;
        Rect rect = new Rect(0, 0, i, i2);
        Point point3 = new Point();
        if (point == null) {
            point3.set((int) Math.round(((double) i) / 2.0d), (int) Math.round(((double) i2) / 2.0d));
            point2 = point3;
        } else {
            point2 = point;
        }
        if (containsPoint(point2, rect, d)) {
            Rect rect2 = new Rect();
            fit(rect, rect2, point2, d, d3);
            return rect2;
        }
        throw new IllegalArgumentException("target frame is invalid: the center point is not inside the area defined by the padding");
    }

    public static BoundingTetragon buildBoundingTetragon(List<Point> list) {
        if (list == null || list.size() != 4) {
            return null;
        }
        List<Point> sort = sort(list.get(0), list.get(1), list.get(2), list.get(3), (Rect) null);
        return new BoundingTetragon(sort.get(1), sort.get(2), sort.get(0), sort.get(3));
    }
}
