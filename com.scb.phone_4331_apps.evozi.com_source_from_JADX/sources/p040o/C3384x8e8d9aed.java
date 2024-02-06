package p040o;

import p040o.ExtractorResponse;
import p040o.FirebaseVisionCloudDocumentRecognizerOptions;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$MediaItem */
public final class C3384x8e8d9aed<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.write> {
    private /* synthetic */ FirebaseVisionCloudDocumentRecognizerOptions.Builder read;

    public C3384x8e8d9aed(FirebaseVisionCloudDocumentRecognizerOptions.Builder builder) {
        this.read = builder;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ExtractorResponse.write write = (ExtractorResponse.write) obj;
        write.IconCompatParcelizer(false);
        write.MediaBrowserCompat$ItemReceiver(false);
        String str = FirebaseVisionCloudDocumentRecognizerOptions.Builder.read(this.read).MediaDescriptionCompat;
        if (str != null) {
            FirebaseVisionCloudDocumentRecognizerOptions.Builder.read(this.read, str);
        } else {
            write.MediaBrowserCompat$ItemReceiver();
        }
        write.IconCompatParcelizer();
    }
}
