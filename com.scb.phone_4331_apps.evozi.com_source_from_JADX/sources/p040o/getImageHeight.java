package p040o;

import com.drew.imaging.tiff.TiffProcessingException;
import java.io.IOException;
import java.util.Set;

/* renamed from: o.getImageHeight */
public interface getImageHeight {

    /* renamed from: o.getImageHeight$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(access$1600 access_1600);

        void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200);

        void MediaBrowserCompat$ItemReceiver(access$1600 access_1600);

        void read(access$1600 access_1600);

        void write();
    }

    void IconCompatParcelizer(int i, int i2);

    void IconCompatParcelizer(int i, long j);

    void IconCompatParcelizer(int i, double[] dArr);

    void IconCompatParcelizer(int i, float[] fArr);

    void IconCompatParcelizer(int i, int[] iArr);

    void IconCompatParcelizer(int i, short[] sArr);

    void IconCompatParcelizer(String str);

    boolean IconCompatParcelizer();

    boolean IconCompatParcelizer(int i);

    void MediaBrowserCompat$CustomActionResultReceiver(int i) throws TiffProcessingException;

    void MediaBrowserCompat$CustomActionResultReceiver(int i, createFromBitmap createfrombitmap);

    void MediaBrowserCompat$CustomActionResultReceiver(int i, copy3DRangeFromUnchecked[] copy3drangefromuncheckedArr);

    void MediaBrowserCompat$CustomActionResultReceiver(int i, short[] sArr);

    Long MediaBrowserCompat$ItemReceiver(int i, long j);

    void MediaBrowserCompat$ItemReceiver(int i, byte b);

    void MediaBrowserCompat$ItemReceiver(int i, int i2);

    void read();

    void read(int i, double d);

    void read(int i, int i2);

    void read(int i, copy3DRangeFromUnchecked copy3drangefromunchecked);

    void read(int i, byte[] bArr);

    void read(int i, long[] jArr);

    void read(String str);

    void write(int i, float f);

    void write(int i, short s);

    void write(int i, byte[] bArr);

    void write(int i, int[] iArr);

    boolean write(int i, Set<Integer> set, int i2, C10820Allocation allocation, int i3, int i4) throws IOException;
}
