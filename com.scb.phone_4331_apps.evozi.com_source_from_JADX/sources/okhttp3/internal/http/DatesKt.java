package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.Util;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

public final class DatesKt {
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[15];
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    public static final long MAX_DATE = 253402300799999L;
    private static final DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = new DatesKt$STANDARD_DATE_FORMAT$1();

    public static final Date toHttpDateOrNull(String str) {
        onGetStartedClick.write((Object) str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) STANDARD_DATE_FORMAT.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS) {
            int length = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = BROWSER_COMPATIBLE_DATE_FORMATS[i];
                if (dateFormat == null) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
                    simpleDateFormat.setTimeZone(Util.UTC);
                    dateFormat = simpleDateFormat;
                    BROWSER_COMPATIBLE_DATE_FORMATS[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            return null;
        }
    }

    public static final String toHttpDateString(Date date) {
        onGetStartedClick.write((Object) date, "$this$toHttpDateString");
        String format = ((DateFormat) STANDARD_DATE_FORMAT.get()).format(date);
        onGetStartedClick.IconCompatParcelizer((Object) format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
