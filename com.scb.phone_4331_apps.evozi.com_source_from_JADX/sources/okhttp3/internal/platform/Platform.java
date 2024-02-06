package okhttp3.internal.platform;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public class Platform {
    public static final Companion Companion;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger = Logger.getLogger(OkHttpClient.class.getName());
    /* access modifiers changed from: private */
    public static volatile Platform platform;

    public static final Platform get() {
        return Companion.get();
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
    }

    public void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "socketFactory");
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
    }

    public void configureTrustManager(X509TrustManager x509TrustManager) {
    }

    public final String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        return null;
    }

    public boolean isCleartextTrafficPermitted(String str) {
        onGetStartedClick.write((Object) str, "hostname");
        return true;
    }

    public SSLContext newSSLContext() {
        SSLContext instance = SSLContext.getInstance("TLS");
        onGetStartedClick.IconCompatParcelizer((Object) instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public X509TrustManager platformTrustManager() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        onGetStartedClick.IconCompatParcelizer((Object) instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new TypeCastException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        onGetStartedClick.IconCompatParcelizer((Object) arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* access modifiers changed from: protected */
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            onGetStartedClick.IconCompatParcelizer((Object) cls, "sslContextClass");
            Object readFieldOrNull = Util.readFieldOrNull(sSLSocketFactory, cls, "context");
            if (readFieldOrNull != null) {
                return (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        onGetStartedClick.write((Object) socket, "socket");
        onGetStartedClick.write((Object) inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public void log(int i, String str, Throwable th) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        logger.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object getStackTraceForCloseable(String str) {
        onGetStartedClick.write((Object) str, "closer");
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void logCloseableLeak(String str, Object obj) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        log(5, str, (Throwable) obj);
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        onGetStartedClick.write((Object) x509TrustManager, "trustManager");
        return new BasicCertificateChainCleaner(buildTrustRootIndex(x509TrustManager));
    }

    public final CertificateChainCleaner buildCertificateChainCleaner(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        X509TrustManager trustManager = trustManager(sSLSocketFactory);
        if (trustManager != null) {
            return buildCertificateChainCleaner(trustManager);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to extract the trust manager on ");
        sb.append(Companion.get());
        sb.append(", ");
        sb.append("sslSocketFactory is ");
        sb.append(sSLSocketFactory.getClass());
        throw new IllegalStateException(sb.toString());
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        onGetStartedClick.write((Object) x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        onGetStartedClick.IconCompatParcelizer((Object) acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "javaClass.simpleName");
        return simpleName;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final Platform get() {
            return Platform.platform;
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
            if ((i & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final void resetForTests(Platform platform) {
            onGetStartedClick.write((Object) platform, "platform");
            Platform.platform = platform;
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> list) {
            onGetStartedClick.write((Object) list, "protocols");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((Protocol) next) != Protocol.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            Iterable<Protocol> iterable = (List) arrayList;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList2 = new ArrayList(((Collection) iterable).size());
            for (Protocol obj : iterable) {
                arrayList2.add(obj.toString());
            }
            return (List) arrayList2;
        }

        private final boolean isConscryptPreferred() {
            Provider provider = Security.getProviders()[0];
            onGetStartedClick.IconCompatParcelizer((Object) provider, "Security.getProviders()[0]");
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "Conscrypt", (Object) provider.getName());
        }

        private final boolean isOpenJSSEPreferred() {
            Provider provider = Security.getProviders()[0];
            onGetStartedClick.IconCompatParcelizer((Object) provider, "Security.getProviders()[0]");
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "OpenJSSE", (Object) provider.getName());
        }

        /* access modifiers changed from: private */
        public final Platform findPlatform() {
            OpenJSSEPlatform buildIfSupported;
            ConscryptPlatform buildIfSupported2;
            Platform buildIfSupported3 = AndroidPlatform.Companion.buildIfSupported();
            if (buildIfSupported3 != null) {
                return buildIfSupported3;
            }
            Companion companion = this;
            if (companion.isConscryptPreferred() && (buildIfSupported2 = ConscryptPlatform.Companion.buildIfSupported()) != null) {
                return buildIfSupported2;
            }
            if (companion.isOpenJSSEPreferred() && (buildIfSupported = OpenJSSEPlatform.Companion.buildIfSupported()) != null) {
                return buildIfSupported;
            }
            Jdk9Platform buildIfSupported4 = Jdk9Platform.Companion.buildIfSupported();
            if (buildIfSupported4 != null) {
                return buildIfSupported4;
            }
            Platform buildIfSupported5 = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            return buildIfSupported5 == null ? new Platform() : buildIfSupported5;
        }

        public final byte[] concatLengthPrefixed(List<? extends Protocol> list) {
            onGetStartedClick.write((Object) list, "protocols");
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            for (String next : alpnProtocolNames(list)) {
                sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(next.length());
                onGetStartedClick.write((Object) next, "string");
                sCBUniversalWebViewActivity.write(next, 0, next.length());
            }
            return sCBUniversalWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver(sCBUniversalWebViewActivity.read);
        }
    }

    static {
        Companion companion = new Companion((NtbDiscoverFundFilterActivity) null);
        Companion = companion;
        platform = companion.findPlatform();
    }
}
