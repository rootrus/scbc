package p040o;

/* renamed from: o.setClipToPadding */
public abstract class setClipToPadding {
    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer(boolean z);

    public abstract void write();

    /* synthetic */ setClipToPadding(byte b) {
        this();
    }

    private setClipToPadding() {
    }

    /* renamed from: o.setClipToPadding$write */
    public static class write extends setClipToPadding {
        private volatile boolean MediaBrowserCompat$ItemReceiver;

        public write() {
            super((byte) 0);
        }

        public final void write() {
            if (this.MediaBrowserCompat$ItemReceiver) {
                throw new IllegalStateException("Already released");
            }
        }

        public final void IconCompatParcelizer(boolean z) {
            this.MediaBrowserCompat$ItemReceiver = z;
        }
    }
}
