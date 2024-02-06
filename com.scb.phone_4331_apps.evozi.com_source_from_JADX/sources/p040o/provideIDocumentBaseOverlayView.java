package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.provideIDocumentBaseOverlayView */
public final /* synthetic */ class provideIDocumentBaseOverlayView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ provideIDocumentBaseOverlayView(List list, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.write = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiPassportExtractor_Factory) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }
}
