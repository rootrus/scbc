package p040o;

import p040o.ExtractorResponse;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver */
public final class FirebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
    private /* synthetic */ FirebaseVisionFace IconCompatParcelizer;

    public FirebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver(FirebaseVisionFace firebaseVisionFace) {
        this.IconCompatParcelizer = firebaseVisionFace;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
        String MediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat.write.MediaMetadataCompat();
        if (MediaMetadataCompat == null) {
            MediaMetadataCompat = "";
        }
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(false, MediaMetadataCompat);
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
