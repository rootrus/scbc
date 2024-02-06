package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.cancelLoad */
public final class cancelLoad {
    private final List<read<?>> IconCompatParcelizer = new ArrayList();

    public final <Z> void read(Class<Z> cls, onContextItemSelected<Z> oncontextitemselected) {
        synchronized (this) {
            this.IconCompatParcelizer.add(new read(cls, oncontextitemselected));
        }
    }

    public final <Z> onContextItemSelected<Z> MediaBrowserCompat$ItemReceiver(Class<Z> cls) {
        synchronized (this) {
            int size = this.IconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                read read2 = this.IconCompatParcelizer.get(i);
                if (read2.read.isAssignableFrom(cls)) {
                    onContextItemSelected<T> oncontextitemselected = read2.write;
                    return oncontextitemselected;
                }
            }
            return null;
        }
    }

    /* renamed from: o.cancelLoad$read */
    static final class read<T> {
        final Class<T> read;
        final onContextItemSelected<T> write;

        read(Class<T> cls, onContextItemSelected<T> oncontextitemselected) {
            this.read = cls;
            this.write = oncontextitemselected;
        }
    }
}
