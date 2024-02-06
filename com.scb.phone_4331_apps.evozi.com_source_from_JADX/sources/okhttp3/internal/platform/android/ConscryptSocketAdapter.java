package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;
import p040o.onGetStartedClick;

public final class ConscryptSocketAdapter implements SocketAdapter {
    public static final ConscryptSocketAdapter INSTANCE = new ConscryptSocketAdapter();

    public final boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        return false;
    }

    public final X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        return null;
    }

    private ConscryptSocketAdapter() {
    }

    public final boolean matchesSocket(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public final boolean isSupported() {
        return ConscryptPlatform.Companion.isSupported();
    }

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        if (matchesSocket(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
        if (matchesSocket(sSLSocket)) {
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
    }

    public final SocketAdapter buildIfSupported() {
        if (ConscryptPlatform.Companion.isSupported()) {
            return INSTANCE;
        }
        return null;
    }
}
