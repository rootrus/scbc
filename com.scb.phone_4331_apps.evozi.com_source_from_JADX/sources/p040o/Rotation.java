package p040o;

import p040o.getSecondPassTexelHeightUniform;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.Rotation */
public final /* synthetic */ class Rotation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSecondPassTexelHeightUniform.C46521 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ defaultReportUploader write;

    public /* synthetic */ Rotation(getSecondPassTexelHeightUniform.C46521 r1, defaultReportUploader defaultreportuploader, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.write = defaultreportuploader;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassTexelHeightUniform.C46521 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((setCvv.MediaDescriptionCompat) obj).IconCompatParcelizer(getSecondPassTexelHeightUniform.this.IconCompatParcelizer.read(this.write, this.MediaBrowserCompat$ItemReceiver));
    }
}
