package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zzxg */
public final class zzxg {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public double MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public int RatingCompat;
    public OffsetDateTime read;
    public double write;

    public /* synthetic */ zzxg(write write2, byte b) {
        this(write2);
    }

    private zzxg(write write2) {
        this.RatingCompat = write2.MediaDescriptionCompat;
        this.IconCompatParcelizer = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.read;
        this.MediaDescriptionCompat = write2.MediaMetadataCompat;
        this.MediaBrowserCompat$ItemReceiver = write2.IconCompatParcelizer;
        this.write = write2.write;
        this.MediaBrowserCompat$SearchResultReceiver = write2.MediaBrowserCompat$SearchResultReceiver;
        this.read = write2.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.zzxg$write */
    public static final class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public OffsetDateTime MediaBrowserCompat$ItemReceiver;
        public double MediaBrowserCompat$SearchResultReceiver;
        public int MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String read;
        public double write;

        public /* synthetic */ write(byte b) {
            this();
        }

        private write() {
        }
    }
}
