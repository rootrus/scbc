package p040o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.ExportCardStatementSelectionAdapter$TitleViewHolder_ViewBinding */
public final class ExportCardStatementSelectionAdapter$TitleViewHolder_ViewBinding extends OutputStream {
    private final OPRRewardTiersAdapter$TierViewHolder IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final byte[] MediaBrowserCompat$ItemReceiver;
    private int read;
    private boolean write;

    @Deprecated
    public ExportCardStatementSelectionAdapter$TitleViewHolder_ViewBinding(OPRRewardTiersAdapter$TierViewHolder oPRRewardTiersAdapter$TierViewHolder) throws IOException {
        this(oPRRewardTiersAdapter$TierViewHolder, (byte) 0);
    }

    private ExportCardStatementSelectionAdapter$TitleViewHolder_ViewBinding(OPRRewardTiersAdapter$TierViewHolder oPRRewardTiersAdapter$TierViewHolder, byte b) {
        this.read = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.write = false;
        this.MediaBrowserCompat$ItemReceiver = new byte[2048];
        this.IconCompatParcelizer = oPRRewardTiersAdapter$TierViewHolder;
    }

    private void read() throws IOException {
        int i = this.read;
        if (i > 0) {
            this.IconCompatParcelizer.write(Integer.toHexString(i));
            this.IconCompatParcelizer.write(this.MediaBrowserCompat$ItemReceiver, 0, this.read);
            this.IconCompatParcelizer.write("");
            this.read = 0;
        }
    }

    public final void write(int i) throws IOException {
        if (!this.write) {
            byte[] bArr = this.MediaBrowserCompat$ItemReceiver;
            int i2 = this.read;
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            this.read = i3;
            if (i3 == bArr.length) {
                read();
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.write) {
            byte[] bArr2 = this.MediaBrowserCompat$ItemReceiver;
            int length = bArr2.length;
            int i3 = this.read;
            if (i2 >= length - i3) {
                this.IconCompatParcelizer.write(Integer.toHexString(i3 + i2));
                this.IconCompatParcelizer.write(this.MediaBrowserCompat$ItemReceiver, 0, this.read);
                this.IconCompatParcelizer.write(bArr, i, i2);
                this.IconCompatParcelizer.write("");
                this.read = 0;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.read += i2;
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public final void flush() throws IOException {
        read();
        this.IconCompatParcelizer.write();
    }

    public final void close() throws IOException {
        if (!this.write) {
            this.write = true;
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                read();
                this.IconCompatParcelizer.write("0");
                this.IconCompatParcelizer.write("");
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
            }
            this.IconCompatParcelizer.write();
        }
    }
}
