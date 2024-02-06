package p040o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: o.setIconifiedByDefault$MediaBrowserCompat$CustomActionResultReceiver */
final class C1493x3a2d1167 extends View.AccessibilityDelegate {
    private final setIconifiedByDefault MediaBrowserCompat$CustomActionResultReceiver;

    C1493x3a2d1167(setIconifiedByDefault seticonifiedbydefault) {
        this.MediaBrowserCompat$CustomActionResultReceiver = seticonifiedbydefault;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.read(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(view, setTextOn.MediaBrowserCompat$CustomActionResultReceiver(accessibilityNodeInfo));
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.MediaBrowserCompat$CustomActionResultReceiver.write(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(viewGroup, view, accessibilityEvent);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        setThumbTintList MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(view);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return (AccessibilityNodeProvider) MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return null;
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(view, i, bundle);
    }
}
