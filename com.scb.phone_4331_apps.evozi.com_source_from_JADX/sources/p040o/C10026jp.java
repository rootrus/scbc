package p040o;

import p040o.C4920kw;
import p040o.QuickExtractor;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.jp */
public final /* synthetic */ class C10026jp implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4920kw.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ C10026jp(C4920kw.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4920kw.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = this.write;
        QuickExtractor.C12502 r4 = (QuickExtractor.C12502) obj;
        if (!C4920kw.this.MediaBrowserCompat$SearchResultReceiver(th)) {
            r4.mo17609i_(C4920kw.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
        }
    }
}
