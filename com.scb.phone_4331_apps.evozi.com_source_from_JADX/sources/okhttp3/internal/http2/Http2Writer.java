package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final SCBUniversalWebViewActivity hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize = 16384;
    private final NsipPartnerPaymentReviewActivity sink;

    public Http2Writer(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, boolean z) {
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
        this.sink = nsipPartnerPaymentReviewActivity;
        this.client = z;
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        this.hpackBuffer = sCBUniversalWebViewActivity;
        this.hpackWriter = new Hpack.Writer(0, false, sCBUniversalWebViewActivity, 3, (NtbDiscoverFundFilterActivity) null);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void connectionPreface() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            } else if (this.client) {
                if (logger.isLoggable(Level.FINE)) {
                    Logger logger2 = logger;
                    StringBuilder sb = new StringBuilder();
                    sb.append(">> CONNECTION ");
                    sb.append(Http2.CONNECTION_PREFACE.read());
                    logger2.fine(Util.format(sb.toString(), new Object[0]));
                }
                this.sink.IconCompatParcelizer(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        }
    }

    public final void applyAndAckSettings(Settings settings) throws IOException {
        synchronized (this) {
            onGetStartedClick.write((Object) settings, "peerSettings");
            if (!this.closed) {
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                if (settings.getHeaderTableSize() != -1) {
                    this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
                }
                frameHeader(0, 0, 4, 1);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void pushPromise(int i, int i2, List<Header> list) throws IOException {
        synchronized (this) {
            onGetStartedClick.write((Object) list, "requestHeaders");
            if (!this.closed) {
                this.hpackWriter.writeHeaders(list);
                long j = this.hpackBuffer.read;
                int min = (int) Math.min(((long) this.maxFrameSize) - 4, j);
                long j2 = (long) min;
                int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                frameHeader(i, min + 4, 5, i3 == 0 ? 4 : 0);
                this.sink.IconCompatParcelizer(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.sink.write(this.hpackBuffer, j2);
                if (i3 > 0) {
                    writeContinuationFrames(i, j - j2);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (!this.closed) {
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void rstStream(int i, ErrorCode errorCode) throws IOException {
        synchronized (this) {
            onGetStartedClick.write((Object) errorCode, "errorCode");
            if (!this.closed) {
                if (errorCode.getHttpCode() != -1) {
                    frameHeader(i, 4, 3, 0);
                    this.sink.IconCompatParcelizer(errorCode.getHttpCode());
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final void data(boolean z, int i, SCBUniversalWebViewActivity sCBUniversalWebViewActivity, int i2) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                dataFrame(i, z ? 1 : 0, sCBUniversalWebViewActivity, i2);
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void dataFrame(int i, int i2, SCBUniversalWebViewActivity sCBUniversalWebViewActivity, int i3) throws IOException {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.sink;
            if (sCBUniversalWebViewActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            nsipPartnerPaymentReviewActivity.write(sCBUniversalWebViewActivity, (long) i3);
        }
    }

    public final void settings(Settings settings) throws IOException {
        synchronized (this) {
            onGetStartedClick.write((Object) settings, "settings");
            if (!this.closed) {
                int i = 0;
                frameHeader(0, settings.size() * 6, 4, 0);
                while (i < 10) {
                    if (settings.isSet(i)) {
                        this.sink.MediaBrowserCompat$MediaItem(i != 4 ? i != 7 ? i : 4 : 3);
                        this.sink.IconCompatParcelizer(settings.get(i));
                    }
                    i++;
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void ping(boolean z, int i, int i2) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                frameHeader(0, 8, 6, z ? 1 : 0);
                this.sink.IconCompatParcelizer(i);
                this.sink.IconCompatParcelizer(i2);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        synchronized (this) {
            onGetStartedClick.write((Object) errorCode, "errorCode");
            onGetStartedClick.write((Object) bArr, "debugData");
            if (!this.closed) {
                boolean z = false;
                if (errorCode.getHttpCode() != -1) {
                    frameHeader(0, bArr.length + 8, 7, 0);
                    this.sink.IconCompatParcelizer(i);
                    this.sink.IconCompatParcelizer(errorCode.getHttpCode());
                    if (bArr.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        this.sink.write(bArr);
                    }
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void windowUpdate(int i, long j) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                if (j != 0 && j <= 2147483647L) {
                    frameHeader(i, 4, 8, 0);
                    this.sink.IconCompatParcelizer((int) j);
                    this.sink.flush();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                    sb.append(j);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void frameHeader(int i, int i2, int i3, int i4) throws IOException {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.INSTANCE.frameLog(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.maxFrameSize) {
            if ((Integer.MIN_VALUE & i) != 0) {
                z = false;
            }
            if (z) {
                Util.writeMedium(this.sink, i2);
                this.sink.MediaBrowserCompat$ItemReceiver(i3 & 255);
                this.sink.MediaBrowserCompat$ItemReceiver(i4 & 255);
                this.sink.IconCompatParcelizer(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("reserved bit set: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FRAME_SIZE_ERROR length > ");
        sb2.append(this.maxFrameSize);
        sb2.append(": ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
        }
    }

    private final void writeContinuationFrames(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min((long) this.maxFrameSize, j);
            j -= min;
            frameHeader(i, (int) min, 9, j == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final void headers(boolean z, int i, List<Header> list) throws IOException {
        synchronized (this) {
            onGetStartedClick.write((Object) list, "headerBlock");
            if (!this.closed) {
                this.hpackWriter.writeHeaders(list);
                long j = this.hpackBuffer.read;
                long min = Math.min((long) this.maxFrameSize, j);
                int i2 = (j > min ? 1 : (j == min ? 0 : -1));
                int i3 = i2 == 0 ? 4 : 0;
                if (z) {
                    i3 |= 1;
                }
                frameHeader(i, (int) min, 1, i3);
                this.sink.write(this.hpackBuffer, min);
                if (i2 > 0) {
                    writeContinuationFrames(i, j - min);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
