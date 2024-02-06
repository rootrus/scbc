package p040o;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.LendingIssuerAdapter$IssuerViewHolder */
public final class LendingIssuerAdapter$IssuerViewHolder {
    private static char[] MediaBrowserCompat$ItemReceiver = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static String MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((bArr.length * 3) / 2);
        int i = 0;
        loop0:
        while (true) {
            int i2 = 0;
            while (i <= length - 3) {
                byte b = ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i + 2] & 255);
                stringBuffer.append(MediaBrowserCompat$ItemReceiver[(b >> Ascii.DC2) & 63]);
                stringBuffer.append(MediaBrowserCompat$ItemReceiver[(b >> 12) & 63]);
                stringBuffer.append(MediaBrowserCompat$ItemReceiver[(b >> 6) & 63]);
                stringBuffer.append(MediaBrowserCompat$ItemReceiver[b & 63]);
                i += 3;
                if (i2 >= 14) {
                    stringBuffer.append("\r\n");
                } else {
                    i2++;
                }
            }
            break loop0;
        }
        if (i == length - 2) {
            int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
            stringBuffer.append(MediaBrowserCompat$ItemReceiver[(i3 >> 18) & 63]);
            stringBuffer.append(MediaBrowserCompat$ItemReceiver[(i3 >> 12) & 63]);
            stringBuffer.append(MediaBrowserCompat$ItemReceiver[(i3 >> 6) & 63]);
            stringBuffer.append("=");
        } else if (i == length - 1) {
            int i4 = (bArr[i] & 255) << 16;
            stringBuffer.append(MediaBrowserCompat$ItemReceiver[(i4 >> 18) & 63]);
            stringBuffer.append(MediaBrowserCompat$ItemReceiver[(i4 >> 12) & 63]);
            stringBuffer.append("==");
        }
        return stringBuffer.toString();
    }

    private static int IconCompatParcelizer(char c) {
        int i;
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        }
        if (c >= 'a' && c <= 'z') {
            i = c - 'a';
        } else if (c >= '0' && c <= '9') {
            i = (c - '0') + 26;
        } else if (c == '+') {
            return 62;
        } else {
            if (c == '/') {
                return 63;
            }
            if (c == '=') {
                return 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected code: ");
            sb.append(c);
            throw new RuntimeException(sb.toString());
        }
        return i + 26;
    }

    public static byte[] write(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            MediaBrowserCompat$CustomActionResultReceiver(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length && str.charAt(i) <= ' ') {
                i++;
            } else if (i != length) {
                int i2 = i + 2;
                int i3 = i + 3;
                int IconCompatParcelizer = (IconCompatParcelizer(str.charAt(i)) << 18) + (IconCompatParcelizer(str.charAt(i + 1)) << 12) + (IconCompatParcelizer(str.charAt(i2)) << 6) + IconCompatParcelizer(str.charAt(i3));
                outputStream.write((IconCompatParcelizer >> 16) & 255);
                if (str.charAt(i2) != '=') {
                    outputStream.write((IconCompatParcelizer >> 8) & 255);
                    if (str.charAt(i3) != '=') {
                        outputStream.write(IconCompatParcelizer & 255);
                        i += 4;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
