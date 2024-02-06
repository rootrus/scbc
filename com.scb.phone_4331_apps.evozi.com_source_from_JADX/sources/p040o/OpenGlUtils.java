package p040o;

import p040o.getSecondPassTexelHeightUniform;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.OpenGlUtils */
public final /* synthetic */ class OpenGlUtils implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSecondPassTexelHeightUniform.C46521 IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ access$1900 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ cacheUserData read;
    private final /* synthetic */ defaultReportUploader write;

    public /* synthetic */ OpenGlUtils(getSecondPassTexelHeightUniform.C46521 r1, access$1900 access_1900, defaultReportUploader defaultreportuploader, cacheUserData cacheuserdata, String str) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$ItemReceiver = access_1900;
        this.write = defaultreportuploader;
        this.read = cacheuserdata;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassTexelHeightUniform.C46521 r0 = this.IconCompatParcelizer;
        ((setCvv.MediaDescriptionCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(getSecondPassTexelHeightUniform.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.write, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, getSecondPassTexelHeightUniform.this.write.MediaBrowserCompat$CustomActionResultReceiver.setCheckable()));
    }
}
