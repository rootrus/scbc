package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getFieldIndex */
public final /* synthetic */ class getFieldIndex implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CaptureGuidance IconCompatParcelizer;

    public /* synthetic */ getFieldIndex(CaptureGuidance captureGuidance) {
        this.IconCompatParcelizer = captureGuidance;
    }

    public final void IconCompatParcelizer(Object obj) {
        CaptureGuidance captureGuidance = this.IconCompatParcelizer;
        proxyGetIIdExtractionServerRtti proxygetiidextractionserverrtti = (proxyGetIIdExtractionServerRtti) obj;
        if (captureGuidance.RatingCompat != null) {
            captureGuidance.RatingCompat.aj_();
        }
        proxygetiidextractionserverrtti.IconCompatParcelizer();
    }
}
