package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import p040o.onGetStartedClick;

public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        onGetStartedClick.write((Object) list, "connectionSpecs");
        this.connectionSpecs = list;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            connectionSpec = null;
            if (i >= size) {
                break;
            }
            connectionSpec = this.connectionSpecs.get(i);
            if (connectionSpec.isCompatible(sSLSocket)) {
                this.nextModeIndex = i + 1;
                break;
            }
            i++;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find acceptable protocols. isFallback=");
            sb.append(this.isFallback);
            sb.append(',');
            sb.append(" modes=");
            sb.append(this.connectionSpecs);
            sb.append(',');
            sb.append(" supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (enabledProtocols == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            String arrays = Arrays.toString(enabledProtocols);
            onGetStartedClick.IconCompatParcelizer((Object) arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        this.isFallbackPossible = isFallbackPossible(sSLSocket);
        connectionSpec.apply$okhttp(sSLSocket, this.isFallback);
        return connectionSpec;
    }

    public final boolean connectionFailed(IOException iOException) {
        onGetStartedClick.write((Object) iOException, "e");
        this.isFallback = true;
        if (this.isFallbackPossible && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
            return true;
        }
        return false;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int size = this.connectionSpecs.size();
        for (int i = this.nextModeIndex; i < size; i++) {
            if (this.connectionSpecs.get(i).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
