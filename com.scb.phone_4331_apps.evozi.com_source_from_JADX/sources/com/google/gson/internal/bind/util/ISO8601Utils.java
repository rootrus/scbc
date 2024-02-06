package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);
    private static final String UTC_ID = "UTC";

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder((z ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        char c = '-';
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            if (offset >= 0) {
                c = '+';
            }
            sb.append(c);
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        } else {
            sb.append(Matrix.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cb A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b0 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date parse(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r3 = r0 + 4
            int r0 = parseInt(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r4 = 45
            boolean r5 = checkOffset(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = parseInt(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            boolean r6 = checkOffset(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = parseInt(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r7 = 84
            boolean r7 = checkOffset(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00be
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = parseInt(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r13 = 58
            boolean r14 = checkOffset(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = parseInt(r1, r7, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            boolean r13 = checkOffset(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r13 <= r14) goto L_0x00ba
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r13 == r10) goto L_0x00ba
            if (r13 == r9) goto L_0x00ba
            if (r13 == r4) goto L_0x00ba
            int r13 = r14 + 2
            int r14 = parseInt(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = checkOffset(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r15 == 0) goto L_0x00b8
            int r13 = r13 + 1
            int r15 = r13 + 1
            int r15 = indexOfNonDigit(r1, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r11 = r13 + 3
            int r11 = java.lang.Math.min(r15, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r16 = parseInt(r1, r13, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r11 = r11 - r13
            if (r11 == r8) goto L_0x00b2
            if (r11 != r12) goto L_0x00b4
            int r16 = r16 * 10
            goto L_0x00b4
        L_0x00b2:
            int r16 = r16 * 100
        L_0x00b4:
            r13 = r15
            r11 = r16
            goto L_0x00c5
        L_0x00b8:
            r11 = 0
            goto L_0x00c5
        L_0x00ba:
            r11 = r7
            r7 = r6
            r6 = r14
            goto L_0x00c0
        L_0x00be:
            r7 = 0
            r11 = 0
        L_0x00c0:
            r13 = r6
            r6 = r7
            r7 = r11
            r11 = 0
            r14 = 0
        L_0x00c5:
            int r15 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r15 <= r13) goto L_0x01b0
            char r15 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r12 = 5
            if (r15 != r10) goto L_0x00d7
            java.util.TimeZone r4 = TIMEZONE_UTC     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r13 = r13 + r8
            goto L_0x017f
        L_0x00d7:
            if (r15 == r9) goto L_0x00f8
            if (r15 != r4) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r3.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
        L_0x00f8:
            java.lang.String r4 = r1.substring(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r9 < r12) goto L_0x0103
            goto L_0x0114
        L_0x0103:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r4 = "00"
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
        L_0x0114:
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r13 = r13 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r9 != 0) goto L_0x017d
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r9 == 0) goto L_0x012a
            goto L_0x017d
        L_0x012a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r10 = "GMT"
            r9.append(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r10 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            boolean r15 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r15 != 0) goto L_0x017b
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r10 = r10.replace(r15, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            boolean r10 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            if (r10 == 0) goto L_0x0158
            goto L_0x017b
        L_0x0158:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r4 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
        L_0x017b:
            r4 = r9
            goto L_0x017f
        L_0x017d:
            java.util.TimeZone r4 = TIMEZONE_UTC     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
        L_0x017f:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r9.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r9.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r0 = 11
            r9.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r0 = 13
            r9.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r0 = 14
            r9.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            r2.setIndex(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            return r0
        L_0x01b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01bc, NumberFormatException -> 0x01ba, IllegalArgumentException -> 0x01b8 }
        L_0x01b8:
            r0 = move-exception
            goto L_0x01bd
        L_0x01ba:
            r0 = move-exception
            goto L_0x01bd
        L_0x01bc:
            r0 = move-exception
        L_0x01bd:
            if (r1 != 0) goto L_0x01c1
            r1 = 0
            goto L_0x01d5
        L_0x01c1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01d5:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01e1
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01ff
        L_0x01e1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01ff:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to parse date ["
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = "]: "
            r4.append(r1)
            r4.append(r3)
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.String r3 = r4.toString()
            int r2 = r18.getIndex()
            r1.<init>(r3, r2)
            r1.initCause(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4++;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
        }
        return -i3;
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
