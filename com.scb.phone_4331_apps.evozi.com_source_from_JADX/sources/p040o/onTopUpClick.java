package p040o;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.onTopUpClick */
public final class onTopUpClick {
    private static final Pattern IconCompatParcelizer = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");
    private static final TimeZone MediaBrowserCompat$CustomActionResultReceiver = new PrepaidMenuActivity(false, 0, 0);

    public static TimeZone write() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static TimeZone read(String str) {
        int i;
        int i2;
        if ("Z".equals(str) || "UTC".equals(str)) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        Matcher matcher = IconCompatParcelizer.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(2);
        boolean z = false;
        if (group != null) {
            i = Integer.parseInt(group);
        } else {
            i = 0;
        }
        String group2 = matcher.group(4);
        if (group2 != null) {
            i2 = Integer.parseInt(group2);
        } else {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        String group3 = matcher.group(1);
        if (group3 != null && group3.charAt(0) == '-') {
            z = true;
        }
        return new PrepaidMenuActivity(z, i, i2);
    }
}
