package p040o;

import java.io.Serializable;

/* renamed from: o.DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding */
public final class DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding implements Serializable {
    public int MediaBrowserCompat$ItemReceiver;
    public byte[] read;

    public DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding(int i) {
        DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Buffer capacity");
        this.read = new byte[i];
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        byte[] bArr = new byte[Math.max(this.read.length << 1, i)];
        System.arraycopy(this.read, 0, bArr, 0, this.MediaBrowserCompat$ItemReceiver);
        this.read = bArr;
    }

    public final void read(byte[] bArr, int i, int i2) {
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
                if (i4 > this.read.length) {
                    MediaBrowserCompat$ItemReceiver(i4);
                }
                System.arraycopy(bArr, i, this.read, this.MediaBrowserCompat$ItemReceiver, i2);
                this.MediaBrowserCompat$ItemReceiver = i4;
            }
        }
    }

    public final void read(int i) {
        int i2 = this.MediaBrowserCompat$ItemReceiver + 1;
        if (i2 > this.read.length) {
            MediaBrowserCompat$ItemReceiver(i2);
        }
        this.read[this.MediaBrowserCompat$ItemReceiver] = (byte) i;
        this.MediaBrowserCompat$ItemReceiver = i2;
    }
}
