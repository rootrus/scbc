package p040o;

import p040o.C9924f;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeFinalize */
public final /* synthetic */ class nativeFinalize implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C9924f.C43921 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nativeFinalize(C9924f.C43921 r1, String str) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6404xb2f77424) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.write, AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("ETB_OPEN_ACCOUNT", this.MediaBrowserCompat$CustomActionResultReceiver), (String) null, (String) null, (String) null, true, false, (String) null, 72));
    }
}
