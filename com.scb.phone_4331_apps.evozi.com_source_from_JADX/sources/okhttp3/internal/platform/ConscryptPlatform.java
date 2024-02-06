package okhttp3.internal.platform;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import org.conscrypt.Conscrypt;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class ConscryptPlatform extends Platform {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    /* access modifiers changed from: private */
    public static final boolean isSupported;
    private final Provider provider;

    private ConscryptPlatform() {
        Provider build = Conscrypt.newProviderBuilder().provideTrustManager(true).build();
        onGetStartedClick.IconCompatParcelizer((Object) build, "Conscrypt.newProviderBui…rustManager(true).build()");
        this.provider = build;
    }

    public /* synthetic */ ConscryptPlatform(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this();
    }

    public final SSLContext newSSLContext() {
        SSLContext instance = SSLContext.getInstance("TLS", this.provider);
        onGetStartedClick.IconCompatParcelizer((Object) instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public final X509TrustManager platformTrustManager() {
        X509TrustManager defaultX509TrustManager = Conscrypt.getDefaultX509TrustManager();
        onGetStartedClick.IconCompatParcelizer((Object) defaultX509TrustManager, "Conscrypt.getDefaultX509TrustManager()");
        return defaultX509TrustManager;
    }

    public final X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.trustManager(sSLSocketFactory);
        }
        try {
            Object readFieldOrNull = Util.readFieldOrNull(sSLSocketFactory, Object.class, "sslParameters");
            if (readFieldOrNull != null) {
                return (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Object[] array = Platform.Companion.alpnProtocolNames(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.configureTlsExtensions(sSLSocket, str, list);
    }

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.getSelectedProtocol(sSLSocket);
    }

    public final void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "socketFactory");
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public final void configureTrustManager(X509TrustManager x509TrustManager) {
        TrustManager trustManager = x509TrustManager;
        if (Conscrypt.isConscrypt(trustManager)) {
            Conscrypt.setHostnameVerifier(trustManager, ConscryptPlatform$configureTrustManager$1.INSTANCE);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final boolean isSupported() {
            return ConscryptPlatform.isSupported;
        }

        public final ConscryptPlatform buildIfSupported() {
            if (isSupported()) {
                return new ConscryptPlatform((NtbDiscoverFundFilterActivity) null);
            }
            return null;
        }

        public static /* synthetic */ boolean atLeastVersion$default(Companion companion, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return companion.atLeastVersion(i, i2, i3);
        }

        public final boolean atLeastVersion(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i) {
                if (version.major() <= i) {
                    return false;
                }
                return true;
            } else if (version.minor() != i2) {
                if (version.minor() > i2) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i3) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (Companion.atLeastVersion(2, 1, 0) != false) goto L_0x0020;
     */
    static {
        /*
            okhttp3.internal.platform.ConscryptPlatform$Companion r0 = new okhttp3.internal.platform.ConscryptPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            Companion = r0
            r0 = 1
            r1 = 0
            java.lang.String r2 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x001f }
            boolean r2 = org.conscrypt.Conscrypt.isAvailable()     // Catch:{ ClassNotFoundException -> 0x001f }
            if (r2 == 0) goto L_0x001f
            okhttp3.internal.platform.ConscryptPlatform$Companion r2 = Companion     // Catch:{ ClassNotFoundException -> 0x001f }
            r3 = 2
            boolean r2 = r2.atLeastVersion(r3, r0, r1)     // Catch:{ ClassNotFoundException -> 0x001f }
            if (r2 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            isSupported = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.ConscryptPlatform.<clinit>():void");
    }
}
