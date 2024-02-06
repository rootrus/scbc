package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.drawFrame */
public final /* synthetic */ class drawFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ cacheUserData MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getSecondPassTexelHeightUniform write;

    public /* synthetic */ drawFrame(getSecondPassTexelHeightUniform getsecondpasstexelheightuniform, cacheUserData cacheuserdata) {
        this.write = getsecondpasstexelheightuniform;
        this.MediaBrowserCompat$CustomActionResultReceiver = cacheuserdata;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = this.write;
        ((setCvv.MediaDescriptionCompat) obj).write(getsecondpasstexelheightuniform.IconCompatParcelizer.read(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
