package p040o;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: o.setThumbResource */
public class setThumbResource {
    private final AccessibilityRecord read;

    public static void MediaBrowserCompat$CustomActionResultReceiver(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    public static void write(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.read;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setThumbResource setthumbresource = (setThumbResource) obj;
        AccessibilityRecord accessibilityRecord = this.read;
        if (accessibilityRecord == null) {
            if (setthumbresource.read != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(setthumbresource.read)) {
            return false;
        }
        return true;
    }
}
