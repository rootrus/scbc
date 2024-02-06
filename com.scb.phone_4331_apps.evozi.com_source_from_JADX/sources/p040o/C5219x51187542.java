package p040o;

import java.util.List;
import java.util.NoSuchElementException;
import p040o.Synchronized;

/* renamed from: o.removeDataStoreInitializedListener$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5219x51187542 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>> {
    final /* synthetic */ removeDataStoreInitializedListener write;

    private C5219x51187542(removeDataStoreInitializedListener removedatastoreinitializedlistener) {
        this.write = removedatastoreinitializedlistener;
    }

    public /* synthetic */ C5219x51187542(removeDataStoreInitializedListener removedatastoreinitializedlistener, byte b) {
        this(removedatastoreinitializedlistener);
    }

    public final /* synthetic */ void onNext(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        show show = new show((List) obj);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, C10860setDeviceId.write));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        boolean z = true;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            removeDataStoreInitializedListener removedatastoreinitializedlistener = this.write;
            Synchronized.SynchronizedAsMapEntries.C38351.C38361 MediaBrowserCompat$CustomActionResultReceiver = removedatastoreinitializedlistener.MediaSessionCompat$ResultReceiverWrapper;
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                String unused = removedatastoreinitializedlistener.MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver.mo26549c_(((StreetViewPanoramaFragment) t).read);
                removeDataStoreInitializedListener removedatastoreinitializedlistener2 = this.write;
                stopRecord stoprecord = new stopRecord(this);
                if (removedatastoreinitializedlistener2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    stoprecord.IconCompatParcelizer(removedatastoreinitializedlistener2.RatingCompat);
                    return;
                }
                return;
            }
            throw new NoSuchElementException("No value present");
        }
    }

    public final void onError(Throwable th) {
        RegularImmutableBiMap unused = this.write.MediaBrowserCompat$CustomActionResultReceiver;
        onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(RegularImmutableBiMap.IconCompatParcelizer(th), new Object[0]);
    }
}
