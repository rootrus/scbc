package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p040o.onGetStartedClick;

public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String str, int i, Dns dns2, SocketFactory socketFactory2, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier2, CertificatePinner certificatePinner2, Authenticator authenticator, Proxy proxy2, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector2) {
        onGetStartedClick.write((Object) str, "uriHost");
        onGetStartedClick.write((Object) dns2, "dns");
        onGetStartedClick.write((Object) socketFactory2, "socketFactory");
        onGetStartedClick.write((Object) authenticator, "proxyAuthenticator");
        onGetStartedClick.write((Object) list, "protocols");
        onGetStartedClick.write((Object) list2, "connectionSpecs");
        onGetStartedClick.write((Object) proxySelector2, "proxySelector");
        this.dns = dns2;
        this.socketFactory = socketFactory2;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier2;
        this.certificatePinner = certificatePinner2;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy2;
        this.proxySelector = proxySelector2;
        this.url = new HttpUrl.Builder().scheme(this.sslSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    public final Dns dns() {
        return this.dns;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m6338deprecated_url() {
        return this.url;
    }

    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m6330deprecated_dns() {
        return this.dns;
    }

    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m6336deprecated_socketFactory() {
        return this.socketFactory;
    }

    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m6334deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m6332deprecated_protocols() {
        return this.protocols;
    }

    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m6329deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m6335deprecated_proxySelector() {
        return this.proxySelector;
    }

    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m6333deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m6337deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m6331deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m6328deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.url, (Object) address.url) && equalsNonHost$okhttp(address);
        }
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode();
        int hashCode2 = this.dns.hashCode();
        int hashCode3 = this.proxyAuthenticator.hashCode();
        int hashCode4 = this.protocols.hashCode();
        int hashCode5 = this.connectionSpecs.hashCode();
        int hashCode6 = this.proxySelector.hashCode();
        int hashCode7 = Objects.hashCode(this.proxy);
        return ((((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    public final boolean equalsNonHost$okhttp(Address address) {
        onGetStartedClick.write((Object) address, "that");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.dns, (Object) address.dns) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.proxyAuthenticator, (Object) address.proxyAuthenticator) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.protocols, (Object) address.protocols) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.connectionSpecs, (Object) address.connectionSpecs) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.proxySelector, (Object) address.proxySelector) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.proxy, (Object) address.proxy) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.sslSocketFactory, (Object) address.sslSocketFactory) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.hostnameVerifier, (Object) address.hostnameVerifier) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.certificatePinner, (Object) address.certificatePinner) && this.url.port() == address.url.port();
    }

    public final String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
