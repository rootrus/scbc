package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.removeAllViews */
public final /* synthetic */ class removeAllViews implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4041ao MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ removeAllViews(C4041ao aoVar, int i) {
        this.MediaBrowserCompat$ItemReceiver = aoVar;
        this.read = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4041ao aoVar = this.MediaBrowserCompat$ItemReceiver;
        int i = this.read;
        IImageProcessorListener iImageProcessorListener = (IImageProcessorListener) obj;
        aoVar.read = i;
        iImageProcessorListener.MediaBrowserCompat$CustomActionResultReceiver(i);
        iImageProcessorListener.write();
    }
}
