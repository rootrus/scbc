package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.readAutoDataCollectionEnabled */
public final /* synthetic */ class readAutoDataCollectionEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ normalize MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ readAutoDataCollectionEnabled(normalize normalize, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = normalize;
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        FirebaseVisionImageMetadata.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, (Extractor) obj);
    }
}
