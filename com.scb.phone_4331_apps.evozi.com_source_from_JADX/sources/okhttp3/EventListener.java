package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public abstract class EventListener {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final EventListener NONE = new EventListener$Companion$NONE$1();

    public interface Factory {
        EventListener create(Call call);
    }

    public void callEnd(Call call) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) iOException, "ioe");
    }

    public void callStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) inetSocketAddress, "inetSocketAddress");
        onGetStartedClick.write((Object) proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) inetSocketAddress, "inetSocketAddress");
        onGetStartedClick.write((Object) proxy, "proxy");
        onGetStartedClick.write((Object) iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) inetSocketAddress, "inetSocketAddress");
        onGetStartedClick.write((Object) proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) str, "domainName");
        onGetStartedClick.write((Object) list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        onGetStartedClick.write((Object) list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
    }

    public void requestBodyEnd(Call call, long j) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void requestBodyStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) request, "request");
    }

    public void requestHeadersStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void responseBodyStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) response, "response");
    }

    public void responseHeadersStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        onGetStartedClick.write((Object) call, "call");
    }

    public void secureConnectStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
