package p040o;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.scb.phone.data.p033di.easycash.C1068xa4368296;
import com.scb.phone.data.p033di.search.SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p040o.rsnContextDestroy;

/* renamed from: o.rsnContextDestroy$MediaBrowserCompat$SearchResultReceiver */
class rsnContextDestroy$MediaBrowserCompat$SearchResultReceiver implements Runnable {
    Runnable IconCompatParcelizer;
    final /* synthetic */ rsnContextDestroy MediaBrowserCompat$CustomActionResultReceiver;
    float MediaBrowserCompat$ItemReceiver;
    private Set<? extends rsnClosureCreate<T>> MediaMetadataCompat;
    Projection read;
    SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver write;

    /* synthetic */ rsnContextDestroy$MediaBrowserCompat$SearchResultReceiver(rsnContextDestroy rsncontextdestroy, Set set, byte b) {
        this(rsncontextdestroy, set);
    }

    private rsnContextDestroy$MediaBrowserCompat$SearchResultReceiver(rsnContextDestroy rsncontextdestroy, Set<? extends rsnClosureCreate<T>> set) {
        this.MediaBrowserCompat$CustomActionResultReceiver = rsncontextdestroy;
        this.MediaMetadataCompat = set;
    }

    public final void run() {
        LatLngBounds latLngBounds;
        ArrayList arrayList;
        if (this.MediaMetadataCompat.equals(this.MediaBrowserCompat$CustomActionResultReceiver.f2622x50fd9e4a)) {
            this.IconCompatParcelizer.run();
            return;
        }
        rsnContextDestroy.write write2 = new rsnContextDestroy.write(this.MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
        float f = this.MediaBrowserCompat$ItemReceiver;
        boolean z = f > this.MediaBrowserCompat$CustomActionResultReceiver.setContentView;
        float MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.setContentView;
        Set<rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver> IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction;
        try {
            latLngBounds = this.read.getVisibleRegion().latLngBounds;
        } catch (Exception e) {
            e.printStackTrace();
            latLngBounds = LatLngBounds.builder().include(new LatLng(0.0d, 0.0d)).build();
        }
        ArrayList arrayList2 = null;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.f2622x50fd9e4a == null || !rsnContextDestroy.MediaDescriptionCompat || !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (rsnClosureCreate rsnclosurecreate : this.MediaBrowserCompat$CustomActionResultReceiver.f2622x50fd9e4a) {
                if ((rsnclosurecreate.write() > this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) && latLngBounds.contains(rsnclosurecreate.MediaBrowserCompat$ItemReceiver())) {
                    arrayList.add(this.write.MediaBrowserCompat$CustomActionResultReceiver(rsnclosurecreate.MediaBrowserCompat$ItemReceiver()));
                }
            }
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        for (rsnClosureCreate rsnclosurecreate2 : this.MediaMetadataCompat) {
            boolean contains = latLngBounds.contains(rsnclosurecreate2.MediaBrowserCompat$ItemReceiver());
            if (!z || !contains || !rsnContextDestroy.MediaDescriptionCompat || !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem) {
                write2.read(contains, new rsnContextDestroy$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, rsnclosurecreate2, newSetFromMap, (LatLng) null));
            } else {
                C1068xa4368296 IconCompatParcelizer3 = rsnContextDestroy.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, arrayList, this.write.MediaBrowserCompat$CustomActionResultReceiver(rsnclosurecreate2.MediaBrowserCompat$ItemReceiver()));
                if (IconCompatParcelizer3 != null) {
                    write2.read(true, new rsnContextDestroy$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, rsnclosurecreate2, newSetFromMap, this.write.write(IconCompatParcelizer3)));
                } else {
                    write2.read(true, new rsnContextDestroy$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, rsnclosurecreate2, newSetFromMap, (LatLng) null));
                }
            }
        }
        write2.read();
        IconCompatParcelizer2.removeAll(newSetFromMap);
        if (rsnContextDestroy.MediaDescriptionCompat && this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem) {
            arrayList2 = new ArrayList();
            for (rsnClosureCreate rsnclosurecreate3 : this.MediaMetadataCompat) {
                if ((rsnclosurecreate3.write() > this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) && latLngBounds.contains(rsnclosurecreate3.MediaBrowserCompat$ItemReceiver())) {
                    arrayList2.add(this.write.MediaBrowserCompat$CustomActionResultReceiver(rsnclosurecreate3.MediaBrowserCompat$ItemReceiver()));
                }
            }
        }
        for (rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver rsncontextdestroy_mediabrowsercompat_customactionresultreceiver : IconCompatParcelizer2) {
            boolean contains2 = latLngBounds.contains(rsncontextdestroy_mediabrowsercompat_customactionresultreceiver.write);
            if (z || f - MediaBrowserCompat$CustomActionResultReceiver2 <= -3.0f || !contains2 || !rsnContextDestroy.MediaDescriptionCompat || !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem) {
                write2.IconCompatParcelizer(contains2, rsncontextdestroy_mediabrowsercompat_customactionresultreceiver.read);
            } else {
                C1068xa4368296 IconCompatParcelizer4 = rsnContextDestroy.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, arrayList2, this.write.MediaBrowserCompat$CustomActionResultReceiver(rsncontextdestroy_mediabrowsercompat_customactionresultreceiver.write));
                if (IconCompatParcelizer4 != null) {
                    LatLng write3 = this.write.write(IconCompatParcelizer4);
                    LatLng latLng = rsncontextdestroy_mediabrowsercompat_customactionresultreceiver.write;
                    write2.MediaBrowserCompat$ItemReceiver.lock();
                    rsnContextDestroy.IconCompatParcelizer iconCompatParcelizer = new rsnContextDestroy.IconCompatParcelizer(rsnContextDestroy.this, rsncontextdestroy_mediabrowsercompat_customactionresultreceiver, latLng, write3, (byte) 0);
                    iconCompatParcelizer.IconCompatParcelizer = rsnContextDestroy.this.RatingCompat.IconCompatParcelizer;
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = true;
                    write2.read.add(iconCompatParcelizer);
                    write2.MediaBrowserCompat$ItemReceiver.unlock();
                } else {
                    write2.IconCompatParcelizer(true, rsncontextdestroy_mediabrowsercompat_customactionresultreceiver.read);
                }
            }
        }
        write2.read();
        Set unused = this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction = newSetFromMap;
        Set unused2 = this.MediaBrowserCompat$CustomActionResultReceiver.f2622x50fd9e4a = this.MediaMetadataCompat;
        float unused3 = this.MediaBrowserCompat$CustomActionResultReceiver.setContentView = f;
        this.IconCompatParcelizer.run();
    }
}
