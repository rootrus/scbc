package p040o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.UnbilledTransactionsAdapter$TransactionViewHolder_ViewBinding */
public final class UnbilledTransactionsAdapter$TransactionViewHolder_ViewBinding extends OutputStream {
    private long IconCompatParcelizer;
    private boolean MediaBrowserCompat$ItemReceiver;
    private final long read;
    private final OPRRewardTiersAdapter$TierViewHolder write;

    public UnbilledTransactionsAdapter$TransactionViewHolder_ViewBinding(OPRRewardTiersAdapter$TierViewHolder oPRRewardTiersAdapter$TierViewHolder, long j) {
        this.write = (OPRRewardTiersAdapter$TierViewHolder) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder, "Session output buffer");
        this.read = DepositTransactionAdapter$GroupItemViewHolder.read(j, "Content length");
    }

    public final void close() throws IOException {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.write.write();
        }
    }

    public final void flush() throws IOException {
        this.write.write();
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            long j = this.IconCompatParcelizer;
            long j2 = this.read;
            if (j < j2) {
                long j3 = j2 - j;
                if (((long) i2) > j3) {
                    i2 = (int) j3;
                }
                this.write.write(bArr, i, i2);
                this.IconCompatParcelizer += (long) i2;
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(int i) throws IOException {
        if (this.MediaBrowserCompat$ItemReceiver) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.IconCompatParcelizer < this.read) {
            this.write.write(i);
            this.IconCompatParcelizer++;
        }
    }
}
