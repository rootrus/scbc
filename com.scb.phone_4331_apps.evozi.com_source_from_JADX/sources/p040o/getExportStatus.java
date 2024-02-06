package p040o;

import p040o.ICheckExtractorListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.getExportStatus */
public final /* synthetic */ class getExportStatus implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ AppStatsSessionEvent MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ doWriteToLog read;

    public /* synthetic */ getExportStatus(AppStatsSessionEvent appStatsSessionEvent, int i, doWriteToLog dowritetolog) {
        this.MediaBrowserCompat$ItemReceiver = appStatsSessionEvent;
        this.IconCompatParcelizer = i;
        this.read = dowritetolog;
    }

    public final void IconCompatParcelizer(Object obj) {
        ICheckExtractorListener.MediaDescriptionCompat mediaDescriptionCompat = (ICheckExtractorListener.MediaDescriptionCompat) obj;
        mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this.read, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
    }
}
