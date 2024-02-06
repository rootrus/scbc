package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingStrategy$MediaSessionCompat$ResultReceiverWrapper */
public final class FieldNamingStrategy$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.MediaDescriptionCompat> {
    private /* synthetic */ FieldNamingStrategy write;

    public FieldNamingStrategy$MediaSessionCompat$ResultReceiverWrapper(FieldNamingStrategy fieldNamingStrategy) {
        this.write = fieldNamingStrategy;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.MediaDescriptionCompat mediaDescriptionCompat = (getFirstName.MediaDescriptionCompat) obj;
        if (this.write.MediaBrowserCompat$ItemReceiver) {
            mediaDescriptionCompat.read();
        } else {
            mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        }
        mediaDescriptionCompat.IconCompatParcelizer();
        mediaDescriptionCompat.MediaBrowserCompat$MediaItem();
        mediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver();
    }
}
