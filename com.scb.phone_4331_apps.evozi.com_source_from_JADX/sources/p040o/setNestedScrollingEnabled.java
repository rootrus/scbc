package p040o;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.setNestedScrollingEnabled */
public class setNestedScrollingEnabled {
    private static Method IconCompatParcelizer;
    private static boolean read;

    public static void MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup, boolean z) {
        MediaBrowserCompat$CustomActionResultReceiver();
        Method method = IconCompatParcelizer;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e);
            } catch (InvocationTargetException e2) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e2);
            }
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!read) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                IconCompatParcelizer = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            read = true;
        }
    }
}
