package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.cA */
public final /* synthetic */ class C4142cA implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List read;
    private final /* synthetic */ ci$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ C4142cA(ci$MediaBrowserCompat$CustomActionResultReceiver ci_mediabrowsercompat_customactionresultreceiver, List list) {
        this.write = ci_mediabrowsercompat_customactionresultreceiver;
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ci$MediaBrowserCompat$CustomActionResultReceiver ci_mediabrowsercompat_customactionresultreceiver = this.write;
        ((injectOnDeviceExtractionServer) obj).MediaBrowserCompat$ItemReceiver(ci_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this.read));
    }
}
