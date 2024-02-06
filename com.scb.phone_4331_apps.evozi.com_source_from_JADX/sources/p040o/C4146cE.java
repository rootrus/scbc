package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.cE */
public final /* synthetic */ class C4146cE implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4190ci MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4146cE(C4190ci ciVar, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ciVar;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4190ci ciVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((injectOnDeviceExtractionServer) obj).MediaBrowserCompat$ItemReceiver(ciVar.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver));
    }
}
