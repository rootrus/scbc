package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.TextureRotationUtil */
public final /* synthetic */ class TextureRotationUtil implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSecondPassTexelHeightUniform IconCompatParcelizer;
    private final /* synthetic */ cacheUserData MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ access$1900 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ defaultReportUploader read;

    public /* synthetic */ TextureRotationUtil(getSecondPassTexelHeightUniform getsecondpasstexelheightuniform, access$1900 access_1900, defaultReportUploader defaultreportuploader, cacheUserData cacheuserdata) {
        this.IconCompatParcelizer = getsecondpasstexelheightuniform;
        this.MediaBrowserCompat$ItemReceiver = access_1900;
        this.read = defaultreportuploader;
        this.MediaBrowserCompat$CustomActionResultReceiver = cacheuserdata;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = this.IconCompatParcelizer;
        ((setCvv.MediaDescriptionCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(getsecondpasstexelheightuniform.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, (String) null, getsecondpasstexelheightuniform.write.MediaBrowserCompat$CustomActionResultReceiver.setCheckable()));
    }
}
