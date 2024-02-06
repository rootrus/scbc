package okhttp3.repackaged.internal.framed;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.repackaged.Protocol;
import okhttp3.repackaged.internal.framed.C10257a;
import okhttp3.repackaged.internal.framed.FrameReader;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickPromptPayActivity;
import p040o.ModifyQuickTopUpActivity;
import p040o.PinLoginActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.onLoginButtonClick;
import p040o.onMenuPromptPayClick;

public final class Http2 implements Variant {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    /* access modifiers changed from: private */
    public static final PinLoginActivity_ViewBinding akw = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(C10251b.class.getName());

    public final Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    public final FrameReader newReader(PinLoginActivity pinLoginActivity, boolean z) {
        return new C10252c(pinLoginActivity, 4096, z);
    }

    public final FrameWriter newWriter(onLoginButtonClick onloginbuttonclick, boolean z) {
        return new C10253d(onloginbuttonclick, z);
    }

    /* renamed from: okhttp3.repackaged.internal.framed.Http2$c */
    static final class C10252c implements FrameReader {
        private final C10250a akx;
        final C10257a.C10258a aky;
        private final boolean client;
        private final PinLoginActivity source;

        C10252c(PinLoginActivity pinLoginActivity, int i, boolean z) {
            this.source = pinLoginActivity;
            this.client = z;
            C10250a aVar = new C10250a(pinLoginActivity);
            this.akx = aVar;
            this.aky = new C10257a.C10258a(i, aVar);
        }

        public final void readConnectionPreface() throws IOException {
            if (!this.client) {
                PinLoginActivity_ViewBinding IconCompatParcelizer = this.source.IconCompatParcelizer((long) Http2.akw.write.length);
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(String.format("<< CONNECTION %s", new Object[]{IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()}));
                }
                if (!Http2.akw.equals(IconCompatParcelizer)) {
                    Object[] objArr = new Object[1];
                    String str = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                    if (str == null) {
                        str = new String(IconCompatParcelizer.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
                        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str;
                    }
                    objArr[0] = str;
                    throw Http2.ioException("Expected a connection header but was %s", objArr);
                }
            }
        }

        public final boolean nextFrame(FrameReader.Handler handler) throws IOException {
            try {
                this.source.MediaDescriptionCompat(9);
                int e = Http2.m6035d(this.source);
                if (e < 0 || e > 16384) {
                    throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(e));
                }
                byte MediaMetadataCompat = (byte) this.source.MediaMetadataCompat();
                byte MediaMetadataCompat2 = (byte) this.source.MediaMetadataCompat();
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(C10251b.m6040a(true, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, e, MediaMetadataCompat, MediaMetadataCompat2));
                }
                switch (MediaMetadataCompat) {
                    case 0:
                        m6044b(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    case 1:
                        m6043a(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    case 2:
                        m6045c(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    case 3:
                        m6046d(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    case 4:
                        m6047e(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    case 5:
                        m6048f(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    case 6:
                        m6049g(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    case 7:
                        m6050h(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    case 8:
                        m6051i(handler, e, MediaMetadataCompat2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        break;
                    default:
                        this.source.MediaMetadataCompat((long) e);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        /* renamed from: a */
        private void m6043a(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            short s = 0;
            if (i2 != 0) {
                boolean z = (b & 1) != 0;
                if ((b & 8) != 0) {
                    s = (short) (this.source.MediaMetadataCompat() & 255);
                }
                if ((b & 32) != 0) {
                    m6042a(handler, i2);
                    i -= 5;
                }
                handler.headers(false, z, i2, -1, m6041a(Http2.lengthWithoutPadding(i, b, s), s, b, i2), HeadersMode.HTTP_20_HEADERS);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        /* renamed from: a */
        private List<Header> m6041a(int i, short s, byte b, int i2) throws IOException {
            C10250a aVar = this.akx;
            aVar.left = i;
            aVar.length = i;
            this.akx.padding = s;
            this.akx.flags = b;
            this.akx.streamId = i2;
            this.aky.readHeaders();
            return this.aky.getAndResetHeaderList();
        }

        /* renamed from: b */
        private void m6044b(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            boolean z = true;
            short s = 0;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.source.MediaMetadataCompat() & 255);
                }
                handler.data(z2, i2, this.source, Http2.lengthWithoutPadding(i, b, s));
                this.source.MediaMetadataCompat((long) s);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        /* renamed from: c */
        private void m6045c(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            } else if (i2 != 0) {
                m6042a(handler, i2);
            } else {
                throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m6042a(FrameReader.Handler handler, int i) throws IOException {
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
            handler.priority(i, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & Api.BaseClientBuilder.API_PRIORITY_OTHER, (this.source.MediaMetadataCompat() & 255) + 1, (Integer.MIN_VALUE & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) != 0);
        }

        /* renamed from: d */
        private void m6046d(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            } else if (i2 != 0) {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                if (fromHttp2 != null) {
                    handler.rstStream(i2, fromHttp2);
                } else {
                    throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver));
                }
            } else {
                throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
        }

        /* renamed from: e */
        private void m6047e(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    handler.ackSettings();
                    return;
                }
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i % 6 == 0) {
                Settings settings = new Settings();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short MediaSessionCompat$Token = this.source.MediaSessionCompat$Token();
                    int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                    if (MediaSessionCompat$Token != 2) {
                        if (MediaSessionCompat$Token == 3) {
                            MediaSessionCompat$Token = 4;
                        } else if (MediaSessionCompat$Token == 4) {
                            MediaSessionCompat$Token = 7;
                            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver < 0) {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        } else if (MediaSessionCompat$Token == 5 && (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver < 16384 || MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver > 16777215)) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver));
                        }
                    } else if (!(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 0 || MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 1)) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                    settings.mo58793d(MediaSessionCompat$Token, 0, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                }
                handler.settings(false, settings);
                if (settings.getHeaderTableSize() >= 0) {
                    this.aky.mo58811x(settings.getHeaderTableSize());
                }
            } else {
                throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
        }

        /* renamed from: f */
        private void m6048f(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            short s = 0;
            if (i2 != 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.source.MediaMetadataCompat() & 255);
                }
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                handler.pushPromise(i2, Integer.MAX_VALUE & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, m6041a(Http2.lengthWithoutPadding(i - 4, b, s), s, b, i2));
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        /* renamed from: g */
        private void m6049g(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            boolean z = true;
            if (i != 8) {
                throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo56993x50fd9e4a();
                if ((b & 1) == 0) {
                    z = false;
                }
                handler.ping(z, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
            } else {
                throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
            }
        }

        /* renamed from: h */
        private void m6050h(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo56993x50fd9e4a();
                int i3 = i - 8;
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
                if (fromHttp2 != null) {
                    PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver;
                    if (i3 > 0) {
                        pinLoginActivity_ViewBinding = this.source.IconCompatParcelizer((long) i3);
                    }
                    handler.goAway(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, fromHttp2, pinLoginActivity_ViewBinding);
                    return;
                }
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2));
            } else {
                throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
        }

        /* renamed from: i */
        private void m6051i(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i == 4) {
                long MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = ((long) this.source.mo56993x50fd9e4a()) & 2147483647L;
                if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != 0) {
                    handler.windowUpdate(i2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                } else {
                    throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver));
                }
            } else {
                throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            }
        }

        public final void close() throws IOException {
            this.source.close();
        }
    }

    /* renamed from: okhttp3.repackaged.internal.framed.Http2$d */
    static final class C10253d implements FrameWriter {
        private final C10257a.C10259b akA;
        private int akB = 16384;
        private final onMenuPromptPayClick akz;
        private final boolean client;
        private boolean closed;
        private final onLoginButtonClick sink;

        C10253d(onLoginButtonClick onloginbuttonclick, boolean z) {
            this.sink = onloginbuttonclick;
            this.client = z;
            onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
            this.akz = onmenupromptpayclick;
            this.akA = new C10257a.C10259b(onmenupromptpayclick);
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

        public final void ackSettings(Settings settings) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    this.akB = settings.getMaxFrameSize(this.akB);
                    frameHeader(0, 0, (byte) 4, (byte) 1);
                    this.sink.flush();
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void connectionPreface() throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                } else if (this.client) {
                    if (Http2.logger.isLoggable(Level.FINE)) {
                        Http2.logger.fine(String.format(">> CONNECTION %s", new Object[]{Http2.akw.MediaBrowserCompat$CustomActionResultReceiver()}));
                    }
                    this.sink.write(Http2.akw.write());
                    this.sink.flush();
                }
            }
        }

        public final void synStream(boolean z, boolean z2, int i, int i2, List<Header> list) throws IOException {
            synchronized (this) {
                if (z2) {
                    throw new UnsupportedOperationException();
                } else if (!this.closed) {
                    headers(z, i, list);
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void synReply(boolean z, int i, List<Header> list) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    headers(z, i, list);
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void headers(int i, List<Header> list) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    headers(false, i, list);
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void pushPromise(int i, int i2, List<Header> list) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    this.akA.writeHeaders(list);
                    long j = this.akz.IconCompatParcelizer;
                    int min = (int) Math.min((long) (this.akB - 4), j);
                    long j2 = (long) min;
                    int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    frameHeader(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : 0);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    this.sink.write(this.akz, j2);
                    if (i3 > 0) {
                        m6052a(i, j - j2);
                    }
                } else {
                    throw new IOException("closed");
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void headers(boolean z, int i, List<Header> list) throws IOException {
            if (!this.closed) {
                this.akA.writeHeaders(list);
                long j = this.akz.IconCompatParcelizer;
                int min = (int) Math.min((long) this.akB, j);
                long j2 = (long) min;
                int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                byte b = i2 == 0 ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                frameHeader(i, min, (byte) 1, b);
                this.sink.write(this.akz, j2);
                if (i2 > 0) {
                    m6052a(i, j - j2);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        /* renamed from: a */
        private void m6052a(int i, long j) throws IOException {
            while (j > 0) {
                int min = (int) Math.min((long) this.akB, j);
                long j2 = (long) min;
                j -= j2;
                frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
                this.sink.write(this.akz, j2);
            }
        }

        public final void rstStream(int i, ErrorCode errorCode) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                } else if (errorCode.httpCode != -1) {
                    frameHeader(i, 4, (byte) 3, (byte) 0);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(errorCode.httpCode);
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }

        public final int maxDataLength() {
            return this.akB;
        }

        public final void data(boolean z, int i, onMenuPromptPayClick onmenupromptpayclick, int i2) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    mo58768a(i, z ? (byte) 1 : 0, onmenupromptpayclick, i2);
                } else {
                    throw new IOException("closed");
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo58768a(int i, byte b, onMenuPromptPayClick onmenupromptpayclick, int i2) throws IOException {
            frameHeader(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.sink.write(onmenupromptpayclick, (long) i2);
            }
        }

        public final void settings(Settings settings) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    int i = 0;
                    frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
                    while (i < 10) {
                        if (settings.isSet(i)) {
                            this.sink.MediaBrowserCompat$MediaItem(i == 4 ? 3 : i == 7 ? 4 : i);
                            this.sink.MediaBrowserCompat$CustomActionResultReceiver(settings.get(i));
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
                    frameHeader(0, 8, (byte) 6, z ? (byte) 1 : 0);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i2);
                    this.sink.flush();
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                } else if (errorCode.httpCode != -1) {
                    frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(errorCode.httpCode);
                    if (bArr.length > 0) {
                        this.sink.write(bArr);
                    }
                    this.sink.flush();
                } else {
                    throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
                }
            }
        }

        public final void windowUpdate(int i, long j) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                } else if (j == 0 || j > 2147483647L) {
                    throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
                } else {
                    frameHeader(i, 4, (byte) 8, (byte) 0);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver((int) j);
                    this.sink.flush();
                }
            }
        }

        public final void close() throws IOException {
            synchronized (this) {
                this.closed = true;
                this.sink.close();
            }
        }

        /* access modifiers changed from: package-private */
        public final void frameHeader(int i, int i2, byte b, byte b2) throws IOException {
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(C10251b.m6040a(false, i, i2, b, b2));
            }
            int i3 = this.akB;
            if (i2 > i3) {
                throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            } else if ((Integer.MIN_VALUE & i) == 0) {
                Http2.m6032a(this.sink, i2);
                this.sink.MediaBrowserCompat$ItemReceiver((int) b & 255);
                this.sink.MediaBrowserCompat$ItemReceiver((int) b2 & 255);
                this.sink.MediaBrowserCompat$CustomActionResultReceiver(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: private */
    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: okhttp3.repackaged.internal.framed.Http2$a */
    static final class C10250a implements HowToAddAccountActivity {
        byte flags;
        int left;
        int length;
        short padding;
        private final PinLoginActivity source;
        int streamId;

        public final void close() throws IOException {
        }

        public C10250a(PinLoginActivity pinLoginActivity) {
            this.source = pinLoginActivity;
        }

        public final long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.MediaMetadataCompat((long) this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1;
                    }
                    m6039uN();
                } else {
                    long read = this.source.read(onmenupromptpayclick, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.left = (int) (((long) this.left) - read);
                    return read;
                }
            }
        }

        public final ModifyQuickPromptPayActivity timeout() {
            return this.source.timeout();
        }

        /* renamed from: uN */
        private void m6039uN() throws IOException {
            int i = this.streamId;
            int e = Http2.m6035d(this.source);
            this.left = e;
            this.length = e;
            byte MediaMetadataCompat = (byte) this.source.MediaMetadataCompat();
            this.flags = (byte) this.source.MediaMetadataCompat();
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(C10251b.m6040a(true, this.streamId, this.length, MediaMetadataCompat, this.flags));
            }
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.streamId = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
            if (MediaMetadataCompat != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(MediaMetadataCompat));
            } else if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != i) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    public static int lengthWithoutPadding(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: okhttp3.repackaged.internal.framed.Http2$b */
    static final class C10251b {
        private static final String[] BINARY = new String[256];
        private static final String[] FLAGS = new String[64];
        private static final String[] TYPES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        C10251b() {
        }

        /* renamed from: a */
        static String m6040a(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = TYPES;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            String formatFlags = formatFlags(b, b2);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = formatFlags;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }

        static String formatFlags(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    return b2 == 1 ? "ACK" : BINARY[b2];
                }
                if (!(b == 7 || b == 8)) {
                    String[] strArr = FLAGS;
                    String str = b2 < strArr.length ? strArr[b2] : BINARY[b2];
                    if (b == 5 && (b2 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                    if (b != 0 || (b2 & 32) == 0) {
                        return str;
                    }
                    return str.replace("PRIORITY", "COMPRESSED");
                }
            }
            return BINARY[b2];
        }

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = BINARY;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = FLAGS;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 <= 0; i3++) {
                int i4 = iArr[i3];
                String[] strArr3 = FLAGS;
                StringBuilder sb = new StringBuilder();
                sb.append(FLAGS[i4]);
                sb.append("|PADDED");
                strArr3[i4 | 8] = sb.toString();
            }
            String[] strArr4 = FLAGS;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 <= 0; i7++) {
                    int i8 = iArr[i7];
                    String[] strArr5 = FLAGS;
                    int i9 = i8 | i6;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(FLAGS[i8]);
                    sb2.append('|');
                    sb2.append(FLAGS[i6]);
                    strArr5[i9] = sb2.toString();
                    String[] strArr6 = FLAGS;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(FLAGS[i8]);
                    sb3.append('|');
                    sb3.append(FLAGS[i6]);
                    sb3.append("|PADDED");
                    strArr6[i9 | 8] = sb3.toString();
                }
            }
            while (true) {
                String[] strArr7 = FLAGS;
                if (i < strArr7.length) {
                    if (strArr7[i] == null) {
                        strArr7[i] = BINARY[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m6035d(PinLoginActivity pinLoginActivity) throws IOException {
        return (pinLoginActivity.MediaMetadataCompat() & 255) | ((pinLoginActivity.MediaMetadataCompat() & 255) << 16) | ((pinLoginActivity.MediaMetadataCompat() & 255) << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m6032a(onLoginButtonClick onloginbuttonclick, int i) throws IOException {
        onloginbuttonclick.MediaBrowserCompat$ItemReceiver((i >>> 16) & 255);
        onloginbuttonclick.MediaBrowserCompat$ItemReceiver((i >>> 8) & 255);
        onloginbuttonclick.MediaBrowserCompat$ItemReceiver(i & 255);
    }
}
