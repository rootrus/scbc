package p040o;

import java.util.List;

/* renamed from: o.map */
public final /* synthetic */ class map implements callStartTransitionListener {
    public static final /* synthetic */ map read = new map();

    private /* synthetic */ map() {
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        discardOldLogFiles discardoldlogfiles = (discardOldLogFiles) obj;
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj2;
        int size = discardoldlogfiles.read.size();
        List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list = discardoldlogfiles.read;
        discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaMetadataCompat = (long) size;
        list.add(size, discardoldlogfiles_mediabrowsercompat_itemreceiver);
        return discardoldlogfiles;
    }
}
