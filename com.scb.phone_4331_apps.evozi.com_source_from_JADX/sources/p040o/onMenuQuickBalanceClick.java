package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: o.onMenuQuickBalanceClick */
public final class onMenuQuickBalanceClick implements HowToAddAccountActivity {
    private final Inflater IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private final onNeedHelpClick MediaBrowserCompat$ItemReceiver;
    private final PinLoginActivity read;
    private final CRC32 write = new CRC32();

    public onMenuQuickBalanceClick(HowToAddAccountActivity howToAddAccountActivity) {
        if (howToAddAccountActivity != null) {
            this.IconCompatParcelizer = new Inflater(true);
            PinLoginActivity MediaBrowserCompat$CustomActionResultReceiver2 = ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(howToAddAccountActivity);
            this.read = MediaBrowserCompat$CustomActionResultReceiver2;
            this.MediaBrowserCompat$ItemReceiver = new onNeedHelpClick(MediaBrowserCompat$CustomActionResultReceiver2, this.IconCompatParcelizer);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        long j2;
        onMenuPromptPayClick onmenupromptpayclick2 = onmenupromptpayclick;
        long j3 = j;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                this.read.MediaDescriptionCompat(10);
                byte write2 = this.read.MediaBrowserCompat$ItemReceiver().write(3);
                boolean z = ((write2 >> 1) & 1) == 1;
                if (z) {
                    read(this.read.MediaBrowserCompat$ItemReceiver(), 0, 10);
                }
                read("ID1ID2", 8075, (int) this.read.MediaSessionCompat$Token());
                this.read.MediaMetadataCompat(8);
                if (((write2 >> 2) & 1) == 1) {
                    this.read.MediaDescriptionCompat(2);
                    if (z) {
                        read(this.read.MediaBrowserCompat$ItemReceiver(), 0, 2);
                    }
                    long write3 = (long) ModifyQuickTopUpActivity.write(this.read.MediaBrowserCompat$ItemReceiver().MediaSessionCompat$Token());
                    this.read.MediaDescriptionCompat(write3);
                    if (z) {
                        j2 = write3;
                        read(this.read.MediaBrowserCompat$ItemReceiver(), 0, write3);
                    } else {
                        j2 = write3;
                    }
                    this.read.MediaMetadataCompat(j2);
                }
                if (((write2 >> 3) & 1) == 1) {
                    long MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
                    if (MediaBrowserCompat$CustomActionResultReceiver2 != -1) {
                        if (z) {
                            read(this.read.MediaBrowserCompat$ItemReceiver(), 0, MediaBrowserCompat$CustomActionResultReceiver2 + 1);
                        }
                        this.read.MediaMetadataCompat(MediaBrowserCompat$CustomActionResultReceiver2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((write2 >> 4) & 1) == 1) {
                    long MediaBrowserCompat$CustomActionResultReceiver3 = this.read.MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
                    if (MediaBrowserCompat$CustomActionResultReceiver3 != -1) {
                        if (z) {
                            read(this.read.MediaBrowserCompat$ItemReceiver(), 0, MediaBrowserCompat$CustomActionResultReceiver3 + 1);
                        }
                        this.read.MediaMetadataCompat(MediaBrowserCompat$CustomActionResultReceiver3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    read("FHCRC", (int) this.read.ParcelableVolumeInfo(), (int) (short) ((int) this.write.getValue()));
                    this.write.reset();
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = 1;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == 1) {
                long j4 = onmenupromptpayclick2.IconCompatParcelizer;
                long read2 = this.MediaBrowserCompat$ItemReceiver.read(onmenupromptpayclick2, j3);
                if (read2 != -1) {
                    read(onmenupromptpayclick, j4, read2);
                    return read2;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = 2;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == 2) {
                read("CRC", this.read.MediaSessionCompat$QueueItem(), (int) this.write.getValue());
                read("ISIZE", this.read.MediaSessionCompat$QueueItem(), this.IconCompatParcelizer.getTotalOut());
                this.MediaBrowserCompat$CustomActionResultReceiver = 3;
                if (!this.read.read()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final ModifyQuickPromptPayActivity timeout() {
        return this.read.timeout();
    }

    public final void close() throws IOException {
        this.MediaBrowserCompat$ItemReceiver.close();
    }

    private void read(onMenuPromptPayClick onmenupromptpayclick, long j, long j2) {
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = onmenupromptpayclick.read;
        while (j >= ((long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat))) {
            j -= (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat);
            baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
        }
        while (j2 > 0) {
            int i = (int) (((long) baseQuickTopUpReviewActivity.MediaMetadataCompat) + j);
            int min = (int) Math.min((long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - i), j2);
            this.write.update(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, i, min);
            j2 -= (long) min;
            baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
            j = 0;
        }
    }

    private static void read(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
