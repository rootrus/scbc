package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: o.onNeedHelpClick */
public final class onNeedHelpClick implements HowToAddAccountActivity {
    private final Inflater IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private final PinLoginActivity read;
    private boolean write;

    public onNeedHelpClick(HowToAddAccountActivity howToAddAccountActivity, Inflater inflater) {
        this(ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(howToAddAccountActivity), inflater);
    }

    onNeedHelpClick(PinLoginActivity pinLoginActivity, Inflater inflater) {
        if (pinLoginActivity == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.read = pinLoginActivity;
            this.IconCompatParcelizer = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        BaseQuickTopUpReviewActivity write2;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.write) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean IconCompatParcelizer2 = IconCompatParcelizer();
                try {
                    write2 = onmenupromptpayclick.write(1);
                    int inflate = this.IconCompatParcelizer.inflate(write2.MediaBrowserCompat$CustomActionResultReceiver, write2.IconCompatParcelizer, 2048 - write2.IconCompatParcelizer);
                    if (inflate > 0) {
                        write2.IconCompatParcelizer += inflate;
                        long j2 = (long) inflate;
                        onmenupromptpayclick.IconCompatParcelizer += j2;
                        return j2;
                    } else if (this.IconCompatParcelizer.finished()) {
                        break;
                    } else if (this.IconCompatParcelizer.needsDictionary()) {
                        break;
                    } else if (IconCompatParcelizer2) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            MediaBrowserCompat$ItemReceiver();
            if (write2.MediaMetadataCompat != write2.IconCompatParcelizer) {
                return -1;
            }
            onmenupromptpayclick.read = write2.MediaBrowserCompat$CustomActionResultReceiver();
            HowToAddFavouriteTopUpActivity.IconCompatParcelizer(write2);
            return -1;
        }
    }

    public final boolean IconCompatParcelizer() throws IOException {
        if (!this.IconCompatParcelizer.needsInput()) {
            return false;
        }
        MediaBrowserCompat$ItemReceiver();
        if (this.IconCompatParcelizer.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.read.read()) {
            return true;
        } else {
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read.MediaBrowserCompat$ItemReceiver().read;
            this.MediaBrowserCompat$CustomActionResultReceiver = baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat;
            this.IconCompatParcelizer.setInput(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, this.MediaBrowserCompat$CustomActionResultReceiver);
            return false;
        }
    }

    private void MediaBrowserCompat$ItemReceiver() throws IOException {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i != 0) {
            int remaining = i - this.IconCompatParcelizer.getRemaining();
            this.MediaBrowserCompat$CustomActionResultReceiver -= remaining;
            this.read.MediaMetadataCompat((long) remaining);
        }
    }

    public final ModifyQuickPromptPayActivity timeout() {
        return this.read.timeout();
    }

    public final void close() throws IOException {
        if (!this.write) {
            this.IconCompatParcelizer.end();
            this.write = true;
            this.read.close();
        }
    }
}
