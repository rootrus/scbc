package p040o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: o.setTrackDrawable */
public final class setTrackDrawable {
    private static boolean MediaBrowserCompat$CustomActionResultReceiver;
    private static Field write;

    public static void write(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof setNavigationOnClickListener) {
            ((setNavigationOnClickListener) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof setNavigationOnClickListener) {
            ((setNavigationOnClickListener) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    public static Drawable MediaBrowserCompat$CustomActionResultReceiver(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!MediaBrowserCompat$CustomActionResultReceiver) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                write = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        Field field = write;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                write = null;
            }
        }
        return null;
    }
}
