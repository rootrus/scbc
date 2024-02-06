package p040o;

import java.util.List;

/* renamed from: o.setEventInterceptor */
public final class setEventInterceptor {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public setInstanceIdProvider MediaMetadataCompat;
    public String read;
    public List<setDataCollectionEnabled> write;

    public /* synthetic */ setEventInterceptor(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private setEventInterceptor(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.read;
        this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.IconCompatParcelizer;
        this.MediaDescriptionCompat = iconCompatParcelizer.RatingCompat;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        this.write = iconCompatParcelizer.write;
        this.MediaMetadataCompat = iconCompatParcelizer.MediaDescriptionCompat;
    }

    /* renamed from: o.setEventInterceptor$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$SearchResultReceiver;
        public setInstanceIdProvider MediaDescriptionCompat;
        public String RatingCompat;
        public String read;
        public List<setDataCollectionEnabled> write;

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
