package p040o;

import p040o.ExtractorResponse;
import p040o.FirebaseVisionCloudDocumentRecognizerOptions;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9737xe50c52fd<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.write> {
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ FirebaseVisionCloudDocumentRecognizerOptions.Builder MediaBrowserCompat$CustomActionResultReceiver;

    public C9737xe50c52fd(FirebaseVisionCloudDocumentRecognizerOptions.Builder builder, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = builder;
        this.IconCompatParcelizer = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ExtractorResponse.write write = (ExtractorResponse.write) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.read != null) {
            write.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, FirebaseVisionCloudDocumentRecognizerOptions.Builder.read(this.MediaBrowserCompat$CustomActionResultReceiver), FirebaseVisionCloudDocumentRecognizerOptions.Builder.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }
}
