package p040o;

import p040o.Analytics;
import p040o.IdCaptureModule;
import p040o.MinMaxPriorityQueue;
import p040o.PhenotypeFlag;

/* renamed from: o.newFactory */
public class newFactory extends writeUInt64NoTag<IdCaptureModule.C6905a> {
    public createFlag IconCompatParcelizer;
    public Analytics.Event MediaBrowserCompat$ItemReceiver;
    MinMaxPriorityQueue.Heap MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final logEventNoInterceptor MediaMetadataCompat;
    /* access modifiers changed from: package-private */
    public getComponent read;
    public PhenotypeFlag.Factory write;

    @HmlPinActivity
    public newFactory(RegularImmutableBiMap regularImmutableBiMap, Analytics.Event event, PhenotypeFlag.Factory factory, MinMaxPriorityQueue.Heap heap, createFlag createflag, logEventNoInterceptor logeventnointerceptor) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = event;
        this.write = factory;
        this.MediaBrowserCompat$SearchResultReceiver = heap;
        this.MediaMetadataCompat = logeventnointerceptor;
        this.IconCompatParcelizer = createflag;
    }
}
