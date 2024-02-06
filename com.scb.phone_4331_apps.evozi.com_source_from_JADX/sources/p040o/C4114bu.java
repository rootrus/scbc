package p040o;

import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.bu */
public class C4114bu extends writeUInt64NoTag<getBackBarcodes> {
    static int MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        if (i2 != 2) {
            return 0;
        }
        if (i == 0) {
            return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
        }
        if (i != 1) {
            return i != 3 ? 0 : 90;
        }
        return 270;
    }

    @HmlPinActivity
    public C4114bu(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }
}
