package p040o;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.ButtonBarLayout$MediaBrowserCompat$ItemReceiver */
public class ButtonBarLayout$MediaBrowserCompat$ItemReceiver {
    public char MediaBrowserCompat$CustomActionResultReceiver;
    public float[] MediaBrowserCompat$ItemReceiver;

    ButtonBarLayout$MediaBrowserCompat$ItemReceiver(char c, float[] fArr) {
        this.MediaBrowserCompat$CustomActionResultReceiver = c;
        this.MediaBrowserCompat$ItemReceiver = fArr;
    }

    ButtonBarLayout$MediaBrowserCompat$ItemReceiver(ButtonBarLayout$MediaBrowserCompat$ItemReceiver buttonBarLayout$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = buttonBarLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        float[] fArr = buttonBarLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = ButtonBarLayout.write(fArr, fArr.length);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr, Path path) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        char c;
        int i4;
        float[] fArr2;
        char c2;
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        int i6;
        float f5;
        float f6;
        float f7;
        float f8;
        int i7;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr;
        Path path2 = path;
        int i8 = 6;
        float[] fArr3 = new float[6];
        char c3 = 'm';
        int i9 = 0;
        char c4 = 'm';
        int i10 = 0;
        while (i10 < buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2.length) {
            char c5 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2[i10].MediaBrowserCompat$CustomActionResultReceiver;
            float[] fArr4 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2[i10].MediaBrowserCompat$ItemReceiver;
            float f22 = fArr3[i9];
            float f23 = fArr3[1];
            float f24 = fArr3[2];
            float f25 = fArr3[3];
            float f26 = fArr3[4];
            float f27 = fArr3[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i8;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                    break;
            }
            i = 2;
            float f28 = f26;
            float f29 = f27;
            float f30 = f22;
            float f31 = f23;
            int i11 = i9;
            while (i11 < fArr4.length) {
                if (c5 != 'A') {
                    if (c5 != 'C') {
                        if (c5 == 'H') {
                            i2 = i11;
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                            path2.lineTo(fArr[i2], f31);
                            f30 = fArr[i2];
                        } else if (c5 == 'Q') {
                            i6 = i11;
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                            int i12 = i6 + 1;
                            int i13 = i6 + 2;
                            int i14 = i6 + 3;
                            path2.quadTo(fArr[i6], fArr[i12], fArr[i13], fArr[i14]);
                            f4 = fArr[i6];
                            f3 = fArr[i12];
                            f5 = fArr[i13];
                            f6 = fArr[i14];
                        } else if (c5 == 'V') {
                            i2 = i11;
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                            path2.lineTo(f30, fArr[i2]);
                            f31 = fArr[i2];
                        } else if (c5 != 'a') {
                            if (c5 == 'c') {
                                i7 = i11;
                                f9 = f31;
                                float f32 = f30;
                                int i15 = i7 + 2;
                                int i16 = i7 + 3;
                                int i17 = i7 + 4;
                                int i18 = i7 + 5;
                                path.rCubicTo(fArr4[i7], fArr4[i7 + 1], fArr4[i15], fArr4[i16], fArr4[i17], fArr4[i18]);
                                f7 = fArr4[i15] + f32;
                                f10 = fArr4[i16] + f9;
                                f30 = f32 + fArr4[i17];
                                f11 = fArr4[i18];
                                f31 = f9 + f11;
                                f8 = f10;
                                f25 = f8;
                                f24 = f7;
                            } else if (c5 != 'h') {
                                if (c5 != 'q') {
                                    if (c5 == 'v') {
                                        i2 = i11;
                                        f12 = f31;
                                        float f33 = f30;
                                        path2.rLineTo(BitmapDescriptorFactory.HUE_RED, fArr4[i2]);
                                        f13 = fArr4[i2];
                                    } else if (c5 != 'L') {
                                        if (c5 == 'M') {
                                            i2 = i11;
                                            f30 = fArr4[i2];
                                            int i19 = i2 + 1;
                                            f31 = fArr4[i19];
                                            if (i2 > 0) {
                                                path2.lineTo(fArr4[i2], fArr4[i19]);
                                            } else {
                                                path2.moveTo(fArr4[i2], fArr4[i19]);
                                            }
                                        } else if (c5 == 'S') {
                                            i7 = i11;
                                            float f34 = f31;
                                            float f35 = f30;
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f14 = (f34 * 2.0f) - f25;
                                                f15 = (f35 * 2.0f) - f24;
                                            } else {
                                                f15 = f35;
                                                f14 = f34;
                                            }
                                            int i20 = i7 + 1;
                                            int i21 = i7 + 2;
                                            int i22 = i7 + 3;
                                            path.cubicTo(f15, f14, fArr4[i7], fArr4[i20], fArr4[i21], fArr4[i22]);
                                            f7 = fArr4[i7];
                                            f8 = fArr4[i20];
                                            f30 = fArr4[i21];
                                            f31 = fArr4[i22];
                                            f25 = f8;
                                            f24 = f7;
                                        } else if (c5 == 'T') {
                                            i2 = i11;
                                            float f36 = f31;
                                            float f37 = f30;
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f16 = (f37 * 2.0f) - f24;
                                                f17 = (f36 * 2.0f) - f25;
                                            } else {
                                                f16 = f37;
                                                f17 = f36;
                                            }
                                            int i23 = i2 + 1;
                                            path2.quadTo(f16, f17, fArr4[i2], fArr4[i23]);
                                            f25 = f17;
                                            f24 = f16;
                                            fArr = fArr4;
                                            c = c5;
                                            i3 = i10;
                                            f30 = fArr4[i2];
                                            f31 = fArr4[i23];
                                        } else if (c5 == 'l') {
                                            i2 = i11;
                                            f12 = f31;
                                            int i24 = i2 + 1;
                                            path2.rLineTo(fArr4[i2], fArr4[i24]);
                                            f30 += fArr4[i2];
                                            f13 = fArr4[i24];
                                        } else if (c5 == c3) {
                                            i2 = i11;
                                            f30 += fArr4[i2];
                                            int i25 = i2 + 1;
                                            f31 += fArr4[i25];
                                            if (i2 > 0) {
                                                path2.rLineTo(fArr4[i2], fArr4[i25]);
                                            } else {
                                                path2.rMoveTo(fArr4[i2], fArr4[i25]);
                                            }
                                        } else if (c5 == 's') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f19 = f30 - f24;
                                                f18 = f31 - f25;
                                            } else {
                                                f19 = BitmapDescriptorFactory.HUE_RED;
                                                f18 = BitmapDescriptorFactory.HUE_RED;
                                            }
                                            int i26 = i11 + 1;
                                            int i27 = i11 + 2;
                                            int i28 = i11 + 3;
                                            i7 = i11;
                                            f9 = f31;
                                            float f38 = f30;
                                            path.rCubicTo(f19, f18, fArr4[i11], fArr4[i26], fArr4[i27], fArr4[i28]);
                                            f7 = fArr4[i7] + f38;
                                            f10 = fArr4[i26] + f9;
                                            f30 = f38 + fArr4[i27];
                                            f11 = fArr4[i28];
                                        } else if (c5 == 't') {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f20 = f30 - f24;
                                                f21 = f31 - f25;
                                            } else {
                                                f21 = BitmapDescriptorFactory.HUE_RED;
                                                f20 = BitmapDescriptorFactory.HUE_RED;
                                            }
                                            int i29 = i11 + 1;
                                            path2.rQuadTo(f20, f21, fArr4[i11], fArr4[i29]);
                                            float f39 = f20 + f30;
                                            f25 = f21 + f31;
                                            f30 = fArr4[i11] + f30;
                                            i2 = i11;
                                            f31 = fArr4[i29] + f31;
                                            fArr = fArr4;
                                            c = c5;
                                            i3 = i10;
                                            f24 = f39;
                                        } else {
                                            i2 = i11;
                                        }
                                        f29 = f31;
                                        f28 = f30;
                                    } else {
                                        i2 = i11;
                                        int i30 = i2 + 1;
                                        path2.lineTo(fArr4[i2], fArr4[i30]);
                                        f30 = fArr4[i2];
                                        f31 = fArr4[i30];
                                    }
                                    f31 = f12 + f13;
                                } else {
                                    i7 = i11;
                                    f9 = f31;
                                    float f40 = f30;
                                    int i31 = i7 + 1;
                                    int i32 = i7 + 2;
                                    int i33 = i7 + 3;
                                    path2.rQuadTo(fArr4[i7], fArr4[i31], fArr4[i32], fArr4[i33]);
                                    f7 = fArr4[i7] + f40;
                                    f10 = fArr4[i31] + f9;
                                    f30 = f40 + fArr4[i32];
                                    f11 = fArr4[i33];
                                }
                                f31 = f9 + f11;
                                f8 = f10;
                                f25 = f8;
                                f24 = f7;
                            } else {
                                i2 = i11;
                                float f41 = f31;
                                path2.rLineTo(fArr4[i2], BitmapDescriptorFactory.HUE_RED);
                                f30 += fArr4[i2];
                            }
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                        } else {
                            i4 = i11;
                            float f42 = f31;
                            float f43 = f30;
                            int i34 = i4 + 5;
                            float f44 = fArr4[i34];
                            int i35 = i4 + 6;
                            float f45 = fArr4[i35];
                            float f46 = fArr4[i4];
                            float f47 = fArr4[i4 + 1];
                            float f48 = fArr4[i4 + 2];
                            boolean z = fArr4[i4 + 3] != BitmapDescriptorFactory.HUE_RED;
                            boolean z2 = fArr4[i4 + 4] != BitmapDescriptorFactory.HUE_RED;
                            fArr2 = fArr4;
                            float f49 = f48;
                            c2 = c5;
                            i5 = i10;
                            write(path, f43, f42, f44 + f43, f45 + f42, f46, f47, f49, z, z2);
                            f = f43 + fArr2[i34];
                            f2 = f42 + fArr2[i35];
                        }
                        i11 = i2 + i;
                        c3 = 'm';
                        i9 = 0;
                        ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr3 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr;
                        c4 = c;
                        c5 = c4;
                        fArr4 = fArr;
                        i10 = i3;
                    } else {
                        i6 = i11;
                        fArr = fArr4;
                        c = c5;
                        i3 = i10;
                        int i36 = i6 + 2;
                        int i37 = i6 + 3;
                        int i38 = i6 + 4;
                        int i39 = i6 + 5;
                        path.cubicTo(fArr[i6], fArr[i6 + 1], fArr[i36], fArr[i37], fArr[i38], fArr[i39]);
                        f5 = fArr[i38];
                        f6 = fArr[i39];
                        f4 = fArr[i36];
                        f3 = fArr[i37];
                    }
                    f24 = f4;
                    f25 = f3;
                    i11 = i2 + i;
                    c3 = 'm';
                    i9 = 0;
                    ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr32 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr;
                    c4 = c;
                    c5 = c4;
                    fArr4 = fArr;
                    i10 = i3;
                } else {
                    i4 = i11;
                    fArr2 = fArr4;
                    c2 = c5;
                    i5 = i10;
                    int i40 = i4 + 5;
                    int i41 = i4 + 6;
                    write(path, f30, f31, fArr2[i40], fArr2[i41], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != BitmapDescriptorFactory.HUE_RED, fArr2[i4 + 4] != BitmapDescriptorFactory.HUE_RED);
                    f = fArr2[i40];
                    f2 = fArr2[i41];
                }
                f25 = f31;
                f24 = f30;
                i11 = i2 + i;
                c3 = 'm';
                i9 = 0;
                ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr322 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr;
                c4 = c;
                c5 = c4;
                fArr4 = fArr;
                i10 = i3;
            }
            int i42 = i10;
            fArr3[i9] = f30;
            fArr3[1] = f31;
            fArr3[2] = f24;
            fArr3[3] = f25;
            fArr3[4] = f28;
            fArr3[5] = f29;
            i10 = i42 + 1;
            i8 = 6;
            c3 = 'm';
            c4 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr[i42].MediaBrowserCompat$CustomActionResultReceiver;
            buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr;
        }
    }

    private static void write(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        float f8 = f;
        float f9 = f3;
        boolean z3 = z2;
        float f10 = f5;
        float f11 = f6;
        float f12 = f7;
        while (true) {
            double radians = Math.toRadians((double) f12);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f8;
            double d4 = (double) f2;
            double d5 = (double) f10;
            double d6 = ((d3 * cos) + (d4 * sin)) / d5;
            double d7 = d5;
            double d8 = d3;
            double d9 = (double) f11;
            float f13 = f3;
            double d10 = d4;
            float f14 = f11;
            double d11 = (double) f4;
            double d12 = ((((double) f13) * cos) + (d11 * sin)) / d7;
            double d13 = ((((double) (-f8)) * sin) + (d4 * cos)) / d9;
            double d14 = ((((double) (-f13)) * sin) + (d11 * cos)) / d9;
            double d15 = d6 - d12;
            double d16 = d13 - d14;
            double d17 = (d6 + d12) / 2.0d;
            double d18 = (d13 + d14) / 2.0d;
            double d19 = sin;
            double d20 = (d15 * d15) + (d16 * d16);
            if (d20 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                StringBuilder sb = new StringBuilder();
                sb.append("Points are too far apart ");
                sb.append(d20);
                Log.w("PathParser", sb.toString());
                float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                f10 *= sqrt;
                f11 = f14 * sqrt;
                f8 = f;
                float f15 = f3;
                f12 = f7;
                boolean z4 = z2;
            } else {
                double sqrt2 = Math.sqrt(d21);
                double d22 = d15 * sqrt2;
                double d23 = sqrt2 * d16;
                boolean z5 = z2;
                if (z == z5) {
                    d2 = d17 - d23;
                    d = d18 + d22;
                } else {
                    d2 = d17 + d23;
                    d = d18 - d22;
                }
                double atan2 = Math.atan2(d13 - d, d6 - d2);
                double atan22 = Math.atan2(d14 - d, d12 - d2) - atan2;
                int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
                if (z5 != (i >= 0)) {
                    atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                }
                double d24 = d2 * d7;
                double d25 = d * d9;
                MediaBrowserCompat$ItemReceiver(path, (d24 * cos) - (d25 * d19), (d24 * d19) + (d25 * cos), d7, d9, d8, d10, radians, atan2, atan22);
                return;
            }
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d11 = -d10;
        double d12 = d11 * cos;
        double d13 = d4 * sin;
        double d14 = d11 * sin;
        double d15 = d4 * cos;
        double d16 = d9 / ((double) ceil);
        double d17 = d6;
        double d18 = (sin2 * d12) - (cos2 * d13);
        double d19 = (sin2 * d14) + (cos2 * d15);
        double d20 = d8;
        int i = 0;
        double d21 = d5;
        while (i < ceil) {
            double d22 = d20 + d16;
            double sin3 = Math.sin(d22);
            double cos3 = Math.cos(d22);
            double d23 = d16;
            double d24 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
            double d25 = d2 + (d10 * sin * cos3) + (d15 * sin3);
            double d26 = (d12 * sin3) - (d13 * cos3);
            double d27 = (sin3 * d14) + (cos3 * d15);
            double d28 = d22 - d20;
            double tan = Math.tan(d28 / 2.0d);
            double sin4 = (Math.sin(d28) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            path.cubicTo((float) (d21 + (d18 * sin4)), (float) (d17 + (d19 * sin4)), (float) (d24 - (sin4 * d26)), (float) (d25 - (sin4 * d27)), (float) d24, (float) d25);
            i++;
            d17 = d25;
            d21 = d24;
            cos = cos;
            sin = sin;
            d20 = d22;
            d19 = d27;
            ceil = ceil;
            d18 = d26;
            d10 = d3;
            d16 = d23;
        }
    }
}
