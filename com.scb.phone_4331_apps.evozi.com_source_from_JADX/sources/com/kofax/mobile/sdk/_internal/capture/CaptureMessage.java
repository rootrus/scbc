package com.kofax.mobile.sdk._internal.capture;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

public class CaptureMessage {
    private int _height = -1;
    private int _width = -1;
    private int position = 1;

    /* renamed from: tA */
    private int f1056tA = -1;

    /* renamed from: tB */
    private Typeface f1057tB;

    /* renamed from: tC */
    private String f1058tC;

    /* renamed from: tD */
    private boolean f1059tD = true;

    /* renamed from: tE */
    private KUIMessageOrientation f1060tE = KUIMessageOrientation.UNKNOWN;

    /* renamed from: tF */
    private Bitmap[] f1061tF = new Bitmap[0];

    /* renamed from: tv */
    private int f1062tv = -1;

    /* renamed from: tw */
    private int f1063tw = 0;

    /* renamed from: tx */
    private Drawable f1064tx;

    /* renamed from: ty */
    private int f1065ty = -1;

    /* renamed from: tz */
    private int f1066tz = -1;

    public enum KUIMessageOrientation {
        PORTRAIT,
        LANDSCAPE,
        REVERSEPORTRAIT,
        REVERSELANDSCAPE,
        UNKNOWN
    }

    public CaptureMessage copy() {
        CaptureMessage captureMessage = new CaptureMessage();
        captureMessage.f1062tv = this.f1062tv;
        captureMessage.f1063tw = this.f1063tw;
        captureMessage.f1064tx = this.f1064tx;
        captureMessage.f1065ty = this.f1065ty;
        captureMessage.f1066tz = this.f1066tz;
        captureMessage._width = this._width;
        captureMessage._height = this._height;
        captureMessage.f1056tA = this.f1056tA;
        captureMessage.f1057tB = this.f1057tB;
        captureMessage.f1058tC = this.f1058tC;
        captureMessage.f1059tD = this.f1059tD;
        captureMessage.f1060tE = this.f1060tE;
        captureMessage.f1061tF = this.f1061tF;
        captureMessage.position = this.position;
        return captureMessage;
    }

    public int getTextColor() {
        return this.f1062tv;
    }

    public void setTextColor(int i) {
        this.f1062tv = i;
    }

    public int getBackgroundColor() {
        return this.f1063tw;
    }

    public void setBackgroundColor(int i) {
        this.f1063tw = i;
    }

    public Drawable getBackground() {
        return this.f1064tx;
    }

    public void setBackground(Drawable drawable) {
        this.f1064tx = drawable;
    }

    public int getPosX() {
        return this.f1065ty;
    }

    public void setPosX(int i) {
        this.f1065ty = i;
    }

    public int getPosY() {
        return this.f1066tz;
    }

    public void setPosY(int i) {
        this.f1066tz = i;
    }

    public int getWidth() {
        return this._width;
    }

    public void setWidth(int i) {
        this._width = i;
    }

    public int getHeight() {
        return this._height;
    }

    public void setHeight(int i) {
        this._height = i;
    }

    public int getTextSize() {
        return this.f1056tA;
    }

    public void setTextSize(int i) {
        this.f1056tA = i;
    }

    public Typeface getTypeface() {
        return this.f1057tB;
    }

    public void setTypeface(Typeface typeface) {
        this.f1057tB = typeface;
    }

    public String getMessage() {
        return this.f1058tC;
    }

    public void setMessage(String str) {
        this.f1058tC = str;
    }

    public boolean getVisibility() {
        return this.f1059tD;
    }

    public void setVisibility(boolean z) {
        this.f1059tD = z;
    }

    public void setOrientation(KUIMessageOrientation kUIMessageOrientation) {
        this.f1060tE = kUIMessageOrientation;
    }

    public KUIMessageOrientation getOrientation() {
        return this.f1060tE;
    }

    public void setMessageIcons(Bitmap[] bitmapArr) {
        this.f1061tF = bitmapArr;
    }

    public Bitmap[] getMessageIcons() {
        return this.f1061tF;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureMessage)) {
            return false;
        }
        CaptureMessage captureMessage = (CaptureMessage) obj;
        if (this.f1063tw != captureMessage.f1063tw || this.f1062tv != captureMessage.f1062tv || this.f1065ty != captureMessage.f1065ty || this.f1066tz != captureMessage.f1066tz || this.f1056tA != captureMessage.f1056tA) {
            return false;
        }
        Drawable drawable = this.f1064tx;
        if (drawable == null ? captureMessage.f1064tx != null : !drawable.equals(captureMessage.f1064tx)) {
            return false;
        }
        String str = this.f1058tC;
        if (str == null ? captureMessage.f1058tC != null : !str.equals(captureMessage.f1058tC)) {
            return false;
        }
        if (this.f1060tE != captureMessage.f1060tE) {
            return false;
        }
        Typeface typeface = this.f1057tB;
        Typeface typeface2 = captureMessage.f1057tB;
        return typeface == null ? typeface2 == null : typeface.equals(typeface2);
    }

    public int hashCode() {
        int i = this.f1062tv;
        int i2 = this.f1063tw;
        Drawable drawable = this.f1064tx;
        int i3 = 0;
        int hashCode = drawable != null ? drawable.hashCode() : 0;
        int i4 = this.f1065ty;
        int i5 = this.f1066tz;
        int i6 = this.f1056tA;
        Typeface typeface = this.f1057tB;
        int hashCode2 = typeface != null ? typeface.hashCode() : 0;
        String str = this.f1058tC;
        int hashCode3 = str != null ? str.hashCode() : 0;
        KUIMessageOrientation kUIMessageOrientation = this.f1060tE;
        if (kUIMessageOrientation != null) {
            i3 = kUIMessageOrientation.hashCode();
        }
        return (((((((((((((((i * 31) + i2) * 31) + hashCode) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + hashCode2) * 31) + hashCode3) * 31) + i3;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        this.position = i;
    }
}
