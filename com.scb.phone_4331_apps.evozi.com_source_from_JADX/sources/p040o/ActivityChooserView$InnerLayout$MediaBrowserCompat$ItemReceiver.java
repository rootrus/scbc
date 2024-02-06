package p040o;

import java.util.Map;

/* renamed from: o.ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver */
public class ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> implements Map.Entry<K, V> {
    final V IconCompatParcelizer;
    final K MediaBrowserCompat$CustomActionResultReceiver;
    public ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> read;
    ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> write;

    ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver(K k, V v) {
        this.MediaBrowserCompat$CustomActionResultReceiver = k;
        this.IconCompatParcelizer = v;
    }

    public final K getKey() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final V getValue() {
        return this.IconCompatParcelizer;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("=");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = (ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver) obj;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.equals(activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) || !this.IconCompatParcelizer.equals(activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.hashCode() ^ this.IconCompatParcelizer.hashCode();
    }
}
