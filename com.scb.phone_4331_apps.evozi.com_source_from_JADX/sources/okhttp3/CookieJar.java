package okhttp3;

import java.util.List;
import p040o.NtbDiscoverFundFilterActivity;

public interface CookieJar {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final CookieJar NO_COOKIES = new CookieJar$Companion$NO_COOKIES$1();

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
