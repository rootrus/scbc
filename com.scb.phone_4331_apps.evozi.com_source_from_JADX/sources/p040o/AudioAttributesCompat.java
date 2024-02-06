package p040o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.AudioAttributesCompat */
public class AudioAttributesCompat<T, Y> {
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private final Map<T, Y> MediaBrowserCompat$ItemReceiver = new LinkedHashMap(100, 0.75f, true);
    private long write;

    public int MediaBrowserCompat$CustomActionResultReceiver(Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void write(T t, Y y) {
    }

    public AudioAttributesCompat(long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
    }

    public final long IconCompatParcelizer() {
        long j;
        synchronized (this) {
            j = this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return j;
    }

    public final Y IconCompatParcelizer(T t) {
        Y y;
        synchronized (this) {
            y = this.MediaBrowserCompat$ItemReceiver.get(t);
        }
        return y;
    }

    public final Y read(T t, Y y) {
        synchronized (this) {
            long MediaBrowserCompat$CustomActionResultReceiver2 = (long) MediaBrowserCompat$CustomActionResultReceiver(y);
            if (MediaBrowserCompat$CustomActionResultReceiver2 >= this.MediaBrowserCompat$CustomActionResultReceiver) {
                write(t, y);
                return null;
            }
            if (y != null) {
                this.write += MediaBrowserCompat$CustomActionResultReceiver2;
            }
            Y put = this.MediaBrowserCompat$ItemReceiver.put(t, y);
            if (put != null) {
                this.write -= (long) MediaBrowserCompat$CustomActionResultReceiver(put);
                if (!put.equals(y)) {
                    write(t, put);
                }
            }
            write(this.MediaBrowserCompat$CustomActionResultReceiver);
            return put;
        }
    }

    public final Y write(T t) {
        Y remove;
        synchronized (this) {
            remove = this.MediaBrowserCompat$ItemReceiver.remove(t);
            if (remove != null) {
                this.write -= (long) MediaBrowserCompat$CustomActionResultReceiver(remove);
            }
        }
        return remove;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        write(0);
    }

    /* access modifiers changed from: protected */
    public final void write(long j) {
        synchronized (this) {
            while (this.write > j) {
                Iterator<Map.Entry<T, Y>> it = this.MediaBrowserCompat$ItemReceiver.entrySet().iterator();
                Map.Entry next = it.next();
                Object value = next.getValue();
                this.write -= (long) MediaBrowserCompat$CustomActionResultReceiver(value);
                Object key = next.getKey();
                it.remove();
                write(key, value);
            }
        }
    }
}
