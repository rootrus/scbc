package p040o;

import java.nio.ByteBuffer;

/* renamed from: o.onCitizenTabClicked */
public final class onCitizenTabClicked implements NsipPartnerPaymentReviewActivity {
    private boolean IconCompatParcelizer;
    private SCBUniversalWebViewActivity MediaBrowserCompat$ItemReceiver = new SCBUniversalWebViewActivity();
    private PinChangeActivity write;

    public onCitizenTabClicked(PinChangeActivity pinChangeActivity) {
        onGetStartedClick.write((Object) pinChangeActivity, "sink");
        this.write = pinChangeActivity;
    }

    public final SCBUniversalWebViewActivity MediaMetadataCompat() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.write(sCBUniversalWebViewActivity, j);
            read();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity IconCompatParcelizer(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
        if (!this.IconCompatParcelizer) {
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
            sCBUniversalWebViewActivity_ViewBinding.write(sCBUniversalWebViewActivity);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "string");
        if (!this.IconCompatParcelizer) {
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) str, "string");
            sCBUniversalWebViewActivity.write(str, 0, str.length());
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity write(String str, int i, int i2) {
        onGetStartedClick.write((Object) str, "string");
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.write(str, i, i2);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity write(byte[] bArr) {
        onGetStartedClick.write((Object) bArr, "source");
        if (!this.IconCompatParcelizer) {
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) bArr, "source");
            sCBUniversalWebViewActivity.IconCompatParcelizer(bArr, 0, bArr.length);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity IconCompatParcelizer(byte[] bArr, int i, int i2) {
        onGetStartedClick.write((Object) bArr, "source");
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(bArr, i, i2);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final int write(ByteBuffer byteBuffer) {
        onGetStartedClick.write((Object) byteBuffer, "source");
        if (!this.IconCompatParcelizer) {
            int write2 = this.MediaBrowserCompat$ItemReceiver.write(byteBuffer);
            read();
            return write2;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity MediaBrowserCompat$ItemReceiver(int i) {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity MediaBrowserCompat$MediaItem(int i) {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem(i);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity IconCompatParcelizer(int i) {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(i);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity RatingCompat(long j) {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.RatingCompat(j);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity MediaSessionCompat$ResultReceiverWrapper(long j) {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper(j);
            return read();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity read() {
        if (!this.IconCompatParcelizer) {
            long MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 > 0) {
                this.write.write(this.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NsipPartnerPaymentReviewActivity write() {
        if (!this.IconCompatParcelizer) {
            long j = this.MediaBrowserCompat$ItemReceiver.read;
            if (j > 0) {
                this.write.write(this.MediaBrowserCompat$ItemReceiver, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void flush() {
        if (!this.IconCompatParcelizer) {
            if (this.MediaBrowserCompat$ItemReceiver.read > 0) {
                PinChangeActivity pinChangeActivity = this.write;
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.MediaBrowserCompat$ItemReceiver;
                pinChangeActivity.write(sCBUniversalWebViewActivity, sCBUniversalWebViewActivity.read);
            }
            this.write.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean isOpen() {
        return !this.IconCompatParcelizer;
    }

    public final void close() {
        if (!this.IconCompatParcelizer) {
            Throwable th = null;
            try {
                if (this.MediaBrowserCompat$ItemReceiver.read > 0) {
                    this.write.write(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver.read);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.write.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.IconCompatParcelizer = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.write.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver(HowToAddAccountStep2Activity howToAddAccountStep2Activity) {
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "source");
        long j = 0;
        while (true) {
            long read = howToAddAccountStep2Activity.read(this.MediaBrowserCompat$ItemReceiver, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            read();
        }
    }
}
