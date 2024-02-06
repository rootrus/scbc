package p040o;

/* renamed from: o.validateSPR */
public final class validateSPR {
    private static byte[] IconCompatParcelizer = new byte[255];
    private static final byte[] read = AlertController$RecycleListView.IconCompatParcelizer("0123456789ABCDEF");

    static {
        for (int i = 0; i < 255; i++) {
            IconCompatParcelizer[i] = -1;
        }
        for (int i2 = 57; i2 >= 48; i2--) {
            IconCompatParcelizer[i2] = (byte) (i2 - 48);
        }
        for (int i3 = 70; i3 >= 65; i3--) {
            IconCompatParcelizer[i3] = (byte) ((i3 - 65) + 10);
        }
        for (int i4 = 102; i4 >= 97; i4--) {
            IconCompatParcelizer[i4] = (byte) ((i4 - 97) + 10);
        }
    }

    public static byte[] IconCompatParcelizer(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[(length << 1)];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            byte[] bArr3 = read;
            bArr2[i2] = bArr3[(bArr[i] & 240) >> 4];
            bArr2[i2 + 1] = bArr3[bArr[i] & 15];
        }
        return bArr2;
    }

    public static byte[] read(byte[] bArr) {
        return MediaBrowserCompat$ItemReceiver(bArr, bArr.length);
    }

    private static byte[] MediaBrowserCompat$ItemReceiver(byte[] bArr, int i) {
        try {
            int i2 = i / 2;
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 << 1;
                bArr2[i3] = (byte) ((IconCompatParcelizer[bArr[i4]] << 4) | IconCompatParcelizer[bArr[i4 + 1]]);
            }
            return bArr2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Data is not hexbin encoded, data=");
            sb.append(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(bArr));
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
