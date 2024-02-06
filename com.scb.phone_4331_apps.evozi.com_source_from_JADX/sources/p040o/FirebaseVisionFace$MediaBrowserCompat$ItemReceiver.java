package p040o;

import p040o.ExtractorResponse;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionFace$MediaBrowserCompat$ItemReceiver */
public final class FirebaseVisionFace$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
    private /* synthetic */ FirebaseVisionFace read;

    public FirebaseVisionFace$MediaBrowserCompat$ItemReceiver(FirebaseVisionFace firebaseVisionFace) {
        this.read = firebaseVisionFace;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
        String MediaMetadataCompat = this.read.MediaMetadataCompat.write.MediaMetadataCompat();
        String str = "";
        if (MediaMetadataCompat == null) {
            MediaMetadataCompat = str;
        }
        boolean z = MediaMetadataCompat.length() > 0;
        String MediaMetadataCompat2 = this.read.MediaMetadataCompat.write.MediaMetadataCompat();
        if (MediaMetadataCompat2 != null) {
            str = MediaMetadataCompat2;
        }
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(z, str);
    }
}
