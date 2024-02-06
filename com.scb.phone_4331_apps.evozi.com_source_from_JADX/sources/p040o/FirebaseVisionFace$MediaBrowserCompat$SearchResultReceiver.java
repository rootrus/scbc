package p040o;

import p040o.ExtractorResponse;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionFace$MediaBrowserCompat$SearchResultReceiver */
public final class FirebaseVisionFace$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
    public static final FirebaseVisionFace$MediaBrowserCompat$SearchResultReceiver write = new FirebaseVisionFace$MediaBrowserCompat$SearchResultReceiver();

    FirebaseVisionFace$MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(new ExtractorResponse$MediaBrowserCompat$ItemReceiver() {
            public final void read() {
                iconCompatParcelizer.read();
            }
        });
    }
}
