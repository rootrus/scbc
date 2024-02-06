package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.SetupQuickPromptPayActivity */
final class SetupQuickPromptPayActivity implements PinLoginActivity {
    public final HowToAddAccountActivity MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public boolean read;
    public final onMenuPromptPayClick write;

    private SetupQuickPromptPayActivity(HowToAddAccountActivity howToAddAccountActivity, onMenuPromptPayClick onmenupromptpayclick) {
        if (howToAddAccountActivity != null) {
            this.write = onmenupromptpayclick;
            this.MediaBrowserCompat$CustomActionResultReceiver = howToAddAccountActivity;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public SetupQuickPromptPayActivity(HowToAddAccountActivity howToAddAccountActivity) {
        this(howToAddAccountActivity, new onMenuPromptPayClick());
    }

    public final onMenuPromptPayClick MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }

    public final long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        if (onmenupromptpayclick == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.read) {
            throw new IllegalStateException("closed");
        } else if (this.write.IconCompatParcelizer == 0 && this.MediaBrowserCompat$CustomActionResultReceiver.read(this.write, 2048) == -1) {
            return -1;
        } else {
            return this.write.read(onmenupromptpayclick, Math.min(j, this.write.IconCompatParcelizer));
        }
    }

    public final boolean read() throws IOException {
        if (!this.read) {
            return ((this.write.IconCompatParcelizer > 0 ? 1 : (this.write.IconCompatParcelizer == 0 ? 0 : -1)) == 0) && this.MediaBrowserCompat$CustomActionResultReceiver.read(this.write, 2048) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public final void MediaDescriptionCompat(long j) throws IOException {
        if (!MediaBrowserCompat$CustomActionResultReceiver(j)) {
            throw new EOFException();
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(long j) throws IOException {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.read) {
            while (this.write.IconCompatParcelizer < j) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.read(this.write, 2048) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final byte[] MediaDescriptionCompat() throws IOException {
        this.write.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        return this.write.MediaDescriptionCompat();
    }

    public final String PlaybackStateCompat$CustomAction() throws IOException {
        long MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver((byte) 10);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != -1) {
            return this.write.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
        }
        onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
        onMenuPromptPayClick onmenupromptpayclick2 = this.write;
        onmenupromptpayclick2.MediaBrowserCompat$ItemReceiver(onmenupromptpayclick, 0, Math.min(32, onmenupromptpayclick2.IconCompatParcelizer));
        StringBuilder sb = new StringBuilder();
        sb.append("\\n not found: size=");
        sb.append(this.write.IconCompatParcelizer);
        sb.append(" content=");
        sb.append(new PinLoginActivity_ViewBinding(onmenupromptpayclick.MediaDescriptionCompat()).MediaBrowserCompat$CustomActionResultReceiver());
        sb.append("...");
        throw new EOFException(sb.toString());
    }

    public final void MediaMetadataCompat(long j) throws IOException {
        if (!this.read) {
            while (j > 0) {
                if (this.write.IconCompatParcelizer == 0 && this.MediaBrowserCompat$CustomActionResultReceiver.read(this.write, 2048) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.write.IconCompatParcelizer);
                this.write.MediaMetadataCompat(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final InputStream MediaBrowserCompat$SearchResultReceiver() {
        return new InputStream() {
            public final int read() throws IOException {
                if (SetupQuickPromptPayActivity.this.read) {
                    throw new IOException("closed");
                } else if (SetupQuickPromptPayActivity.this.write.IconCompatParcelizer == 0 && SetupQuickPromptPayActivity.this.MediaBrowserCompat$CustomActionResultReceiver.read(SetupQuickPromptPayActivity.this.write, 2048) == -1) {
                    return -1;
                } else {
                    return SetupQuickPromptPayActivity.this.write.MediaMetadataCompat() & 255;
                }
            }

            public final int read(byte[] bArr, int i, int i2) throws IOException {
                if (!SetupQuickPromptPayActivity.this.read) {
                    ModifyQuickTopUpActivity.IconCompatParcelizer((long) bArr.length, (long) i, (long) i2);
                    if (SetupQuickPromptPayActivity.this.write.IconCompatParcelizer == 0 && SetupQuickPromptPayActivity.this.MediaBrowserCompat$CustomActionResultReceiver.read(SetupQuickPromptPayActivity.this.write, 2048) == -1) {
                        return -1;
                    }
                    return SetupQuickPromptPayActivity.this.write.write(bArr, i, i2);
                }
                throw new IOException("closed");
            }

            public final int available() throws IOException {
                if (!SetupQuickPromptPayActivity.this.read) {
                    return (int) Math.min(SetupQuickPromptPayActivity.this.write.IconCompatParcelizer, 2147483647L);
                }
                throw new IOException("closed");
            }

            public final void close() throws IOException {
                SetupQuickPromptPayActivity.this.close();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(SetupQuickPromptPayActivity.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    public final void close() throws IOException {
        if (!this.read) {
            this.read = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.close();
            onMenuPromptPayClick onmenupromptpayclick = this.write;
            try {
                onmenupromptpayclick.MediaMetadataCompat(onmenupromptpayclick.IconCompatParcelizer);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final ModifyQuickPromptPayActivity timeout() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver(byte b) throws IOException {
        if (!this.read) {
            do {
                long j = 0;
                if (0 < this.write.IconCompatParcelizer) {
                    do {
                        long IconCompatParcelizer = this.write.IconCompatParcelizer(b, j);
                        if (IconCompatParcelizer != -1) {
                            return IconCompatParcelizer;
                        }
                        j = this.write.IconCompatParcelizer;
                    } while (this.MediaBrowserCompat$CustomActionResultReceiver.read(this.write, 2048) != -1);
                    return -1;
                }
            } while (this.MediaBrowserCompat$CustomActionResultReceiver.read(this.write, 2048) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public final byte MediaMetadataCompat() throws IOException {
        if (MediaBrowserCompat$CustomActionResultReceiver(1)) {
            return this.write.MediaMetadataCompat();
        }
        throw new EOFException();
    }

    public final byte[] read(long j) throws IOException {
        if (MediaBrowserCompat$CustomActionResultReceiver(j)) {
            return this.write.read(j);
        }
        throw new EOFException();
    }

    public final PinLoginActivity_ViewBinding IconCompatParcelizer(long j) throws IOException {
        if (MediaBrowserCompat$CustomActionResultReceiver(j)) {
            return this.write.IconCompatParcelizer(j);
        }
        throw new EOFException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long MediaBrowserCompat$MediaItem() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            boolean r0 = r6.MediaBrowserCompat$CustomActionResultReceiver((long) r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            r1 = r0
        L_0x000a:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.MediaBrowserCompat$CustomActionResultReceiver((long) r3)
            if (r3 == 0) goto L_0x0042
            o.onMenuPromptPayClick r3 = r6.write
            long r4 = (long) r1
            byte r3 = r3.write((long) r4)
            r4 = 48
            if (r3 < r4) goto L_0x0022
            r4 = 57
            if (r3 <= r4) goto L_0x0028
        L_0x0022:
            if (r1 != 0) goto L_0x002a
            r4 = 45
            if (r3 != r4) goto L_0x002a
        L_0x0028:
            r1 = r2
            goto L_0x000a
        L_0x002a:
            if (r1 == 0) goto L_0x002d
            goto L_0x0042
        L_0x002d:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            r1[r0] = r2
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x0042:
            o.onMenuPromptPayClick r0 = r6.write
            long r0 = r0.MediaBrowserCompat$MediaItem()
            return r0
        L_0x0049:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SetupQuickPromptPayActivity.MediaBrowserCompat$MediaItem():long");
    }

    public final long MediaSessionCompat$ResultReceiverWrapper() throws IOException {
        if (MediaBrowserCompat$CustomActionResultReceiver(1)) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!MediaBrowserCompat$CustomActionResultReceiver((long) i2)) {
                    break;
                }
                byte write2 = this.write.write((long) i);
                if ((write2 >= 48 && write2 <= 57) || ((write2 >= 97 && write2 <= 102) || (write2 >= 65 && write2 <= 70))) {
                    i = i2;
                } else if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(write2)}));
                }
            }
            return this.write.MediaSessionCompat$ResultReceiverWrapper();
        }
        throw new EOFException();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo56993x50fd9e4a() throws IOException {
        if (MediaBrowserCompat$CustomActionResultReceiver(4)) {
            return this.write.mo56993x50fd9e4a();
        }
        throw new EOFException();
    }

    public final int MediaSessionCompat$QueueItem() throws IOException {
        if (MediaBrowserCompat$CustomActionResultReceiver(4)) {
            return this.write.MediaSessionCompat$QueueItem();
        }
        throw new EOFException();
    }

    public final short MediaSessionCompat$Token() throws IOException {
        if (MediaBrowserCompat$CustomActionResultReceiver(2)) {
            return this.write.MediaSessionCompat$Token();
        }
        throw new EOFException();
    }

    public final short ParcelableVolumeInfo() throws IOException {
        if (MediaBrowserCompat$CustomActionResultReceiver(2)) {
            return this.write.ParcelableVolumeInfo();
        }
        throw new EOFException();
    }
}
