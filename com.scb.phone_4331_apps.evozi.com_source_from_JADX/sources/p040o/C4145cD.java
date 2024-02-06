package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.cD */
public final /* synthetic */ class C4145cD implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4192cj IconCompatParcelizer;
    private final /* synthetic */ String write;

    public /* synthetic */ C4145cD(C4192cj cjVar, String str) {
        this.IconCompatParcelizer = cjVar;
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4192cj cjVar = this.IconCompatParcelizer;
        ((KtaJsonCheck.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(cjVar.MediaDescriptionCompat, cjVar.MediaBrowserCompat$ItemReceiver, this.write);
    }
}
