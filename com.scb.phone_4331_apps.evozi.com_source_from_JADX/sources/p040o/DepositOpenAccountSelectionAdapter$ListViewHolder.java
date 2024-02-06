package p040o;

import java.io.Serializable;

/* renamed from: o.DepositOpenAccountSelectionAdapter$ListViewHolder */
public final class DepositOpenAccountSelectionAdapter$ListViewHolder implements Serializable {
    public byte[] IconCompatParcelizer;
    public int MediaBrowserCompat$ItemReceiver;

    public DepositOpenAccountSelectionAdapter$ListViewHolder(int i) {
        C6431x12296157.MediaBrowserCompat$CustomActionResultReceiver(i, "Buffer capacity");
        this.IconCompatParcelizer = new byte[i];
    }

    private void MediaBrowserCompat$ItemReceiver(int i) {
        byte[] bArr = new byte[Math.max(this.IconCompatParcelizer.length << 1, i)];
        System.arraycopy(this.IconCompatParcelizer, 0, bArr, 0, this.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = bArr;
    }

    public final void IconCompatParcelizer(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr != null) {
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("off: ");
                sb.append(i);
                sb.append(" len: ");
                sb.append(i2);
                sb.append(" b.length: ");
                sb.append(bArr.length);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 != 0) {
                int i4 = this.MediaBrowserCompat$ItemReceiver + i2;
                if (i4 > this.IconCompatParcelizer.length) {
                    MediaBrowserCompat$ItemReceiver(i4);
                }
                System.arraycopy(bArr, i, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, i2);
                this.MediaBrowserCompat$ItemReceiver = i4;
            }
        }
    }
}
