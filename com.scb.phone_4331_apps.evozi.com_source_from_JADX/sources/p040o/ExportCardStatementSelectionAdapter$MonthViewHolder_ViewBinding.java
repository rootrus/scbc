package p040o;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.TruncatedChunkException;
import p040o.OPRRewardAdapter;

/* renamed from: o.ExportCardStatementSelectionAdapter$MonthViewHolder_ViewBinding */
public final class ExportCardStatementSelectionAdapter$MonthViewHolder_ViewBinding extends InputStream {
    private boolean IconCompatParcelizer;
    private final DepositTransactionAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$MediaItem;
    private int MediaDescriptionCompat;
    private final OPRRewardTiersAdapter$TierViewHolder_ViewBinding MediaMetadataCompat;
    private final EnterProxyActivity read;
    private long write;

    private ExportCardStatementSelectionAdapter$MonthViewHolder_ViewBinding(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, byte b) {
        this.MediaBrowserCompat$ItemReceiver = false;
        this.IconCompatParcelizer = false;
        this.MediaMetadataCompat = (OPRRewardTiersAdapter$TierViewHolder_ViewBinding) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, "Session input buffer");
        this.MediaBrowserCompat$MediaItem = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(16);
        this.read = EnterProxyActivity.IconCompatParcelizer;
        this.MediaDescriptionCompat = 1;
    }

    public ExportCardStatementSelectionAdapter$MonthViewHolder_ViewBinding(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding) {
        this(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, (byte) 0);
    }

    public final int available() throws IOException {
        OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding = this.MediaMetadataCompat;
        if (oPRRewardTiersAdapter$TierViewHolder_ViewBinding instanceof OPRRewardAdapter.RewardViewHolder) {
            return (int) Math.min((long) ((OPRRewardAdapter.RewardViewHolder) oPRRewardTiersAdapter$TierViewHolder_ViewBinding).MediaDescriptionCompat(), this.write - this.MediaBrowserCompat$MediaItem);
        }
        return 0;
    }

    public final int read() throws IOException {
        if (this.IconCompatParcelizer) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.MediaBrowserCompat$ItemReceiver) {
            return -1;
        } else {
            if (this.MediaDescriptionCompat != 2) {
                write();
                if (this.MediaBrowserCompat$ItemReceiver) {
                    return -1;
                }
            }
            int read2 = this.MediaMetadataCompat.read();
            if (read2 != -1) {
                long j = this.MediaBrowserCompat$MediaItem + 1;
                this.MediaBrowserCompat$MediaItem = j;
                if (j >= this.write) {
                    this.MediaDescriptionCompat = 3;
                }
            }
            return read2;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.IconCompatParcelizer) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.MediaBrowserCompat$ItemReceiver) {
            return -1;
        } else {
            if (this.MediaDescriptionCompat != 2) {
                write();
                if (this.MediaBrowserCompat$ItemReceiver) {
                    return -1;
                }
            }
            int read2 = this.MediaMetadataCompat.read(bArr, i, (int) Math.min((long) i2, this.write - this.MediaBrowserCompat$MediaItem));
            if (read2 != -1) {
                long j = this.MediaBrowserCompat$MediaItem + ((long) read2);
                this.MediaBrowserCompat$MediaItem = j;
                if (j >= this.write) {
                    this.MediaDescriptionCompat = 3;
                }
                return read2;
            }
            this.MediaBrowserCompat$ItemReceiver = true;
            throw new TruncatedChunkException("Truncated chunk (expected size: %,d; actual size: %,d)", Long.valueOf(this.write), Long.valueOf(this.MediaBrowserCompat$MediaItem));
        }
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    private void write() throws IOException {
        if (this.MediaDescriptionCompat != Integer.MAX_VALUE) {
            try {
                long MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
                this.write = MediaBrowserCompat$CustomActionResultReceiver2;
                int i = (MediaBrowserCompat$CustomActionResultReceiver2 > 0 ? 1 : (MediaBrowserCompat$CustomActionResultReceiver2 == 0 ? 0 : -1));
                if (i >= 0) {
                    this.MediaDescriptionCompat = 2;
                    this.MediaBrowserCompat$MediaItem = 0;
                    if (i == 0) {
                        this.MediaBrowserCompat$ItemReceiver = true;
                        ExportCardStatementSelectionAdapter$ItemSelectionViewHolder.write(this.MediaMetadataCompat, this.read.MediaBrowserCompat$ItemReceiver, this.read.read, StopChequeHistoryAdapter$ViewHolder.write, new ArrayList());
                        return;
                    }
                    return;
                }
                throw new MalformedChunkCodingException("Negative chunk size");
            } catch (HttpException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid footer: ");
                sb.append(e.getMessage());
                MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException(sb.toString());
                malformedChunkCodingException.initCause(e);
                throw malformedChunkCodingException;
            } catch (MalformedChunkCodingException e2) {
                this.MediaDescriptionCompat = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                throw e2;
            }
        } else {
            throw new MalformedChunkCodingException("Corrupt data stream");
        }
    }

    private long MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        int i = this.MediaDescriptionCompat;
        if (i != 1) {
            if (i == 3) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = 0;
                if (this.MediaMetadataCompat.read(this.MediaBrowserCompat$CustomActionResultReceiver) != -1) {
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == 0) {
                        this.MediaDescriptionCompat = 1;
                    } else {
                        throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
                    }
                } else {
                    throw new MalformedChunkCodingException("CRLF expected at end of chunk");
                }
            } else {
                throw new IllegalStateException("Inconsistent codec state");
            }
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = 0;
        if (this.MediaMetadataCompat.read(this.MediaBrowserCompat$CustomActionResultReceiver) != -1) {
            int MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(59);
            if (MediaBrowserCompat$ItemReceiver2 < 0) {
                MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.length();
            }
            String write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write(0, MediaBrowserCompat$ItemReceiver2);
            try {
                return Long.parseLong(write2, 16);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bad chunk header: ");
                sb.append(write2);
                throw new MalformedChunkCodingException(sb.toString());
            }
        } else {
            throw new ConnectionClosedException("Premature end of chunk coded message body: closing chunk expected");
        }
    }

    public final void close() throws IOException {
        if (!this.IconCompatParcelizer) {
            try {
                if (!this.MediaBrowserCompat$ItemReceiver && this.MediaDescriptionCompat != Integer.MAX_VALUE) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.MediaBrowserCompat$ItemReceiver = true;
                this.IconCompatParcelizer = true;
            }
        }
    }
}
