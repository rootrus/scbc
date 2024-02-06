package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p040o.NtbDiscoverFundFilterActivity;

public interface Dns {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final Dns SYSTEM = new Dns$Companion$SYSTEM$1();

    List<InetAddress> lookup(String str) throws UnknownHostException;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
