package p040o;

import com.google.common.base.Objects;
import java.util.Map;

/* renamed from: o.rsnAllocationCreateFromAssetStream$MediaBrowserCompat$CustomActionResultReceiver */
final class C10126x8ed868aa implements Map.Entry<K, V> {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ rsnAllocationCreateFromAssetStream MediaBrowserCompat$ItemReceiver;

    C10126x8ed868aa(rsnAllocationCreateFromAssetStream rsnallocationcreatefromassetstream, int i) {
        this.MediaBrowserCompat$ItemReceiver = rsnallocationcreatefromassetstream;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final K getKey() {
        rsnAllocationCreateFromAssetStream rsnallocationcreatefromassetstream = this.MediaBrowserCompat$ItemReceiver;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i < 0 || i >= rsnallocationcreatefromassetstream.MediaBrowserCompat$CustomActionResultReceiver) {
            return null;
        }
        return rsnallocationcreatefromassetstream.MediaBrowserCompat$ItemReceiver[i << 1];
    }

    public final V getValue() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final V setValue(V v) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, v);
    }

    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!Objects.equal(getKey(), entry.getKey()) || !Objects.equal(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }
}
