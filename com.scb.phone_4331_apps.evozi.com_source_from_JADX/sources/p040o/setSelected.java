package p040o;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: o.setSelected */
public final class setSelected {
    private static final Locale write = new Locale("", "");

    public static int MediaBrowserCompat$ItemReceiver(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(write)) {
            return 0;
        }
        String write2 = ScrollingTabContainerView.write(locale);
        if (write2 == null) {
            return IconCompatParcelizer(locale);
        }
        return (write2.equalsIgnoreCase("Arab") || write2.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }

    private static int IconCompatParcelizer(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
