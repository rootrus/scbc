package okhttp3.internal.p089ws;

import java.io.IOException;
import java.util.Random;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.PinChangeActivity;
import p040o.PinChangeActivity_ViewBinding;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

/* renamed from: okhttp3.internal.ws.WebSocketWriter */
public final class WebSocketWriter {
    private boolean activeWriter;
    private final SCBUniversalWebViewActivity buffer = new SCBUniversalWebViewActivity();
    private final FrameSink frameSink = new FrameSink();
    private final boolean isClient;
    private final SCBUniversalWebViewActivity.IconCompatParcelizer maskCursor;
    private final byte[] maskKey;
    private final Random random;
    private final NsipPartnerPaymentReviewActivity sink;
    private final SCBUniversalWebViewActivity sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, Random random2) {
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
        onGetStartedClick.write((Object) random2, "random");
        this.isClient = z;
        this.sink = nsipPartnerPaymentReviewActivity;
        this.random = random2;
        this.sinkBuffer = nsipPartnerPaymentReviewActivity.MediaMetadataCompat();
        SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer = null;
        this.maskKey = this.isClient ? new byte[4] : null;
        this.maskCursor = this.isClient ? new SCBUniversalWebViewActivity.IconCompatParcelizer() : iconCompatParcelizer;
    }

    public final NsipPartnerPaymentReviewActivity getSink() {
        return this.sink;
    }

    public final Random getRandom() {
        return this.random;
    }

    public final SCBUniversalWebViewActivity getBuffer() {
        return this.buffer;
    }

    public final boolean getActiveWriter() {
        return this.activeWriter;
    }

    public final void setActiveWriter(boolean z) {
        this.activeWriter = z;
    }

    public final void writePing(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "payload");
        writeControlFrame(9, sCBUniversalWebViewActivity_ViewBinding);
    }

    public final void writePong(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "payload");
        writeControlFrame(10, sCBUniversalWebViewActivity_ViewBinding);
    }

    public final void writeClose(int i, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2 = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        if (!(i == 0 && sCBUniversalWebViewActivity_ViewBinding == null)) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(i);
            if (sCBUniversalWebViewActivity_ViewBinding != null) {
                onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
                sCBUniversalWebViewActivity_ViewBinding.write(sCBUniversalWebViewActivity);
            }
            sCBUniversalWebViewActivity_ViewBinding2 = new SCBUniversalWebViewActivity_ViewBinding(sCBUniversalWebViewActivity.RatingCompat());
        }
        try {
            writeControlFrame(8, sCBUniversalWebViewActivity_ViewBinding2);
        } finally {
            this.writerClosed = true;
        }
    }

    private final void writeControlFrame(int i, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        if (!this.writerClosed) {
            int write = sCBUniversalWebViewActivity_ViewBinding.write();
            if (((long) write) <= 125) {
                this.sinkBuffer.MediaBrowserCompat$ItemReceiver(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.MediaBrowserCompat$ItemReceiver(write | 128);
                    Random random2 = this.random;
                    byte[] bArr = this.maskKey;
                    if (bArr == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    random2.nextBytes(bArr);
                    SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.sinkBuffer;
                    byte[] bArr2 = this.maskKey;
                    onGetStartedClick.write((Object) bArr2, "source");
                    sCBUniversalWebViewActivity.IconCompatParcelizer(bArr2, 0, bArr2.length);
                    if (write > 0) {
                        long j = this.sinkBuffer.read;
                        SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = this.sinkBuffer;
                        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
                        sCBUniversalWebViewActivity_ViewBinding.write(sCBUniversalWebViewActivity2);
                        SCBUniversalWebViewActivity sCBUniversalWebViewActivity3 = this.sinkBuffer;
                        SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer = this.maskCursor;
                        if (iconCompatParcelizer == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        sCBUniversalWebViewActivity3.read(iconCompatParcelizer);
                        this.maskCursor.IconCompatParcelizer(j);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.MediaBrowserCompat$ItemReceiver(write);
                    SCBUniversalWebViewActivity sCBUniversalWebViewActivity4 = this.sinkBuffer;
                    onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
                    sCBUniversalWebViewActivity_ViewBinding.write(sCBUniversalWebViewActivity4);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public final PinChangeActivity newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            this.frameSink.setFormatOpcode(i);
            this.frameSink.setContentLength(j);
            this.frameSink.setFirstFrame(true);
            this.frameSink.setClosed(false);
            return this.frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?".toString());
    }

    public final void writeMessageFrame(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.writerClosed) {
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.sinkBuffer.MediaBrowserCompat$ItemReceiver(i);
            int i2 = this.isClient ? 128 : 0;
            if (j <= 125) {
                this.sinkBuffer.MediaBrowserCompat$ItemReceiver(i2 | ((int) j));
            } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.MediaBrowserCompat$ItemReceiver(i2 | 126);
                this.sinkBuffer.MediaBrowserCompat$MediaItem((int) j);
            } else {
                this.sinkBuffer.MediaBrowserCompat$ItemReceiver(i2 | 127);
                this.sinkBuffer.MediaSessionCompat$QueueItem(j);
            }
            if (this.isClient) {
                Random random2 = this.random;
                byte[] bArr = this.maskKey;
                if (bArr == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                random2.nextBytes(bArr);
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.sinkBuffer;
                byte[] bArr2 = this.maskKey;
                onGetStartedClick.write((Object) bArr2, "source");
                sCBUniversalWebViewActivity.IconCompatParcelizer(bArr2, 0, bArr2.length);
                if (j > 0) {
                    long j2 = this.sinkBuffer.read;
                    this.sinkBuffer.write(this.buffer, j);
                    SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = this.sinkBuffer;
                    SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer = this.maskCursor;
                    if (iconCompatParcelizer == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    sCBUniversalWebViewActivity2.read(iconCompatParcelizer);
                    this.maskCursor.IconCompatParcelizer(j2);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.write();
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: okhttp3.internal.ws.WebSocketWriter$FrameSink */
    public final class FrameSink implements PinChangeActivity {
        private boolean closed;
        private long contentLength;
        private int formatOpcode;
        private boolean isFirstFrame;

        public FrameSink() {
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final void setFormatOpcode(int i) {
            this.formatOpcode = i;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final void setContentLength(long j) {
            this.contentLength = j;
        }

        public final boolean isFirstFrame() {
            return this.isFirstFrame;
        }

        public final void setFirstFrame(boolean z) {
            this.isFirstFrame = z;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
            if (!this.closed) {
                WebSocketWriter.this.getBuffer().write(sCBUniversalWebViewActivity, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.getBuffer().read > this.contentLength - 8192;
                long MediaBrowserCompat$ItemReceiver = WebSocketWriter.this.getBuffer().MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, MediaBrowserCompat$ItemReceiver, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.getBuffer().read, this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        public final PinChangeActivity_ViewBinding timeout() {
            return WebSocketWriter.this.getSink().timeout();
        }

        public final void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.getBuffer().read, this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.setActiveWriter(false);
                return;
            }
            throw new IOException("closed");
        }
    }
}
