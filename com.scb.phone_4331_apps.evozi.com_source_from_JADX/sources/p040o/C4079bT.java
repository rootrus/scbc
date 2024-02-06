package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.bT */
public final /* synthetic */ class C4079bT implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4193ck MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ PlacePhotoMetadataResult read;

    public /* synthetic */ C4079bT(C4193ck ckVar, List list, PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ckVar;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = placePhotoMetadataResult;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4193ck ckVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        List list = this.MediaBrowserCompat$ItemReceiver;
        PlacePhotoMetadataResult placePhotoMetadataResult = this.read;
        getFrontBarcodes getfrontbarcodes = (getFrontBarcodes) obj;
        if (list.size() <= 1) {
            getfrontbarcodes.MediaBrowserCompat$ItemReceiver();
            return;
        }
        getfrontbarcodes.read(ckVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(placePhotoMetadataResult));
        getfrontbarcodes.IconCompatParcelizer(ckVar.IconCompatParcelizer.IconCompatParcelizer(placePhotoMetadataResult.setGroupDividerEnabled.get(0)));
        getfrontbarcodes.MediaBrowserCompat$CustomActionResultReceiver(list);
    }
}
