package p040o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.EligiblePrivilegesAdapter$ItemViewHolder_ViewBinding */
public final class EligiblePrivilegesAdapter$ItemViewHolder_ViewBinding extends OutputStream {
    private final OPRRewardTiersAdapter$TierViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    private boolean read = false;

    public EligiblePrivilegesAdapter$ItemViewHolder_ViewBinding(OPRRewardTiersAdapter$TierViewHolder oPRRewardTiersAdapter$TierViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (OPRRewardTiersAdapter$TierViewHolder) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder, "Session output buffer");
    }

    public final void close() throws IOException {
        if (!this.read) {
            this.read = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.write();
        }
    }

    public final void flush() throws IOException {
        this.MediaBrowserCompat$CustomActionResultReceiver.write();
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.read) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(bArr, i, i2);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(int i) throws IOException {
        if (!this.read) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(i);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
