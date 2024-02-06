package com.kofax.mobile.sdk.capture.model;

import java.io.Serializable;

public class PointDouble implements Serializable {

    /* renamed from: x */
    public final double f4794x;

    /* renamed from: y */
    public final double f4795y;

    public PointDouble(double d, double d2) {
        this.f4794x = d;
        this.f4795y = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Point [x = ");
        sb.append(this.f4794x);
        sb.append(", y = ");
        sb.append(this.f4795y);
        sb.append("]");
        return sb.toString();
    }
}
