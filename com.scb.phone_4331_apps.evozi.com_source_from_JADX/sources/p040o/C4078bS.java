package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.bS */
public final /* synthetic */ class C4078bS implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4193ck IconCompatParcelizer;
    private final /* synthetic */ List read;
    private final /* synthetic */ PlacePhotoMetadataResult write;

    public /* synthetic */ C4078bS(C4193ck ckVar, List list, PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.IconCompatParcelizer = ckVar;
        this.read = list;
        this.write = placePhotoMetadataResult;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4193ck ckVar = this.IconCompatParcelizer;
        List list = this.read;
        PlacePhotoMetadataResult placePhotoMetadataResult = this.write;
        getFrontBarcodes getfrontbarcodes = (getFrontBarcodes) obj;
        if (list.size() <= 0) {
            getfrontbarcodes.MediaBrowserCompat$ItemReceiver();
            return;
        }
        getfrontbarcodes.MediaDescriptionCompat();
        getfrontbarcodes.IconCompatParcelizer(ckVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(placePhotoMetadataResult));
        getfrontbarcodes.MediaBrowserCompat$CustomActionResultReceiver(list);
    }
}
