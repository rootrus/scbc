package p040o;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* renamed from: o.setThumbDrawable */
public final class setThumbDrawable {
    public static boolean MediaBrowserCompat$ItemReceiver(AccessibilityManager accessibilityManager, setThumbDrawable$MediaBrowserCompat$CustomActionResultReceiver setthumbdrawable_mediabrowsercompat_customactionresultreceiver) {
        if (Build.VERSION.SDK_INT < 19 || setthumbdrawable_mediabrowsercompat_customactionresultreceiver == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new write(setthumbdrawable_mediabrowsercompat_customactionresultreceiver));
    }

    public static boolean write(AccessibilityManager accessibilityManager, setThumbDrawable$MediaBrowserCompat$CustomActionResultReceiver setthumbdrawable_mediabrowsercompat_customactionresultreceiver) {
        if (Build.VERSION.SDK_INT < 19 || setthumbdrawable_mediabrowsercompat_customactionresultreceiver == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new write(setthumbdrawable_mediabrowsercompat_customactionresultreceiver));
    }

    /* renamed from: o.setThumbDrawable$write */
    static class write implements AccessibilityManager.TouchExplorationStateChangeListener {
        final setThumbDrawable$MediaBrowserCompat$CustomActionResultReceiver read;

        write(setThumbDrawable$MediaBrowserCompat$CustomActionResultReceiver setthumbdrawable_mediabrowsercompat_customactionresultreceiver) {
            this.read = setthumbdrawable_mediabrowsercompat_customactionresultreceiver;
        }

        public int hashCode() {
            return this.read.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.read.equals(((write) obj).read);
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.read.MediaBrowserCompat$ItemReceiver(z);
        }
    }
}
