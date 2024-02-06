package okhttp3;

import java.io.IOException;
import p040o.NtbDiscoverFundFilterActivity;

public interface Authenticator {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final Authenticator NONE = new Authenticator$Companion$NONE$1();

    Request authenticate(Route route, Response response) throws IOException;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
