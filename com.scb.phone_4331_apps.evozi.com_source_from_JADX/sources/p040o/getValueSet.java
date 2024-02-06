package p040o;

import p040o.C10829Sizeof;
import p040o.writeUInt64NoTag;

/* renamed from: o.getValueSet */
public final /* synthetic */ class getValueSet implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10829Sizeof.SizeOfNewObject MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ PlacePhotoMetadataResult read;

    public /* synthetic */ getValueSet(C10829Sizeof.SizeOfNewObject sizeOfNewObject, PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sizeOfNewObject;
        this.read = placePhotoMetadataResult;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10829Sizeof.SizeOfNewObject sizeOfNewObject = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getPiggybackDocument) obj).read(sizeOfNewObject.write.MediaBrowserCompat$ItemReceiver(this.read));
    }
}
