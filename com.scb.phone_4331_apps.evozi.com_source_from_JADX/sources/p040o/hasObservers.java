package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: o.hasObservers */
public final class hasObservers implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        RetrofitException.IconCompatParcelizer(request);
        Response proceed = chain.proceed(request);
        RetrofitException.MediaBrowserCompat$CustomActionResultReceiver(proceed);
        return proceed;
    }
}
