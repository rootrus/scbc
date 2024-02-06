package p040o;

import p040o.C4889kC;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.jq */
public final /* synthetic */ class C4877jq implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ C4889kC.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4877jq(C4889kC.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4889kC.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        Throwable th = this.IconCompatParcelizer;
        if (!C4889kC.this.MediaBrowserCompat$SearchResultReceiver(th)) {
            C4889kC kCVar = C4889kC.this;
            kCVar.MediaBrowserCompat$ItemReceiver(kCVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
