package p040o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.getMicrAmount;

/* renamed from: o.performStart */
final class performStart<K extends getMicrAmount, V> {
    private final performStart$MediaBrowserCompat$CustomActionResultReceiver<K, V> read = new performStart$MediaBrowserCompat$CustomActionResultReceiver<>();
    private final Map<K, performStart$MediaBrowserCompat$CustomActionResultReceiver<K, V>> write = new HashMap();

    performStart() {
    }

    public final void MediaBrowserCompat$ItemReceiver(K k, V v) {
        performStart$MediaBrowserCompat$CustomActionResultReceiver performstart_mediabrowsercompat_customactionresultreceiver = this.write.get(k);
        if (performstart_mediabrowsercompat_customactionresultreceiver == null) {
            performstart_mediabrowsercompat_customactionresultreceiver = new performStart$MediaBrowserCompat$CustomActionResultReceiver(k);
            IconCompatParcelizer(performstart_mediabrowsercompat_customactionresultreceiver);
            this.write.put(k, performstart_mediabrowsercompat_customactionresultreceiver);
        } else {
            k.MediaBrowserCompat$ItemReceiver();
        }
        if (performstart_mediabrowsercompat_customactionresultreceiver.read == null) {
            performstart_mediabrowsercompat_customactionresultreceiver.read = new ArrayList();
        }
        performstart_mediabrowsercompat_customactionresultreceiver.read.add(v);
    }

    public final V read(K k) {
        performStart$MediaBrowserCompat$CustomActionResultReceiver performstart_mediabrowsercompat_customactionresultreceiver = this.write.get(k);
        if (performstart_mediabrowsercompat_customactionresultreceiver == null) {
            performstart_mediabrowsercompat_customactionresultreceiver = new performStart$MediaBrowserCompat$CustomActionResultReceiver(k);
            this.write.put(k, performstart_mediabrowsercompat_customactionresultreceiver);
        } else {
            k.MediaBrowserCompat$ItemReceiver();
        }
        write(performstart_mediabrowsercompat_customactionresultreceiver);
        List<V> list = performstart_mediabrowsercompat_customactionresultreceiver.read;
        int size = list != null ? list.size() : 0;
        if (size > 0) {
            return performstart_mediabrowsercompat_customactionresultreceiver.read.remove(size - 1);
        }
        return null;
    }

    public final V MediaBrowserCompat$ItemReceiver() {
        performStart$MediaBrowserCompat$CustomActionResultReceiver<K, V> performstart_mediabrowsercompat_customactionresultreceiver = this.read.MediaBrowserCompat$ItemReceiver;
        while (true) {
            V v = null;
            if (performstart_mediabrowsercompat_customactionresultreceiver.equals(this.read)) {
                return null;
            }
            List<V> list = performstart_mediabrowsercompat_customactionresultreceiver.read;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                v = performstart_mediabrowsercompat_customactionresultreceiver.read.remove(size - 1);
            }
            if (v != null) {
                return v;
            }
            performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
            performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
            this.write.remove(performstart_mediabrowsercompat_customactionresultreceiver.write);
            ((getMicrAmount) performstart_mediabrowsercompat_customactionresultreceiver.write).MediaBrowserCompat$ItemReceiver();
            performstart_mediabrowsercompat_customactionresultreceiver = performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (performStart$MediaBrowserCompat$CustomActionResultReceiver<K, V> performstart_mediabrowsercompat_customactionresultreceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver; !performstart_mediabrowsercompat_customactionresultreceiver.equals(this.read); performstart_mediabrowsercompat_customactionresultreceiver = performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            z = true;
            sb.append('{');
            sb.append(performstart_mediabrowsercompat_customactionresultreceiver.write);
            sb.append(':');
            List<V> list = performstart_mediabrowsercompat_customactionresultreceiver.read;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    private void write(performStart$MediaBrowserCompat$CustomActionResultReceiver<K, V> performstart_mediabrowsercompat_customactionresultreceiver) {
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = this.read;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = performstart_mediabrowsercompat_customactionresultreceiver;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = performstart_mediabrowsercompat_customactionresultreceiver;
    }

    private void IconCompatParcelizer(performStart$MediaBrowserCompat$CustomActionResultReceiver<K, V> performstart_mediabrowsercompat_customactionresultreceiver) {
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = this.read;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = performstart_mediabrowsercompat_customactionresultreceiver;
        performstart_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = performstart_mediabrowsercompat_customactionresultreceiver;
    }
}
