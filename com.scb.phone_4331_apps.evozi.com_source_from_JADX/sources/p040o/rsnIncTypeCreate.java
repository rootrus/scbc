package p040o;

/* renamed from: o.rsnIncTypeCreate */
public final class rsnIncTypeCreate extends rsnIncElementCreate {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final byte[] MediaBrowserCompat$MediaItem;
    private final int RatingCompat;
    private final int read;
    private final int write;

    public rsnIncTypeCreate(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.MediaBrowserCompat$MediaItem = bArr;
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.write = i3;
        this.RatingCompat = i4;
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() {
        int i = this.IconCompatParcelizer;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        if (i == this.read && i2 == this.MediaBrowserCompat$CustomActionResultReceiver) {
            return this.MediaBrowserCompat$MediaItem;
        }
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        int i4 = this.RatingCompat;
        int i5 = this.read;
        int i6 = (i4 * i5) + this.write;
        if (i == i5) {
            System.arraycopy(this.MediaBrowserCompat$MediaItem, i6, bArr, 0, i3);
            return bArr;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            System.arraycopy(this.MediaBrowserCompat$MediaItem, i6, bArr, i7 * i, i);
            i6 += this.read;
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
        int i3 = this.RatingCompat;
        int i4 = this.read;
        System.arraycopy(this.MediaBrowserCompat$MediaItem, ((i + i3) * i4) + this.write, bArr, 0, i2);
        return bArr;
    }
}
