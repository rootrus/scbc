package okhttp3.repackaged.internal.p090io;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.repackaged.Address;
import okhttp3.repackaged.Connection;
import okhttp3.repackaged.ConnectionSpec;
import okhttp3.repackaged.Handshake;
import okhttp3.repackaged.HttpUrl;
import okhttp3.repackaged.Protocol;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.Response;
import okhttp3.repackaged.Route;
import okhttp3.repackaged.internal.ConnectionSpecSelector;
import okhttp3.repackaged.internal.Platform;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.Version;
import okhttp3.repackaged.internal.framed.ErrorCode;
import okhttp3.repackaged.internal.framed.FramedConnection;
import okhttp3.repackaged.internal.framed.FramedStream;
import okhttp3.repackaged.internal.http.Http1xStream;
import okhttp3.repackaged.internal.http.OkHeaders;
import okhttp3.repackaged.internal.http.RouteException;
import okhttp3.repackaged.internal.http.StreamAllocation;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.PinLoginActivity;
import p040o.onLoginButtonClick;

/* renamed from: okhttp3.repackaged.internal.io.RealConnection */
public final class RealConnection extends FramedConnection.Listener implements Connection {
    private Handshake agZ;
    public int allocationLimit;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    private final Route amD;
    private Socket amP;
    public volatile FramedConnection framedConnection;
    public long idleAtNanos = Long.MAX_VALUE;
    public boolean noNewStreams;
    private Protocol protocol;
    public onLoginButtonClick sink;
    public Socket socket;
    public PinLoginActivity source;
    public int successCount;

    public RealConnection(Route route) {
        this.amD = route;
    }

    public final void connect(int i, int i2, int i3, List<ConnectionSpec> list, boolean z) throws RouteException {
        Socket socket2;
        if (this.protocol == null) {
            ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
            Proxy proxy = this.amD.proxy();
            Address address = this.amD.address();
            if (this.amD.address().sslSocketFactory() != null || list.contains(ConnectionSpec.CLEARTEXT)) {
                RouteException routeException = null;
                while (this.protocol == null) {
                    try {
                        if (proxy.type() != Proxy.Type.DIRECT) {
                            if (proxy.type() != Proxy.Type.HTTP) {
                                socket2 = new Socket(proxy);
                                this.amP = socket2;
                                m6170a(i, i2, i3, connectionSpecSelector);
                            }
                        }
                        socket2 = address.socketFactory().createSocket();
                        this.amP = socket2;
                        m6170a(i, i2, i3, connectionSpecSelector);
                    } catch (IOException e) {
                        Util.closeQuietly(this.socket);
                        Util.closeQuietly(this.amP);
                        this.socket = null;
                        this.amP = null;
                        this.source = null;
                        this.sink = null;
                        this.agZ = null;
                        this.protocol = null;
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (!z || !connectionSpecSelector.connectionFailed(e)) {
                            throw routeException;
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CLEARTEXT communication not supported: ");
            sb.append(list);
            throw new RouteException(new UnknownServiceException(sb.toString()));
        }
        throw new IllegalStateException("already connected");
    }

    /* renamed from: a */
    private void m6170a(int i, int i2, int i3, ConnectionSpecSelector connectionSpecSelector) throws IOException {
        this.amP.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.amP, this.amD.socketAddress(), i);
            this.source = ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(this.amP));
            this.sink = ModifyQuickBalanceActivity.read(ModifyQuickBalanceActivity.read(this.amP));
            if (this.amD.address().sslSocketFactory() != null) {
                m6171a(i2, i3, connectionSpecSelector);
            } else {
                this.protocol = Protocol.HTTP_1_1;
                this.socket = this.amP;
            }
            if (this.protocol == Protocol.SPDY_3 || this.protocol == Protocol.HTTP_2) {
                this.socket.setSoTimeout(0);
                FramedConnection build = new FramedConnection.Builder(true).socket(this.socket, this.amD.address().url().host(), this.source, this.sink).protocol(this.protocol).listener(this).build();
                build.sendConnectionPreface();
                this.allocationLimit = build.maxConcurrentStreams();
                this.framedConnection = build;
                return;
            }
            this.allocationLimit = 1;
        } catch (ConnectException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.amD.socketAddress());
            throw new ConnectException(sb.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0122 A[Catch:{ all -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0128 A[Catch:{ all -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6171a(int r6, int r7, okhttp3.repackaged.internal.ConnectionSpecSelector r8) throws java.io.IOException {
        /*
            r5 = this;
            okhttp3.repackaged.Route r0 = r5.amD
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x000b
            r5.m6172o(r6, r7)
        L_0x000b:
            okhttp3.repackaged.Route r6 = r5.amD
            okhttp3.repackaged.Address r6 = r6.address()
            javax.net.ssl.SSLSocketFactory r7 = r6.sslSocketFactory()
            r0 = 0
            java.net.Socket r1 = r5.amP     // Catch:{ AssertionError -> 0x011b }
            okhttp3.repackaged.HttpUrl r2 = r6.url()     // Catch:{ AssertionError -> 0x011b }
            java.lang.String r2 = r2.host()     // Catch:{ AssertionError -> 0x011b }
            okhttp3.repackaged.HttpUrl r3 = r6.url()     // Catch:{ AssertionError -> 0x011b }
            int r3 = r3.port()     // Catch:{ AssertionError -> 0x011b }
            r4 = 1
            java.net.Socket r7 = r7.createSocket(r1, r2, r3, r4)     // Catch:{ AssertionError -> 0x011b }
            javax.net.ssl.SSLSocket r7 = (javax.net.ssl.SSLSocket) r7     // Catch:{ AssertionError -> 0x011b }
            okhttp3.repackaged.ConnectionSpec r8 = r8.configureSecureSocket(r7)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            boolean r1 = r8.supportsTlsExtensions()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            if (r1 == 0) goto L_0x004c
            okhttp3.repackaged.internal.Platform r1 = okhttp3.repackaged.internal.Platform.get()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            okhttp3.repackaged.HttpUrl r2 = r6.url()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r2 = r2.host()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.util.List r3 = r6.protocols()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r1.configureTlsExtensions(r7, r2, r3)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
        L_0x004c:
            r7.startHandshake()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            javax.net.ssl.SSLSession r1 = r7.getSession()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            okhttp3.repackaged.Handshake r1 = okhttp3.repackaged.Handshake.get(r1)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            javax.net.ssl.HostnameVerifier r2 = r6.hostnameVerifier()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            okhttp3.repackaged.HttpUrl r3 = r6.url()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r3 = r3.host()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            javax.net.ssl.SSLSession r4 = r7.getSession()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            boolean r2 = r2.verify(r3, r4)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            if (r2 == 0) goto L_0x00bd
            okhttp3.repackaged.CertificatePinner r2 = r6.certificatePinner()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            okhttp3.repackaged.HttpUrl r6 = r6.url()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = r6.host()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.util.List r3 = r1.peerCertificates()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r2.check((java.lang.String) r6, (java.util.List<java.security.cert.Certificate>) r3)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            boolean r6 = r8.supportsTlsExtensions()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            if (r6 == 0) goto L_0x008e
            okhttp3.repackaged.internal.Platform r6 = okhttp3.repackaged.internal.Platform.get()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r0 = r6.getSelectedProtocol(r7)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
        L_0x008e:
            r5.socket = r7     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            o.HowToAddAccountActivity r6 = p040o.ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver((java.net.Socket) r7)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            o.PinLoginActivity r6 = p040o.ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver((p040o.HowToAddAccountActivity) r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r5.source = r6     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.net.Socket r6 = r5.socket     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            o.QuickPromptPayActivity r6 = p040o.ModifyQuickBalanceActivity.read((java.net.Socket) r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            o.onLoginButtonClick r6 = p040o.ModifyQuickBalanceActivity.read((p040o.QuickPromptPayActivity) r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r5.sink = r6     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r5.agZ = r1     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            if (r0 == 0) goto L_0x00af
            okhttp3.repackaged.Protocol r6 = okhttp3.repackaged.Protocol.get(r0)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            goto L_0x00b1
        L_0x00af:
            okhttp3.repackaged.Protocol r6 = okhttp3.repackaged.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
        L_0x00b1:
            r5.protocol = r6     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            if (r7 == 0) goto L_0x00bc
            okhttp3.repackaged.internal.Platform r6 = okhttp3.repackaged.internal.Platform.get()
            r6.afterHandshake(r7)
        L_0x00bc:
            return
        L_0x00bd:
            java.util.List r8 = r1.peerCertificates()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r1.<init>()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r2 = "Hostname "
            r1.append(r2)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            okhttp3.repackaged.HttpUrl r6 = r6.url()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = r6.host()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = " not verified:"
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = "\n    certificate: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = okhttp3.repackaged.CertificatePinner.pin(r8)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = "\n    DN: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.security.Principal r6 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = r6.getName()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = "\n    subjectAltNames: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.util.List r6 = okhttp3.repackaged.internal.tls.OkHostnameVerifier.allSubjectAltNames(r8)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            java.lang.String r6 = r1.toString()     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            r0.<init>(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
            throw r0     // Catch:{ AssertionError -> 0x0116, all -> 0x0114 }
        L_0x0114:
            r6 = move-exception
            goto L_0x012a
        L_0x0116:
            r6 = move-exception
            r0 = r7
            goto L_0x011c
        L_0x0119:
            r6 = move-exception
            goto L_0x0129
        L_0x011b:
            r6 = move-exception
        L_0x011c:
            boolean r7 = okhttp3.repackaged.internal.Util.isAndroidGetsocknameError(r6)     // Catch:{ all -> 0x0119 }
            if (r7 == 0) goto L_0x0128
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0119 }
            r7.<init>(r6)     // Catch:{ all -> 0x0119 }
            throw r7     // Catch:{ all -> 0x0119 }
        L_0x0128:
            throw r6     // Catch:{ all -> 0x0119 }
        L_0x0129:
            r7 = r0
        L_0x012a:
            if (r7 == 0) goto L_0x0133
            okhttp3.repackaged.internal.Platform r8 = okhttp3.repackaged.internal.Platform.get()
            r8.afterHandshake(r7)
        L_0x0133:
            okhttp3.repackaged.internal.Util.closeQuietly((java.net.Socket) r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.p090io.RealConnection.m6171a(int, int, okhttp3.repackaged.internal.ConnectionSpecSelector):void");
    }

    /* renamed from: o */
    private void m6172o(int i, int i2) throws IOException {
        Request vn = m6173vn();
        HttpUrl url = vn.url();
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        boolean z = true;
        sb.append(Util.hostHeader(url, true));
        sb.append(" HTTP/1.1");
        String obj = sb.toString();
        do {
            Http1xStream http1xStream = new Http1xStream((StreamAllocation) null, this.source, this.sink);
            this.source.timeout().timeout((long) i, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            http1xStream.writeRequest(vn.headers(), obj);
            http1xStream.finishRequest();
            Response build = http1xStream.readResponse().request(vn).build();
            long contentLength = OkHeaders.contentLength(build);
            if (contentLength == -1) {
                contentLength = 0;
            }
            HowToAddAccountActivity newFixedLengthSource = http1xStream.newFixedLengthSource(contentLength);
            Util.skipAll(newFixedLengthSource, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
            int code = build.code();
            if (code == 200) {
                if (this.source.MediaBrowserCompat$ItemReceiver().IconCompatParcelizer == 0) {
                    if (this.sink.MediaBrowserCompat$ItemReceiver().IconCompatParcelizer != 0) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (code == 407) {
                vn = this.amD.address().proxyAuthenticator().authenticate(this.amD, build);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected response code for CONNECT: ");
                sb2.append(build.code());
                throw new IOException(sb2.toString());
            }
        } while (vn != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    /* renamed from: vn */
    private Request m6173vn() throws IOException {
        return new Request.Builder().url(this.amD.address().url()).header("Host", Util.hostHeader(this.amD.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
    }

    /* access modifiers changed from: package-private */
    public final boolean isConnected() {
        return this.protocol != null;
    }

    public final Route route() {
        return this.amD;
    }

    public final void cancel() {
        Util.closeQuietly(this.amP);
    }

    public final Socket socket() {
        return this.socket;
    }

    public final boolean isHealthy(boolean z) {
        int soTimeout;
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        if (this.framedConnection == null && z) {
            try {
                soTimeout = this.socket.getSoTimeout();
                this.socket.setSoTimeout(1);
                if (this.source.read()) {
                    this.socket.setSoTimeout(soTimeout);
                    return false;
                }
                this.socket.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.socket.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public final void onStream(FramedStream framedStream) throws IOException {
        framedStream.close(ErrorCode.REFUSED_STREAM);
    }

    public final void onSettings(FramedConnection framedConnection2) {
        this.allocationLimit = framedConnection2.maxConcurrentStreams();
    }

    public final Handshake handshake() {
        return this.agZ;
    }

    public final boolean isMultiplexed() {
        return this.framedConnection != null;
    }

    public final Protocol protocol() {
        if (this.framedConnection != null) {
            return this.framedConnection.getProtocol();
        }
        Protocol protocol2 = this.protocol;
        return protocol2 == null ? Protocol.HTTP_1_1 : protocol2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.amD.address().url().host());
        sb.append(":");
        sb.append(this.amD.address().url().port());
        sb.append(", proxy=");
        sb.append(this.amD.proxy());
        sb.append(" hostAddress=");
        sb.append(this.amD.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.agZ;
        sb.append(handshake != null ? handshake.cipherSuite() : "none");
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }
}
