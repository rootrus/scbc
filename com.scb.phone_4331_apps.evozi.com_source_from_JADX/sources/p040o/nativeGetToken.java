package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetToken */
public final /* synthetic */ class nativeGetToken implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CaptureGuidance write;

    public /* synthetic */ nativeGetToken(CaptureGuidance captureGuidance) {
        this.write = captureGuidance;
    }

    public final void IconCompatParcelizer(Object obj) {
        CaptureGuidance captureGuidance = this.write;
        proxyGetIIdExtractionServerRtti proxygetiidextractionserverrtti = (proxyGetIIdExtractionServerRtti) obj;
        if (captureGuidance.RatingCompat != null) {
            captureGuidance.RatingCompat.aj_();
        }
        proxygetiidextractionserverrtti.MediaBrowserCompat$MediaItem();
    }
}
