package p040o;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: o.AppCompatSpinner */
public final class AppCompatSpinner {
    public static String MediaBrowserCompat$ItemReceiver(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }

    public static int read(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }
}
