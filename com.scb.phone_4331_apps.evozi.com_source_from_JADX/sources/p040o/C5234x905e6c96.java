package p040o;

import java.util.List;
import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.MoreExecutors;
import p040o.writeUInt64NoTag;

/* renamed from: o.requestWasSuccessful$MediaBrowserCompat$MediaItem$MediaBrowserCompat$CustomActionResultReceiver */
final class C5234x905e6c96<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.read> {
    private /* synthetic */ List IconCompatParcelizer;

    C5234x905e6c96(List list) {
        this.IconCompatParcelizer = list;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CheckCaptureModule_GetExtractionParametersFactory.read read = (CheckCaptureModule_GetExtractionParametersFactory.read) obj;
        read.read(false);
        read.read((List<MoreExecutors.C36611>) this.IconCompatParcelizer);
        if (this.IconCompatParcelizer.isEmpty()) {
            read.MediaBrowserCompat$ItemReceiver();
        }
    }
}
