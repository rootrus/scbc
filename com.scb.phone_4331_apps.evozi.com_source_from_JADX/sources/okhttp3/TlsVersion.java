package okhttp3;

import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final Companion Companion = null;
    private final String javaName;

    public static final TlsVersion forJavaName(String str) {
        return Companion.forJavaName(str);
    }

    private TlsVersion(String str) {
        this.javaName = str;
    }

    public final String javaName() {
        return this.javaName;
    }

    static {
        Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m6325deprecated_javaName() {
        return this.javaName;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final TlsVersion forJavaName(String str) {
            onGetStartedClick.write((Object) str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected TLS version: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
