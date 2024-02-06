package p040o;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.math.Primes;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: o.setMessageHandler */
public final class setMessageHandler {
    private static final int[] IconCompatParcelizer = new int[256];
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] MediaBrowserCompat$ItemReceiver = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 134, 240, 92, 254}, new int[]{28, 24, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, 223, 248, 116, 255, 110, 61}, new int[]{CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 205, 12, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 100, 242}, new int[]{CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 97, 192, 252, 95, 9, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, 119, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 45, 18, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 83, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384}, new int[]{83, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 244, 9, 233, 71, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 2, 188, 160, 153, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 253, 79, 108, 82, 27, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256}, new int[]{52, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 88, 205, 109, 39, CipherSuite.TLS_PSK_WITH_NULL_SHA256, 21, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 251, 223, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, 21, 5, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 254, EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE, 12, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 96, 50, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256}, new int[]{Primes.SMALL_FACTOR_LIMIT, 231, 43, 97, 71, 96, 103, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 37, 151, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 53, 75, 34, 249, 121, 17, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 110, 213, 141, 136, 120, 151, 233, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 93, 255}, new int[]{245, 127, 242, 218, ISO781611.BIOMETRIC_SUBTYPE_TAG, 250, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 102, 120, 84, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 220, 251, 80, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 229, 18, 2, 4, 68, 33, 101, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 95, 119, 115, 44, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 59, 25, 225, 98, 81, 112}, new int[]{77, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 95, 100, 9, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 105, ModuleDescriptor.MODULE_VERSION, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 226, 5, 9, 5}, new int[]{245, 132, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 106, 16, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 118, 23, 37, 90, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 205, 131, 88, 120, 100, 66, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 240, 82, 44, CipherSuite.TLS_PSK_WITH_NULL_SHA256, 87, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 160, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 69, 213, 92, 253, 225, 19}, new int[]{CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 9, 223, 238, 12, 17, 220, 208, 100, 29, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 230, 192, 215, 235, CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, 36, 223, 38, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 132, 54, 228, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 218, 234, 117, 203, 29, 232, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 238, 22, CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA, 201, 117, 62, 207, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 13, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 245, 127, 67, 247, 28, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, 43, 203, 107, 233, 53, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 46}, new int[]{242, 93, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 50, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 210, 39, 118, 202, 188, 201, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 108, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 37, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 112, 134, 230, 245, 63, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 250, 106, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 221, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 64, 114, 71, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 44, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 6, 27, 218, 51, 63, 87, 10, 40, ISO781611.BIOMETRIC_SUBTYPE_TAG, 188, 17, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 31, CipherSuite.TLS_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 4, 107, 232, 7, 94, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, PassportService.DEFAULT_MAX_BLOCKSIZE, EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE, 86, 47, 11, 204}, new int[]{220, 228, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 89, 251, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, 56, 89, 33, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 244, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, 36, 73, 127, 213, 136, 248, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 234, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 158, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 68, 122, 93, 213, 15, 160, 227, 236, 66, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 153, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 202, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 25, 220, 232, 96, 210, 231, 136, 223, 239, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 241, 59, 52, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 25, 49, 232, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 64, 54, 108, 153, 132, 63, 96, 103, 82, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256}};
    private static final int[] read = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            read[i2] = i;
            IconCompatParcelizer[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    public static String read(String str, sendMessage sendmessage) {
        if (str.length() == sendmessage.MediaBrowserCompat$CustomActionResultReceiver) {
            StringBuilder sb = new StringBuilder(sendmessage.MediaBrowserCompat$CustomActionResultReceiver + sendmessage.MediaBrowserCompat$ItemReceiver);
            sb.append(str);
            int MediaBrowserCompat$CustomActionResultReceiver2 = sendmessage.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2 == 1) {
                sb.append(IconCompatParcelizer(str, sendmessage.MediaBrowserCompat$ItemReceiver));
            } else {
                sb.setLength(sb.capacity());
                int[] iArr = new int[MediaBrowserCompat$CustomActionResultReceiver2];
                int[] iArr2 = new int[MediaBrowserCompat$CustomActionResultReceiver2];
                int[] iArr3 = new int[MediaBrowserCompat$CustomActionResultReceiver2];
                int i = 0;
                while (i < MediaBrowserCompat$CustomActionResultReceiver2) {
                    int i2 = i + 1;
                    iArr[i] = sendmessage.MediaBrowserCompat$ItemReceiver(i2);
                    iArr2[i] = sendmessage.IconCompatParcelizer;
                    iArr3[i] = 0;
                    if (i > 0) {
                        iArr3[i] = iArr3[i - 1] + iArr[i];
                    }
                    i = i2;
                }
                for (int i3 = 0; i3 < MediaBrowserCompat$CustomActionResultReceiver2; i3++) {
                    StringBuilder sb2 = new StringBuilder(iArr[i3]);
                    for (int i4 = i3; i4 < sendmessage.MediaBrowserCompat$CustomActionResultReceiver; i4 += MediaBrowserCompat$CustomActionResultReceiver2) {
                        sb2.append(str.charAt(i4));
                    }
                    String IconCompatParcelizer2 = IconCompatParcelizer(sb2.toString(), iArr2[i3]);
                    int i5 = i3;
                    int i6 = 0;
                    while (i5 < iArr2[i3] * MediaBrowserCompat$CustomActionResultReceiver2) {
                        sb.setCharAt(sendmessage.MediaBrowserCompat$CustomActionResultReceiver + i5, IconCompatParcelizer2.charAt(i6));
                        i5 += MediaBrowserCompat$CustomActionResultReceiver2;
                        i6++;
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }

    private static String IconCompatParcelizer(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (true) {
            int[] iArr = MediaBrowserCompat$CustomActionResultReceiver;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int[] iArr2 = MediaBrowserCompat$ItemReceiver[i2];
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = 0;
            }
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i - 1;
                char charAt = cArr[i5] ^ charSequence.charAt(i4);
                while (i5 > 0) {
                    if (charAt == 0 || iArr2[i5] == 0) {
                        cArr[i5] = cArr[i5 - 1];
                    } else {
                        char c = cArr[i5 - 1];
                        int[] iArr3 = read;
                        int[] iArr4 = IconCompatParcelizer;
                        cArr[i5] = (char) (c ^ iArr3[(iArr4[charAt] + iArr4[iArr2[i5]]) % 255]);
                    }
                    i5--;
                }
                if (charAt == 0 || iArr2[0] == 0) {
                    cArr[0] = 0;
                } else {
                    int[] iArr5 = read;
                    int[] iArr6 = IconCompatParcelizer;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[iArr2[0]]) % 255];
                }
            }
            char[] cArr2 = new char[i];
            for (int i6 = 0; i6 < i; i6++) {
                cArr2[i6] = cArr[(i - i6) - 1];
            }
            return String.valueOf(cArr2);
        }
        StringBuilder sb = new StringBuilder("Illegal number of error correction codewords specified: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
