package p040o;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.setChildInsets */
class setChildInsets extends DrawerLayout {
    private static Method IconCompatParcelizer;
    private static boolean MediaBrowserCompat$ItemReceiver;
    private static Method read;
    private static boolean write;

    setChildInsets() {
    }

    public void read(View view, Matrix matrix) {
        write();
        Method method = IconCompatParcelizer;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public void MediaBrowserCompat$ItemReceiver(View view, Matrix matrix) {
        IconCompatParcelizer();
        Method method = read;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    private void write() {
        if (!MediaBrowserCompat$ItemReceiver) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                IconCompatParcelizer = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            MediaBrowserCompat$ItemReceiver = true;
        }
    }

    private void IconCompatParcelizer() {
        if (!write) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                read = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            write = true;
        }
    }
}
