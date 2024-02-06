package p040o;

import java.nio.ByteOrder;

/* renamed from: o.CustomCardApplyViewComponent_ViewBinding */
public final class CustomCardApplyViewComponent_ViewBinding {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int read;
    public String write;

    public CustomCardApplyViewComponent_ViewBinding() {
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(int i, int i2) {
        return IconCompatParcelizer(i, i2, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] IconCompatParcelizer(int i, int i2, ByteOrder byteOrder) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) (i >>> (byteOrder == ByteOrder.BIG_ENDIAN ? ((i2 - 1) - i3) << 3 : i3 << 3));
        }
        return bArr;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(byte[][] bArr, byte[] bArr2) {
        int i = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i, bArr3.length);
            i += bArr3.length;
        }
    }

    public CustomCardApplyViewComponent_ViewBinding(int i, String str, String str2, String str3) {
        this.read = i;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }
}
