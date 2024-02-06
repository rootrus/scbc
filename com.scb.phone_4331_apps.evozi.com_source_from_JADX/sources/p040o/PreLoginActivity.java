package p040o;

import java.io.IOException;
import java.util.zip.Deflater;

/* renamed from: o.PreLoginActivity */
public final class PreLoginActivity implements QuickPromptPayActivity {
    private boolean IconCompatParcelizer;
    private final Deflater MediaBrowserCompat$CustomActionResultReceiver;
    private final onLoginButtonClick read;

    public PreLoginActivity(QuickPromptPayActivity quickPromptPayActivity, Deflater deflater) {
        this(ModifyQuickBalanceActivity.read(quickPromptPayActivity), deflater);
    }

    private PreLoginActivity(onLoginButtonClick onloginbuttonclick, Deflater deflater) {
        if (onloginbuttonclick == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.read = onloginbuttonclick;
            this.MediaBrowserCompat$CustomActionResultReceiver = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        ModifyQuickTopUpActivity.IconCompatParcelizer(onmenupromptpayclick.IconCompatParcelizer, 0, j);
        while (j > 0) {
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = onmenupromptpayclick.read;
            int min = (int) Math.min(j, (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat));
            this.MediaBrowserCompat$CustomActionResultReceiver.setInput(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, min);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            long j2 = (long) min;
            onmenupromptpayclick.IconCompatParcelizer -= j2;
            baseQuickTopUpReviewActivity.MediaMetadataCompat += min;
            if (baseQuickTopUpReviewActivity.MediaMetadataCompat == baseQuickTopUpReviewActivity.IconCompatParcelizer) {
                onmenupromptpayclick.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
            }
            j -= j2;
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) throws IOException {
        BaseQuickTopUpReviewActivity write;
        int i;
        onMenuPromptPayClick MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver();
        while (true) {
            write = MediaBrowserCompat$ItemReceiver.write(1);
            if (z) {
                i = this.MediaBrowserCompat$CustomActionResultReceiver.deflate(write.MediaBrowserCompat$CustomActionResultReceiver, write.IconCompatParcelizer, 2048 - write.IconCompatParcelizer, 2);
            } else {
                i = this.MediaBrowserCompat$CustomActionResultReceiver.deflate(write.MediaBrowserCompat$CustomActionResultReceiver, write.IconCompatParcelizer, 2048 - write.IconCompatParcelizer);
            }
            if (i > 0) {
                write.IconCompatParcelizer += i;
                MediaBrowserCompat$ItemReceiver.IconCompatParcelizer += (long) i;
                this.read.IconCompatParcelizer();
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver.needsInput()) {
                break;
            }
        }
        if (write.MediaMetadataCompat == write.IconCompatParcelizer) {
            MediaBrowserCompat$ItemReceiver.read = write.MediaBrowserCompat$CustomActionResultReceiver();
            HowToAddFavouriteTopUpActivity.IconCompatParcelizer(write);
        }
    }

    public final void flush() throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(true);
        this.read.flush();
    }

    public final void close() throws IOException {
        if (!this.IconCompatParcelizer) {
            Throwable th = null;
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.finish();
                MediaBrowserCompat$CustomActionResultReceiver(false);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.read.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.IconCompatParcelizer = true;
            if (th != null) {
                ModifyQuickTopUpActivity.MediaBrowserCompat$CustomActionResultReceiver(th);
            }
        }
    }

    public final ModifyQuickPromptPayActivity timeout() {
        return this.read.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeflaterSink(");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
