package p040o;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p040o.Guideline;

/* renamed from: o.setId  reason: case insensitive filesystem */
public final class C10826setId<T> {
    final Guideline.write<T> MediaBrowserCompat$ItemReceiver;
    public final Executor read;
    final Executor write = null;

    C10826setId(Executor executor, Executor executor2, Guideline.write<T> write2) {
        this.read = executor2;
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    /* renamed from: o.setId$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> {
        private static Executor MediaBrowserCompat$ItemReceiver = null;
        private static final Object read = new Object();
        private Executor IconCompatParcelizer;
        private final Guideline.write<T> write;

        public IconCompatParcelizer(Guideline.write<T> write2) {
            this.write = write2;
        }

        public final C10826setId<T> write() {
            if (this.IconCompatParcelizer == null) {
                synchronized (read) {
                    if (MediaBrowserCompat$ItemReceiver == null) {
                        MediaBrowserCompat$ItemReceiver = Executors.newFixedThreadPool(2);
                    }
                }
                this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
            }
            return new C10826setId<>((Executor) null, this.IconCompatParcelizer, this.write);
        }
    }
}
