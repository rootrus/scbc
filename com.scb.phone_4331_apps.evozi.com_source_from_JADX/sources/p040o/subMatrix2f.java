package p040o;

import android.graphics.Color;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: o.subMatrix2f */
public final class subMatrix2f {
    public static int MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        return (i & 16777215) | ((i2 & 255) << 24);
    }

    static {
        Color.rgb(207, 248, 246);
        Color.rgb(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, 212, 212);
        Color.rgb(136, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        Color.rgb(118, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384);
        Color.rgb(42, 109, ISO781611.BIOMETRIC_SUBTYPE_TAG);
        Color.rgb(217, 80, CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
        Color.rgb(254, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, 7);
        Color.rgb(254, 247, 120);
        Color.rgb(106, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 134);
        Color.rgb(53, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 209);
        Color.rgb(64, 89, 128);
        Color.rgb(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE);
        Color.rgb(217, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256);
        Color.rgb(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 134, 134);
        Color.rgb(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 48, 80);
        Color.rgb(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 37, 82);
        Color.rgb(255, 102, 0);
        Color.rgb(245, 199, 0);
        Color.rgb(106, CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA, 31);
        Color.rgb(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 100, 53);
        Color.rgb(192, 255, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
        Color.rgb(255, 247, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
        Color.rgb(255, 208, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
        Color.rgb(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, 234, 255);
        Color.rgb(255, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384);
        IconCompatParcelizer("#2ecc71");
        IconCompatParcelizer("#f1c40f");
        IconCompatParcelizer("#e74c3c");
        IconCompatParcelizer("#3498db");
    }

    private static int IconCompatParcelizer(String str) {
        int parseLong = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, parseLong & 255);
    }
}
