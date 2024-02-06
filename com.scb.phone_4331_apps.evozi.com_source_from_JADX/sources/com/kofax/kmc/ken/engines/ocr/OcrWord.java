package com.kofax.kmc.ken.engines.ocr;

public class OcrWord {

    /* renamed from: hS */
    String f3397hS;

    /* renamed from: hU */
    private int f3398hU;

    /* renamed from: hV */
    private int f3399hV;

    /* renamed from: hW */
    private int f3400hW;

    /* renamed from: hX */
    private int f3401hX;
    int height;
    int width;

    /* renamed from: x */
    int f3402x;

    /* renamed from: y */
    int f3403y;

    public String getText() {
        return this.f3397hS;
    }

    public void setText(String str) {
        this.f3397hS = str;
    }

    public int getX() {
        return this.f3402x;
    }

    public void setX(int i) {
        this.f3402x = i;
    }

    public int getY() {
        return this.f3403y;
    }

    public void setY(int i) {
        this.f3403y = i;
    }

    public int getWidth() {
        return this.f3400hW - this.f3401hX;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.f3398hU - this.f3399hV;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    /* access modifiers changed from: protected */
    public void setBRy(int i) {
        this.f3398hU = i;
    }

    /* access modifiers changed from: protected */
    public void setTRy(int i) {
        this.f3399hV = i;
    }

    /* access modifiers changed from: protected */
    public void setTRx(int i) {
        this.f3400hW = i;
    }

    /* access modifiers changed from: protected */
    public void setTLx(int i) {
        this.f3401hX = i;
    }
}
