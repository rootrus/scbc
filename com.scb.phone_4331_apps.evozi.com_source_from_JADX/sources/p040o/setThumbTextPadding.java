package p040o;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: o.setThumbTextPadding */
public final class setThumbTextPadding {
    public static void MediaBrowserCompat$CustomActionResultReceiver(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static int read(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }
}
