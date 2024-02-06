package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import p040o.GoodToKnowActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class CipherSuite {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    /* access modifiers changed from: private */
    public static final Map<String, CipherSuite> INSTANCES = new LinkedHashMap();
    /* access modifiers changed from: private */
    public static final Comparator<String> ORDER_BY_NAME = new CipherSuite$Companion$ORDER_BY_NAME$1();
    public static final CipherSuite TLS_AES_128_CCM_8_SHA256 = Companion.init("TLS_AES_128_CCM_8_SHA256", 4869);
    public static final CipherSuite TLS_AES_128_CCM_SHA256 = Companion.init("TLS_AES_128_CCM_SHA256", 4868);
    public static final CipherSuite TLS_AES_128_GCM_SHA256 = Companion.init("TLS_AES_128_GCM_SHA256", 4865);
    public static final CipherSuite TLS_AES_256_GCM_SHA384 = Companion.init("TLS_AES_256_GCM_SHA384", 4866);
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_CHACHA20_POLY1305_SHA256", 4867);
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = Companion.init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = Companion.init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = Companion.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = Companion.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = Companion.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = Companion.init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = Companion.init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA = Companion.init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = Companion.init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = Companion.init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = Companion.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384);
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = Companion.init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = Companion.init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", org.bouncycastle.crypto.tls.CipherSuite.DRAFT_TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA = Companion.init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = Companion.init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = Companion.init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = Companion.init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA = Companion.init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA = Companion.init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256 = Companion.init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384);
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA = Companion.init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5 = Companion.init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", org.bouncycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", org.bouncycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = Companion.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", org.bouncycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA = Companion.init("TLS_ECDHE_RSA_WITH_NULL_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA = Companion.init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = Companion.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_NULL_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA);
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = Companion.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384);
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA = Companion.init("TLS_ECDH_RSA_WITH_NULL_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA);
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA = Companion.init("TLS_ECDH_RSA_WITH_RC4_128_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA);
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA);
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA);
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA);
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA = Companion.init("TLS_ECDH_anon_WITH_NULL_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA);
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA = Companion.init("TLS_ECDH_anon_WITH_RC4_128_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA);
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV = Companion.init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    public static final CipherSuite TLS_FALLBACK_SCSV = Companion.init("TLS_FALLBACK_SCSV", org.bouncycastle.crypto.tls.CipherSuite.TLS_FALLBACK_SCSV);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = Companion.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = Companion.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = Companion.init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA = Companion.init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = Companion.init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5 = Companion.init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA = Companion.init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5 = Companion.init("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA = Companion.init("TLS_KRB5_WITH_RC4_128_SHA", 32);
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA = Companion.init("TLS_PSK_WITH_AES_128_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA = Companion.init("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA = Companion.init("TLS_PSK_WITH_RC4_128_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = Companion.init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5 = Companion.init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA = Companion.init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_RSA_WITH_AES_128_GCM_SHA256", org.bouncycastle.crypto.tls.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256);
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256 = Companion.init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_RSA_WITH_AES_256_GCM_SHA384", org.bouncycastle.crypto.tls.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384);
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = Companion.init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = Companion.init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA = Companion.init("SSL_RSA_WITH_DES_CBC_SHA", 9);
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5 = Companion.init("SSL_RSA_WITH_NULL_MD5", 1);
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA = Companion.init("SSL_RSA_WITH_NULL_SHA", 2);
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256 = Companion.init("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5 = Companion.init("SSL_RSA_WITH_RC4_128_MD5", 4);
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA = Companion.init("SSL_RSA_WITH_RC4_128_SHA", 5);
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA = Companion.init("TLS_RSA_WITH_SEED_CBC_SHA", org.bouncycastle.crypto.tls.CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA);
    private final String javaName;

    public static final CipherSuite forJavaName(String str) {
        CipherSuite forJavaName;
        synchronized (CipherSuite.class) {
            forJavaName = Companion.forJavaName(str);
        }
        return forJavaName;
    }

    private CipherSuite(String str) {
        this.javaName = str;
    }

    public /* synthetic */ CipherSuite(String str, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this(str);
    }

    public final String javaName() {
        return this.javaName;
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m6350deprecated_javaName() {
        return this.javaName;
    }

    public final String toString() {
        return this.javaName;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final Comparator<String> getORDER_BY_NAME$okhttp() {
            return CipherSuite.ORDER_BY_NAME;
        }

        public final CipherSuite forJavaName(String str) {
            CipherSuite cipherSuite;
            synchronized (this) {
                onGetStartedClick.write((Object) str, "javaName");
                cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(str);
                if (cipherSuite == null) {
                    cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(secondaryName(str));
                    if (cipherSuite == null) {
                        cipherSuite = new CipherSuite(str, (NtbDiscoverFundFilterActivity) null);
                    }
                    CipherSuite.INSTANCES.put(str, cipherSuite);
                }
            }
            return cipherSuite;
        }

        /* access modifiers changed from: private */
        public final CipherSuite init(String str, int i) {
            CipherSuite cipherSuite = new CipherSuite(str, (NtbDiscoverFundFilterActivity) null);
            CipherSuite.INSTANCES.put(str, cipherSuite);
            return cipherSuite;
        }

        private final String secondaryName(String str) {
            if (GoodToKnowActivity.read(str, "TLS_", false)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                if (str != null) {
                    String substring = str.substring(4);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    return sb.toString();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            } else if (!GoodToKnowActivity.read(str, "SSL_", false)) {
                return str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TLS_");
                if (str != null) {
                    String substring2 = str.substring(4);
                    onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                    sb2.append(substring2);
                    return sb2.toString();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }
}
