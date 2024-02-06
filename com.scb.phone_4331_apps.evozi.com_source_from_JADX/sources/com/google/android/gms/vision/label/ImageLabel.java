package com.google.android.gms.vision.label;

public class ImageLabel {
    private final String label;
    private final String zzdn;
    private final float zzdo;

    public ImageLabel(String str, String str2, float f) {
        this.zzdn = str;
        this.label = str2;
        this.zzdo = f;
    }

    public String getMid() {
        return this.zzdn;
    }

    public String getLabel() {
        return this.label;
    }

    public float getConfidence() {
        return this.zzdo;
    }
}
