package okhttp3.repackaged;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.repackaged.HttpUrl;
import okhttp3.repackaged.internal.Util;

public final class Address {
    final HttpUrl agw;
    final Dns agx;
    final Authenticator agy;
    final CertificatePinner agz;
    final List<ConnectionSpec> connectionSpecs;
    final HostnameVerifier hostnameVerifier;
    final List<Protocol> protocols;
    final Proxy proxy;
    final ProxySelector proxySelector;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory2, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier2, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy2, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector2) {
        this.agw = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        if (dns != null) {
            this.agx = dns;
            if (socketFactory2 != null) {
                this.socketFactory = socketFactory2;
                if (authenticator != null) {
                    this.agy = authenticator;
                    if (list != null) {
                        this.protocols = Util.immutableList(list);
                        if (list2 != null) {
                            this.connectionSpecs = Util.immutableList(list2);
                            if (proxySelector2 != null) {
                                this.proxySelector = proxySelector2;
                                this.proxy = proxy2;
                                this.sslSocketFactory = sSLSocketFactory;
                                this.hostnameVerifier = hostnameVerifier2;
                                this.agz = certificatePinner;
                                return;
                            }
                            throw new IllegalArgumentException("proxySelector == null");
                        }
                        throw new IllegalArgumentException("connectionSpecs == null");
                    }
                    throw new IllegalArgumentException("protocols == null");
                }
                throw new IllegalArgumentException("proxyAuthenticator == null");
            }
            throw new IllegalArgumentException("socketFactory == null");
        }
        throw new IllegalArgumentException("dns == null");
    }

    public final HttpUrl url() {
        return this.agw;
    }

    public final Dns dns() {
        return this.agx;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final Authenticator proxyAuthenticator() {
        return this.agy;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final CertificatePinner certificatePinner() {
        return this.agz;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        if (!this.agw.equals(address.agw) || !this.agx.equals(address.agx) || !this.agy.equals(address.agy) || !this.protocols.equals(address.protocols) || !this.connectionSpecs.equals(address.connectionSpecs) || !this.proxySelector.equals(address.proxySelector) || !Util.equal(this.proxy, address.proxy) || !Util.equal(this.sslSocketFactory, address.sslSocketFactory) || !Util.equal(this.hostnameVerifier, address.hostnameVerifier) || !Util.equal(this.agz, address.agz)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.agw.hashCode();
        int hashCode2 = this.agx.hashCode();
        int hashCode3 = this.agy.hashCode();
        int hashCode4 = this.protocols.hashCode();
        int hashCode5 = this.connectionSpecs.hashCode();
        int hashCode6 = this.proxySelector.hashCode();
        Proxy proxy2 = this.proxy;
        int i = 0;
        int hashCode7 = proxy2 != null ? proxy2.hashCode() : 0;
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
        int hashCode8 = sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0;
        HostnameVerifier hostnameVerifier2 = this.hostnameVerifier;
        int hashCode9 = hostnameVerifier2 != null ? hostnameVerifier2.hashCode() : 0;
        CertificatePinner certificatePinner = this.agz;
        if (certificatePinner != null) {
            i = certificatePinner.hashCode();
        }
        return ((((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }
}
