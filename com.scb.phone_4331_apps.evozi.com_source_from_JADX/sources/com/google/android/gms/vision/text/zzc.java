package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzy;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

final class zzc {
    static Rect zza(Text text) {
        int i = PKIFailureInfo.systemUnavail;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point point : text.getCornerPoints()) {
            i4 = Math.min(i4, point.x);
            i = Math.max(i, point.x);
            i2 = Math.min(i2, point.y);
            i3 = Math.max(i3, point.y);
        }
        return new Rect(i4, i2, i, i3);
    }

    static Point[] zza(zzy zzy) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians((double) zzy.zzfb));
        double cos = Math.cos(Math.toRadians((double) zzy.zzfb));
        pointArr[0] = new Point(zzy.left, zzy.top);
        pointArr[1] = new Point((int) (((double) zzy.left) + (((double) zzy.width) * cos)), (int) (((double) zzy.top) + (((double) zzy.width) * sin)));
        pointArr[2] = new Point((int) (((double) pointArr[1].x) - (((double) zzy.height) * sin)), (int) (((double) pointArr[1].y) + (((double) zzy.height) * cos)));
        pointArr[3] = new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y));
        return pointArr;
    }
}
