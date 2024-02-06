package p040o;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.setAdapter$MediaBrowserCompat$ItemReceiver */
class setAdapter$MediaBrowserCompat$ItemReceiver {
    private static Method MediaBrowserCompat$CustomActionResultReceiver;
    private static boolean MediaBrowserCompat$ItemReceiver;

    public static IBinder write(Bundle bundle, String str) {
        if (!MediaBrowserCompat$ItemReceiver) {
            try {
                Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                MediaBrowserCompat$CustomActionResultReceiver = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
            }
            MediaBrowserCompat$ItemReceiver = true;
        }
        Method method2 = MediaBrowserCompat$CustomActionResultReceiver;
        if (method2 != null) {
            try {
                return (IBinder) method2.invoke(bundle, new Object[]{str});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                MediaBrowserCompat$CustomActionResultReceiver = null;
            }
        }
        return null;
    }
}
