package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.onForceLoad */
public final class onForceLoad {
    private final List<IconCompatParcelizer<?>> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();

    public final <T> isInLayout<T> write(Class<T> cls) {
        synchronized (this) {
            for (IconCompatParcelizer next : this.MediaBrowserCompat$CustomActionResultReceiver) {
                if (next.IconCompatParcelizer.isAssignableFrom(cls)) {
                    isInLayout<T> isinlayout = next.MediaBrowserCompat$CustomActionResultReceiver;
                    return isinlayout;
                }
            }
            return null;
        }
    }

    public final <T> void MediaBrowserCompat$CustomActionResultReceiver(Class<T> cls, isInLayout<T> isinlayout) {
        synchronized (this) {
            this.MediaBrowserCompat$CustomActionResultReceiver.add(new IconCompatParcelizer(cls, isinlayout));
        }
    }

    /* renamed from: o.onForceLoad$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> {
        final Class<T> IconCompatParcelizer;
        final isInLayout<T> MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(Class<T> cls, isInLayout<T> isinlayout) {
            this.IconCompatParcelizer = cls;
            this.MediaBrowserCompat$CustomActionResultReceiver = isinlayout;
        }
    }
}
