package p040o;

import p040o.AppStatsSqLiteDs;
import p040o.ICheckExtractorListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.aU */
public final /* synthetic */ class C9846aU implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AppStatsSqLiteDs.C3043b write;

    public /* synthetic */ C9846aU(AppStatsSqLiteDs.C3043b bVar) {
        this.write = bVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSqLiteDs.C3043b bVar = this.write;
        ((ICheckExtractorListener.read) obj).MediaBrowserCompat$ItemReceiver(bVar.write, bVar.MediaBrowserCompat$ItemReceiver, bVar.read, false);
    }
}
