package p040o;

import java.util.Iterator;
import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.dy$MediaSessionCompat$QueueItem */
public final class dy$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<ListOfException> {
    private /* synthetic */ C4310dy IconCompatParcelizer;
    private /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ PlacePhotoMetadataResult MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ List write;

    public dy$MediaSessionCompat$QueueItem(C4310dy dyVar, PlacePhotoMetadataResult placePhotoMetadataResult, List list, List list2) {
        this.IconCompatParcelizer = dyVar;
        this.MediaBrowserCompat$ItemReceiver = placePhotoMetadataResult;
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        boolean z;
        HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity;
        Object obj2;
        boolean z2;
        ListOfException listOfException = (ListOfException) obj;
        listOfException.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver));
        listOfException.IconCompatParcelizer((List<? extends setGenerator>) this.write);
        toStringBuilder write2 = this.IconCompatParcelizer.IconCompatParcelizer;
        List list = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) list, "tiles");
        Iterator it = list.iterator();
        while (true) {
            z = false;
            hmlVerifyEmailSuccessfulActivity = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            PlacePhotoMetadataResult placePhotoMetadataResult = (PlacePhotoMetadataResult) obj2;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) placePhotoMetadataResult.setShortcut, (Object) "CARD_TILE_VERTICAL") || placePhotoMetadataResult.setBackgroundResource != 1) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        PlacePhotoMetadataResult placePhotoMetadataResult2 = (PlacePhotoMetadataResult) obj2;
        if (placePhotoMetadataResult2 != null) {
            String IconCompatParcelizer2 = write2.IconCompatParcelizer(placePhotoMetadataResult2);
            if (placePhotoMetadataResult2.setContentView == 1) {
                z = true;
            }
            hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(IconCompatParcelizer2, Boolean.valueOf(z));
        }
        if (hmlVerifyEmailSuccessfulActivity != null) {
            String str = (String) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver;
            if (((Boolean) hmlVerifyEmailSuccessfulActivity.write).booleanValue()) {
                listOfException.MediaDescriptionCompat(str);
            } else {
                listOfException.read(str);
            }
        }
    }
}
