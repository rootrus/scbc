package p040o;

import java.io.IOException;

/* renamed from: o.onCreateContextMenu */
public interface onCreateContextMenu<T> {

    /* renamed from: o.onCreateContextMenu$read */
    public interface read<T> {
        Class<T> MediaBrowserCompat$ItemReceiver();

        onCreateContextMenu<T> MediaBrowserCompat$ItemReceiver(T t);
    }

    void IconCompatParcelizer();

    T read() throws IOException;
}
