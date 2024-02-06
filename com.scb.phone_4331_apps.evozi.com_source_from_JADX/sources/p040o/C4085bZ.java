package p040o;

import java.util.List;
import p040o.C4190ci;
import p040o.writeUInt64NoTag;

/* renamed from: o.bZ */
public final /* synthetic */ class C4085bZ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4190ci.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ C4085bZ(C4190ci.read read, List list) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4190ci.read read = this.MediaBrowserCompat$ItemReceiver;
        ((injectOnDeviceExtractionServer) obj).MediaBrowserCompat$ItemReceiver(C4190ci.this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this.write));
    }
}
