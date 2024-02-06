package p040o;

import p040o.QuickExtractorAgent;
import p040o.writeUInt64NoTag;

/* renamed from: o.hL */
public final /* synthetic */ class C4729hL implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4729hL(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractorAgent.C70191) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
