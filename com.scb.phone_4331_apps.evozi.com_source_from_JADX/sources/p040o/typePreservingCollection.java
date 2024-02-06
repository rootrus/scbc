package p040o;

import p040o.Synchronized;

/* renamed from: o.typePreservingCollection */
public final /* synthetic */ class typePreservingCollection implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ Synchronized.SynchronizedAsMapValues MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ typePreservingCollection(Synchronized.SynchronizedAsMapValues synchronizedAsMapValues) {
        this.MediaBrowserCompat$CustomActionResultReceiver = synchronizedAsMapValues;
    }

    public final boolean write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.read >= ((PlaceEntity) obj).MediaBrowserCompat$CustomActionResultReceiver;
    }
}
