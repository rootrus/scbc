package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p040o.FundFactSheetActivity;
import p040o.onGetStartedClick;

public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    Response intercept(Chain chain) throws IOException;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(FundFactSheetActivity<? super Chain, Response> fundFactSheetActivity) {
            onGetStartedClick.write((Object) fundFactSheetActivity, "block");
            return new Interceptor$Companion$invoke$1(fundFactSheetActivity);
        }
    }
}
