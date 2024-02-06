package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: o.ShortcutRouterActivity */
public final class ShortcutRouterActivity implements NsipPartnerPaymentOtpActivity {
    public boolean MediaBrowserCompat$ItemReceiver;
    public final HowToAddAccountStep2Activity read;
    public final SCBUniversalWebViewActivity write = new SCBUniversalWebViewActivity();

    public ShortcutRouterActivity(HowToAddAccountStep2Activity howToAddAccountStep2Activity) {
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "source");
        this.read = howToAddAccountStep2Activity;
    }

    public final SCBUniversalWebViewActivity MediaMetadataCompat() {
        return this.write;
    }

    public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!(!this.MediaBrowserCompat$ItemReceiver)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.write.read == 0 && this.read.read(this.write, 8192) == -1) {
            return -1;
        } else {
            return this.write.read(sCBUniversalWebViewActivity, Math.min(j, this.write.read));
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            if (!(this.write.read == 0) || this.read.read(this.write, 8192) != -1) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void MediaDescriptionCompat(long j) {
        if (!MediaBrowserCompat$SearchResultReceiver(j)) {
            throw new EOFException();
        }
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver(long j) {
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!this.MediaBrowserCompat$ItemReceiver) {
            while (this.write.read < j) {
                if (this.read.read(this.write, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final int read(onAlienCardTabClicked onaliencardtabclicked) {
        onGetStartedClick.write((Object) onaliencardtabclicked, "options");
        if (!this.MediaBrowserCompat$ItemReceiver) {
            do {
                int MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$ItemReceiver(onaliencardtabclicked, true);
                if (MediaBrowserCompat$ItemReceiver2 != -2) {
                    if (MediaBrowserCompat$ItemReceiver2 == -1) {
                        return -1;
                    }
                    this.write.MediaBrowserCompat$MediaItem((long) onaliencardtabclicked.IconCompatParcelizer[MediaBrowserCompat$ItemReceiver2].write());
                    return MediaBrowserCompat$ItemReceiver2;
                }
            } while (this.read.read(this.write, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void read(byte[] bArr) {
        onGetStartedClick.write((Object) bArr, "sink");
        try {
            if (MediaBrowserCompat$SearchResultReceiver((long) bArr.length)) {
                this.write.read(bArr);
                return;
            }
            throw new EOFException();
        } catch (EOFException e) {
            int i = 0;
            while (this.write.read > 0) {
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.write;
                int write2 = sCBUniversalWebViewActivity.write(bArr, i, (int) sCBUniversalWebViewActivity.read);
                if (write2 != -1) {
                    i += write2;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public final long IconCompatParcelizer(PinChangeActivity pinChangeActivity) {
        onGetStartedClick.write((Object) pinChangeActivity, "sink");
        long j = 0;
        while (this.read.read(this.write, 8192) != -1) {
            long MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 > 0) {
                j += MediaBrowserCompat$ItemReceiver2;
                pinChangeActivity.write(this.write, MediaBrowserCompat$ItemReceiver2);
            }
        }
        if (this.write.read <= 0) {
            return j;
        }
        long j2 = j + this.write.read;
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.write;
        pinChangeActivity.write(sCBUniversalWebViewActivity, sCBUniversalWebViewActivity.read);
        return j2;
    }

    public final String Keep() {
        return IconCompatParcelizer(Long.MAX_VALUE);
    }

    public final String IconCompatParcelizer(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long IconCompatParcelizer = IconCompatParcelizer((byte) 10, 0, j2);
            if (IconCompatParcelizer != -1) {
                return this.write.write(IconCompatParcelizer);
            }
            if (j2 < Long.MAX_VALUE && MediaBrowserCompat$SearchResultReceiver(j2) && this.write.read(j2 - 1) == 13 && MediaBrowserCompat$SearchResultReceiver(1 + j2) && this.write.read(j2) == 10) {
                return this.write.write(j2);
            }
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = this.write;
            sCBUniversalWebViewActivity2.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity, 0, Math.min(32, sCBUniversalWebViewActivity2.read));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.write.read, j));
            sb.append(" content=");
            sb.append(sCBUniversalWebViewActivity.ParcelableVolumeInfo().read());
            sb.append("…");
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void MediaBrowserCompat$MediaItem(long j) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            while (j > 0) {
                if (this.write.read == 0 && this.read.read(this.write, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.write.read);
                this.write.MediaBrowserCompat$MediaItem(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return IconCompatParcelizer((byte) 0, 0, Long.MAX_VALUE);
    }

    private long IconCompatParcelizer(byte b, long j, long j2) {
        boolean z = true;
        if (!this.MediaBrowserCompat$ItemReceiver) {
            if (j2 < 0) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long write2 = this.write.write(b, j, j2);
                    if (write2 == -1) {
                        long j3 = this.write.read;
                        if (j3 >= j2 || this.read.read(this.write, 8192) == -1) {
                            break;
                        }
                        j = Math.max(j, j3);
                    } else {
                        return write2;
                    }
                }
                return -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex=");
            sb.append(0);
            sb.append(" toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long write(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        if (!this.MediaBrowserCompat$ItemReceiver) {
            long j = 0;
            while (true) {
                long MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(sCBUniversalWebViewActivity_ViewBinding, j);
                if (MediaBrowserCompat$CustomActionResultReceiver != -1) {
                    return MediaBrowserCompat$CustomActionResultReceiver;
                }
                long j2 = this.write.read;
                if (this.read.read(this.write, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) sCBUniversalWebViewActivity_ViewBinding.write())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final long read(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "targetBytes");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "targetBytes");
        if (!this.MediaBrowserCompat$ItemReceiver) {
            long j = 0;
            while (true) {
                long MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity_ViewBinding, j);
                if (MediaBrowserCompat$ItemReceiver2 != -1) {
                    return MediaBrowserCompat$ItemReceiver2;
                }
                long j2 = this.write.read;
                if (this.read.read(this.write, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final NsipPartnerPaymentOtpActivity MediaBrowserCompat$MediaItem() {
        return onSubmit.read((HowToAddAccountStep2Activity) new onPassportTabClicked(this));
    }

    /* renamed from: o.ShortcutRouterActivity$write */
    public static final class write extends InputStream {
        private /* synthetic */ ShortcutRouterActivity MediaBrowserCompat$ItemReceiver;

        write(ShortcutRouterActivity shortcutRouterActivity) {
            this.MediaBrowserCompat$ItemReceiver = shortcutRouterActivity;
        }

        public final int read() {
            if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) {
                throw new IOException("closed");
            } else if (this.MediaBrowserCompat$ItemReceiver.write.read == 0 && this.MediaBrowserCompat$ItemReceiver.read.read(this.MediaBrowserCompat$ItemReceiver.write, 8192) == -1) {
                return -1;
            } else {
                return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$SearchResultReceiver() & 255;
            }
        }

        public final int read(byte[] bArr, int i, int i2) {
            onGetStartedClick.write((Object) bArr, "data");
            if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) {
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((long) bArr.length, (long) i, (long) i2);
                if (this.MediaBrowserCompat$ItemReceiver.write.read == 0 && this.MediaBrowserCompat$ItemReceiver.read.read(this.MediaBrowserCompat$ItemReceiver.write, 8192) == -1) {
                    return -1;
                }
                return this.MediaBrowserCompat$ItemReceiver.write.write(bArr, i, i2);
            }
            throw new IOException("closed");
        }

        public final int available() {
            if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) {
                return (int) Math.min(this.MediaBrowserCompat$ItemReceiver.write.read, 2147483647L);
            }
            throw new IOException("closed");
        }

        public final void close() {
            this.MediaBrowserCompat$ItemReceiver.close();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    public final InputStream MediaDescriptionCompat() {
        return new write(this);
    }

    public final boolean isOpen() {
        return !this.MediaBrowserCompat$ItemReceiver;
    }

    public final void close() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.read.close();
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.write;
            sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(sCBUniversalWebViewActivity.read);
        }
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.read.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }

    public final SCBUniversalWebViewActivity_ViewBinding ParcelableVolumeInfo() {
        this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        return new SCBUniversalWebViewActivity_ViewBinding(this.write.RatingCompat());
    }

    public final byte[] RatingCompat() {
        this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.write;
        return sCBUniversalWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver(sCBUniversalWebViewActivity.read);
    }

    public final int read(ByteBuffer byteBuffer) {
        onGetStartedClick.write((Object) byteBuffer, "sink");
        if (this.write.read == 0 && this.read.read(this.write, 8192) == -1) {
            return -1;
        }
        return this.write.read(byteBuffer);
    }

    public final String write(Charset charset) {
        onGetStartedClick.write((Object) charset, "charset");
        this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.write;
        onGetStartedClick.write((Object) charset, "charset");
        return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, charset);
    }

    public final boolean write(long j, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        int write2 = sCBUniversalWebViewActivity_ViewBinding.write();
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        if (!(!this.MediaBrowserCompat$ItemReceiver)) {
            throw new IllegalStateException("closed".toString());
        } else if (j < 0 || write2 < 0 || sCBUniversalWebViewActivity_ViewBinding.write() < write2) {
            return false;
        } else {
            for (int i = 0; i < write2; i++) {
                long j2 = ((long) i) + j;
                if (!MediaBrowserCompat$SearchResultReceiver(1 + j2) || this.write.read(j2) != sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final byte MediaBrowserCompat$SearchResultReceiver() {
        if (MediaBrowserCompat$SearchResultReceiver(1)) {
            return this.write.MediaBrowserCompat$SearchResultReceiver();
        }
        throw new EOFException();
    }

    public final byte[] MediaBrowserCompat$CustomActionResultReceiver(long j) {
        if (MediaBrowserCompat$SearchResultReceiver(j)) {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver(j);
        }
        throw new EOFException();
    }

    public final SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver(long j) {
        if (MediaBrowserCompat$SearchResultReceiver(j)) {
            return this.write.MediaBrowserCompat$ItemReceiver(j);
        }
        throw new EOFException();
    }

    public final long MediaSessionCompat$Token() {
        int i;
        if (MediaBrowserCompat$SearchResultReceiver(1)) {
            long j = 0;
            while (true) {
                long j2 = j + 1;
                if (!MediaBrowserCompat$SearchResultReceiver(j2)) {
                    break;
                }
                byte read2 = this.write.read(j);
                if ((read2 >= 48 && read2 <= 57) || (j == 0 && read2 == 45)) {
                    j = j2;
                } else if (i == 0) {
                    FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
                    String format = String.format("Expected leading [0-9] or '-' character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(read2)}, 1));
                    onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
                    throw new NumberFormatException(format);
                }
            }
            return this.write.MediaSessionCompat$Token();
        }
        throw new EOFException();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        try {
            if (MediaBrowserCompat$SearchResultReceiver(j)) {
                this.write.MediaBrowserCompat$CustomActionResultReceiver(sCBUniversalWebViewActivity, j);
                return;
            }
            throw new EOFException();
        } catch (EOFException e) {
            sCBUniversalWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountStep2Activity) this.write);
            throw e;
        }
    }

    public final long MediaSessionCompat$QueueItem() {
        if (MediaBrowserCompat$SearchResultReceiver(1)) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!MediaBrowserCompat$SearchResultReceiver((long) i2)) {
                    break;
                }
                byte read2 = this.write.read((long) i);
                if ((read2 >= 48 && read2 <= 57) || ((read2 >= 97 && read2 <= 102) || (read2 >= 65 && read2 <= 70))) {
                    i = i2;
                } else if (i == 0) {
                    FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
                    String format = String.format("Expected leading [0-9a-fA-F] character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(read2)}, 1));
                    onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
                    throw new NumberFormatException(format);
                }
            }
            return this.write.MediaSessionCompat$QueueItem();
        }
        throw new EOFException();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo42948x50fd9e4a() {
        if (MediaBrowserCompat$SearchResultReceiver(4)) {
            return this.write.mo42948x50fd9e4a();
        }
        throw new EOFException();
    }

    public final long AlertController$RecycleListView() {
        if (MediaBrowserCompat$SearchResultReceiver(8)) {
            return this.write.AlertController$RecycleListView();
        }
        throw new EOFException();
    }

    public final short setHasDecor() {
        if (MediaBrowserCompat$SearchResultReceiver(2)) {
            return this.write.setHasDecor();
        }
        throw new EOFException();
    }
}
