package p040o;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import p040o.OPRRewardAdapter;

/* renamed from: o.ExportCardStatementSelectionAdapter$TitleViewHolder */
public final class ExportCardStatementSelectionAdapter$TitleViewHolder extends InputStream {
    private OPRRewardTiersAdapter$TierViewHolder_ViewBinding IconCompatParcelizer = null;
    private final long MediaBrowserCompat$ItemReceiver;
    private boolean read = false;
    private long write = 0;

    public ExportCardStatementSelectionAdapter$TitleViewHolder(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, long j) {
        this.IconCompatParcelizer = (OPRRewardTiersAdapter$TierViewHolder_ViewBinding) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, "Session input buffer");
        this.MediaBrowserCompat$ItemReceiver = DepositTransactionAdapter$GroupItemViewHolder.read(j, "Content length");
    }

    public final void close() throws IOException {
        if (!this.read) {
            try {
                if (this.write < this.MediaBrowserCompat$ItemReceiver) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.read = true;
            }
        }
    }

    public final int available() throws IOException {
        OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding = this.IconCompatParcelizer;
        if (oPRRewardTiersAdapter$TierViewHolder_ViewBinding instanceof OPRRewardAdapter.RewardViewHolder) {
            return Math.min(((OPRRewardAdapter.RewardViewHolder) oPRRewardTiersAdapter$TierViewHolder_ViewBinding).MediaDescriptionCompat(), (int) (this.MediaBrowserCompat$ItemReceiver - this.write));
        }
        return 0;
    }

    public final int read() throws IOException {
        if (this.read) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.write >= this.MediaBrowserCompat$ItemReceiver) {
            return -1;
        } else {
            int read2 = this.IconCompatParcelizer.read();
            if (read2 == -1) {
                long j = this.write;
                long j2 = this.MediaBrowserCompat$ItemReceiver;
                if (j < j2) {
                    throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(j2), Long.valueOf(this.write));
                }
            } else {
                this.write++;
            }
            return read2;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.read) {
            long j = this.write;
            long j2 = this.MediaBrowserCompat$ItemReceiver;
            if (j >= j2) {
                return -1;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            int read2 = this.IconCompatParcelizer.read(bArr, i, i2);
            if (read2 == -1) {
                long j3 = this.write;
                long j4 = this.MediaBrowserCompat$ItemReceiver;
                if (j3 < j4) {
                    throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(j4), Long.valueOf(this.write));
                }
            }
            if (read2 > 0) {
                this.write += (long) read2;
            }
            return read2;
        }
        throw new IOException("Attempted read from closed stream.");
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final long skip(long j) throws IOException {
        int read2;
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.MediaBrowserCompat$ItemReceiver - this.write);
        long j2 = 0;
        while (min > 0 && (read2 = read(bArr, 0, (int) Math.min(2048, min))) != -1) {
            long j3 = (long) read2;
            j2 += j3;
            min -= j3;
        }
        return j2;
    }
}
