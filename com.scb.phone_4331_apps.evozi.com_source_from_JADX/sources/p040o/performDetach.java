package p040o;

/* renamed from: o.performDetach */
public final class performDetach<Z> implements performOptionsMenuClosed<Z> {
    private boolean IconCompatParcelizer;
    final boolean MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private final isStateSaved MediaBrowserCompat$MediaItem;
    private final write MediaDescriptionCompat;
    final performOptionsMenuClosed<Z> read;
    private final boolean write;

    /* renamed from: o.performDetach$write */
    interface write {
        void MediaBrowserCompat$ItemReceiver(isStateSaved isstatesaved, performDetach<?> performdetach);
    }

    performDetach(performOptionsMenuClosed<Z> performoptionsmenuclosed, boolean z, boolean z2, isStateSaved isstatesaved, write write2) {
        if (performoptionsmenuclosed != null) {
            this.read = performoptionsmenuclosed;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.write = z2;
            this.MediaBrowserCompat$MediaItem = isstatesaved;
            if (write2 != null) {
                this.MediaDescriptionCompat = write2;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final Class<Z> IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    public final Z write() {
        return this.read.write();
    }

    public final int read() {
        return this.read.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            } else if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                if (this.write) {
                    this.read.MediaBrowserCompat$CustomActionResultReceiver();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        synchronized (this) {
            if (!this.IconCompatParcelizer) {
                this.MediaBrowserCompat$ItemReceiver++;
            } else {
                throw new IllegalStateException("Cannot acquire a recycled resource");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaMetadataCompat() {
        boolean z;
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver > 0) {
                z = true;
                int i = this.MediaBrowserCompat$ItemReceiver - 1;
                this.MediaBrowserCompat$ItemReceiver = i;
                if (i != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, this);
        }
    }

    public final String toString() {
        String obj;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("EngineResource{isMemoryCacheable=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", listener=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", key=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", acquired=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", isRecycled=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", resource=");
            sb.append(this.read);
            sb.append('}');
            obj = sb.toString();
        }
        return obj;
    }
}
