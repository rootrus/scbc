package p040o;

/* renamed from: o.rsnObjDestroy */
public final class rsnObjDestroy extends rsnIncElementCreate {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final byte[] read;
    private final int write;

    public rsnObjDestroy(int i, int i2, int[] iArr) {
        super(i, i2);
        this.write = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        int i3 = i * i2;
        this.read = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            this.read[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & 510)) + (i5 & 255)) / 4);
        }
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() {
        int i = this.IconCompatParcelizer;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        if (i == this.write && i2 == this.MediaBrowserCompat$CustomActionResultReceiver) {
            return this.read;
        }
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        int i4 = this.write;
        int i5 = i4 * 0;
        if (i == i4) {
            System.arraycopy(this.read, i5, bArr, 0, i3);
            return bArr;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(this.read, i5, bArr, i6 * i, i);
            i5 += this.write;
        }
        return bArr;
    }

    public final byte[] read(int i, byte[] bArr) {
        if (i < 0 || i >= this.MediaBrowserCompat$ItemReceiver) {
            StringBuilder sb = new StringBuilder("Requested row is outside the image: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = this.IconCompatParcelizer;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(this.read, i * this.write, bArr, 0, i2);
        return bArr;
    }
}
