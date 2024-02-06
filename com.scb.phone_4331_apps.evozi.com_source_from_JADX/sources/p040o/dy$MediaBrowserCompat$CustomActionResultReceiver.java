package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dy$MediaBrowserCompat$CustomActionResultReceiver */
final class dy$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ListOfException> {
    private /* synthetic */ PlacePhotoMetadataResult MediaBrowserCompat$ItemReceiver;

    dy$MediaBrowserCompat$CustomActionResultReceiver(PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.MediaBrowserCompat$ItemReceiver = placePhotoMetadataResult;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ListOfException listOfException = (ListOfException) obj;
        String str = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
        if (this.MediaBrowserCompat$ItemReceiver.Keep) {
            listOfException.MediaBrowserCompat$MediaItem(str);
        } else {
            listOfException.write(str);
        }
    }
}
