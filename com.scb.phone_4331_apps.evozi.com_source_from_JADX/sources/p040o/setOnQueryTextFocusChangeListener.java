package p040o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: o.setOnQueryTextFocusChangeListener */
public final class setOnQueryTextFocusChangeListener {
    public static MenuItem write(MenuItem menuItem, setMaxWidth setmaxwidth) {
        if (menuItem instanceof setGravity) {
            return ((setGravity) menuItem).MediaBrowserCompat$CustomActionResultReceiver(setmaxwidth);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof setGravity) {
            ((setGravity) menuItem).MediaBrowserCompat$ItemReceiver(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof setGravity) {
            ((setGravity) menuItem).IconCompatParcelizer(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    public static void write(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof setGravity) {
            ((setGravity) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    public static void read(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof setGravity) {
            ((setGravity) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    public static void IconCompatParcelizer(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof setGravity) {
            ((setGravity) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof setGravity) {
            ((setGravity) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
