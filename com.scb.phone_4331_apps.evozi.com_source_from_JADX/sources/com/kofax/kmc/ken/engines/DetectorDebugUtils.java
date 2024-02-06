package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.DetectionResult;
import com.kofax.mobile.sdk._internal.C0767k;

public class DetectorDebugUtils {

    /* renamed from: P */
    private static float f3307P = 6.0f;

    /* renamed from: Q */
    private static Paint f3308Q;

    public static Bitmap getBitmap(DetectionResult detectionResult) {
        Paint paint = new Paint(1);
        f3308Q = paint;
        paint.setStyle(Paint.Style.STROKE);
        Canvas canvas = new Canvas(detectionResult.getOriginalImage());
        f3308Q.setStrokeWidth(f3307P);
        Path e = m3708e(detectionResult.getBounds());
        f3308Q.setColor(-65536);
        canvas.drawPath(e, f3308Q);
        Rect targetRect = detectionResult.getTargetRect();
        Path e2 = m3708e(new BoundingTetragon(targetRect.left, targetRect.top, targetRect.right, targetRect.top, targetRect.left, targetRect.bottom, targetRect.right, targetRect.bottom));
        f3308Q.setColor(-16711936);
        canvas.drawPath(e2, f3308Q);
        return detectionResult.getOriginalImage();
    }

    /* renamed from: e */
    private static Path m3708e(BoundingTetragon boundingTetragon) {
        Path path = new Path();
        float f = (float) boundingTetragon.getBottomLeft().x;
        float f2 = (float) boundingTetragon.getBottomLeft().y;
        float f3 = (float) boundingTetragon.getTopLeft().x;
        float f4 = (float) boundingTetragon.getTopLeft().y;
        float f5 = (float) boundingTetragon.getTopRight().x;
        float f6 = (float) boundingTetragon.getTopRight().y;
        float f7 = (float) boundingTetragon.getBottomRight().x;
        float f8 = (float) boundingTetragon.getBottomRight().y;
        StringBuilder sb = new StringBuilder();
        sb.append("BottomLeft:");
        sb.append(f);
        sb.append(",");
        sb.append(f2);
        sb.append(", getTopLeft: ");
        sb.append(f3);
        sb.append(",");
        sb.append(f4);
        sb.append("TopRight:");
        sb.append(f5);
        sb.append(",");
        sb.append(f6);
        sb.append(" , getBottomRight");
        sb.append(f7);
        sb.append(",");
        sb.append(f8);
        C0767k.m1807c("CapturePageBoundaryView", sb.toString());
        float f9 = (f3307P / 2.0f) - 2.0f;
        path.reset();
        path.moveTo(f - f9, f2 + f9);
        path.lineTo(f3 - f9, f4 - f9);
        path.lineTo(f5 + f9, f6 - f9);
        path.lineTo(f7 + f9, f8 + f9);
        path.close();
        return path;
    }
}
