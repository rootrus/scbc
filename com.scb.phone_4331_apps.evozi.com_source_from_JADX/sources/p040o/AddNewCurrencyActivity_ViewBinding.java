package p040o;

import java.util.ArrayList;

/* renamed from: o.AddNewCurrencyActivity_ViewBinding */
public final class AddNewCurrencyActivity_ViewBinding {
    public boolean MediaBrowserCompat$ItemReceiver = true;

    public AddNewCurrencyActivity_ViewBinding() {
        new ArrayList().add(String.class);
    }

    public final AddNewCurrencyActivity_ViewBinding read(Object obj, Object obj2) {
        if (!this.MediaBrowserCompat$ItemReceiver || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            this.MediaBrowserCompat$ItemReceiver = false;
            return this;
        }
        if (obj.getClass().isArray()) {
            write(obj, obj2);
        } else {
            this.MediaBrowserCompat$ItemReceiver = obj.equals(obj2);
        }
        return this;
    }

    private void write(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (obj.getClass() != obj2.getClass()) {
            this.MediaBrowserCompat$ItemReceiver = false;
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && jArr != jArr2) {
                if (jArr == null || jArr2 == null || jArr.length != jArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i = 0; i < jArr.length && (z8 = this.MediaBrowserCompat$ItemReceiver); i++) {
                    long j = jArr[i];
                    long j2 = jArr2[i];
                    if (z8) {
                        this.MediaBrowserCompat$ItemReceiver = j == j2;
                    }
                }
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && iArr != iArr2) {
                if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i2 = 0; i2 < iArr.length && (z7 = this.MediaBrowserCompat$ItemReceiver); i2++) {
                    int i3 = iArr[i2];
                    int i4 = iArr2[i2];
                    if (z7) {
                        this.MediaBrowserCompat$ItemReceiver = i3 == i4;
                    }
                }
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            short[] sArr2 = (short[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && sArr != sArr2) {
                if (sArr == null || sArr2 == null || sArr.length != sArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i5 = 0; i5 < sArr.length && (z6 = this.MediaBrowserCompat$ItemReceiver); i5++) {
                    short s = sArr[i5];
                    short s2 = sArr2[i5];
                    if (z6) {
                        this.MediaBrowserCompat$ItemReceiver = s == s2;
                    }
                }
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            char[] cArr2 = (char[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && cArr != cArr2) {
                if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i6 = 0; i6 < cArr.length && (z5 = this.MediaBrowserCompat$ItemReceiver); i6++) {
                    char c = cArr[i6];
                    char c2 = cArr2[i6];
                    if (z5) {
                        this.MediaBrowserCompat$ItemReceiver = c == c2;
                    }
                }
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && bArr != bArr2) {
                if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i7 = 0; i7 < bArr.length && (z4 = this.MediaBrowserCompat$ItemReceiver); i7++) {
                    byte b = bArr[i7];
                    byte b2 = bArr2[i7];
                    if (z4) {
                        this.MediaBrowserCompat$ItemReceiver = b == b2;
                    }
                }
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && dArr != dArr2) {
                if (dArr == null || dArr2 == null || dArr.length != dArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i8 = 0; i8 < dArr.length && (z3 = this.MediaBrowserCompat$ItemReceiver); i8++) {
                    double d = dArr[i8];
                    double d2 = dArr2[i8];
                    if (z3) {
                        long doubleToLongBits = Double.doubleToLongBits(d);
                        long doubleToLongBits2 = Double.doubleToLongBits(d2);
                        if (this.MediaBrowserCompat$ItemReceiver) {
                            this.MediaBrowserCompat$ItemReceiver = doubleToLongBits == doubleToLongBits2;
                        }
                    }
                }
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && fArr != fArr2) {
                if (fArr == null || fArr2 == null || fArr.length != fArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i9 = 0; i9 < fArr.length && (z2 = this.MediaBrowserCompat$ItemReceiver); i9++) {
                    float f = fArr[i9];
                    float f2 = fArr2[i9];
                    if (z2) {
                        int floatToIntBits = Float.floatToIntBits(f);
                        int floatToIntBits2 = Float.floatToIntBits(f2);
                        if (this.MediaBrowserCompat$ItemReceiver) {
                            this.MediaBrowserCompat$ItemReceiver = floatToIntBits == floatToIntBits2;
                        }
                    }
                }
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && zArr != zArr2) {
                if (zArr == null || zArr2 == null || zArr.length != zArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i10 = 0; i10 < zArr.length && (z = this.MediaBrowserCompat$ItemReceiver); i10++) {
                    boolean z9 = zArr[i10];
                    boolean z10 = zArr2[i10];
                    if (z) {
                        this.MediaBrowserCompat$ItemReceiver = z9 == z10;
                    }
                }
            }
        } else {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (this.MediaBrowserCompat$ItemReceiver && objArr != objArr2) {
                if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                    return;
                }
                for (int i11 = 0; i11 < objArr.length && this.MediaBrowserCompat$ItemReceiver; i11++) {
                    read(objArr[i11], objArr2[i11]);
                }
            }
        }
    }
}
