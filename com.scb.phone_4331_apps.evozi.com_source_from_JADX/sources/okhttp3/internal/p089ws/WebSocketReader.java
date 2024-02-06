package okhttp3.internal.p089ws;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;
import p040o.GroupFavoriteActivity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

/* renamed from: okhttp3.internal.ws.WebSocketReader */
public final class WebSocketReader {
    private boolean closed;
    private final SCBUniversalWebViewActivity controlFrameBuffer = new SCBUniversalWebViewActivity();
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final SCBUniversalWebViewActivity.IconCompatParcelizer maskCursor;
    private final byte[] maskKey;
    private final SCBUniversalWebViewActivity messageFrameBuffer = new SCBUniversalWebViewActivity();
    private int opcode;
    private final NsipPartnerPaymentOtpActivity source;

    /* renamed from: okhttp3.internal.ws.WebSocketReader$FrameCallback */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException;

        void onReadPing(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding);

        void onReadPong(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding);
    }

    public WebSocketReader(boolean z, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, FrameCallback frameCallback2) {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        onGetStartedClick.write((Object) frameCallback2, "frameCallback");
        this.isClient = z;
        this.source = nsipPartnerPaymentOtpActivity;
        this.frameCallback = frameCallback2;
        SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer = null;
        this.maskKey = this.isClient ? null : new byte[4];
        this.maskCursor = !this.isClient ? new SCBUniversalWebViewActivity.IconCompatParcelizer() : iconCompatParcelizer;
    }

    public final NsipPartnerPaymentOtpActivity getSource() {
        return this.source;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed(boolean z) {
        this.closed = z;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }

    /* JADX INFO: finally extract failed */
    private final void readHeader() throws IOException, ProtocolException {
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = and & 15;
                boolean z = true;
                this.isFinalFrame = (and & 128) != 0;
                boolean z2 = (and & 8) != 0;
                this.isControlFrame = z2;
                if (!z2 || this.isFinalFrame) {
                    boolean z3 = (and & 64) != 0;
                    boolean z4 = (and & 32) != 0;
                    boolean z5 = (and & 16) != 0;
                    if (z3 || z4 || z5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    int and2 = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
                    if ((and2 & 128) == 0) {
                        z = false;
                    }
                    boolean z6 = this.isClient;
                    if (z == z6) {
                        throw new ProtocolException(z6 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j = (long) (and2 & 127);
                    this.frameLength = j;
                    if (j == 126) {
                        this.frameLength = (long) Util.and(this.source.setHasDecor(), (int) Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    } else if (j == 127) {
                        long AlertController$RecycleListView = this.source.AlertController$RecycleListView();
                        this.frameLength = AlertController$RecycleListView;
                        if (AlertController$RecycleListView < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Frame length 0x");
                            sb.append(Util.toHexString(this.frameLength));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity = this.source;
                        byte[] bArr = this.maskKey;
                        if (bArr == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        nsipPartnerPaymentOtpActivity.read(bArr);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private final void readControlFrame() throws IOException {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.MediaBrowserCompat$CustomActionResultReceiver(this.controlFrameBuffer, j);
            if (!this.isClient) {
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.controlFrameBuffer;
                SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer = this.maskCursor;
                if (iconCompatParcelizer == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                sCBUniversalWebViewActivity.read(iconCompatParcelizer);
                this.maskCursor.IconCompatParcelizer(0);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                if (bArr == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                webSocketProtocol.toggleMask(iconCompatParcelizer2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long j2 = this.controlFrameBuffer.read;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = this.controlFrameBuffer.setHasDecor();
                        SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = this.controlFrameBuffer;
                        str = sCBUniversalWebViewActivity2.IconCompatParcelizer(sCBUniversalWebViewActivity2.read, GroupFavoriteActivity.IconCompatParcelizer);
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.ParcelableVolumeInfo());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.ParcelableVolumeInfo());
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown control opcode: ");
                sb.append(Util.toHexString(this.opcode));
                throw new ProtocolException(sb.toString());
        }
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (i == 1) {
                FrameCallback frameCallback2 = this.frameCallback;
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.messageFrameBuffer;
                frameCallback2.onReadMessage(sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer));
                return;
            }
            this.frameCallback.onReadMessage(this.messageFrameBuffer.ParcelableVolumeInfo());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown opcode: ");
        sb.append(Util.toHexString(i));
        throw new ProtocolException(sb.toString());
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.MediaBrowserCompat$CustomActionResultReceiver(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.messageFrameBuffer;
                    SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer = this.maskCursor;
                    if (iconCompatParcelizer == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    sCBUniversalWebViewActivity.read(iconCompatParcelizer);
                    this.maskCursor.IconCompatParcelizer(this.messageFrameBuffer.read - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    if (bArr == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    webSocketProtocol.toggleMask(iconCompatParcelizer2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected continuation opcode. Got: ");
                    sb.append(Util.toHexString(this.opcode));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }
}
