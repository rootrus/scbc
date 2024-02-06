package p040o;

import java.util.List;
import p040o.Predicates;
import p040o.Synchronized;

/* renamed from: o.registerNewObjectListener */
public class registerNewObjectListener extends writeUInt64NoTag<C7138hs> {
    public final indexIn MediaBrowserCompat$ItemReceiver;
    final Predicates.AndPredicate read;
    final Synchronized.C38331 write;

    @HmlPinActivity
    public registerNewObjectListener(RegularImmutableBiMap regularImmutableBiMap, indexIn indexin, Predicates.AndPredicate andPredicate, Synchronized.C38331 r4) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = indexin;
        this.read = andPredicate;
        this.write = r4;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(List list, C7138hs hsVar) {
        hsVar.read();
        hsVar.IconCompatParcelizer(list);
    }

    public void onDestroy() {
        super.onDestroy();
        indexIn indexin = this.MediaBrowserCompat$ItemReceiver;
        if (!indexin.MediaBrowserCompat$MediaItem.isDisposed()) {
            indexin.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void read(registerNewObjectListener registernewobjectlistener) {
        if (registernewobjectlistener.RatingCompat != null) {
            registernewobjectlistener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(discardOldLogFiles discardoldlogfiles, C7138hs hsVar) {
        hsVar.read(discardoldlogfiles.read);
        hsVar.aj_();
    }
}
