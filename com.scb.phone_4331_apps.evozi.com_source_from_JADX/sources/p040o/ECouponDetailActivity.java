package p040o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.ECouponDetailActivity */
public final class ECouponDetailActivity {
    private static final Pattern read = Pattern.compile("(.+?)(?=/\\w+\\*).*");

    public static boolean write(String str) {
        return str.contains("*");
    }

    public static String IconCompatParcelizer(String str) {
        Matcher matcher = read.matcher(str);
        if (!matcher.matches()) {
            return str;
        }
        return matcher.group(1);
    }

    public static Pattern MediaBrowserCompat$ItemReceiver(String str) {
        return Pattern.compile(str.replace("*", "\\d+"));
    }
}
