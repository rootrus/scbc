package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dy$MediaSessionCompat$Token */
final class dy$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<ListOfException> {
    private /* synthetic */ C4310dy IconCompatParcelizer;
    private /* synthetic */ PlacePhotoMetadataResult MediaBrowserCompat$CustomActionResultReceiver;

    dy$MediaSessionCompat$Token(C4310dy dyVar, PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.IconCompatParcelizer = dyVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = placePhotoMetadataResult;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ListOfException listOfException = (ListOfException) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
        if (str == null) {
            str = "";
        }
        listOfException.MediaMetadataCompat(str);
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        listOfException.IconCompatParcelizer(str2);
    }
}
