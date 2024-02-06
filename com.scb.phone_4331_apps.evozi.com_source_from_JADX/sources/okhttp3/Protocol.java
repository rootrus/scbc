package okhttp3;

import java.io.IOException;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    private Protocol(String str) {
        this.protocol = str;
    }

    static {
        Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    }

    public final String toString() {
        return this.protocol;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            onGetStartedClick.write((Object) str, "protocol");
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) Protocol.HTTP_1_0.protocol)) {
                return Protocol.HTTP_1_0;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) Protocol.HTTP_1_1.protocol)) {
                return Protocol.HTTP_1_1;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) Protocol.H2_PRIOR_KNOWLEDGE.protocol)) {
                return Protocol.H2_PRIOR_KNOWLEDGE;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) Protocol.HTTP_2.protocol)) {
                return Protocol.HTTP_2;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) Protocol.SPDY_3.protocol)) {
                return Protocol.SPDY_3;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) Protocol.QUIC.protocol)) {
                return Protocol.QUIC;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected protocol: ");
            sb.append(str);
            throw new IOException(sb.toString());
        }
    }
}
