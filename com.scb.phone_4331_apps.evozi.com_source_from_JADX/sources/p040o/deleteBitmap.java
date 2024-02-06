package p040o;

import p040o.KtaServiceCaller;
import p040o.writeUInt64NoTag;

/* renamed from: o.deleteBitmap */
public final /* synthetic */ class deleteBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getAmbientEnabled MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ KtaServiceCaller.JOB_TYPE.C35622 write;

    public /* synthetic */ deleteBitmap(KtaServiceCaller.JOB_TYPE.C35622 r1, getAmbientEnabled getambientenabled) {
        this.write = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = getambientenabled;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7535ub) obj).read(KtaServiceCaller.JOB_TYPE.this.write.MediaBrowserCompat$ItemReceiver(false), this.MediaBrowserCompat$CustomActionResultReceiver.read);
    }
}
