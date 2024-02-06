package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.isEnabled */
public final /* synthetic */ class isEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ FirebaseVisionImageMetadata IconCompatParcelizer;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ isEnabled(FirebaseVisionImageMetadata firebaseVisionImageMetadata, Throwable th) {
        this.IconCompatParcelizer = firebaseVisionImageMetadata;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.IconCompatParcelizer;
        Throwable th = this.read;
        Extractor extractor = (Extractor) obj;
        extractor.aj_();
        if (!firebaseVisionImageMetadata.MediaBrowserCompat$SearchResultReceiver(th)) {
            extractor.write(firebaseVisionImageMetadata.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
