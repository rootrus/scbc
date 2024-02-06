package p040o;

import java.util.List;

/* renamed from: o.isDataCollectionEnabled */
public final class isDataCollectionEnabled extends getConditionalUserProperties {
    public String MediaDescriptionCompat;
    public List<logEventAndBundle> MediaMetadataCompat;

    /* synthetic */ isDataCollectionEnabled(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private isDataCollectionEnabled(IconCompatParcelizer iconCompatParcelizer) {
        super(iconCompatParcelizer);
        this.IconCompatParcelizer = null;
        this.MediaMetadataCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
        this.MediaDescriptionCompat = iconCompatParcelizer.MediaMetadataCompat;
    }

    public static IconCompatParcelizer MediaBrowserCompat$ItemReceiver() {
        return new IconCompatParcelizer((byte) 0);
    }

    /* renamed from: o.isDataCollectionEnabled$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends C9962x621ef0db {
        public List<logEventAndBundle> MediaBrowserCompat$MediaItem;
        public String MediaMetadataCompat;

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }

        public final /* synthetic */ getConditionalUserProperties read() {
            return new isDataCollectionEnabled(this, (byte) 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isDataCollectionEnabled isdatacollectionenabled = (isDataCollectionEnabled) obj;
        List<logEventAndBundle> list = this.MediaMetadataCompat;
        if (list == null ? isdatacollectionenabled.MediaMetadataCompat != null : !list.equals(isdatacollectionenabled.MediaMetadataCompat)) {
            return false;
        }
        String str = this.MediaDescriptionCompat;
        String str2 = isdatacollectionenabled.MediaDescriptionCompat;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<logEventAndBundle> list = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
