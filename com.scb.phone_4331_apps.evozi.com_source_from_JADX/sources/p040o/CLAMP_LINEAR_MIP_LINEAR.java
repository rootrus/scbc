package p040o;

import com.google.android.gms.common.api.Api;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.CLAMP_LINEAR_MIP_LINEAR */
public final class CLAMP_LINEAR_MIP_LINEAR extends getMinification {
    static final int[] IconCompatParcelizer = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 448, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, TitleChanger.DEFAULT_ANIMATION_DELAY, 208, 133, 388, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 42};
    private final int[] MediaBrowserCompat$CustomActionResultReceiver;
    private final StringBuilder MediaBrowserCompat$ItemReceiver;
    private final boolean read;
    private final boolean write;

    public CLAMP_LINEAR_MIP_LINEAR() {
        this(false);
    }

    public CLAMP_LINEAR_MIP_LINEAR(boolean z) {
        this(z, (byte) 0);
    }

    private CLAMP_LINEAR_MIP_LINEAR(boolean z, byte b) {
        this.read = z;
        this.write = false;
        this.MediaBrowserCompat$ItemReceiver = new StringBuilder(20);
        this.MediaBrowserCompat$CustomActionResultReceiver = new int[9];
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws NotFoundException, ChecksumException, FormatException {
        char c;
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = rsnscriptintrinsiccreate;
        int[] iArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.MediaBrowserCompat$ItemReceiver;
        sb.setLength(0);
        int i2 = rsnscriptintrinsiccreate2.read;
        int read2 = rsnscriptintrinsiccreate2.read(0);
        int length = iArr.length;
        boolean z = false;
        int i3 = 0;
        int i4 = read2;
        while (read2 < i2) {
            if ((((1 << (read2 & 31)) & rsnscriptintrinsiccreate2.write[read2 / 32]) != 0) != z) {
                iArr[i3] = iArr[i3] + 1;
                int i5 = i;
            } else {
                if (i3 != length - 1) {
                    int i6 = i;
                    i3++;
                } else if (write(iArr) != 148 || !rsnscriptintrinsiccreate2.IconCompatParcelizer(Math.max(0, i4 - ((read2 - i4) / 2)), i4)) {
                    int i7 = i;
                    i4 += iArr[0] + iArr[1];
                    int i8 = i3 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i8);
                    iArr[i8] = 0;
                    iArr[i3] = 0;
                    i3--;
                } else {
                    int[] iArr2 = {i4, read2};
                    int read3 = rsnscriptintrinsiccreate2.read(iArr2[1]);
                    int i9 = rsnscriptintrinsiccreate2.read;
                    while (true) {
                        MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate2, read3, iArr);
                        int write2 = write(iArr);
                        if (write2 >= 0) {
                            int i10 = 0;
                            while (true) {
                                int[] iArr3 = IconCompatParcelizer;
                                if (i10 < iArr3.length) {
                                    if (iArr3[i10] == write2) {
                                        c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i10);
                                        break;
                                    }
                                    i10++;
                                } else if (write2 == 148) {
                                    c = '*';
                                } else {
                                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                                }
                            }
                            sb.append(c);
                            int i11 = read3;
                            for (int i12 : iArr) {
                                i11 += i12;
                            }
                            int read4 = rsnscriptintrinsiccreate2.read(i11);
                            if (c == '*') {
                                sb.setLength(sb.length() - 1);
                                int i13 = 0;
                                for (int i14 : iArr) {
                                    i13 += i14;
                                }
                                if (read4 == i9 || (((read4 - read3) - i13) << 1) >= i13) {
                                    if (this.read) {
                                        int length2 = sb.length() - 1;
                                        int i15 = 0;
                                        for (int i16 = 0; i16 < length2; i16++) {
                                            i15 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.MediaBrowserCompat$ItemReceiver.charAt(i16));
                                        }
                                        if (sb.charAt(length2) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i15 % 43)) {
                                            sb.setLength(length2);
                                        } else {
                                            throw ChecksumException.write();
                                        }
                                    }
                                    if (sb.length() != 0) {
                                        float f = (float) i;
                                        return new getLayers$MediaBrowserCompat$CustomActionResultReceiver(sb.toString(), (byte[]) null, new rsnScriptForEach[]{new rsnScriptForEach(((float) (iArr2[1] + iArr2[0])) / 2.0f, f), new rsnScriptForEach(((float) read3) + (((float) i13) / 2.0f), f)}, rsnIncAllocationCreateTyped.CODE_39);
                                    }
                                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                                }
                                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                            }
                            int i17 = i;
                            read3 = read4;
                        } else {
                            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                        }
                    }
                }
                iArr[i3] = 1;
                z = !z;
            }
            read2++;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private static int write(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }
}
