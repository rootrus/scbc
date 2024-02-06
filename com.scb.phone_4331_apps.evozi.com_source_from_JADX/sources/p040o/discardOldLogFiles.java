package p040o;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Deprecated
/* renamed from: o.discardOldLogFiles */
public final class discardOldLogFiles extends newProxy {
    public List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> read = new ArrayList();

    public final void IconCompatParcelizer(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        int size = this.read.size();
        List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list = this.read;
        discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaMetadataCompat = (long) size;
        list.add(size, discardoldlogfiles_mediabrowsercompat_itemreceiver);
    }

    public final discardOldLogFiles$MediaBrowserCompat$ItemReceiver write(long j) {
        isSupportFragmentClass issupportfragmentclass;
        show show = new show(this.read);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new getLogAsBytes(j)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
            return null;
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            return (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver(int i) {
        if (i < 0 || i >= this.read.size()) {
            return new discardOldLogFiles$MediaBrowserCompat$ItemReceiver();
        }
        return this.read.get(i);
    }
}
