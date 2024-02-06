package p040o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.QuickPromptPayReviewActivity */
final class QuickPromptPayReviewActivity implements onLoginButtonClick {
    public final onMenuPromptPayClick IconCompatParcelizer;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    private QuickPromptPayActivity read;

    private QuickPromptPayReviewActivity(QuickPromptPayActivity quickPromptPayActivity, onMenuPromptPayClick onmenupromptpayclick) {
        if (quickPromptPayActivity != null) {
            this.IconCompatParcelizer = onmenupromptpayclick;
            this.read = quickPromptPayActivity;
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public QuickPromptPayReviewActivity(QuickPromptPayActivity quickPromptPayActivity) {
        this(quickPromptPayActivity, new onMenuPromptPayClick());
    }

    public final onMenuPromptPayClick MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.write(onmenupromptpayclick, j);
            IconCompatParcelizer();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick IconCompatParcelizer(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.IconCompatParcelizer(pinLoginActivity_ViewBinding);
            return IconCompatParcelizer();
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick IconCompatParcelizer(String str) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.read(str, 0, str.length());
            return IconCompatParcelizer();
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick write(byte[] bArr) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            onMenuPromptPayClick onmenupromptpayclick = this.IconCompatParcelizer;
            if (bArr != null) {
                onmenupromptpayclick.MediaBrowserCompat$CustomActionResultReceiver(bArr, 0, bArr.length);
                return IconCompatParcelizer();
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, int i, int i2) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(bArr, i, i2);
            return IconCompatParcelizer();
        }
        throw new IllegalStateException("closed");
    }

    public final long MediaBrowserCompat$ItemReceiver(HowToAddAccountActivity howToAddAccountActivity) throws IOException {
        if (howToAddAccountActivity != null) {
            long j = 0;
            while (true) {
                long read2 = howToAddAccountActivity.read(this.IconCompatParcelizer, 2048);
                if (read2 == -1) {
                    return j;
                }
                j += read2;
                IconCompatParcelizer();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final onLoginButtonClick MediaBrowserCompat$ItemReceiver(int i) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i);
            return IconCompatParcelizer();
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick MediaBrowserCompat$MediaItem(int i) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.MediaBrowserCompat$MediaItem(i);
            return IconCompatParcelizer();
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick MediaBrowserCompat$CustomActionResultReceiver(int i) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i);
            return IconCompatParcelizer();
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick RatingCompat(long j) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.RatingCompat(j);
            return IconCompatParcelizer();
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick ParcelableVolumeInfo(long j) throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.ParcelableVolumeInfo(j);
            return IconCompatParcelizer();
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick IconCompatParcelizer() throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            onMenuPromptPayClick onmenupromptpayclick = this.IconCompatParcelizer;
            long j = onmenupromptpayclick.IconCompatParcelizer;
            if (j == 0) {
                j = 0;
            } else {
                BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = onmenupromptpayclick.read.write;
                if (baseQuickTopUpReviewActivity.IconCompatParcelizer < 2048 && baseQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver) {
                    j -= (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat);
                }
            }
            if (j > 0) {
                this.read.write(this.IconCompatParcelizer, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final onLoginButtonClick write() throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            long j = this.IconCompatParcelizer.IconCompatParcelizer;
            if (j > 0) {
                this.read.write(this.IconCompatParcelizer, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final OutputStream RatingCompat() {
        return new OutputStream() {
            public final void write(int i) throws IOException {
                if (!QuickPromptPayReviewActivity.this.MediaBrowserCompat$CustomActionResultReceiver) {
                    QuickPromptPayReviewActivity.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((int) (byte) i);
                    QuickPromptPayReviewActivity.this.IconCompatParcelizer();
                    return;
                }
                throw new IOException("closed");
            }

            public final void write(byte[] bArr, int i, int i2) throws IOException {
                if (!QuickPromptPayReviewActivity.this.MediaBrowserCompat$CustomActionResultReceiver) {
                    QuickPromptPayReviewActivity.this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(bArr, i, i2);
                    QuickPromptPayReviewActivity.this.IconCompatParcelizer();
                    return;
                }
                throw new IOException("closed");
            }

            public final void flush() throws IOException {
                if (!QuickPromptPayReviewActivity.this.MediaBrowserCompat$CustomActionResultReceiver) {
                    QuickPromptPayReviewActivity.this.flush();
                }
            }

            public final void close() throws IOException {
                QuickPromptPayReviewActivity.this.close();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(QuickPromptPayReviewActivity.this);
                sb.append(".outputStream()");
                return sb.toString();
            }
        };
    }

    public final void flush() throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (this.IconCompatParcelizer.IconCompatParcelizer > 0) {
                QuickPromptPayActivity quickPromptPayActivity = this.read;
                onMenuPromptPayClick onmenupromptpayclick = this.IconCompatParcelizer;
                quickPromptPayActivity.write(onmenupromptpayclick, onmenupromptpayclick.IconCompatParcelizer);
            }
            this.read.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() throws IOException {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            Throwable th = null;
            try {
                if (this.IconCompatParcelizer.IconCompatParcelizer > 0) {
                    this.read.write(this.IconCompatParcelizer, this.IconCompatParcelizer.IconCompatParcelizer);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.read.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
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
        sb.append("buffer(");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
