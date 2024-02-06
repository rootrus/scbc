package p040o;

import p040o.AppStatsSqLiteDs;
import p040o.ICheckExtractorListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.aS */
public final /* synthetic */ class C3985aS implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AppStatsSqLiteDs.C3043b write;

    public /* synthetic */ C3985aS(AppStatsSqLiteDs.C3043b bVar, boolean z) {
        this.write = bVar;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSqLiteDs.C3043b bVar = this.write;
        ((ICheckExtractorListener.read) obj).MediaBrowserCompat$ItemReceiver(bVar.write, bVar.MediaBrowserCompat$ItemReceiver, bVar.read, this.MediaBrowserCompat$ItemReceiver);
    }
}
