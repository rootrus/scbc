package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import p040o.onGetStartedClick;

public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor INSTANCE = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        onGetStartedClick.write((Object) chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request();
        Transmitter transmitter = realInterceptorChain.transmitter();
        return realInterceptorChain.proceed(request, transmitter, transmitter.newExchange$okhttp(chain, !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) request.method(), (Object) "GET")));
    }
}
