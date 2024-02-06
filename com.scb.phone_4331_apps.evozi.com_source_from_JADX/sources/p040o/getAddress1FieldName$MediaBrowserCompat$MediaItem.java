package p040o;

import p040o.LocalProjectProvider_Factory;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress1FieldName$MediaBrowserCompat$MediaItem */
public final class getAddress1FieldName$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider_Factory.IconCompatParcelizer> {
    public static final getAddress1FieldName$MediaBrowserCompat$MediaItem write = new getAddress1FieldName$MediaBrowserCompat$MediaItem();

    getAddress1FieldName$MediaBrowserCompat$MediaItem() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        LocalProjectProvider_Factory.IconCompatParcelizer iconCompatParcelizer = (LocalProjectProvider_Factory.IconCompatParcelizer) obj;
        iconCompatParcelizer.read();
        iconCompatParcelizer.RatingCompat();
    }
}
