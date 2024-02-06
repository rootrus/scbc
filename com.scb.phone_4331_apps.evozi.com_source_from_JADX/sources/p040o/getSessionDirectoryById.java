package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSessionDirectoryById */
public final /* synthetic */ class getSessionDirectoryById implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getFrameSize read;

    public /* synthetic */ getSessionDirectoryById(getFrameSize getframesize, int i) {
        this.read = getframesize;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        getFrameSize getframesize = this.read;
        ((KtaJsonCheck.C6928a) obj).read(getframesize.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
