package p040o;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.setDrawerListener */
class setDrawerListener extends setChildInsets {
    private static boolean MediaBrowserCompat$ItemReceiver;
    private static Method read;

    setDrawerListener() {
    }

    public void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        MediaBrowserCompat$ItemReceiver();
        Method method = read;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (!MediaBrowserCompat$ItemReceiver) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                read = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            MediaBrowserCompat$ItemReceiver = true;
        }
    }
}
