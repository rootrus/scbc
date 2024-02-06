package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;

/* renamed from: o.getYEnd */
final class getYEnd {
    private static final float[][] read;

    static {
        int i;
        int length = access$400.MediaBrowserCompat$ItemReceiver.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        read = (float[][]) Array.newInstance(Float.TYPE, iArr);
        for (int i2 = 0; i2 < access$400.MediaBrowserCompat$ItemReceiver.length; i2++) {
            int i3 = access$400.MediaBrowserCompat$ItemReceiver[i2];
            int i4 = i3 & 1;
            int i5 = 0;
            while (i5 < 8) {
                float f = BitmapDescriptorFactory.HUE_RED;
                while (true) {
                    i = i3 & 1;
                    if (i != i4) {
                        break;
                    }
                    f += 1.0f;
                    i3 >>= 1;
                }
                read[i2][(8 - i5) - 1] = f / 17.0f;
                i5++;
                i4 = i;
            }
        }
    }

    static int write(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        float f = (float) i;
        int[] iArr2 = new int[8];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 17; i5++) {
            if (((float) (iArr[i4] + i3)) <= (f / 34.0f) + ((((float) i5) * f) / 17.0f)) {
                i3 += iArr[i4];
                i4++;
            }
            iArr2[i4] = iArr2[i4] + 1;
        }
        long j = 0;
        for (int i6 = 0; i6 < 8; i6++) {
            for (int i7 = 0; i7 < iArr2[i6]; i7++) {
                j = (j << 1) | ((long) (i6 % 2 != 0 ? 0 : 1));
            }
        }
        int i8 = (int) j;
        int i9 = -1;
        if (access$400.MediaBrowserCompat$CustomActionResultReceiver(i8) == -1) {
            i8 = -1;
        }
        if (i8 != -1) {
            return i8;
        }
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float[] fArr = new float[8];
        if (i10 > 1) {
            for (int i12 = 0; i12 < 8; i12++) {
                fArr[i12] = ((float) iArr[i12]) / ((float) i10);
            }
        }
        float f2 = Float.MAX_VALUE;
        int i13 = 0;
        while (true) {
            float[][] fArr2 = read;
            if (i13 >= fArr2.length) {
                return i9;
            }
            float f3 = BitmapDescriptorFactory.HUE_RED;
            float[] fArr3 = fArr2[i13];
            for (int i14 = 0; i14 < 8; i14++) {
                float f4 = fArr3[i14] - fArr[i14];
                f3 += f4 * f4;
                if (f3 >= f2) {
                    break;
                }
            }
            if (f3 < f2) {
                i9 = access$400.MediaBrowserCompat$ItemReceiver[i13];
                f2 = f3;
            }
            i13++;
        }
    }
}
