package p040o;

import com.google.android.gms.location.places.Place;
import com.google.common.base.Ascii;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;
import net.p088sf.scuba.smartcards.ISO7816;

/* renamed from: o.MoneyActionAdapter$CustomViewHolder */
public final class MoneyActionAdapter$CustomViewHolder {
    private static String write;

    static {
        try {
            write = (String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                public final /* synthetic */ Object run() {
                    return System.getProperty("line.separator");
                }
            });
        } catch (Exception unused) {
            try {
                write = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                write = "\n";
            }
        }
    }

    public static String IconCompatParcelizer(byte[] bArr) {
        char c;
        byte b;
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            i4++;
            if ((bArr[i3] & 240) == 240) {
                i4++;
                i3 += 4;
            } else if ((bArr[i3] & ISO7816.INS_CREATE_FILE) == 224) {
                i3 += 3;
            } else {
                i3 = (bArr[i3] & ISO7816.INS_GET_RESPONSE) == 192 ? i3 + 2 : i3 + 1;
            }
        }
        char[] cArr = new char[i4];
        int i5 = 0;
        while (i2 < bArr.length) {
            if ((bArr[i2] & 240) == 240) {
                int i6 = (((((bArr[i2] & 3) << Ascii.DC2) | ((bArr[i2 + 1] & 63) << 12)) | ((bArr[i2 + 2] & 63) << 6)) | (bArr[i2 + 3] & 63)) - 65536;
                c = (char) ((i6 & Place.TYPE_SUBLOCALITY_LEVEL_1) | 56320);
                cArr[i5] = (char) (55296 | (i6 >> 10));
                i2 += 4;
                i5++;
            } else if ((bArr[i2] & ISO7816.INS_CREATE_FILE) == 224) {
                c = (char) (((bArr[i2] & 15) << 12) | ((bArr[i2 + 1] & 63) << 6) | (bArr[i2 + 2] & 63));
                i2 += 3;
            } else {
                if ((bArr[i2] & ISO7816.INS_WRITE_BINARY) == 208) {
                    i = (bArr[i2] & Ascii.f3259US) << 6;
                    b = bArr[i2 + 1];
                } else if ((bArr[i2] & ISO7816.INS_GET_RESPONSE) == 192) {
                    i = (bArr[i2] & Ascii.f3259US) << 6;
                    b = bArr[i2 + 1];
                } else {
                    c = (char) (bArr[i2] & 255);
                    i2++;
                }
                c = (char) (i | (b & 63));
                i2 += 2;
            }
            cArr[i5] = c;
            i5++;
        }
        return new String(cArr);
    }

    public static String write(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static byte[] IconCompatParcelizer(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String read(byte[] bArr) {
        return new String(write(bArr));
    }

    private static char[] write(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String[] MediaBrowserCompat$ItemReceiver(String str) {
        Vector vector = new Vector();
        boolean z = true;
        while (z) {
            int indexOf = str.indexOf(46);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static String read() {
        return write;
    }
}
