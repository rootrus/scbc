package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.FixedAspectRatioDetectionResult */
public final /* synthetic */ class FixedAspectRatioDetectionResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ buildNameMap MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FixedAspectRatioDetectionResult(buildNameMap buildnamemap, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = buildnamemap;
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        buildNameMap buildnamemap = this.MediaBrowserCompat$CustomActionResultReceiver;
        QuickExtractorAgent quickExtractorAgent = (QuickExtractorAgent) obj;
        quickExtractorAgent.read(this.IconCompatParcelizer);
        quickExtractorAgent.IconCompatParcelizer(buildnamemap.MediaDescriptionCompat());
    }
}
