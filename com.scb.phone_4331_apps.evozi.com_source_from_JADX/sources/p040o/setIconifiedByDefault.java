package p040o;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: o.setIconifiedByDefault */
public class setIconifiedByDefault {
    private static final View.AccessibilityDelegate read = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate IconCompatParcelizer = new C1493x3a2d1167(this);

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
        read.sendAccessibilityEvent(view, i);
    }

    public void IconCompatParcelizer(View view, AccessibilityEvent accessibilityEvent) {
        read.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean read(View view, AccessibilityEvent accessibilityEvent) {
        return read.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void write(View view, AccessibilityEvent accessibilityEvent) {
        read.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(View view, AccessibilityEvent accessibilityEvent) {
        read.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void IconCompatParcelizer(View view, setTextOn settexton) {
        read.onInitializeAccessibilityNodeInfo(view, settexton.AppCompatDelegateImpl$ListMenuDecorView());
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return read.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public setThumbTintList MediaBrowserCompat$CustomActionResultReceiver(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = read.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new setThumbTintList(accessibilityNodeProvider);
    }

    public boolean MediaBrowserCompat$ItemReceiver(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return read.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }
}
