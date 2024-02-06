package okhttp3.repackaged.internal.framed;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import okhttp3.repackaged.Protocol;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.framed.FrameReader;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.PinLoginActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.PreLoginActivity;
import p040o.QuickPromptPayActivity;
import p040o.onLoginButtonClick;
import p040o.onMenuPromptPayClick;

public final class Spdy3 implements Variant {
    static final int agA = 3;
    static final int alc = 0;
    static final int ald = 1;
    static final int ale = 2;
    static final int alf = 3;
    static final int alg = 4;
    static final int alh = 6;
    static final int ali = 7;
    static final int alj = 8;
    static final int alk = 9;
    static final int all = 1;
    static final int alm = 2;
    static final byte[] aln;

    public final Protocol getProtocol() {
        return Protocol.SPDY_3;
    }

    static {
        try {
            aln = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(Util.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    public final FrameReader newReader(PinLoginActivity pinLoginActivity, boolean z) {
        return new C10255a(pinLoginActivity, z);
    }

    public final FrameWriter newWriter(onLoginButtonClick onloginbuttonclick, boolean z) {
        return new C10256b(onloginbuttonclick, z);
    }

    /* renamed from: okhttp3.repackaged.internal.framed.Spdy3$a */
    static final class C10255a implements FrameReader {
        private final C10262c alo;
        private final boolean client;
        private final PinLoginActivity source;

        public final void readConnectionPreface() {
        }

        C10255a(PinLoginActivity pinLoginActivity, boolean z) {
            this.source = pinLoginActivity;
            this.alo = new C10262c(pinLoginActivity);
            this.client = z;
        }

        public final boolean nextFrame(FrameReader.Handler handler) throws IOException {
            boolean z = false;
            try {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo56993x50fd9e4a();
                int i = (-16777216 & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2) >>> 24;
                int i2 = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 & 16777215;
                if ((Integer.MIN_VALUE & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) != 0) {
                    int i3 = (2147418112 & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) >>> 16;
                    if (i3 == 3) {
                        switch (65535 & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) {
                            case 1:
                                m6068a(handler, i, i2);
                                return true;
                            case 2:
                                m6069b(handler, i, i2);
                                return true;
                            case 3:
                                m6070c(handler, i, i2);
                                return true;
                            case 4:
                                m6075h(handler, i, i2);
                                return true;
                            case 6:
                                m6073f(handler, i, i2);
                                return true;
                            case 7:
                                m6074g(handler, i, i2);
                                return true;
                            case 8:
                                m6071d(handler, i, i2);
                                return true;
                            case 9:
                                m6072e(handler, i, i2);
                                return true;
                            default:
                                this.source.MediaMetadataCompat((long) i2);
                                return true;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("version != 3: ");
                        sb.append(i3);
                        throw new ProtocolException(sb.toString());
                    }
                } else {
                    if ((i & 1) != 0) {
                        z = true;
                    }
                    handler.data(z, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & Api.BaseClientBuilder.API_PRIORITY_OTHER, this.source, i2);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        /* renamed from: a */
        private void m6068a(FrameReader.Handler handler, int i, int i2) throws IOException {
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo56993x50fd9e4a();
            this.source.MediaSessionCompat$Token();
            List<Header> F = this.alo.mo58818F(i2 - 10);
            handler.headers((i & 2) != 0, (i & 1) != 0, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & Api.BaseClientBuilder.API_PRIORITY_OTHER, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 & Api.BaseClientBuilder.API_PRIORITY_OTHER, F, HeadersMode.SPDY_SYN_STREAM);
        }

        /* renamed from: b */
        private void m6069b(FrameReader.Handler handler, int i, int i2) throws IOException {
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
            handler.headers(false, (i & 1) != 0, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & Api.BaseClientBuilder.API_PRIORITY_OTHER, -1, this.alo.mo58818F(i2 - 4), HeadersMode.SPDY_REPLY);
        }

        /* renamed from: c */
        private void m6070c(FrameReader.Handler handler, int i, int i2) throws IOException {
            if (i2 == 8) {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo56993x50fd9e4a();
                ErrorCode fromSpdy3Rst = ErrorCode.fromSpdy3Rst(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
                if (fromSpdy3Rst != null) {
                    handler.rstStream(Integer.MAX_VALUE & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, fromSpdy3Rst);
                } else {
                    throw ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2));
                }
            } else {
                throw ioException("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
            }
        }

        /* renamed from: d */
        private void m6071d(FrameReader.Handler handler, int i, int i2) throws IOException {
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
            FrameReader.Handler handler2 = handler;
            handler2.headers(false, false, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & Api.BaseClientBuilder.API_PRIORITY_OTHER, -1, this.alo.mo58818F(i2 - 4), HeadersMode.SPDY_HEADERS);
        }

        /* renamed from: e */
        private void m6072e(FrameReader.Handler handler, int i, int i2) throws IOException {
            if (i2 == 8) {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                long MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = (long) (this.source.mo56993x50fd9e4a() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 != 0) {
                    handler.windowUpdate(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & Api.BaseClientBuilder.API_PRIORITY_OTHER, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
                } else {
                    throw ioException("windowSizeIncrement was 0", Long.valueOf(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2));
                }
            } else {
                throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
            }
        }

        /* renamed from: f */
        private void m6073f(FrameReader.Handler handler, int i, int i2) throws IOException {
            boolean z = true;
            if (i2 == 4) {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                if (this.client != ((MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & 1) == 1)) {
                    z = false;
                }
                handler.ping(z, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, 0);
                return;
            }
            throw ioException("TYPE_PING length: %d != 4", Integer.valueOf(i2));
        }

        /* renamed from: g */
        private void m6074g(FrameReader.Handler handler, int i, int i2) throws IOException {
            if (i2 == 8) {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo56993x50fd9e4a();
                ErrorCode fromSpdyGoAway = ErrorCode.fromSpdyGoAway(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
                if (fromSpdyGoAway != null) {
                    handler.goAway(Integer.MAX_VALUE & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, fromSpdyGoAway, PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver);
                } else {
                    throw ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2));
                }
            } else {
                throw ioException("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
            }
        }

        /* renamed from: h */
        private void m6075h(FrameReader.Handler handler, int i, int i2) throws IOException {
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
            boolean z = false;
            if (i2 == (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver << 3) + 4) {
                Settings settings = new Settings();
                for (int i3 = 0; i3 < MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver; i3++) {
                    int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = this.source.mo56993x50fd9e4a();
                    settings.mo58793d(16777215 & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2, (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 & -16777216) >>> 24, this.source.mo56993x50fd9e4a());
                }
                if ((i & 1) != 0) {
                    z = true;
                }
                handler.settings(z, settings);
                return;
            }
            throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver));
        }

        private static IOException ioException(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        public final void close() throws IOException {
            this.alo.close();
        }
    }

    /* renamed from: okhttp3.repackaged.internal.framed.Spdy3$b */
    static final class C10256b implements FrameWriter {
        private final onMenuPromptPayClick alp;
        private final onLoginButtonClick alq;
        private final boolean client;
        private boolean closed;
        private final onLoginButtonClick sink;

        public final void ackSettings(Settings settings) {
        }

        public final int maxDataLength() {
            return 16383;
        }

        public final void pushPromise(int i, int i2, List<Header> list) throws IOException {
        }

        C10256b(onLoginButtonClick onloginbuttonclick, boolean z) {
            this.sink = onloginbuttonclick;
            this.client = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(Spdy3.aln);
            onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
            this.alp = onmenupromptpayclick;
            this.alq = ModifyQuickBalanceActivity.read((QuickPromptPayActivity) new PreLoginActivity((QuickPromptPayActivity) onmenupromptpayclick, deflater));
        }

        public final void connectionPreface() {
            synchronized (this) {
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

        public final void synStream(boolean z, boolean z2, int i, int i2, List<Header> list) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    m6076x(list);
                    int i3 = (int) (this.alp.IconCompatParcelizer + 10);
                    char c = z2 ? (char) 2 : 0;
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(-2147287039);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver((((z | c) & true ? 1 : 0) << true) | (16777215 & i3));
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(Integer.MAX_VALUE & i2);
                    this.sink.MediaBrowserCompat$MediaItem(0);
                    this.sink.MediaBrowserCompat$ItemReceiver((HowToAddAccountActivity) this.alp);
                    this.sink.flush();
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void synReply(boolean z, int i, List<Header> list) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    m6076x(list);
                    int i2 = (int) (this.alp.IconCompatParcelizer + 4);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(-2147287038);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(((z & true ? 1 : 0) << true) | (i2 & 16777215));
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    this.sink.MediaBrowserCompat$ItemReceiver((HowToAddAccountActivity) this.alp);
                    this.sink.flush();
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void headers(int i, List<Header> list) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    m6076x(list);
                    int i2 = (int) (this.alp.IconCompatParcelizer + 4);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(-2147287032);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i2 & 16777215);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    this.sink.MediaBrowserCompat$ItemReceiver((HowToAddAccountActivity) this.alp);
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void rstStream(int i, ErrorCode errorCode) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                } else if (errorCode.spdyRstCode != -1) {
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(-2147287037);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(8);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(errorCode.spdyRstCode);
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }

        public final void data(boolean z, int i, onMenuPromptPayClick onmenupromptpayclick, int i2) throws IOException {
            synchronized (this) {
                mo58804a(i, z ? 1 : 0, onmenupromptpayclick, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo58804a(int i, int i2, onMenuPromptPayClick onmenupromptpayclick, int i3) throws IOException {
            if (!this.closed) {
                long j = (long) i3;
                if (j <= 16777215) {
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(((i2 & 255) << 24) | (16777215 & i3));
                    if (i3 > 0) {
                        this.sink.write(onmenupromptpayclick, j);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("FRAME_TOO_LARGE max size is 16Mib: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IOException("closed");
        }

        /* renamed from: x */
        private void m6076x(List<Header> list) throws IOException {
            this.alq.MediaBrowserCompat$CustomActionResultReceiver(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = list.get(i).name;
                this.alq.MediaBrowserCompat$CustomActionResultReceiver(pinLoginActivity_ViewBinding.write.length);
                this.alq.IconCompatParcelizer(pinLoginActivity_ViewBinding);
                PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding2 = list.get(i).value;
                this.alq.MediaBrowserCompat$CustomActionResultReceiver(pinLoginActivity_ViewBinding2.write.length);
                this.alq.IconCompatParcelizer(pinLoginActivity_ViewBinding2);
            }
            this.alq.flush();
        }

        public final void settings(Settings settings) throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    int size = settings.size();
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(-2147287036);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(((size << 3) + 4) & 16777215);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(size);
                    for (int i = 0; i <= 10; i++) {
                        if (settings.isSet(i)) {
                            this.sink.MediaBrowserCompat$CustomActionResultReceiver(((settings.mo58781G(i) & 255) << 24) | (i & 16777215));
                            this.sink.MediaBrowserCompat$CustomActionResultReceiver(settings.get(i));
                        }
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
                    boolean z2 = false;
                    if (this.client != ((i & 1) == 1)) {
                        z2 = true;
                    }
                    if (z == z2) {
                        this.sink.MediaBrowserCompat$CustomActionResultReceiver(-2147287034);
                        this.sink.MediaBrowserCompat$CustomActionResultReceiver(4);
                        this.sink.MediaBrowserCompat$CustomActionResultReceiver(i);
                        this.sink.flush();
                    } else {
                        throw new IllegalArgumentException("payload != reply");
                    }
                } else {
                    throw new IOException("closed");
                }
            }
        }

        public final void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                } else if (errorCode.spdyGoAwayCode != -1) {
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(-2147287033);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(8);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(errorCode.spdyGoAwayCode);
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
                }
            }
        }

        public final void windowUpdate(int i, long j) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                } else if (j == 0 || j > 2147483647L) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("windowSizeIncrement must be between 1 and 0x7fffffff: ");
                    sb.append(j);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(-2147287031);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(8);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver(i);
                    this.sink.MediaBrowserCompat$CustomActionResultReceiver((int) j);
                    this.sink.flush();
                }
            }
        }

        public final void close() throws IOException {
            synchronized (this) {
                this.closed = true;
                Util.closeAll(this.sink, this.alq);
            }
        }
    }
}
