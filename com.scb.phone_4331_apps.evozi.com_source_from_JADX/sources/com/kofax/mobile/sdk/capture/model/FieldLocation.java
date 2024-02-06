package com.kofax.mobile.sdk.capture.model;

import android.graphics.RectF;
import java.io.Serializable;

public class FieldLocation implements Serializable {
    public static final FieldLocation UNDEFINED = new FieldLocation(0.0d, 0.0d, 0.0d, 0.0d);
    public final PointDouble origin;
    public final SizeDouble size;

    public FieldLocation(double d, double d2, double d3, double d4) {
        this.origin = new PointDouble(d, d2);
        this.size = new SizeDouble(d3, d4);
    }

    public FieldLocation(RectF rectF) {
        this((double) rectF.left, (double) rectF.top, (double) rectF.width(), (double) rectF.height());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Location [");
        sb.append(this.origin);
        sb.append(",  ");
        sb.append(this.size);
        sb.append("]");
        return sb.toString();
    }

    public boolean isUndefined() {
        return this.origin.f4794x == 0.0d && this.origin.f4795y == 0.0d && this.size.width == 0.0d && this.size.height == 0.0d;
    }
}
