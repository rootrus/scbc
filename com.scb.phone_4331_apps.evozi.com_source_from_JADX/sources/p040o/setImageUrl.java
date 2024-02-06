package p040o;

import p040o.CameraSource;
import p040o.setDynamicIcons;
import p043rx.exceptions.OnErrorNotImplementedException;

/* renamed from: o.setImageUrl */
public enum setImageUrl {
    ;
    
    public static final setImageUrl$MediaBrowserCompat$ItemReceiver COUNTER = null;
    static final setImageUrl$MediaBrowserCompat$CustomActionResultReceiver ERROR_EXTRACTOR = null;
    public static final setDefaultBorder<Throwable> ERROR_NOT_IMPLEMENTED = null;
    public static final CameraSource.CameraSourceException.IconCompatParcelizer<Boolean, Object> IS_EMPTY = null;
    public static final read LONG_COUNTER = null;
    public static final IconCompatParcelizer OBJECT_EQUALS = null;
    static final MediaMetadataCompat RETURNS_VOID = null;
    public static final setImageUrl$MediaBrowserCompat$SearchResultReceiver TO_ARRAY = null;

    static {
        COUNTER = new setImageUrl$MediaBrowserCompat$ItemReceiver();
        LONG_COUNTER = new read();
        OBJECT_EQUALS = new IconCompatParcelizer();
        TO_ARRAY = new setImageUrl$MediaBrowserCompat$SearchResultReceiver();
        RETURNS_VOID = new MediaMetadataCompat();
        ERROR_EXTRACTOR = new setImageUrl$MediaBrowserCompat$CustomActionResultReceiver();
        ERROR_NOT_IMPLEMENTED = new write();
        IS_EMPTY = new setDynamicIcons.Cdefault(setDrawable$MediaBrowserCompat$ItemReceiver.INSTANCE);
    }

    /* renamed from: o.setImageUrl$read */
    static final class read {
        read() {
        }
    }

    /* renamed from: o.setImageUrl$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        IconCompatParcelizer() {
        }
    }

    /* renamed from: o.setImageUrl$MediaMetadataCompat */
    static final class MediaMetadataCompat implements setInnerColors<Object, Void> {
        public final /* bridge */ /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            return null;
        }

        MediaMetadataCompat() {
        }
    }

    /* renamed from: o.setImageUrl$write */
    static final class write implements setDefaultBorder<Throwable> {
        write() {
        }

        public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
            throw new OnErrorNotImplementedException((Throwable) obj);
        }
    }
}
