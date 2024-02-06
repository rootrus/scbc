package okhttp3.repackaged.internal.tls;

import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.repackaged.internal.tls.a */
final class C10280a {
    private final String amT;
    private int amU;
    private int amV;
    private char[] chars;
    private int end;
    private final int length;
    private int pos;

    public C10280a(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.amT = name;
        this.length = name.length();
    }

    /* renamed from: vo */
    private String m6179vo() {
        while (true) {
            int i = this.pos;
            if (i >= this.length || this.chars[i] != ' ') {
                int i2 = this.pos;
            } else {
                this.pos = i + 1;
            }
        }
        int i22 = this.pos;
        if (i22 == this.length) {
            return null;
        }
        this.amU = i22;
        this.pos = i22 + 1;
        while (true) {
            int i3 = this.pos;
            if (i3 >= this.length) {
                break;
            }
            char[] cArr = this.chars;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.pos = i3 + 1;
        }
        int i4 = this.pos;
        if (i4 < this.length) {
            this.end = i4;
            if (this.chars[i4] == ' ') {
                while (true) {
                    int i5 = this.pos;
                    if (i5 >= this.length) {
                        break;
                    }
                    char[] cArr2 = this.chars;
                    if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                        break;
                    }
                    this.pos = i5 + 1;
                }
                char[] cArr3 = this.chars;
                int i6 = this.pos;
                if (cArr3[i6] != '=' || i6 == this.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected end of DN: ");
                    sb.append(this.amT);
                    throw new IllegalStateException(sb.toString());
                }
            }
            this.pos++;
            while (true) {
                int i7 = this.pos;
                if (i7 >= this.length || this.chars[i7] != ' ') {
                    int i8 = this.end;
                    int i9 = this.amU;
                } else {
                    this.pos = i7 + 1;
                }
            }
            int i82 = this.end;
            int i92 = this.amU;
            if (i82 - i92 > 4) {
                char[] cArr4 = this.chars;
                if (cArr4[i92 + 3] == '.' && (cArr4[i92] == 'O' || cArr4[i92] == 'o')) {
                    char[] cArr5 = this.chars;
                    int i10 = this.amU + 1;
                    if (cArr5[i10] == 'I' || cArr5[i10] == 'i') {
                        char[] cArr6 = this.chars;
                        int i11 = this.amU + 2;
                        if (cArr6[i11] == 'D' || cArr6[i11] == 'd') {
                            this.amU += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.chars;
            int i12 = this.amU;
            return new String(cArr7, i12, this.end - i12);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected end of DN: ");
        sb2.append(this.amT);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: vp */
    private String m6180vp() {
        int i = this.pos + 1;
        this.pos = i;
        this.amU = i;
        this.end = i;
        while (true) {
            int i2 = this.pos;
            if (i2 != this.length) {
                char[] cArr = this.chars;
                if (cArr[i2] == '\"') {
                    this.pos = i2 + 1;
                    while (true) {
                        int i3 = this.pos;
                        if (i3 >= this.length || this.chars[i3] != ' ') {
                            char[] cArr2 = this.chars;
                            int i4 = this.amU;
                        } else {
                            this.pos = i3 + 1;
                        }
                    }
                    char[] cArr22 = this.chars;
                    int i42 = this.amU;
                    return new String(cArr22, i42, this.end - i42);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.end] = m6183vs();
                } else {
                    cArr[this.end] = cArr[i2];
                }
                this.pos++;
                this.end++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected end of DN: ");
                sb.append(this.amT);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: vq */
    private String m6181vq() {
        int i = this.pos;
        if (i + 4 < this.length) {
            this.amU = i;
            this.pos = i + 1;
            while (true) {
                int i2 = this.pos;
                if (i2 == this.length) {
                    break;
                }
                char[] cArr = this.chars;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.end = i2;
                    this.pos = i2 + 1;
                    while (true) {
                        int i3 = this.pos;
                        if (i3 >= this.length || this.chars[i3] != ' ') {
                            break;
                        }
                        this.pos = i3 + 1;
                    }
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    this.pos++;
                }
            }
            this.end = this.pos;
            int i4 = this.end;
            int i5 = this.amU;
            int i6 = i4 - i5;
            if (i6 < 5 || (i6 & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected end of DN: ");
                sb.append(this.amT);
                throw new IllegalStateException(sb.toString());
            }
            int i7 = i6 / 2;
            byte[] bArr = new byte[i7];
            int i8 = i5 + 1;
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i9] = (byte) m6178Q(i8);
                i8 += 2;
            }
            return new String(this.chars, this.amU, i6);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected end of DN: ");
        sb2.append(this.amT);
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r0 = r8.chars;
        r1 = r8.amU;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        return new java.lang.String(r0, r1, r8.amV - r1);
     */
    /* renamed from: vr */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m6182vr() {
        /*
            r8 = this;
            int r0 = r8.pos
            r8.amU = r0
            r8.end = r0
        L_0x0006:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 < r1) goto L_0x0019
            char[] r0 = r8.chars
            int r1 = r8.amU
            java.lang.String r2 = new java.lang.String
            int r3 = r8.end
            int r3 = r3 - r1
            r2.<init>(r0, r1, r3)
            return r2
        L_0x0019:
            char[] r1 = r8.chars
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x0060
            if (r2 == r5) goto L_0x0053
            r5 = 92
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0053
            if (r2 == r3) goto L_0x0053
            int r2 = r8.end
            int r3 = r2 + 1
            r8.end = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.pos = r0
            goto L_0x0006
        L_0x0040:
            int r0 = r8.end
            int r2 = r0 + 1
            r8.end = r2
            char r2 = r8.m6183vs()
            r1[r0] = r2
            int r0 = r8.pos
            int r0 = r0 + 1
            r8.pos = r0
            goto L_0x0006
        L_0x0053:
            char[] r0 = r8.chars
            int r1 = r8.amU
            java.lang.String r2 = new java.lang.String
            int r3 = r8.end
            int r3 = r3 - r1
            r2.<init>(r0, r1, r3)
            return r2
        L_0x0060:
            int r2 = r8.end
            r8.amV = r2
            int r0 = r0 + 1
            r8.pos = r0
            int r0 = r2 + 1
            r8.end = r0
            r1[r2] = r6
        L_0x006e:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 >= r1) goto L_0x0087
            char[] r1 = r8.chars
            char r2 = r1[r0]
            if (r2 != r6) goto L_0x0087
            int r2 = r8.end
            int r7 = r2 + 1
            r8.end = r7
            r1[r2] = r6
            int r0 = r0 + 1
            r8.pos = r0
            goto L_0x006e
        L_0x0087:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 == r1) goto L_0x009b
            char[] r1 = r8.chars
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x009b
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x009b
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x009b:
            char[] r0 = r8.chars
            int r1 = r8.amU
            java.lang.String r2 = new java.lang.String
            int r3 = r8.amV
            int r3 = r3 - r1
            r2.<init>(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.tls.C10280a.m6182vr():java.lang.String");
    }

    /* renamed from: vs */
    private char m6183vs() {
        int i = this.pos + 1;
        this.pos = i;
        if (i != this.length) {
            char c = this.chars[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return m6184vt();
                        }
                }
            }
            return this.chars[this.pos];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected end of DN: ");
        sb.append(this.amT);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: vt */
    private char m6184vt() {
        int i;
        int i2;
        int Q = m6178Q(this.pos);
        this.pos++;
        if (Q < 128) {
            return (char) Q;
        }
        if (Q < 192 || Q > 247) {
            return '?';
        }
        if (Q <= 223) {
            i2 = Q & 31;
            i = 1;
        } else if (Q <= 239) {
            i = 2;
            i2 = Q & 15;
        } else {
            i = 3;
            i2 = Q & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.pos + 1;
            this.pos = i4;
            if (i4 == this.length || this.chars[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.pos = i5;
            int Q2 = m6178Q(i5);
            this.pos++;
            if ((Q2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (Q2 & 63);
        }
        return (char) i2;
    }

    /* renamed from: Q */
    private int m6178Q(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.length) {
            char c = this.chars[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed DN: ");
                sb.append(this.amT);
                throw new IllegalStateException(sb.toString());
            } else {
                i2 = c - '7';
            }
            char c2 = this.chars[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Malformed DN: ");
                sb2.append(this.amT);
                throw new IllegalStateException(sb2.toString());
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Malformed DN: ");
        sb3.append(this.amT);
        throw new IllegalStateException(sb3.toString());
    }

    public final String findMostSpecific(String str) {
        String str2;
        this.pos = 0;
        this.amU = 0;
        this.end = 0;
        this.amV = 0;
        this.chars = this.amT.toCharArray();
        String vo = m6179vo();
        if (vo == null) {
            return null;
        }
        do {
            int i = this.pos;
            if (i == this.length) {
                return null;
            }
            char c = this.chars[i];
            if (c != '\"') {
                str2 = c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : m6182vr() : m6181vq();
            } else {
                str2 = m6180vp();
            }
            if (str.equalsIgnoreCase(vo)) {
                return str2;
            }
            int i2 = this.pos;
            if (i2 >= this.length) {
                return null;
            }
            char[] cArr = this.chars;
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.pos++;
                vo = m6179vo();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed DN: ");
                sb.append(this.amT);
                throw new IllegalStateException(sb.toString());
            }
        } while (vo != null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Malformed DN: ");
        sb2.append(this.amT);
        throw new IllegalStateException(sb2.toString());
    }
}
