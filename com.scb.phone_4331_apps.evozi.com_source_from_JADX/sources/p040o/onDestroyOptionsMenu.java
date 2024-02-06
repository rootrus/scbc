package p040o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p040o.onCreateContextMenu;

/* renamed from: o.onDestroyOptionsMenu */
public final class onDestroyOptionsMenu {
    private static final onCreateContextMenu.read<?> MediaBrowserCompat$ItemReceiver = new onCreateContextMenu.read<Object>() {
        public final onCreateContextMenu<Object> MediaBrowserCompat$ItemReceiver(Object obj) {
            return new read(obj);
        }

        public final Class<Object> MediaBrowserCompat$ItemReceiver() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    public final Map<Class<?>, onCreateContextMenu.read<?>> write = new HashMap();

    public final <T> onCreateContextMenu<T> write(T t) {
        onCreateContextMenu<?> MediaBrowserCompat$ItemReceiver2;
        synchronized (this) {
            if (t != null) {
                onCreateContextMenu.read<?> read2 = this.write.get(t.getClass());
                if (read2 == null) {
                    Iterator<onCreateContextMenu.read<?>> it = this.write.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        onCreateContextMenu.read<?> next = it.next();
                        if (next.MediaBrowserCompat$ItemReceiver().isAssignableFrom(t.getClass())) {
                            read2 = next;
                            break;
                        }
                    }
                }
                if (read2 == null) {
                    read2 = MediaBrowserCompat$ItemReceiver;
                }
                MediaBrowserCompat$ItemReceiver2 = read2.MediaBrowserCompat$ItemReceiver(t);
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        return MediaBrowserCompat$ItemReceiver2;
    }

    /* renamed from: o.onDestroyOptionsMenu$read */
    static final class read implements onCreateContextMenu<Object> {
        private final Object MediaBrowserCompat$ItemReceiver;

        public final void IconCompatParcelizer() {
        }

        read(Object obj) {
            this.MediaBrowserCompat$ItemReceiver = obj;
        }

        public final Object read() {
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }
}
