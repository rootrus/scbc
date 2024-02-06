package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.bQ */
public final /* synthetic */ class C4076bQ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C4192cj write;

    public /* synthetic */ C4076bQ(C4192cj cjVar, String str, String str2) {
        this.write = cjVar;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4192cj cjVar = this.write;
        ((KtaJsonCheck.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, cjVar.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
