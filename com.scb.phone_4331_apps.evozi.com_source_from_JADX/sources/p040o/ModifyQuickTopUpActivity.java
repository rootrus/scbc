package p040o;

import java.nio.charset.Charset;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.ModifyQuickTopUpActivity */
public final class ModifyQuickTopUpActivity {
    public static final Charset MediaBrowserCompat$ItemReceiver = Charset.forName("UTF-8");

    public static int MediaBrowserCompat$ItemReceiver(int i) {
        return ((i & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) << 8) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    public static short write(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 65280) >>> 8) | ((s2 & 255) << 8));
    }

    public static void IconCompatParcelizer(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    public static boolean read(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        throw th;
    }
}
