package p040o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.IdpShareInformationActivity */
public abstract class IdpShareInformationActivity<T> extends BaseNtbInstructionActivity {
    private static final AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(IdpShareInformationActivity.class, Object.class, "_consensus");
    public volatile Object _consensus = onButtonStartClick.MediaBrowserCompat$CustomActionResultReceiver;

    public final IdpShareInformationActivity<?> MediaBrowserCompat$CustomActionResultReceiver() {
        return this;
    }

    public long MediaBrowserCompat$ItemReceiver() {
        return 0;
    }

    public abstract Object MediaBrowserCompat$ItemReceiver(T t);

    public abstract void read(T t, Object obj);

    public final Object write(Object obj) {
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(obj != onButtonStartClick.MediaBrowserCompat$CustomActionResultReceiver)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        if (obj2 != onButtonStartClick.MediaBrowserCompat$CustomActionResultReceiver) {
            return obj2;
        }
        if (IconCompatParcelizer.compareAndSet(this, onButtonStartClick.MediaBrowserCompat$CustomActionResultReceiver, obj)) {
            return obj;
        }
        return this._consensus;
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == onButtonStartClick.MediaBrowserCompat$CustomActionResultReceiver) {
            obj2 = write(MediaBrowserCompat$ItemReceiver(obj));
        }
        read(obj, obj2);
        return obj2;
    }
}
