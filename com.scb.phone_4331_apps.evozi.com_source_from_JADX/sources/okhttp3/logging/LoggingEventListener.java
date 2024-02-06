package okhttp3.logging;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger2, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this(logger2);
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger2) {
        this.logger = logger2;
    }

    public final void callStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
        this.startNs = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        sb.append("callStart: ");
        sb.append(call.request());
        logWithTime(sb.toString());
    }

    public final void proxySelectStart(Call call, HttpUrl httpUrl) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        StringBuilder sb = new StringBuilder();
        sb.append("proxySelectStart: ");
        sb.append(httpUrl);
        logWithTime(sb.toString());
    }

    public final void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        onGetStartedClick.write((Object) list, "proxies");
        StringBuilder sb = new StringBuilder();
        sb.append("proxySelectEnd: ");
        sb.append(list);
        logWithTime(sb.toString());
    }

    public final void dnsStart(Call call, String str) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) str, "domainName");
        StringBuilder sb = new StringBuilder();
        sb.append("dnsStart: ");
        sb.append(str);
        logWithTime(sb.toString());
    }

    public final void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) str, "domainName");
        onGetStartedClick.write((Object) list, "inetAddressList");
        StringBuilder sb = new StringBuilder();
        sb.append("dnsEnd: ");
        sb.append(list);
        logWithTime(sb.toString());
    }

    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) inetSocketAddress, "inetSocketAddress");
        onGetStartedClick.write((Object) proxy, "proxy");
        StringBuilder sb = new StringBuilder();
        sb.append("connectStart: ");
        sb.append(inetSocketAddress);
        sb.append(' ');
        sb.append(proxy);
        logWithTime(sb.toString());
    }

    public final void secureConnectStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
        logWithTime("secureConnectStart");
    }

    public final void secureConnectEnd(Call call, Handshake handshake) {
        onGetStartedClick.write((Object) call, "call");
        StringBuilder sb = new StringBuilder();
        sb.append("secureConnectEnd: ");
        sb.append(handshake);
        logWithTime(sb.toString());
    }

    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) inetSocketAddress, "inetSocketAddress");
        onGetStartedClick.write((Object) proxy, "proxy");
        StringBuilder sb = new StringBuilder();
        sb.append("connectEnd: ");
        sb.append(protocol);
        logWithTime(sb.toString());
    }

    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) inetSocketAddress, "inetSocketAddress");
        onGetStartedClick.write((Object) proxy, "proxy");
        onGetStartedClick.write((Object) iOException, "ioe");
        StringBuilder sb = new StringBuilder();
        sb.append("connectFailed: ");
        sb.append(protocol);
        sb.append(' ');
        sb.append(iOException);
        logWithTime(sb.toString());
    }

    public final void connectionAcquired(Call call, Connection connection) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) connection, "connection");
        StringBuilder sb = new StringBuilder();
        sb.append("connectionAcquired: ");
        sb.append(connection);
        logWithTime(sb.toString());
    }

    public final void connectionReleased(Call call, Connection connection) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) connection, "connection");
        logWithTime("connectionReleased");
    }

    public final void requestHeadersStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
        logWithTime("requestHeadersStart");
    }

    public final void requestHeadersEnd(Call call, Request request) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) request, "request");
        logWithTime("requestHeadersEnd");
    }

    public final void requestBodyStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
        logWithTime("requestBodyStart");
    }

    public final void requestBodyEnd(Call call, long j) {
        onGetStartedClick.write((Object) call, "call");
        StringBuilder sb = new StringBuilder();
        sb.append("requestBodyEnd: byteCount=");
        sb.append(j);
        logWithTime(sb.toString());
    }

    public final void requestFailed(Call call, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) iOException, "ioe");
        StringBuilder sb = new StringBuilder();
        sb.append("requestFailed: ");
        sb.append(iOException);
        logWithTime(sb.toString());
    }

    public final void responseHeadersStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
        logWithTime("responseHeadersStart");
    }

    public final void responseHeadersEnd(Call call, Response response) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) response, "response");
        StringBuilder sb = new StringBuilder();
        sb.append("responseHeadersEnd: ");
        sb.append(response);
        logWithTime(sb.toString());
    }

    public final void responseBodyStart(Call call) {
        onGetStartedClick.write((Object) call, "call");
        logWithTime("responseBodyStart");
    }

    public final void responseBodyEnd(Call call, long j) {
        onGetStartedClick.write((Object) call, "call");
        StringBuilder sb = new StringBuilder();
        sb.append("responseBodyEnd: byteCount=");
        sb.append(j);
        logWithTime(sb.toString());
    }

    public final void responseFailed(Call call, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) iOException, "ioe");
        StringBuilder sb = new StringBuilder();
        sb.append("responseFailed: ");
        sb.append(iOException);
        logWithTime(sb.toString());
    }

    public final void callEnd(Call call) {
        onGetStartedClick.write((Object) call, "call");
        logWithTime("callEnd");
    }

    public final void callFailed(Call call, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) iOException, "ioe");
        StringBuilder sb = new StringBuilder();
        sb.append("callFailed: ");
        sb.append(iOException);
        logWithTime(sb.toString());
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        HttpLoggingInterceptor.Logger logger2 = this.logger;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(millis);
        sb.append(" ms] ");
        sb.append(str);
        logger2.log(sb.toString());
    }

    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        public Factory() {
            this((HttpLoggingInterceptor.Logger) null, 1, (NtbDiscoverFundFilterActivity) null);
        }

        public Factory(HttpLoggingInterceptor.Logger logger2) {
            onGetStartedClick.write((Object) logger2, "logger");
            this.logger = logger2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger2, int i, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this((i & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger2);
        }

        public EventListener create(Call call) {
            onGetStartedClick.write((Object) call, "call");
            return new LoggingEventListener(this.logger, (NtbDiscoverFundFilterActivity) null);
        }
    }
}
