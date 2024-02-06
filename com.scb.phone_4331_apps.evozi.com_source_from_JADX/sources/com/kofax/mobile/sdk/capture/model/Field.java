package com.kofax.mobile.sdk.capture.model;

import java.io.Serializable;

public class Field<T extends Serializable> implements Serializable {
    private final String acX;
    private final double acY;
    private final T acZ;
    private final FieldLocation ada;

    public Field(String str, T t, double d, FieldLocation fieldLocation) {
        this.acX = str;
        this.acZ = t;
        this.acY = d;
        this.ada = fieldLocation;
    }

    public String getName() {
        return this.acX;
    }

    public double getConfidence() {
        return this.acY;
    }

    public T getObject() {
        return this.acZ;
    }

    public FieldLocation getLocation() {
        return this.ada;
    }

    public Field<T> clone() {
        return new Field(this.acX, this.acZ, this.acY, this.ada);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(": ");
        sb.append(getObject());
        sb.append(", Confidence: ");
        sb.append(getConfidence());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.acX.equals(((Field) obj).acX);
    }

    public int hashCode() {
        return this.acX.hashCode();
    }
}
