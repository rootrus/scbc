package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

public final class zzhk implements Serializable {
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Pattern zzzm = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private final long value;
    private final boolean zzzn;
    private final int zzzo;

    public zzhk(long j) {
        this(false, 0, (Integer) null);
    }

    private zzhk(boolean z, long j, Integer num) {
        int i;
        this.zzzn = z;
        this.value = j;
        if (z) {
            i = 0;
        } else {
            i = num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
        }
        this.zzzo = i;
    }

    public final String zzhe() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.setTimeInMillis(this.value + (((long) this.zzzo) * 60000));
        zza(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        zza(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        zza(sb, gregorianCalendar.get(5), 2);
        if (!this.zzzn) {
            sb.append('T');
            zza(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            zza(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            zza(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                zza(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.zzzo;
            if (i == 0) {
                sb.append(Matrix.MATRIX_TYPE_ZERO);
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                zza(sb, i / 60, 2);
                sb.append(':');
                zza(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return zzhe();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhk)) {
            return false;
        }
        zzhk zzhk = (zzhk) obj;
        return this.zzzn == zzhk.zzzn && this.value == zzhk.value && this.zzzo == zzhk.zzzo;
    }

    public final int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.value;
        jArr[1] = this.zzzn ? 1 : 0;
        jArr[2] = (long) this.zzzo;
        return Arrays.hashCode(jArr);
    }

    public static zzhk zzap(String str) throws NumberFormatException {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Matcher matcher = zzzm.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new NumberFormatException(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "));
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2));
        int parseInt3 = Integer.parseInt(matcher.group(3));
        boolean z2 = matcher.group(4) != null;
        String group = matcher.group(9);
        boolean z3 = group != null;
        Integer num = null;
        if (!z3 || z2) {
            if (z2) {
                int parseInt4 = Integer.parseInt(matcher.group(5));
                int parseInt5 = Integer.parseInt(matcher.group(6));
                int parseInt6 = Integer.parseInt(matcher.group(7));
                if (matcher.group(8) != null) {
                    z = z2;
                    i4 = parseInt2;
                    i5 = (int) (((double) ((float) Integer.parseInt(matcher.group(8).substring(1)))) / Math.pow(10.0d, (double) (matcher.group(8).substring(1).length() - 3)));
                } else {
                    i4 = parseInt2;
                    z = z2;
                    i5 = 0;
                }
                i2 = parseInt5;
                i = parseInt6;
                i3 = parseInt4;
            } else {
                i4 = parseInt2;
                z = z2;
                i5 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
            gregorianCalendar.set(parseInt, i4 - 1, parseInt3, i3, i2, i);
            gregorianCalendar.set(14, i5);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (z && z3) {
                if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                    i6 = 0;
                } else {
                    int parseInt7 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                    i6 = matcher.group(10).charAt(0) == '-' ? -parseInt7 : parseInt7;
                    timeInMillis -= ((long) i6) * 60000;
                }
                num = Integer.valueOf(i6);
            }
            return new zzhk(!z, timeInMillis, num);
        }
        String valueOf2 = String.valueOf(str);
        throw new NumberFormatException(valueOf2.length() != 0 ? "Invalid date/time format, cannot specify time zone shift without specifying time: ".concat(valueOf2) : new String("Invalid date/time format, cannot specify time zone shift without specifying time: "));
    }

    private static void zza(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }
}
