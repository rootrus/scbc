package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dy$MediaBrowserCompat$ItemReceiver */
public final class dy$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ListOfException> {
    private /* synthetic */ PlacePhotoMetadataResult MediaBrowserCompat$ItemReceiver;

    public dy$MediaBrowserCompat$ItemReceiver(PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.MediaBrowserCompat$ItemReceiver = placePhotoMetadataResult;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ListOfException listOfException = (ListOfException) obj;
        String str = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
        if (str == null) {
            str = "";
        }
        listOfException.MediaMetadataCompat(str);
    }
}
