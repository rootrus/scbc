package p040o;

import p040o.setOnCloseListener;

/* renamed from: o.setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver */
public class setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver<T> implements setOnCloseListener.read<T> {
    private int MediaBrowserCompat$ItemReceiver;
    private final Object[] read;

    public setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i > 0) {
            this.read = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T read() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.read;
        T t = tArr[i2];
        tArr[i2] = null;
        this.MediaBrowserCompat$ItemReceiver = i2;
        return t;
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(T t) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.MediaBrowserCompat$ItemReceiver) {
                z = false;
                break;
            } else if (this.read[i] == t) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            Object[] objArr = this.read;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.MediaBrowserCompat$ItemReceiver = i2 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
