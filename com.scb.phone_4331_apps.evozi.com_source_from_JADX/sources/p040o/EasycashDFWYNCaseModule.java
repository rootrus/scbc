package p040o;

import com.thunderhead.connectivity.transport.OkClientFactory;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: o.EasycashDFWYNCaseModule */
public final class EasycashDFWYNCaseModule implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        onGetStartedClick.write((Object) chain, "chain");
        try {
            Response proceed = chain.proceed(chain.request());
            onGetStartedClick.IconCompatParcelizer((Object) proceed, "chain.proceed(chain.request())");
            return proceed;
        } catch (SocketTimeoutException e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindManagePromptpayLandingFragment.SOCKET_TIMEOUT);
            OkClientFactory.flushConnectionsPools();
            throw new IOException(e);
        }
    }
}
