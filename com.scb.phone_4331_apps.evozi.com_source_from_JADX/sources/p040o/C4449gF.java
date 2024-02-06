package p040o;

import java.util.List;
import p040o.getDocumentSkew;
import p040o.writeUInt64NoTag;

/* renamed from: o.gF */
public final /* synthetic */ class C4449gF implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List read;

    public /* synthetic */ C4449gF(List list) {
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getDocumentSkew.write) obj).MediaBrowserCompat$ItemReceiver(this.read);
    }
}
