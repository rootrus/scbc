package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;

public class CaptureMessage {

    /* renamed from: mM */
    com.kofax.mobile.sdk._internal.capture.CaptureMessage f681mM;

    public enum KUIMessageOrientation {
        PORTRAIT,
        LANDSCAPE,
        REVERSEPORTRAIT,
        REVERSELANDSCAPE,
        UNKNOWN
    }

    public CaptureMessage() {
        this.f681mM = new com.kofax.mobile.sdk._internal.capture.CaptureMessage();
    }

    CaptureMessage(com.kofax.mobile.sdk._internal.capture.CaptureMessage captureMessage) {
        this.f681mM = captureMessage;
    }

    public int getTextColor() {
        return this.f681mM.getTextColor();
    }

    public void setTextColor(int i) {
        this.f681mM.setTextColor(i);
    }

    public int getBackgroundColor() {
        return this.f681mM.getBackgroundColor();
    }

    public void setBackgroundColor(int i) {
        this.f681mM.setBackgroundColor(i);
    }

    public Drawable getBackground() {
        return this.f681mM.getBackground();
    }

    public void setBackground(Drawable drawable) {
        this.f681mM.setBackground(drawable);
    }

    public int getPosX() {
        return this.f681mM.getPosX();
    }

    public void setPosX(int i) {
        this.f681mM.setPosX(i);
    }

    public int getPosY() {
        return this.f681mM.getPosY();
    }

    public void setPosY(int i) {
        this.f681mM.setPosY(i);
    }

    public int getWidth() {
        return this.f681mM.getWidth();
    }

    public void setWidth(int i) {
        this.f681mM.setWidth(i);
    }

    public int getHeight() {
        return this.f681mM.getHeight();
    }

    public void setHeight(int i) {
        this.f681mM.setHeight(i);
    }

    public int getTextSize() {
        return this.f681mM.getTextSize();
    }

    public void setTextSize(int i) {
        this.f681mM.setTextSize(i);
    }

    public Typeface getTypeface() {
        return this.f681mM.getTypeface();
    }

    public void setTypeface(Typeface typeface) {
        this.f681mM.setTypeface(typeface);
    }

    public String getMessage() {
        return this.f681mM.getMessage();
    }

    public void setMessage(String str) {
        this.f681mM.setMessage(str);
    }

    public boolean getVisibility() {
        return this.f681mM.getVisibility();
    }

    public void setVisibility(boolean z) {
        this.f681mM.setVisibility(z);
    }

    public void setOrientation(KUIMessageOrientation kUIMessageOrientation) {
        this.f681mM.setOrientation(CaptureMessage.KUIMessageOrientation.valueOf(kUIMessageOrientation.name()));
    }

    public KUIMessageOrientation getOrientation() {
        return KUIMessageOrientation.valueOf(this.f681mM.getOrientation().name());
    }

    public void setMessageIcons(Bitmap[] bitmapArr) {
        this.f681mM.setMessageIcons(bitmapArr);
    }

    public Bitmap[] getMessageIcons() {
        return this.f681mM.getMessageIcons();
    }
}
