package p040o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.getActivity$MediaBrowserCompat$CustomActionResultReceiver */
public class getActivity$MediaBrowserCompat$CustomActionResultReceiver {
    public final setTextAppearance<getAnimator$MediaBrowserCompat$ItemReceiver, List<Class<?>>> IconCompatParcelizer = new setTextAppearance<>();
    private final AtomicReference<getAnimator$MediaBrowserCompat$ItemReceiver> read = new AtomicReference<>();

    public final List<Class<?>> write(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        getAnimator$MediaBrowserCompat$ItemReceiver andSet = this.read.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new getAnimator$MediaBrowserCompat$ItemReceiver(cls, cls2, cls3);
        } else {
            andSet.MediaBrowserCompat$ItemReceiver = cls;
            andSet.IconCompatParcelizer = cls2;
            andSet.MediaBrowserCompat$CustomActionResultReceiver = cls3;
        }
        synchronized (this.IconCompatParcelizer) {
            list = this.IconCompatParcelizer.get(andSet);
        }
        this.read.set(andSet);
        return list;
    }
}
