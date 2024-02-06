package org.bouncycastle.util;

import com.google.android.gms.location.places.Place;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;
import net.p088sf.scuba.smartcards.ISO7816;
import org.jmrtd.PassportService;

public final class Strings {
    private static String LINE_SEPARATOR;

    static class StringListImpl extends ArrayList<String> implements StringList {
        private StringListImpl() {
        }

        public void add(int i, String str) {
            super.add(i, str);
        }

        public boolean add(String str) {
            return super.add(str);
        }

        public /* bridge */ /* synthetic */ String get(int i) {
            return (String) super.get(i);
        }

        public String set(int i, String str) {
            return (String) super.set(i, str);
        }

        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i = 0; i != size; i++) {
                strArr[i] = (String) get(i);
            }
            return strArr;
        }

        public String[] toStringArray(int i, int i2) {
            String[] strArr = new String[(i2 - i)];
            int i3 = i;
            while (i3 != size() && i3 != i2) {
                strArr[i3 - i] = (String) get(i3);
                i3++;
            }
            return strArr;
        }
    }

    static {
        try {
            LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                public final String run() {
                    return System.getProperty("line.separator");
                }
            });
        } catch (Exception unused) {
            try {
                LINE_SEPARATOR = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                LINE_SEPARATOR = "\n";
            }
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
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
            } else {
                i3 = (bArr[i3] & ISO7816.INS_CREATE_FILE) == 224 ? i3 + 3 : (bArr[i3] & ISO7816.INS_GET_RESPONSE) == 192 ? i3 + 2 : i3 + 1;
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

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    public static StringList newList() {
        return new StringListImpl();
    }

    public static String[] split(String str, char c) {
        Vector vector = new Vector();
        boolean z = true;
        while (z) {
            int indexOf = str.indexOf(c);
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

    public static int toByteArray(String str, byte[] bArr, int i) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
        return length;
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static String toLowerCase(String str) {
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

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) throws IOException {
        char c;
        int i;
        char c2;
        int i2;
        int i3;
        int i4 = 0;
        while (i4 < cArr.length) {
            char c3 = cArr[i4];
            if (c3 < 128) {
                c = c3;
            } else {
                if (c3 < 2048) {
                    i = (c3 >> 6) | 192;
                    c2 = c3;
                } else {
                    if (c3 < 55296 || c3 > 57343) {
                        i2 = (c3 >> 12) | PassportService.DEFAULT_MAX_BLOCKSIZE;
                        i3 = c3;
                    } else {
                        i4++;
                        if (i4 < cArr.length) {
                            char c4 = cArr[i4];
                            if (c3 <= 56319) {
                                i3 = (((c3 & 1023) << 10) | (c4 & 1023)) + 0;
                                outputStream.write((i3 >> 18) | 240);
                                i2 = ((i3 >> 12) & 63) | 128;
                            } else {
                                throw new IllegalStateException("invalid UTF-16 codepoint");
                            }
                        } else {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                    }
                    outputStream.write(i2);
                    i = ((i3 >> 6) & 63) | 128;
                    c2 = i3;
                }
                outputStream.write(i);
                c = (c2 & true) | true;
            }
            outputStream.write(c);
            i4++;
        }
    }

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
