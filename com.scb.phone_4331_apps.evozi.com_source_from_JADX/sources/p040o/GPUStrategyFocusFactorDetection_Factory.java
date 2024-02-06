package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.GPUStrategyFocusFactorDetection_Factory */
public final /* synthetic */ class GPUStrategyFocusFactorDetection_Factory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ defaultReportUploader read;

    public /* synthetic */ GPUStrategyFocusFactorDetection_Factory(defaultReportUploader defaultreportuploader) {
        this.read = defaultreportuploader;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.read) obj).read(this.read);
    }
}
