package p040o;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p040o.onButtonClicked$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.onButtonClicked */
public final class onButtonClicked<T extends onButtonClicked$MediaBrowserCompat$CustomActionResultReceiver> {
    public List<T> MediaBrowserCompat$ItemReceiver = new CopyOnWriteArrayList();
    public boolean read = false;

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        if (!this.MediaBrowserCompat$ItemReceiver.contains(t)) {
            this.MediaBrowserCompat$ItemReceiver.add(t);
        }
        if (this.read) {
            this.read = false;
        }
    }

    public final <S, U> void write(S s, U u) {
        for (T t : this.MediaBrowserCompat$ItemReceiver) {
            if (s == t.MediaBrowserCompat$ItemReceiver.get() && u.equals(t.IconCompatParcelizer)) {
                this.MediaBrowserCompat$ItemReceiver.remove(t);
                return;
            }
        }
    }
}
