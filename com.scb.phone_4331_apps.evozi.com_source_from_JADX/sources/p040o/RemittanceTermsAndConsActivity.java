package p040o;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: o.RemittanceTermsAndConsActivity */
public final class RemittanceTermsAndConsActivity {
    private static final String[] IconCompatParcelizer = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private static final Date MediaBrowserCompat$CustomActionResultReceiver;
    private static TimeZone MediaBrowserCompat$ItemReceiver = TimeZone.getTimeZone("GMT");

    static {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(MediaBrowserCompat$ItemReceiver);
        instance.set(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        MediaBrowserCompat$CustomActionResultReceiver = instance.getTime();
    }

    /* renamed from: o.RemittanceTermsAndConsActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> MediaBrowserCompat$CustomActionResultReceiver = new ThreadLocal<>();

        IconCompatParcelizer() {
        }

        public static SimpleDateFormat write(String str) {
            Map map;
            SoftReference softReference = MediaBrowserCompat$CustomActionResultReceiver.get();
            if (softReference == null) {
                map = null;
            } else {
                map = (Map) softReference.get();
            }
            if (map == null) {
                map = new HashMap();
                MediaBrowserCompat$CustomActionResultReceiver.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }

    public static Date write(String str, String[] strArr) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Date value");
        if (strArr == null) {
            strArr = IconCompatParcelizer;
        }
        Date date = MediaBrowserCompat$CustomActionResultReceiver;
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String write : strArr) {
            SimpleDateFormat write2 = IconCompatParcelizer.write(write);
            write2.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = write2.parse(str, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return parse;
            }
        }
        return null;
    }
}
