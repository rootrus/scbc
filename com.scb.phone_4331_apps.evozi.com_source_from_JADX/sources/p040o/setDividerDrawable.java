package p040o;

import android.os.Build;

/* renamed from: o.setDividerDrawable */
public class setDividerDrawable {
    public static boolean MediaBrowserCompat$ItemReceiver() {
        if (Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'Q' || Build.VERSION.CODENAME.charAt(0) > 'Z') {
            return false;
        }
        return true;
    }
}
