package com.kofax.mobile.sdk.capture.model;

import java.io.Serializable;

public class SizeDouble implements Serializable {
    public final double height;
    public final double width;

    public SizeDouble(double d, double d2) {
        this.width = d;
        this.height = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Size [width = ");
        sb.append(this.width);
        sb.append(", height = ");
        sb.append(this.height);
        sb.append("]");
        return sb.toString();
    }
}
