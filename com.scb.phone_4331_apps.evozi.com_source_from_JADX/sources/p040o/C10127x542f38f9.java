package p040o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.rsnAllocationCreateFromAssetStream$MediaBrowserCompat$ItemReceiver */
final class C10127x542f38f9 implements Iterator<Map.Entry<K, V>> {
    private /* synthetic */ rsnAllocationCreateFromAssetStream IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;
    private boolean write;

    C10127x542f38f9(rsnAllocationCreateFromAssetStream rsnallocationcreatefromassetstream) {
        this.IconCompatParcelizer = rsnallocationcreatefromassetstream;
    }

    public final boolean hasNext() {
        return this.MediaBrowserCompat$ItemReceiver < this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void remove() {
        int i = this.MediaBrowserCompat$ItemReceiver - 1;
        if (this.write || i < 0) {
            throw new IllegalArgumentException();
        }
        this.IconCompatParcelizer.read(i << 1);
        this.MediaBrowserCompat$ItemReceiver--;
        this.write = true;
    }

    public final /* synthetic */ Object next() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        if (i != this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver++;
            this.write = false;
            return new C10126x8ed868aa(this.IconCompatParcelizer, i);
        }
        throw new NoSuchElementException();
    }
}
