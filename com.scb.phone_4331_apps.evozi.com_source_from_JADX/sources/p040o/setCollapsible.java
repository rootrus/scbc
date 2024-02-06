package p040o;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: o.setCollapsible */
public final class setCollapsible {
    private static boolean IconCompatParcelizer;
    private static boolean MediaBrowserCompat$CustomActionResultReceiver;
    private static Field read;
    private static Method write;

    public static void MediaBrowserCompat$ItemReceiver(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i3, SwitchCompat.m3079x50fd9e4a(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (Build.VERSION.SDK_INT >= 21) {
            if (!MediaBrowserCompat$CustomActionResultReceiver) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    read = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                MediaBrowserCompat$CustomActionResultReceiver = true;
            }
            Field field = read;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    public static void write(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!IconCompatParcelizer) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                write = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            IconCompatParcelizer = true;
        }
        Method method = write;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }
}
