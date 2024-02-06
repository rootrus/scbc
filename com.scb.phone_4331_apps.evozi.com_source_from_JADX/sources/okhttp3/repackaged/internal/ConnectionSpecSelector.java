package okhttp3.repackaged.internal;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.repackaged.ConnectionSpec;

public final class ConnectionSpecSelector {
    private int aiL = 0;
    private boolean aiM;
    private boolean aiN;
    private final List<ConnectionSpec> connectionSpecs;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        this.connectionSpecs = list;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        int i = this.aiL;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.connectionSpecs.get(i);
            if (connectionSpec.isCompatible(sSLSocket)) {
                this.aiL = i + 1;
                break;
            }
            i++;
        }
        if (connectionSpec != null) {
            this.aiM = m5914a(sSLSocket);
            Internal.instance.apply(connectionSpec, sSLSocket, this.aiN);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.aiN);
        sb.append(", modes=");
        sb.append(this.connectionSpecs);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean connectionFailed(IOException iOException) {
        this.aiN = true;
        if (!this.aiM || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z || (iOException instanceof SSLProtocolException)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m5914a(SSLSocket sSLSocket) {
        for (int i = this.aiL; i < this.connectionSpecs.size(); i++) {
            if (this.connectionSpecs.get(i).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
