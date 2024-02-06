package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import p040o.GoodToKnowActivity;
import p040o.onGetStartedClick;

public final class DeferredSocketAdapter implements SocketAdapter {
    private SocketAdapter delegate;
    private boolean initialized;
    private final String socketPackage;

    public final boolean isSupported() {
        return true;
    }

    public final boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        return false;
    }

    public final X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        return null;
    }

    public DeferredSocketAdapter(String str) {
        onGetStartedClick.write((Object) str, "socketPackage");
        this.socketPackage = str;
    }

    public final boolean matchesSocket(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        onGetStartedClick.IconCompatParcelizer((Object) name, "sslSocket.javaClass.name");
        return GoodToKnowActivity.read(name, this.socketPackage, false);
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
        SocketAdapter delegate2 = getDelegate(sSLSocket);
        if (delegate2 != null) {
            delegate2.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        SocketAdapter delegate2 = getDelegate(sSLSocket);
        if (delegate2 != null) {
            return delegate2.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    private final SocketAdapter getDelegate(SSLSocket sSLSocket) {
        SocketAdapter socketAdapter;
        synchronized (this) {
            if (!this.initialized) {
                try {
                    Class cls = sSLSocket.getClass();
                    while (true) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.socketPackage);
                        sb.append(".OpenSSLSocketImpl");
                        if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) sb.toString()))) {
                            this.delegate = new AndroidSocketAdapter(cls);
                            break;
                        }
                        cls = cls.getSuperclass();
                        onGetStartedClick.IconCompatParcelizer((Object) cls, "possibleClass.superclass");
                        if (cls == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("No OpenSSLSocketImpl superclass of socket of type ");
                            sb2.append(sSLSocket);
                            throw new AssertionError(sb2.toString());
                        }
                    }
                } catch (Exception e) {
                    Platform platform = Platform.Companion.get();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to initialize DeferredSocketAdapter ");
                    sb3.append(this.socketPackage);
                    platform.log(5, sb3.toString(), e);
                }
                this.initialized = true;
            }
            socketAdapter = this.delegate;
        }
        return socketAdapter;
    }
}
