package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNationalIdActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class RouteSelector {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses = HmlNationalIdActivity.IconCompatParcelizer;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes = new ArrayList();
    private List<? extends Proxy> proxies = HmlNationalIdActivity.IconCompatParcelizer;
    private final RouteDatabase routeDatabase;

    public RouteSelector(Address address2, RouteDatabase routeDatabase2, Call call2, EventListener eventListener2) {
        onGetStartedClick.write((Object) address2, "address");
        onGetStartedClick.write((Object) routeDatabase2, "routeDatabase");
        onGetStartedClick.write((Object) call2, "call");
        onGetStartedClick.write((Object) eventListener2, "eventListener");
        this.address = address2;
        this.routeDatabase = routeDatabase2;
        this.call = call2;
        this.eventListener = eventListener2;
        resetNextProxy(this.address.url(), this.address.proxy());
    }

    public final boolean hasNext() {
        return hasNextProxy() || (this.postponedRoutes.isEmpty() ^ true);
    }

    public final Selection next() throws IOException {
        if (hasNext()) {
            List arrayList = new ArrayList();
            while (hasNextProxy()) {
                Proxy nextProxy = nextProxy();
                for (InetSocketAddress route : this.inetSocketAddresses) {
                    Route route2 = new Route(this.address, nextProxy, route);
                    if (this.routeDatabase.shouldPostpone(route2)) {
                        this.postponedRoutes.add(route2);
                    } else {
                        arrayList.add(route2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList, this.postponedRoutes);
                this.postponedRoutes.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }

    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        List<? extends Proxy> list;
        this.eventListener.proxySelectStart(this.call, httpUrl);
        if (proxy != null) {
            list = Collections.singletonList(proxy);
            onGetStartedClick.IconCompatParcelizer((Object) list, "java.util.Collections.singletonList(element)");
        } else {
            List<Proxy> select = this.address.proxySelector().select(httpUrl.uri());
            if (select == null || !(!select.isEmpty())) {
                list = Util.immutableListOf(Proxy.NO_PROXY);
            } else {
                list = Util.toImmutableList(select);
            }
        }
        this.proxies = list;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, list);
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws IOException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i = this.nextProxyIndex;
            this.nextProxyIndex = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.address.url().host());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.proxies);
        throw new SocketException(sb.toString());
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String str;
        int i;
        List<? extends InetSocketAddress> arrayList = new ArrayList<>();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.address.url().host();
            i = this.address.url().port();
        } else {
            SocketAddress address2 = proxy.address();
            if (address2 instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                str = Companion.getSocketHost(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address2.getClass());
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
        if (i <= 0 || 65535 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            sb2.append(str);
            sb2.append(':');
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.eventListener.dnsStart(this.call, str);
            List<InetAddress> lookup = this.address.dns().lookup(str);
            if (!lookup.isEmpty()) {
                this.eventListener.dnsEnd(this.call, str, lookup);
                for (InetAddress inetSocketAddress2 : lookup) {
                    arrayList.add(new InetSocketAddress(inetSocketAddress2, i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.address.dns());
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            onGetStartedClick.write((Object) list, "routes");
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Route next() {
            if (hasNext()) {
                List<Route> list = this.routes;
                int i = this.nextRouteIndex;
                this.nextRouteIndex = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            onGetStartedClick.write((Object) inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                onGetStartedClick.IconCompatParcelizer((Object) hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            onGetStartedClick.IconCompatParcelizer((Object) hostName, "hostName");
            return hostName;
        }
    }
}
