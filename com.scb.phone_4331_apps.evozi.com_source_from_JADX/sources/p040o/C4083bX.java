package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.bX */
public final /* synthetic */ class C4083bX implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;

    public /* synthetic */ C4083bX(String str) {
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(true, this.read);
    }
}
