package p040o;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p040o.AppCompatMultiAutoCompleteTextView;

/* renamed from: o.DrawerLayout */
class DrawerLayout extends AppCompatMultiAutoCompleteTextView.read {
    private static boolean IconCompatParcelizer;
    private static Method MediaBrowserCompat$CustomActionResultReceiver;
    private static Method read;
    private static boolean write;

    public void MediaBrowserCompat$ItemReceiver(View view) {
    }

    public void write(View view) {
    }

    DrawerLayout() {
    }

    public void write(View view, float f) {
        MediaBrowserCompat$ItemReceiver();
        Method method = MediaBrowserCompat$CustomActionResultReceiver;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    public float IconCompatParcelizer(View view) {
        write();
        Method method = read;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.IconCompatParcelizer(view);
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (!IconCompatParcelizer) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                MediaBrowserCompat$CustomActionResultReceiver = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            IconCompatParcelizer = true;
        }
    }

    private void write() {
        if (!write) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                read = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            write = true;
        }
    }
}
