package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zzxi */
public final class zzxi {
    public String IconCompatParcelizer;
    public Double MediaBrowserCompat$CustomActionResultReceiver;
    public OffsetDateTime MediaBrowserCompat$ItemReceiver;
    public OffsetDateTime read;

    public /* synthetic */ zzxi(write write2, byte b) {
        this(write2);
    }

    private zzxi(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2.write;
        this.read = write2.read;
        this.IconCompatParcelizer = write2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.IconCompatParcelizer;
    }

    /* renamed from: o.zzxi$write */
    public static final class write {
        public Double IconCompatParcelizer;
        public String MediaBrowserCompat$ItemReceiver;
        public OffsetDateTime read;
        public OffsetDateTime write;

        public /* synthetic */ write(byte b) {
            this();
        }

        private write() {
        }
    }
}
