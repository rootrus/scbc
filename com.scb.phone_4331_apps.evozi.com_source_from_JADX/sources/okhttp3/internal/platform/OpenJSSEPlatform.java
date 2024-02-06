package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class OpenJSSEPlatform extends Platform {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    /* access modifiers changed from: private */
    public static final boolean isSupported;
    private final Provider provider;

    private OpenJSSEPlatform() {
        this.provider = new OpenJSSE();
    }

    public /* synthetic */ OpenJSSEPlatform(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this();
    }

    public final SSLContext newSSLContext() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.provider);
        onGetStartedClick.IconCompatParcelizer((Object) instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public final X509TrustManager platformTrustManager() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.provider);
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

    public final X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = Platform.Companion.alpnProtocolNames(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.configureTlsExtensions(sSLSocket, str, list);
    }

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.getSelectedProtocol(sSLSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) applicationProtocol, (Object) "")) {
            return null;
        }
        return applicationProtocol;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final boolean isSupported() {
            return OpenJSSEPlatform.isSupported;
        }

        public final OpenJSSEPlatform buildIfSupported() {
            if (isSupported()) {
                return new OpenJSSEPlatform((NtbDiscoverFundFilterActivity) null);
            }
            return null;
        }
    }

    static {
        boolean z;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        isSupported = z;
    }
}
