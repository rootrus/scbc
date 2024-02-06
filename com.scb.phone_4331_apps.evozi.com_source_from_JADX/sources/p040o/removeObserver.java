package p040o;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: o.removeObserver */
public final class removeObserver implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        onCheckBoxClick.IconCompatParcelizer("Log.info: %s", request.url().url().toString());
        Response proceed = chain.proceed(request);
        String header = proceed.header("correlationid");
        if (header != null) {
            onCheckBoxClick.IconCompatParcelizer("Log.info: %s", header);
        }
        return proceed;
    }
}
