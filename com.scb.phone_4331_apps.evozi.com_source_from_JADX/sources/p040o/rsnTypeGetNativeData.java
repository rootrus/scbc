package p040o;

import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.rsnTypeGetNativeData */
final class rsnTypeGetNativeData extends sendMessage {
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return 10;
    }

    public final int MediaBrowserCompat$ItemReceiver(int i) {
        return i <= 8 ? CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 : CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
    }

    rsnTypeGetNativeData() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }
}
