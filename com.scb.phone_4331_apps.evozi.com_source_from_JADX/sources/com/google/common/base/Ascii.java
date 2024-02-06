package com.google.common.base;

public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;

    /* renamed from: BS */
    public static final byte f3246BS = 8;
    public static final byte CAN = 24;

    /* renamed from: CR */
    public static final byte f3247CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = Byte.MAX_VALUE;
    public static final byte DLE = 16;

    /* renamed from: EM */
    public static final byte f3248EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;

    /* renamed from: FF */
    public static final byte f3249FF = 12;

    /* renamed from: FS */
    public static final byte f3250FS = 28;

    /* renamed from: GS */
    public static final byte f3251GS = 29;

    /* renamed from: HT */
    public static final byte f3252HT = 9;

    /* renamed from: LF */
    public static final byte f3253LF = 10;
    public static final int MAX = 127;
    public static final int MIN = 0;
    public static final byte NAK = 21;

    /* renamed from: NL */
    public static final byte f3254NL = 10;
    public static final byte NUL = 0;

    /* renamed from: RS */
    public static final byte f3255RS = 30;

    /* renamed from: SI */
    public static final byte f3256SI = 15;

    /* renamed from: SO */
    public static final byte f3257SO = 14;
    public static final byte SOH = 1;

    /* renamed from: SP */
    public static final byte f3258SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;

    /* renamed from: US */
    public static final byte f3259US = 31;

    /* renamed from: VT */
    public static final byte f3260VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private Ascii() {
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(toLowerCase(str.charAt(i)));
        }
        return sb.toString();
    }

    public static char toLowerCase(char c) {
        return isUpperCase(c) ? (char) (c ^ ' ') : c;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(toUpperCase(str.charAt(i)));
        }
        return sb.toString();
    }

    public static char toUpperCase(char c) {
        return isLowerCase(c) ? (char) (c & '_') : c;
    }
}
