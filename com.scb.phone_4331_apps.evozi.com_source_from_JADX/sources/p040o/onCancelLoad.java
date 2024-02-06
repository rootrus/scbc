package p040o;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p040o.setOnCloseListener;

/* renamed from: o.onCancelLoad */
public final class onCancelLoad {
    public static final performLowMemory<?, ?, ?> MediaBrowserCompat$CustomActionResultReceiver = new performLowMemory(Object.class, Object.class, Object.class, Collections.singletonList(new performCreateView(Object.class, Object.class, Object.class, Collections.emptyList(), new ReportFragment(), (setOnCloseListener.read<List<Throwable>>) null)), (setOnCloseListener.read<List<Throwable>>) null);
    public final setTextAppearance<getAnimator$MediaBrowserCompat$ItemReceiver, performLowMemory<?, ?, ?>> MediaBrowserCompat$ItemReceiver = new setTextAppearance<>();
    private final AtomicReference<getAnimator$MediaBrowserCompat$ItemReceiver> read = new AtomicReference<>();

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(performLowMemory<?, ?, ?> performlowmemory) {
        return MediaBrowserCompat$CustomActionResultReceiver.equals(performlowmemory);
    }

    public final <Data, TResource, Transcode> performLowMemory<Data, TResource, Transcode> MediaBrowserCompat$CustomActionResultReceiver(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        performLowMemory<Data, TResource, Transcode> performlowmemory;
        getAnimator$MediaBrowserCompat$ItemReceiver andSet = this.read.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new getAnimator$MediaBrowserCompat$ItemReceiver();
        }
        andSet.MediaBrowserCompat$ItemReceiver = cls;
        andSet.IconCompatParcelizer = cls2;
        andSet.MediaBrowserCompat$CustomActionResultReceiver = cls3;
        synchronized (this.MediaBrowserCompat$ItemReceiver) {
            performlowmemory = this.MediaBrowserCompat$ItemReceiver.get(andSet);
        }
        this.read.set(andSet);
        return performlowmemory;
    }
}
