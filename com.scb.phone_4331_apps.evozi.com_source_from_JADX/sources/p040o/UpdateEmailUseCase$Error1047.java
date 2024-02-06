package p040o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: o.UpdateEmailUseCase$Error1047 */
public final class UpdateEmailUseCase$Error1047 extends SSLSocketFactory {
    private static final String[] MediaBrowserCompat$ItemReceiver = {"TLSv1.2"};
    private final SSLSocketFactory delegate;

    public UpdateEmailUseCase$Error1047(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    public final String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.delegate.createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(MediaBrowserCompat$ItemReceiver);
        }
        return createSocket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.delegate.createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(MediaBrowserCompat$ItemReceiver);
        }
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.delegate.createSocket(str, i, inetAddress, i2);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(MediaBrowserCompat$ItemReceiver);
        }
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.delegate.createSocket(inetAddress, i);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(MediaBrowserCompat$ItemReceiver);
        }
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.delegate.createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(MediaBrowserCompat$ItemReceiver);
        }
        return createSocket;
    }
}
