package org.bouncycastle.crypto.tls;

import java.io.IOException;
import okhttp3.internal.http2.Settings;
import org.bouncycastle.util.Strings;

public final class ProtocolVersion {
    public static final ProtocolVersion DTLSv10 = new ProtocolVersion(65279, "DTLS 1.0");
    public static final ProtocolVersion DTLSv12 = new ProtocolVersion(65277, "DTLS 1.2");
    public static final ProtocolVersion SSLv3 = new ProtocolVersion(768, "SSL 3.0");
    public static final ProtocolVersion TLSv10 = new ProtocolVersion(769, "TLS 1.0");
    public static final ProtocolVersion TLSv11 = new ProtocolVersion(770, "TLS 1.1");
    public static final ProtocolVersion TLSv12 = new ProtocolVersion(771, "TLS 1.2");
    private String name;
    private int version;

    private ProtocolVersion(int i, String str) {
        this.version = i & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.name = str;
    }

    public static ProtocolVersion get(int i, int i2) throws IOException {
        String str;
        if (i != 3) {
            if (i == 254) {
                switch (i2) {
                    case 253:
                        return DTLSv12;
                    case 254:
                        throw new TlsFatalAlert(47);
                    case 255:
                        return DTLSv10;
                    default:
                        str = "DTLS";
                        break;
                }
            } else {
                throw new TlsFatalAlert(47);
            }
        } else if (i2 == 0) {
            return SSLv3;
        } else {
            if (i2 == 1) {
                return TLSv10;
            }
            if (i2 == 2) {
                return TLSv11;
            }
            if (i2 == 3) {
                return TLSv12;
            }
            str = "TLS";
        }
        return getUnknownVersion(i, i2, str);
    }

    private static ProtocolVersion getUnknownVersion(int i, int i2, String str) throws IOException {
        TlsUtils.checkUint8(i);
        TlsUtils.checkUint8(i2);
        int i3 = (i << 8) | i2;
        String upperCase = Strings.toUpperCase(Integer.toHexString(65536 | i3).substring(1));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" 0x");
        sb.append(upperCase);
        return new ProtocolVersion(i3, sb.toString());
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProtocolVersion) && equals((ProtocolVersion) obj));
    }

    public final boolean equals(ProtocolVersion protocolVersion) {
        return protocolVersion != null && this.version == protocolVersion.version;
    }

    public final ProtocolVersion getEquivalentTLSVersion() {
        return !isDTLS() ? this : this == DTLSv10 ? TLSv11 : TLSv12;
    }

    public final int getFullVersion() {
        return this.version;
    }

    public final int getMajorVersion() {
        return this.version >> 8;
    }

    public final int getMinorVersion() {
        return this.version & 255;
    }

    public final int hashCode() {
        return this.version;
    }

    public final boolean isDTLS() {
        return getMajorVersion() == 254;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isEqualOrEarlierVersionOf(org.bouncycastle.crypto.tls.ProtocolVersion r4) {
        /*
            r3 = this;
            int r0 = r3.getMajorVersion()
            int r1 = r4.getMajorVersion()
            r2 = 0
            if (r0 == r1) goto L_0x000c
            return r2
        L_0x000c:
            int r4 = r4.getMinorVersion()
            int r0 = r3.getMinorVersion()
            int r4 = r4 - r0
            boolean r0 = r3.isDTLS()
            if (r0 == 0) goto L_0x001e
            if (r4 > 0) goto L_0x0021
            goto L_0x0020
        L_0x001e:
            if (r4 < 0) goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.ProtocolVersion.isEqualOrEarlierVersionOf(org.bouncycastle.crypto.tls.ProtocolVersion):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isLaterVersionOf(org.bouncycastle.crypto.tls.ProtocolVersion r4) {
        /*
            r3 = this;
            int r0 = r3.getMajorVersion()
            int r1 = r4.getMajorVersion()
            r2 = 0
            if (r0 == r1) goto L_0x000c
            return r2
        L_0x000c:
            int r4 = r4.getMinorVersion()
            int r0 = r3.getMinorVersion()
            int r4 = r4 - r0
            boolean r0 = r3.isDTLS()
            if (r0 == 0) goto L_0x001e
            if (r4 <= 0) goto L_0x0021
            goto L_0x0020
        L_0x001e:
            if (r4 >= 0) goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.ProtocolVersion.isLaterVersionOf(org.bouncycastle.crypto.tls.ProtocolVersion):boolean");
    }

    public final boolean isSSL() {
        return this == SSLv3;
    }

    public final boolean isTLS() {
        return getMajorVersion() == 3;
    }

    public final String toString() {
        return this.name;
    }
}
