package p040o;

import com.google.android.gms.common.api.Api;
import com.google.zxing.NotFoundException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.bindAllocation */
public abstract class bindAllocation extends getMinification {
    private final int[] IconCompatParcelizer = new int[8];
    private final int[] MediaBrowserCompat$CustomActionResultReceiver = new int[4];
    private final int[] MediaBrowserCompat$ItemReceiver = new int[4];
    private final float[] MediaMetadataCompat = new float[4];
    private final float[] read = new float[4];
    private final int[] write = new int[4];

    /* access modifiers changed from: protected */
    public final int[] MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: protected */
    public final int[] write() {
        return this.IconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    public final float[] MediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* access modifiers changed from: protected */
    public final float[] read() {
        return this.read;
    }

    /* access modifiers changed from: protected */
    public final int[] RatingCompat() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: protected */
    public final int[] IconCompatParcelizer() {
        return this.write;
    }

    protected static int MediaBrowserCompat$CustomActionResultReceiver(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (IconCompatParcelizer(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    protected static void MediaBrowserCompat$ItemReceiver(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    protected static void read(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    protected static boolean IconCompatParcelizer(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i3 = PKIFailureInfo.systemUnavail;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }
}
