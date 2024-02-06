package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.ScaleType */
public final /* synthetic */ class ScaleType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSecondPassTexelHeightUniform IconCompatParcelizer;
    private final /* synthetic */ defaultReportUploader read;

    public /* synthetic */ ScaleType(getSecondPassTexelHeightUniform getsecondpasstexelheightuniform, defaultReportUploader defaultreportuploader) {
        this.IconCompatParcelizer = getsecondpasstexelheightuniform;
        this.read = defaultreportuploader;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = this.IconCompatParcelizer;
        ((setCvv.MediaDescriptionCompat) obj).IconCompatParcelizer(getsecondpasstexelheightuniform.IconCompatParcelizer.read(this.read, (String) null));
    }
}
