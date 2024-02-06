package okhttp3.repackaged.internal.http;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.repackaged.Address;
import okhttp3.repackaged.HttpUrl;
import okhttp3.repackaged.Route;
import okhttp3.repackaged.internal.RouteDatabase;

public final class RouteSelector {
    private final Address address;
    private final RouteDatabase aho;
    private List<InetSocketAddress> amA = Collections.emptyList();
    private int amB;
    private final List<Route> amC = new ArrayList();
    private Proxy amw;
    private InetSocketAddress amx;
    private List<Proxy> amy = Collections.emptyList();
    private int amz;

    public RouteSelector(Address address2, RouteDatabase routeDatabase) {
        this.address = address2;
        this.aho = routeDatabase;
        m6149a(address2.url(), address2.proxy());
    }

    public final boolean hasNext() {
        return m6152ve() || m6150vc() || m6154vg();
    }

    public final Route next() throws IOException {
        while (true) {
            if (!m6152ve()) {
                if (m6150vc()) {
                    this.amw = m6151vd();
                } else if (m6154vg()) {
                    return m6155vh();
                } else {
                    throw new NoSuchElementException();
                }
            }
            InetSocketAddress vf = m6153vf();
            this.amx = vf;
            Route route = new Route(this.address, this.amw, vf);
            if (!this.aho.shouldPostpone(route)) {
                return route;
            }
            this.amC.add(route);
        }
    }

    public final void connectFailed(Route route, IOException iOException) {
        if (!(route.proxy().type() == Proxy.Type.DIRECT || this.address.proxySelector() == null)) {
            this.address.proxySelector().connectFailed(this.address.url().uri(), route.proxy().address(), iOException);
        }
        this.aho.failed(route);
    }

    /* renamed from: a */
    private void m6149a(HttpUrl httpUrl, Proxy proxy) {
        if (proxy != null) {
            this.amy = Collections.singletonList(proxy);
        } else {
            this.amy = new ArrayList();
            List<Proxy> select = this.address.proxySelector().select(httpUrl.uri());
            if (select != null) {
                this.amy.addAll(select);
            }
            this.amy.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.amy.add(Proxy.NO_PROXY);
        }
        this.amz = 0;
    }

    /* renamed from: vc */
    private boolean m6150vc() {
        return this.amz < this.amy.size();
    }

    /* renamed from: vd */
    private Proxy m6151vd() throws IOException {
        if (m6150vc()) {
            List<Proxy> list = this.amy;
            int i = this.amz;
            this.amz = i + 1;
            Proxy proxy = list.get(i);
            m6148a(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.address.url().host());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.amy);
        throw new SocketException(sb.toString());
    }

    /* renamed from: a */
    private void m6148a(Proxy proxy) throws IOException {
        String str;
        int i;
        this.amA = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.address.url().host();
            i = this.address.url().port();
        } else {
            SocketAddress address2 = proxy.address();
            if (address2 instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                str = getHostString(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address2.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i <= 0 || i > 65535) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.amA.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            List<InetAddress> lookup = this.address.dns().lookup(str);
            int size = lookup.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.amA.add(new InetSocketAddress(lookup.get(i2), i));
            }
        }
        this.amB = 0;
    }

    static String getHostString(InetSocketAddress inetSocketAddress) {
        InetAddress address2 = inetSocketAddress.getAddress();
        if (address2 == null) {
            return inetSocketAddress.getHostName();
        }
        return address2.getHostAddress();
    }

    /* renamed from: ve */
    private boolean m6152ve() {
        return this.amB < this.amA.size();
    }

    /* renamed from: vf */
    private InetSocketAddress m6153vf() throws IOException {
        if (m6152ve()) {
            List<InetSocketAddress> list = this.amA;
            int i = this.amB;
            this.amB = i + 1;
            return list.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.address.url().host());
        sb.append("; exhausted inet socket addresses: ");
        sb.append(this.amA);
        throw new SocketException(sb.toString());
    }

    /* renamed from: vg */
    private boolean m6154vg() {
        return !this.amC.isEmpty();
    }

    /* renamed from: vh */
    private Route m6155vh() {
        return this.amC.remove(0);
    }
}
