package p040o;

import java.util.regex.Pattern;

/* renamed from: o.GiftingSelectRecipientActivity */
public final class GiftingSelectRecipientActivity {
    private static final Pattern MediaBrowserCompat$CustomActionResultReceiver = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
    private static final Pattern MediaBrowserCompat$ItemReceiver = Pattern.compile("^(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    private static final Pattern read = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");

    static {
        Pattern.compile("^::[fF]{4}:(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    }

    public static boolean read(String str) {
        return MediaBrowserCompat$ItemReceiver.matcher(str).matches();
    }

    public static boolean IconCompatParcelizer(String str) {
        if (MediaBrowserCompat$CustomActionResultReceiver.matcher(str).matches()) {
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ':') {
                i++;
            }
        }
        if (!(i <= 7 && read.matcher(str).matches())) {
            return false;
        }
        return true;
    }
}
