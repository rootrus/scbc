package p040o;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: o.DiscoverSearchActivity$MediaBrowserCompat$ItemReceiver */
class DiscoverSearchActivity$MediaBrowserCompat$ItemReceiver implements Serializable {
    /* access modifiers changed from: private */
    public static final DiscoverSearchActivity$MediaBrowserCompat$ItemReceiver read = new DiscoverSearchActivity$MediaBrowserCompat$ItemReceiver();

    private DiscoverSearchActivity$MediaBrowserCompat$ItemReceiver() {
    }

    private Object readResolve() throws ObjectStreamException {
        return read;
    }
}
