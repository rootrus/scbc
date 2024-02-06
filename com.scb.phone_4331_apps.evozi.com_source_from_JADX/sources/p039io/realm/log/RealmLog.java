package p039io.realm.log;

import android.util.Log;
import java.util.Locale;

/* renamed from: io.realm.log.RealmLog */
public final class RealmLog {
    private static String read = "REALM_JAVA";

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i, String str, Throwable th, String str2);

    public static void MediaBrowserCompat$CustomActionResultReceiver(Throwable th, String str, Object... objArr) {
        MediaBrowserCompat$CustomActionResultReceiver(6, th, str, objArr);
    }

    public static void MediaBrowserCompat$ItemReceiver(String str, Object... objArr) {
        MediaBrowserCompat$CustomActionResultReceiver(6, (Throwable) null, str, objArr);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(String str, Object... objArr) {
        MediaBrowserCompat$CustomActionResultReceiver(7, (Throwable) null, str, objArr);
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(int i, Throwable th, String str, Object... objArr) {
        if (i >= nativeGetLogLevel()) {
            StringBuilder sb = new StringBuilder();
            if (!(str == null || objArr == null || objArr.length <= 0)) {
                str = String.format(Locale.US, str, objArr);
            }
            if (th != null) {
                sb.append(Log.getStackTraceString(th));
            }
            if (str != null) {
                if (th != null) {
                    sb.append("\n");
                }
                sb.append(str);
            }
            nativeLog(i, read, th, sb.toString());
        }
    }

    public static void IconCompatParcelizer(String str, Object... objArr) {
        MediaBrowserCompat$CustomActionResultReceiver(5, (Throwable) null, str, objArr);
    }
}
