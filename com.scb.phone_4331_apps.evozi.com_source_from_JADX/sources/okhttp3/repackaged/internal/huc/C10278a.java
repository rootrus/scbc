package okhttp3.repackaged.internal.huc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.repackaged.Handshake;

/* renamed from: okhttp3.repackaged.internal.huc.a */
abstract class C10278a extends HttpsURLConnection {
    private final HttpURLConnection amI;

    public abstract HostnameVerifier getHostnameVerifier();

    public abstract SSLSocketFactory getSSLSocketFactory();

    /* access modifiers changed from: protected */
    public abstract Handshake handshake();

    public abstract void setHostnameVerifier(HostnameVerifier hostnameVerifier);

    public abstract void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory);

    public C10278a(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.amI = httpURLConnection;
    }

    public String getCipherSuite() {
        Handshake handshake = handshake();
        if (handshake != null) {
            return handshake.cipherSuite().javaName();
        }
        return null;
    }

    public Certificate[] getLocalCertificates() {
        Handshake handshake = handshake();
        if (handshake == null) {
            return null;
        }
        List<Certificate> localCertificates = handshake.localCertificates();
        if (!localCertificates.isEmpty()) {
            return (Certificate[]) localCertificates.toArray(new Certificate[localCertificates.size()]);
        }
        return null;
    }

    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        Handshake handshake = handshake();
        if (handshake == null) {
            return null;
        }
        List<Certificate> peerCertificates = handshake.peerCertificates();
        if (!peerCertificates.isEmpty()) {
            return (Certificate[]) peerCertificates.toArray(new Certificate[peerCertificates.size()]);
        }
        return null;
    }

    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        Handshake handshake = handshake();
        if (handshake != null) {
            return handshake.peerPrincipal();
        }
        return null;
    }

    public Principal getLocalPrincipal() {
        Handshake handshake = handshake();
        if (handshake != null) {
            return handshake.localPrincipal();
        }
        return null;
    }

    public void connect() throws IOException {
        this.connected = true;
        this.amI.connect();
    }

    public void disconnect() {
        this.amI.disconnect();
    }

    public InputStream getErrorStream() {
        return this.amI.getErrorStream();
    }

    public String getRequestMethod() {
        return this.amI.getRequestMethod();
    }

    public int getResponseCode() throws IOException {
        return this.amI.getResponseCode();
    }

    public String getResponseMessage() throws IOException {
        return this.amI.getResponseMessage();
    }

    public void setRequestMethod(String str) throws ProtocolException {
        this.amI.setRequestMethod(str);
    }

    public boolean usingProxy() {
        return this.amI.usingProxy();
    }

    public boolean getInstanceFollowRedirects() {
        return this.amI.getInstanceFollowRedirects();
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.amI.setInstanceFollowRedirects(z);
    }

    public boolean getAllowUserInteraction() {
        return this.amI.getAllowUserInteraction();
    }

    public Object getContent() throws IOException {
        return this.amI.getContent();
    }

    public Object getContent(Class[] clsArr) throws IOException {
        return this.amI.getContent(clsArr);
    }

    public String getContentEncoding() {
        return this.amI.getContentEncoding();
    }

    public int getContentLength() {
        return this.amI.getContentLength();
    }

    public String getContentType() {
        return this.amI.getContentType();
    }

    public long getDate() {
        return this.amI.getDate();
    }

    public boolean getDefaultUseCaches() {
        return this.amI.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.amI.getDoInput();
    }

    public boolean getDoOutput() {
        return this.amI.getDoOutput();
    }

    public long getExpiration() {
        return this.amI.getExpiration();
    }

    public String getHeaderField(int i) {
        return this.amI.getHeaderField(i);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.amI.getHeaderFields();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.amI.getRequestProperties();
    }

    public void addRequestProperty(String str, String str2) {
        this.amI.addRequestProperty(str, str2);
    }

    public String getHeaderField(String str) {
        return this.amI.getHeaderField(str);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.amI.getHeaderFieldDate(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.amI.getHeaderFieldInt(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.amI.getHeaderFieldKey(i);
    }

    public long getIfModifiedSince() {
        return this.amI.getIfModifiedSince();
    }

    public InputStream getInputStream() throws IOException {
        return this.amI.getInputStream();
    }

    public long getLastModified() {
        return this.amI.getLastModified();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.amI.getOutputStream();
    }

    public Permission getPermission() throws IOException {
        return this.amI.getPermission();
    }

    public String getRequestProperty(String str) {
        return this.amI.getRequestProperty(str);
    }

    public URL getURL() {
        return this.amI.getURL();
    }

    public boolean getUseCaches() {
        return this.amI.getUseCaches();
    }

    public void setAllowUserInteraction(boolean z) {
        this.amI.setAllowUserInteraction(z);
    }

    public void setDefaultUseCaches(boolean z) {
        this.amI.setDefaultUseCaches(z);
    }

    public void setDoInput(boolean z) {
        this.amI.setDoInput(z);
    }

    public void setDoOutput(boolean z) {
        this.amI.setDoOutput(z);
    }

    public void setIfModifiedSince(long j) {
        this.amI.setIfModifiedSince(j);
    }

    public void setRequestProperty(String str, String str2) {
        this.amI.setRequestProperty(str, str2);
    }

    public void setUseCaches(boolean z) {
        this.amI.setUseCaches(z);
    }

    public void setConnectTimeout(int i) {
        this.amI.setConnectTimeout(i);
    }

    public int getConnectTimeout() {
        return this.amI.getConnectTimeout();
    }

    public void setReadTimeout(int i) {
        this.amI.setReadTimeout(i);
    }

    public int getReadTimeout() {
        return this.amI.getReadTimeout();
    }

    public String toString() {
        return this.amI.toString();
    }

    public void setFixedLengthStreamingMode(int i) {
        this.amI.setFixedLengthStreamingMode(i);
    }

    public void setChunkedStreamingMode(int i) {
        this.amI.setChunkedStreamingMode(i);
    }
}
