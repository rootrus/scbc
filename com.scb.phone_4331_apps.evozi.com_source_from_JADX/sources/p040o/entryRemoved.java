package p040o;

/* renamed from: o.entryRemoved */
public abstract class entryRemoved {

    /* renamed from: o.entryRemoved$read */
    public enum read {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    /* renamed from: o.entryRemoved$write */
    public enum write {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public abstract void IconCompatParcelizer(evictAll evictall);

    public abstract void MediaBrowserCompat$ItemReceiver(evictAll evictall);

    public abstract read read();
}
