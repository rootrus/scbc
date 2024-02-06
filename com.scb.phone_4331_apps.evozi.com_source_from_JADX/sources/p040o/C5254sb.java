package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.sb */
public final /* synthetic */ class C5254sb implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean write;

    public /* synthetic */ C5254sb(boolean z, String str) {
        this.write = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C5174qT.write(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, (ServerProjectProvider.C70706) obj);
    }
}
