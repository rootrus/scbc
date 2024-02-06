package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p040o.onGetStartedClick;

public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address2, Proxy proxy2, InetSocketAddress inetSocketAddress) {
        onGetStartedClick.write((Object) address2, "address");
        onGetStartedClick.write((Object) proxy2, "proxy");
        onGetStartedClick.write((Object) inetSocketAddress, "socketAddress");
        this.address = address2;
        this.proxy = proxy2;
        this.socketAddress = inetSocketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    /* renamed from: -deprecated_address  reason: not valid java name */
    public final Address m6423deprecated_address() {
        return this.address;
    }

    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m6424deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_socketAddress  reason: not valid java name */
    public final InetSocketAddress m6425deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) route.address, (Object) this.address) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) route.proxy, (Object) this.proxy) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) route.socketAddress, (Object) this.socketAddress);
        }
    }

    public final int hashCode() {
        return ((((this.address.hashCode() + 527) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Route{");
        sb.append(this.socketAddress);
        sb.append('}');
        return sb.toString();
    }
}
