package p040o;

/* renamed from: o.rsnIncElementCreate */
public abstract class rsnIncElementCreate {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompat$ItemReceiver;

    public boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return false;
    }

    public abstract byte[] MediaBrowserCompat$ItemReceiver();

    public abstract byte[] read(int i, byte[] bArr);

    protected rsnIncElementCreate(int i, int i2) {
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
    }

    public rsnIncElementCreate IconCompatParcelizer() {
        return new rsnIncContextDestroy(this);
    }

    public rsnIncElementCreate read() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.IconCompatParcelizer;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.MediaBrowserCompat$ItemReceiver * (i + 1));
        for (int i2 = 0; i2 < this.MediaBrowserCompat$ItemReceiver; i2++) {
            bArr = read(i2, bArr);
            for (int i3 = 0; i3 < this.IconCompatParcelizer; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
