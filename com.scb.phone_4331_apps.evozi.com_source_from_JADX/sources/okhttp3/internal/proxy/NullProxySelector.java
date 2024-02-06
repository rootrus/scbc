package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import p040o.onGetStartedClick;

public final class NullProxySelector extends ProxySelector {
    public static final NullProxySelector INSTANCE = new NullProxySelector();

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    private NullProxySelector() {
    }

    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            List<Proxy> singletonList = Collections.singletonList(Proxy.NO_PROXY);
            onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
            return singletonList;
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
