package p040o;

import com.google.zxing.WriterException;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.CLAMP_LINEAR */
public final class CLAMP_LINEAR extends getWrapS {
    public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        if (rsnincallocationcreatetyped == rsnIncAllocationCreateTyped.CODE_39) {
            return super.write(str, rsnincallocationcreatetyped, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_39, but got ");
        sb.append(rsnincallocationcreatetyped);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean[] MediaBrowserCompat$ItemReceiver(String str) {
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt = str.charAt(i2);
                        if (charAt != 0) {
                            if (charAt != ' ') {
                                if (charAt == '@') {
                                    sb.append("%V");
                                } else if (charAt == '`') {
                                    sb.append("%W");
                                } else if (!(charAt == '-' || charAt == '.')) {
                                    if (charAt > 0 && charAt < 27) {
                                        sb.append('$');
                                        sb.append((char) ((charAt - 1) + 65));
                                    } else if (charAt > 26 && charAt < ' ') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - 27) + 65));
                                    } else if ((charAt > ' ' && charAt < '-') || charAt == '/' || charAt == ':') {
                                        sb.append('/');
                                        sb.append((char) ((charAt - '!') + 65));
                                    } else if (charAt > '/' && charAt < ':') {
                                        sb.append((char) ((charAt - '0') + 48));
                                    } else if (charAt > ':' && charAt < '@') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - ';') + 70));
                                    } else if (charAt > '@' && charAt < '[') {
                                        sb.append((char) ((charAt - 'A') + 65));
                                    } else if (charAt > 'Z' && charAt < '`') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - '[') + 75));
                                    } else if (charAt > '`' && charAt < '{') {
                                        sb.append('+');
                                        sb.append((char) ((charAt - 'a') + 65));
                                    } else if (charAt <= 'z' || charAt >= 128) {
                                        StringBuilder sb2 = new StringBuilder("Requested content contains a non-encodable character: '");
                                        sb2.append(str.charAt(i2));
                                        sb2.append("'");
                                        throw new IllegalArgumentException(sb2.toString());
                                    } else {
                                        sb.append('%');
                                        sb.append((char) ((charAt - '{') + 80));
                                    }
                                }
                            }
                            sb.append(charAt);
                        } else {
                            sb.append("%U");
                        }
                    }
                    str = sb.toString();
                    length = str.length();
                    if (length > 80) {
                        StringBuilder sb3 = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
                        sb3.append(length);
                        sb3.append(" (extended full ASCII mode)");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            int i3 = length + 25;
            for (int i4 = 0; i4 < length; i4++) {
                MediaBrowserCompat$ItemReceiver(CLAMP_LINEAR_MIP_LINEAR.IconCompatParcelizer["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr);
                for (int i5 = 0; i5 < 9; i5++) {
                    i3 += iArr[i5];
                }
            }
            boolean[] zArr = new boolean[i3];
            MediaBrowserCompat$ItemReceiver(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, iArr);
            int read = read(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int read2 = read + read(zArr, read, iArr2, false);
            for (int i6 = 0; i6 < length; i6++) {
                MediaBrowserCompat$ItemReceiver(CLAMP_LINEAR_MIP_LINEAR.IconCompatParcelizer["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr);
                int read3 = read2 + read(zArr, read2, iArr, true);
                read2 = read3 + read(zArr, read3, iArr2, false);
            }
            MediaBrowserCompat$ItemReceiver(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, iArr);
            read(zArr, read2, iArr, true);
            return zArr;
        }
        StringBuilder sb4 = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
        sb4.append(length);
        throw new IllegalArgumentException(sb4.toString());
    }

    private static void MediaBrowserCompat$ItemReceiver(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }
}
