package p040o;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.LoanInputActivity_ViewBinding */
public class LoanInputActivity_ViewBinding extends LoanPaymentReviewActivity {
    public static final Integer read(String str) {
        onGetStartedClick.write((Object) str, "$this$toIntOrNull");
        return GoodToKnowActivity.write(str);
    }

    public static final Integer write(String str) {
        int i;
        int i2;
        onGetStartedClick.write((Object) str, "$this$toIntOrNull");
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        boolean z = true;
        if (charAt >= '0') {
            i = 0;
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = PKIFailureInfo.systemUnavail;
                i = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                i = 1;
                z = false;
            }
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static final Long MediaBrowserCompat$MediaItem(String str) {
        String str2 = str;
        onGetStartedClick.write((Object) str2, "$this$toLongOrNull");
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        boolean z = true;
        if (charAt >= '0') {
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i = 1;
            }
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        long j4 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit(str2.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j4) {
                if (j4 == j3) {
                    j4 = j / 10;
                    if (j2 < j4) {
                    }
                }
                return null;
            }
            long j5 = j2 * 10;
            long j6 = (long) digit;
            if (j5 < j + j6) {
                return null;
            }
            j2 = j5 - j6;
            i++;
            j3 = -256204778801521550L;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
