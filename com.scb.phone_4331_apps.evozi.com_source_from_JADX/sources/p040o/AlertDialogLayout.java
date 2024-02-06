package p040o;

import java.util.HashMap;
import p040o.ActivityChooserView;

/* renamed from: o.AlertDialogLayout */
public final class AlertDialogLayout<K, V> extends ActivityChooserView.InnerLayout<K, V> {
    public HashMap<K, ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V>> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>();

    /* access modifiers changed from: protected */
    public final ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> IconCompatParcelizer(K k) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(k);
    }

    public final V read(K k) {
        V read = super.read(k);
        this.MediaBrowserCompat$CustomActionResultReceiver.remove(k);
        return read;
    }

    public final V IconCompatParcelizer(K k, V v) {
        ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get(k);
        if (activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver != null) {
            return activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.put(k, read(k, v));
        return null;
    }
}
