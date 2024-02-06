package p040o;

/* renamed from: o.rsnAllocationResize2D */
public abstract class rsnAllocationResize2D {
    private static final ThreadLocal<char[]> IconCompatParcelizer = new ThreadLocal<char[]>() {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new char[1024];
        }
    };

    /* access modifiers changed from: protected */
    public abstract char[] read(int i);

    /* access modifiers changed from: protected */
    public int write(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int read = read(charSequence, i, i2);
            if (read < 0 || read(read) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(read) ? 2 : 1;
        }
        return i;
    }

    public String write(String str) {
        int length = str.length();
        int write = write(str, 0, length);
        return write != length ? write(str, write) : str;
    }

    /* access modifiers changed from: protected */
    public final String write(String str, int i) {
        int length = str.length();
        char[] cArr = IconCompatParcelizer.get();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int read = read(str, i, length);
            if (read >= 0) {
                char[] read2 = read(read);
                if (read2 != null) {
                    int i4 = i - i2;
                    int i5 = i3 + i4;
                    int length2 = read2.length + i5;
                    if (cArr.length < length2) {
                        char[] cArr2 = new char[(length2 + (length - i) + 32)];
                        if (i3 > 0) {
                            System.arraycopy(cArr, 0, cArr2, 0, i3);
                        }
                        cArr = cArr2;
                    }
                    if (i4 > 0) {
                        str.getChars(i2, i, cArr, i3);
                        i3 = i5;
                    }
                    if (read2.length > 0) {
                        System.arraycopy(read2, 0, cArr, i3, read2.length);
                        i3 += read2.length;
                    }
                }
                i2 = (Character.isSupplementaryCodePoint(read) ? 2 : 1) + i;
                i = write(str, i2, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i6 = length - i2;
        if (i6 > 0) {
            int i7 = i6 + i3;
            if (cArr.length < i7) {
                char[] cArr3 = new char[i7];
                if (i3 > 0) {
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                }
                cArr = cArr3;
            }
            str.getChars(i2, length, cArr, i3);
            i3 = i7;
        }
        return new String(cArr, 0, i3);
    }

    private static int read(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append(charAt);
                sb.append(" at index ");
                sb.append(i3 - 1);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected low surrogate but got char '");
                sb2.append(charAt2);
                sb2.append("' with value ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }
}
