package p040o;

/* renamed from: o.onMapLongClick */
public final class onMapLongClick {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String read;
    public String write;

    /* renamed from: o.onMapLongClick$write */
    public static final class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public int MediaBrowserCompat$SearchResultReceiver;
        public String read;
        public String write;
    }

    public /* synthetic */ onMapLongClick(write write2, byte b) {
        this(write2);
    }

    private onMapLongClick(write write2) {
        this.MediaDescriptionCompat = write2.MediaBrowserCompat$SearchResultReceiver;
        this.write = write2.read;
        this.MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$ItemReceiver;
        this.read = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.IconCompatParcelizer;
        this.MediaMetadataCompat = write2.MediaBrowserCompat$MediaItem;
        this.IconCompatParcelizer = write2.write;
    }
}
