package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import p040o.AddAccountConsentActivity;
import p040o.C1132xe4073f0a;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.OffshoreCurrencyActivity;
import p040o.PinChangeActivity_ViewBinding;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.ScbsInputActivity;
import p040o.onGetStartedClick;

public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    /* access modifiers changed from: private */
    public static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final NsipPartnerPaymentOtpActivity source;

    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, String str2, int i2, long j);

        void data(boolean z, int i, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, int i2) throws IOException;

        void goAway(int i, ErrorCode errorCode, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    public Http2Reader(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, boolean z) {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        this.source = nsipPartnerPaymentOtpActivity;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(nsipPartnerPaymentOtpActivity);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, (NtbDiscoverFundFilterActivity) null);
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        onGetStartedClick.write((Object) handler, "handler");
        if (!this.client) {
            SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver = this.source.MediaBrowserCompat$ItemReceiver((long) Http2.CONNECTION_PREFACE.write());
            if (logger.isLoggable(Level.FINE)) {
                Logger logger2 = logger;
                StringBuilder sb = new StringBuilder();
                sb.append("<< CONNECTION ");
                sb.append(MediaBrowserCompat$ItemReceiver.read());
                logger2.fine(Util.format(sb.toString(), new Object[0]));
            }
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) Http2.CONNECTION_PREFACE, (Object) MediaBrowserCompat$ItemReceiver)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a connection header but was ");
                sb2.append(PinChangeSuccessActivity.MediaMetadataCompat(MediaBrowserCompat$ItemReceiver));
                throw new IOException(sb2.toString());
            }
        } else if (!nextFrame(true, handler)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final boolean nextFrame(boolean z, Handler handler) throws IOException {
        onGetStartedClick.write((Object) handler, "handler");
        try {
            this.source.MediaDescriptionCompat(9);
            int readMedium = Util.readMedium(this.source);
            if (readMedium <= 16384) {
                int and = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
                if (!z || and == 4) {
                    int and2 = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
                    int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo42948x50fd9e4a() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(Http2.INSTANCE.frameLog(true, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, readMedium, and, and2));
                    }
                    switch (and) {
                        case 0:
                            readData(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        case 1:
                            readHeaders(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        case 2:
                            readPriority(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        case 3:
                            readRstStream(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        case 4:
                            readSettings(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        case 5:
                            readPushPromise(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        case 6:
                            readPing(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        case 7:
                            readGoAway(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        case 8:
                            readWindowUpdate(handler, readMedium, and2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                            return true;
                        default:
                            this.source.MediaBrowserCompat$MediaItem((long) readMedium);
                            return true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected a SETTINGS frame but was ");
                    sb.append(and);
                    throw new IOException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FRAME_SIZE_ERROR: ");
                sb2.append(readMedium);
                throw new IOException(sb2.toString());
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    private final void readHeaders(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                i4 = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
            }
            if ((i2 & 32) != 0) {
                readPriority(handler, i3);
                i -= 5;
            }
            handler.headers(z, i3, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final List<Header> readHeaderBlock(int i, int i2, int i3, int i4) throws IOException {
        this.continuation.setLeft(i);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i2);
        this.continuation.setFlags(i3);
        this.continuation.setStreamId(i4);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readData(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = true;
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((i2 & 8) != 0) {
                    i4 = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
                }
                handler.data(z2, i3, this.source, Companion.lengthWithoutPadding(i, i2, i4));
                this.source.MediaBrowserCompat$MediaItem((long) i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readPriority(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("TYPE_PRIORITY length: ");
            sb.append(i);
            sb.append(" != 5");
            throw new IOException(sb.toString());
        } else if (i3 != 0) {
            readPriority(handler, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    private final void readPriority(Handler handler, int i) throws IOException {
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo42948x50fd9e4a();
        handler.priority(i, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & Api.BaseClientBuilder.API_PRIORITY_OTHER, Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255) + 1, (Integer.MIN_VALUE & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) != 0);
    }

    private final void readRstStream(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("TYPE_RST_STREAM length: ");
            sb.append(i);
            sb.append(" != 4");
            throw new IOException(sb.toString());
        } else if (i3 != 0) {
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo42948x50fd9e4a();
            ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            if (fromHttp2 != null) {
                handler.rstStream(i3, fromHttp2);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TYPE_RST_STREAM unexpected error code: ");
            sb2.append(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            throw new IOException(sb2.toString());
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    private final void readSettings(Handler handler, int i, int i2, int i3) throws IOException {
        AddAccountConsentActivity addAccountConsentActivity;
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i2 & 1) != 0) {
            if (i == 0) {
                handler.ackSettings();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            Settings settings = new Settings();
            if (i <= Integer.MIN_VALUE) {
                C1132xe4073f0a addAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver;
                addAccountConsentActivity = AddAccountConsentActivity.MediaBrowserCompat$MediaItem;
            } else {
                addAccountConsentActivity = new AddAccountConsentActivity(0, i - 1);
            }
            OffshoreCurrencyActivity write = ScbsInputActivity.write(addAccountConsentActivity, 6);
            int i4 = write.IconCompatParcelizer;
            int i5 = write.write;
            int i6 = write.read;
            if (i6 < 0 ? i4 >= i5 : i4 <= i5) {
                while (true) {
                    int and = Util.and(this.source.setHasDecor(), (int) Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo42948x50fd9e4a();
                    if (and != 2) {
                        if (and == 3) {
                            and = 4;
                        } else if (and == 4) {
                            and = 7;
                            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                        } else if (and == 5 && (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver < 16384 || MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver > 16777215)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ");
                            sb.append(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        }
                    } else if (!(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 0 || MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    settings.set(and, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ");
                sb2.append(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                throw new IOException(sb2.toString());
            }
            handler.settings(false, settings);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("TYPE_SETTINGS length % 6 != 0: ");
            sb3.append(i);
            throw new IOException(sb3.toString());
        }
    }

    private final void readPushPromise(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int and = (i2 & 8) != 0 ? Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255) : 0;
            handler.pushPromise(i3, Integer.MAX_VALUE & this.source.mo42948x50fd9e4a(), readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i2, and), and, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readPing(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            StringBuilder sb = new StringBuilder();
            sb.append("TYPE_PING length != 8: ");
            sb.append(i);
            throw new IOException(sb.toString());
        } else if (i3 == 0) {
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo42948x50fd9e4a();
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo42948x50fd9e4a();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            handler.ping(z, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    private final void readGoAway(Handler handler, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            StringBuilder sb = new StringBuilder();
            sb.append("TYPE_GOAWAY length < 8: ");
            sb.append(i);
            throw new IOException(sb.toString());
        } else if (i3 == 0) {
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo42948x50fd9e4a();
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo42948x50fd9e4a();
            int i4 = i - 8;
            ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
            if (fromHttp2 != null) {
                SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                if (i4 > 0) {
                    sCBUniversalWebViewActivity_ViewBinding = this.source.MediaBrowserCompat$ItemReceiver((long) i4);
                }
                handler.goAway(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, fromHttp2, sCBUniversalWebViewActivity_ViewBinding);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TYPE_GOAWAY unexpected error code: ");
            sb2.append(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
            throw new IOException(sb2.toString());
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    private final void readWindowUpdate(Handler handler, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            long and = Util.and(this.source.mo42948x50fd9e4a(), 2147483647L);
            if (and != 0) {
                handler.windowUpdate(i3, and);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TYPE_WINDOW_UPDATE length !=4: ");
        sb.append(i);
        throw new IOException(sb.toString());
    }

    public final void close() throws IOException {
        this.source.close();
    }

    public static final class ContinuationSource implements HowToAddAccountStep2Activity {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final NsipPartnerPaymentOtpActivity source;
        private int streamId;

        public final void close() throws IOException {
        }

        public ContinuationSource(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) {
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
            this.source = nsipPartnerPaymentOtpActivity;
        }

        public final int getLength() {
            return this.length;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        public final int getLeft() {
            return this.left;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.MediaBrowserCompat$MediaItem((long) this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(sCBUniversalWebViewActivity, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final PinChangeActivity_ViewBinding timeout() {
            return this.source.timeout();
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
            this.flags = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
            if (Http2Reader.Companion.getLogger().isLoggable(Level.FINE)) {
                Http2Reader.Companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo42948x50fd9e4a() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.streamId = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
            if (and != 9) {
                StringBuilder sb = new StringBuilder();
                sb.append(and);
                sb.append(" != TYPE_CONTINUATION");
                throw new IOException(sb.toString());
            } else if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("PROTOCOL_ERROR padding ");
            sb.append(i3);
            sb.append(" > remaining length ");
            sb.append(i);
            throw new IOException(sb.toString());
        }
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        onGetStartedClick.IconCompatParcelizer((Object) logger2, "Logger.getLogger(Http2::class.java.name)");
        logger = logger2;
    }
}
