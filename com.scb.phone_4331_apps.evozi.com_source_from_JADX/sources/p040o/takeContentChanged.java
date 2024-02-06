package p040o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.takeContentChanged */
public final class takeContentChanged {
    private static final ConcurrentMap<String, isStateSaved> MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentHashMap();

    public static isStateSaved IconCompatParcelizer(Context context) {
        String str;
        String packageName = context.getPackageName();
        isStateSaved isstatesaved = (isStateSaved) MediaBrowserCompat$CustomActionResultReceiver.get(packageName);
        if (isstatesaved != null) {
            return isstatesaved;
        }
        PackageInfo read = read(context);
        if (read != null) {
            str = String.valueOf(read.versionCode);
        } else {
            str = UUID.randomUUID().toString();
        }
        unregisterListener unregisterlistener = new unregisterListener(str);
        isStateSaved putIfAbsent = MediaBrowserCompat$CustomActionResultReceiver.putIfAbsent(packageName, unregisterlistener);
        return putIfAbsent != null ? putIfAbsent : unregisterlistener;
    }

    private static PackageInfo read(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot resolve info for");
            sb.append(context.getPackageName());
            Log.e("AppVersionSignature", sb.toString(), e);
            return null;
        }
    }
}
