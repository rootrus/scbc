package com.kofax.kmc.kut.utilities;

import android.graphics.Point;
import android.hardware.Camera;

public class Size {
    public int height;
    public int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public Size(Point point) {
        this.width = point.x;
        this.height = point.y;
    }

    public Size(Camera.Size size) {
        this.width = size.width;
        this.height = size.height;
    }

    public Size(android.util.Size size) {
        this.width = size.getWidth();
        this.height = size.getHeight();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width == size.width && this.height == size.height) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.width * 32713) + this.height;
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
